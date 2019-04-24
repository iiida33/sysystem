<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>圣婴网-会员登录</title>
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="../../../static/css/normalize.min.css">
    <link rel="stylesheet" href="../../../static/css/login.css">
</head>

<body>
<input type="text" hidden="hidden" id="state" name="state" value=""/>
<div class="form">
    <ul class="tab-group">
        <li class="tab active" style="width: 800px;margin-left: 50px;"><a href="#login">登录</a></li>
        <%--<li class="tab"><a href="#signup">注册</a></li>--%>
    </ul>

    <div class="tab-content">
        <div id="login">
            <h1>管理员登录</h1>
            <form action="" method="post" onsubmit="return false">
                <div class="field-wrap">
                    <label>工号<span class="req">*</span></label>
                    <input type="text" id="loginName" name="loginName" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>

                <div class="field-wrap">
                    <label>密码<span class="req">*</span></label>
                    <input type="password" id="custPasswordLo" name="custPasswordLo" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>

                <p class="forgot"><a href="#" class="popup" onmousemove="myFunction();">
                    忘记密码？<span class="popuptext" id="myPopup">请与部门负责人联系</span></a></p>
                <button id="loginButton" class="button button-block" onclick="adminLogin();">
                    登录
                </button>
            </form>
        </div>

        <div id="signup">
        </div>

    </div><!-- tab-content -->
</div>
<!-- /form -->
<script src='../../../static/js/jquery.min.js'></script>
<script src="../../../static/js/login.js"></script>
<script src="../../../static/js/bootstrap.min.js"></script>
<script>
    function adminLogin() {
        var loginName = $("#loginName").val();
        var custPasswordLo = $("#custPasswordLo").val();
        $(".prompt").hide();

        if (loginName == "") {
            $("#loginName").next().text("请输入登录工号！");
            $("#loginName").next().show();
            return false;
        }
        if (custPasswordLo == "") {
            $("#custPasswordLo").next().text("请输入密码！");
            $("#custPasswordLo").next().show();
            return false;
        }
        // 这是使用ajax的方式提交
        $.ajax({
            type: 'post',
            url: 'adminLogin.do',
            data: {
                'adminNum': loginName,
                'adminPassword': custPasswordLo,
            },
            dataType: 'json',
            success: function (data) {
                var code = data.status;
                if (code == 200) {
                    $("#loginButton").text("正在登录……")
                    window.location.href = data.url;
                } else if (code == 500) {
                    $("#custPasswordLo").next().text(data.msg);
                    $("#custPasswordLo").next().show();
                    $("#custPasswordLo").val("").focus();// 清空并获得焦点
                }
            }
        });
    }
</script>
</body>
</html>

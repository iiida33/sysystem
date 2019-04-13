<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>圣婴网管理端</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="../../../img/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../../static/lib/css/font.css">
    <link rel="stylesheet" href="../../../static/lib/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../../static/lib/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../static/lib/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <input type="hidden" id="custId" name="custId"/>
        <div class="layui-form-item">
            <label for="custUsername" class="layui-form-label">
                用户名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="custUsername" name="custUsername" disabled="" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="newpass" class="layui-form-label">
                <span class="x-red">*</span>新密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="newpass" name="newpass" required="" lay-verify="required|newpass"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                密码由6-18个字母、数字、下划线组成
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
                <span class="x-red">*</span>确认密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="L_repass" name="repass" required="" lay-verify="required|secpass"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" id="save" lay-filter="save" lay-submit="">
                修改
            </button>
        </div>
    </form>
</div>
<script>
    //加载参数
    window.onload = function () {
        //加载顾客id
        $("#custId").val(decodeURI(getQueryVariable("custId")));
        //加载顾客用户名
        $("#custUsername").val(decodeURI(getQueryVariable("custUsername")));
    };

    //获取url参数
    function getQueryVariable(variable) {
        var query = window.location.search.substring(1);
        var index = query.indexOf("?");
        query = query.substr(index + 1, query.length);
        // console.log(query);
        var vars = query.split("&");
        // console.log(vars);
        for (var i = 0; i < vars.length; i++) {
            var pair = vars[i].split("=");
            // console.log(pair[0]);
            if (pair[0] == variable) {
                return pair[1];
            }
        }
        return false;
    }

    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate
            , $ = layui.jquery;
        // 监听提交
        form.on('submit(save)', function (data) {
            // alert($("#dIdInput").val());
            // alert(JSON.stringify(data.field));
            $.ajax({
                type: 'post',
                url: 'customer/changePassword1.do',
                data: {
                    "custId": parseInt($("#custId").val()),
                    "custPassword": $("#newpass").val()
                },
                dataType: 'json',
                success: function (data) {
                    // console.log(data);
                    layer.alert("修改成功", {
                            title: '修改信息'
                        }
                        // function () {
                        //     window.parent.location.reload();
                        //     var index = parent.layer.getFrameIndex(window.name);
                        //     parent.layer.close(index);
                        // }
                    );
                }
            });
            return false;
        });
        //自定义验证规则
        form.verify({
            secpass: function (value) { //value：表单的值、item：表单的DOM对象
                if (value != $('#newpass').val()) {
                    return '两次密码不一致！';
                }
            }
            //我们既支持上述函数式的方式，也支持下述数组的形式
            //数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
            , newpass: [
                /^[a-zA-Z0-9_]{6,18}$/
                , '密码由6-18个字母、数字、下划线组成'
            ]
        });
    })
    ;
</script>
<%--<script>--%>
<%--layui.use(['form', 'layer'], function () {--%>
<%--$ = layui.jquery;--%>
<%--var form = layui.form--%>
<%--, layer = layui.layer;--%>
<%--//监听提交--%>
<%--form.on('submit(save)', function (data) {--%>
<%--var custId = $("#custId").val();--%>
<%--var custPass = $("#newpass").val();--%>
<%--// 监听提交--%>
<%--$.ajax({--%>
<%--type: 'post',--%>
<%--url: 'customer/changePassword1.do',--%>
<%--data: {--%>
<%--"custId": custId,--%>
<%--"custPassword": custPass--%>
<%--},--%>
<%--dataType: 'json',--%>
<%--success: function (data) {--%>
<%--console.log(11111);--%>
<%--// var status = data.status;--%>
<%--// // 说明存在同名--%>
<%--// if (status != "200") {--%>
<%--//     // console.log(data);--%>
<%--//     layer.msg(data.msg);--%>
<%--// } else {--%>
<%--//     layer.alert(data.msg, {--%>
<%--//             title: '修改信息'--%>
<%--//         },--%>
<%--//         function () {--%>
<%--//             window.parent.location.reload();--%>
<%--//             var index = parent.layer.getFrameIndex(window.name);--%>
<%--//             parent.layer.close(index);--%>
<%--//         }--%>
<%--//     );--%>
<%--// }--%>
<%--}--%>
<%--});--%>
<%--return false;--%>
<%--});--%>
<%--form.verify({--%>
<%--secpass: function (value) { //value：表单的值、item：表单的DOM对象--%>
<%--if (value != $('#newpass').val()) {--%>
<%--return '两次密码不一致！';--%>
<%--}--%>
<%--}--%>
<%--//我们既支持上述函数式的方式，也支持下述数组的形式--%>
<%--//数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]--%>
<%--, newpass: [--%>
<%--/^[a-zA-Z0-9_]{6,18}$/--%>
<%--, '密码由6-18个字母、数字、下划线组成'--%>
<%--]--%>
<%--});--%>
<%--});--%>
<%--</script>--%>
</body>
</html>
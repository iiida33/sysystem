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
        <li class="tab active"><a href="#login">登录</a></li>
        <li class="tab"><a href="#signup">注册</a></li>
    </ul>

    <div class="tab-content">
        <div id="login">
            <h1>登录圣婴网</h1>
            <form action="" method="post" onsubmit="return false">
                <div class="field-wrap">
                    <label>会员名/手机号码/邮箱<span class="req">*</span></label>
                    <input type="text" id="loginName" name="loginName" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>

                <div class="field-wrap">
                    <label>密码<span class="req">*</span></label>
                    <input type="password" id="custPasswordLo" name="custPasswordLo" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>

                <p class="forgot"><a href="#" class="popup" onmousemove="myFunction();">
                    忘记密码？<span class="popuptext" id="myPopup">请联系商城管理员2513567599@qq.com</span></a></p>
                <button id="loginButton" class="button button-block" onclick="login();">
                    登录
                </button>
            </form>
        </div>

        <div id="signup">
            <h1>免费成为圣婴网会员</h1>
            <form action="" method="post" onsubmit="return false">
                <div class="field-wrap">
                    <label>手机号码<span class="req">*</span></label>
                    <input type="text" id="custPhone" name="custPhone" autocomplete="off"/>
                    <label class="prompt" style="display: none;"></label>
                </div>
                <div class="field-wrap">
                    <label>会员名<span class="req">*</span></label>
                    <input type="text" id="custUsername" name="custUsername" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>
                <div class="field-wrap">
                    <label>设置密码<span class="req">*</span></label>
                    <input type="password" id="custPassword" name="custPassword" autocomplete="off"/>
                    <label class="prompt" style="display: none"></label>
                </div>
                <div class="bottom-row">
                    <div class="field-wrap">
                        <label>
                            验证码<span class="req">*</span>
                        </label>
                        <input type="text" id="validateCode" name="validateCode" autocomplete="off"/>
                        <label class="prompt" style="display: none"></label>
                    </div>
                    <div>
                        <a href="javascript:void(0);" onclick="VerificationCode();">
                            <img id="captchaImage" src="changeCode.do" style="height: 48px;width: 120px;"/>
                        </a>
                    </div>
                </div>
                <button type="submit" id="submit" class="button button-block" onclick="register();">
                    注册
                </button>
            </form>
        </div>

    </div><!-- tab-content -->
</div>
<!-- /form -->
<script src='../../../static/js/jquery.min.js'></script>
<script src="../../../static/js/login.js"></script>
<script src="../../../static/js/bootstrap.min.js"></script>
</body>
</html>

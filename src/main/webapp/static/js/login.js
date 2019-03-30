$(document).ready(function () {
    var request = (function () {
        var obj = {};
        var arr = window.location.search.slice(1).split("&");
        for (var i = 0, len = arr.length; i < len; i++) {
            var nv = arr[i].split("=");
            obj[unescape(nv[0]).toLowerCase()] = unescape(nv[1]);
        }
        return obj;
    })()
    if (request.state == "1") {
        $("[href='#signup']").parent().addClass('active');
        $("[href='#login']").parent().removeClass('active');
        target = $("[href='#signup']").attr('href');
        $('.tab-content > div').not(target).hide();
        $(target).fadeIn(600);
    }
});
$('.form').find('input, textarea').on('keyup blur focus', function (e) {

    var $this = $(this),
        label = $this.prev('label');

    if (e.type === 'keyup') {
        if ($this.val() === '') {
            label.removeClass('active highlight');
        } else {
            label.addClass('active highlight');
        }
    }
    else if (e.type === 'blur') {
        if ($this.val() === '') {
            label.removeClass('active highlight');
        } else {
            label.removeClass('highlight');
        }
    } else if (e.type === 'focus') {

        if ($this.val() === '') {
            label.removeClass('highlight');
        }
        else if ($this.val() !== '') {
            label.addClass('highlight');
        }
    }

});

$('.tab a').on('click', function (e) {

    e.preventDefault();

    $(this).parent().addClass('active');
    $(this).parent().siblings().removeClass('active');

    target = $(this).attr('href');

    $('.tab-content > div').not(target).hide();

    $(target).fadeIn(600);

});

// 更换验证码
function VerificationCode() {
    $("#captchaImage").attr("src", "changeCode.do?timestamp=" + (new Date()).valueOf());
}

function register() {
    var custUsername = $("#custUsername").val();
    var custPassword = $("#custPassword").val();
    var custPhone = $("#custPhone").val()
    var validateCode = $("#validateCode").val();
    $(".prompt").hide();
    // $("#custPhone").next().hide();
    // $("#custUsername").next().hide();
    // $("#custPassword").next().hide();
    // $("#validateCode").next().hide();

    if (custPhone == "") {
        $("#custPhone").next().text("手机号码不能为空");
        $("#custPhone").next().show();
        return false;
    }
    if (custUsername == "") {
        $("#custUsername").next().text("用户名不能为空");
        $("#custUsername").next().show();
        return false;
    }
    if (custPassword == "") {
        $("#custPassword").next().text("密码不能为空");
        $("#custPassword").next().show();
        return false;
    }
    if (validateCode == "") {
        $("#validateCode").next().text("请输入验证码");
        $("#validateCode").next().show();
        return false;
    }

    if (!(/^[1][3,4,5,7,8][0-9]{9}$/.test(custPhone))) {
        $("#custPhone").next().text("请输入正确的手机号码");
        $("#custPhone").next().show();
        return false;
    }

    if (!(/^.{3,18}$/.test(custUsername))) {
        $("#custUsername").next().text("请设置用户名长度为3-18个字符");
        $("#custUsername").next().show();
        return false;
    }

    if (!(/^[a-zA-Z0-9_]{6,18}$/.test(custPassword))) {
        $("#custPassword").next().text("密码由6-18个字母、数字、下划线组成");
        $("#custPassword").next().show();
        return false;
    }

    // 这是使用ajax的方式提交
    $.ajax({
        type: 'post',
        url: 'customerRegister.do',
        data: {
            'custUsername': custUsername,
            'custPassword': custPassword,
            'custPhone': custPhone,
            'validateCode': validateCode
        },
        dataType: 'json',
        success: function (data) {
            var code = data.status;
            if (code == 0) {
                $("#validateCode").next().text(data.msg);
                $("#validateCode").next().show();
                $("#captchaImage").attr("src", "changeCode.do?timestamp=" + (new Date()).valueOf());
                $("#validateCode").val("").focus(); // 清空并获得焦点
            } else if (code == 200) {
                $("#submit").text("注册成功，正在跳转……")
                window.location.href = "/customerLoginSuccess.do";
            } else if (code >= 500) {
                if (code == 501) {
                    $("#custPhone").next().text(data.msg);
                    $("#custPhone").next().show();
                    $("#custPhone").val("").focus();// 清空并获得焦点
                }
                if (code == 502) {
                    $("#custUsername").next().text(data.msg);
                    $("#custUsername").next().show();
                    $("#custUsername").val("").focus();// 清空并获得焦点
                }
                // $("#custPassword").val("");
                $("#validateCode").val(""); // 清空
                $("#captchaImage").attr("src", "changeCode.do?timestamp=" + (new Date()).valueOf());
            }
        }
    });
}

function login() {
    var loginName = $("#loginName").val();
    var custPasswordLo = $("#custPasswordLo").val();
    $(".prompt").hide();

    if (loginName == "") {
        $("#loginName").next().text("请输入登录账号！");
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
        url: 'customerLogin.do',
        data: {
            'loginName': loginName,
            'custPassword': custPasswordLo,
        },
        dataType: 'json',
        success: function (data) {
            var code = data.status;
            if (code == 200) {
                $("#loginButton").text("正在登录……")
                window.location.href = "/customerLoginSuccess.do";
            } else if (code == 500) {
                $("#custPasswordLo").next().text(data.msg);
                $("#custPasswordLo").next().show();
                $("#custPasswordLo").val("").focus();// 清空并获得焦点
            }
        }
    });
}

function myFunction() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
}


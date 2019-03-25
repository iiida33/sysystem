$(document).ready(function () {
    var state = $("#state").val();
    if (state == "1") {
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
    $("#custPhone").next().hide();
    $("#custUsername").next().hide();
    $("#custPassword").next().hide();
    $("#validateCode").next().hide();

    if (custPhone == "") {
        $("#custPhone").next().text("手机号码不能为空");
        $("#custPhone").next().show();
        return false;
    }
    else {
        var reg=/^\w+@[a-zA-Z0-9]{2,10}(?:\.[a-z]{2,4}){1,3}$/;
        return reg.test(str);
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
                window.location.href = data.url;
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


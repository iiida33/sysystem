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

    if (custUsername == "") {
        alert("用户名不能为空");
        // layer.msg("用户名不能为空", {time: 2000, icon: 5, anim: 6})
        // $("#username").face()
        return false;
    }
    if (custPassword == "") {
        $("#custUsername").prev(label).val();
        // layer.msg("密码不能为空", {time: 2000, icon: 5, anim: 6})
        // $("#custPassword").face()
        return false;
    }
    if (custPhone == "") {
        layer.msg("手机号码不能为空", {time: 2000, icon: 5, anim: 6})
        $("#custPhone").face()
        return false;
    }
    if (validateCode == "") {
        layer.msg("验证码不能为空", {time: 2000, icon: 5, anim: 6})
        $("#validateCode").face()
        return false;
    }

    //这是使用ajax的方式提交
    $.ajax({
        type: 'post',
        url: 'loginSuccess.do',
        //data:$('#loginInputForm').serialize(),
        data: {
            'custUsername': custUsername,
            'custPassword': custPassword,
            'custPhone': custPhone,
            'validateCode': validateCode,
        },
        dataType: 'json',
        success: function (data) {
            var code = data.status;
            if (code == 0) {
                layer.msg(data.msg, {time: 2000, icon: 2, anim: 6});
                $("#captchaImage").attr("src", "changeCode.do?timestamp=" + (new Date()).valueOf());
                $("#validateCode").val("").focus(); // 清空并获得焦点
            } else if (code == 200) {
                // layer.msg("登陆成功，正在跳转……")
                window.location.href = data.url;
            } else if (code == 500) {
                layer.msg(data.msg, {time: 2000, icon: 2, anim: 6});
                $("#password").val("").focus(); // 清空并获得焦点
                $("#validateCode").val(""); // 清空并获得焦点
                $("#captchaImage").attr("src", "changeCode.do?timestamp=" + (new Date()).valueOf());
            }
        }
    });
}


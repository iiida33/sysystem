function myAccount() {
    $('#myAccount').addClass('active');
    $('#myOrder').removeClass('active');
    $('#mycollect').removeClass('active');
    $('#custInfo').show();
    $('#orderInfo').hide();
    $('#colltionInfo').hide();
    $.ajax({
        type: 'get',
        url: '/customer/getCustInfo.do',
        dataType: 'json'
    })
}

function myOrder() {
    $('#myAccount').removeClass('active');
    $('#myOrder').addClass('active');
    $('#mycollect').removeClass('active');
    $('#custInfo').hide();
    $('#orderInfo').show();
    $('#colltionInfo').hide();
    $.ajax({
        type: 'get',
        url: '',
        dataType: 'json'
    })
}

function mycollect() {
    $('#myAccount').removeClass('active');
    $('#myOrder').removeClass('active');
    $('#mycollect').addClass('active');
    $('#custInfo').hide();
    $('#orderInfo').hide();
    $('#colltionInfo').show();
    $.ajax({
        type: 'get',
        url: '',
        dataType: 'json'
    })
}

function editInfo() {
    var custUsername = $("#custUsername").val();
    var custEmail = $("#custEmail").val();
    var custPhone = $("#custPhone").val()
    if (!(/^[1][3,4,5,7,8][0-9]{9}$/.test(custPhone))) {
        alert("请输入正确的手机号码");
        return false;
    }

    if (!(/^.{3,18}$/.test(custUsername))) {
        alert("请设置用户名长度为3-18个字符");
        return false;
    }

    if (custEmail != "" && (!(/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/.test(custEmail)))) {
        alert("请设置正确的电子邮箱");
        return false;
    }

    $.ajax({
        type: 'post',
        url: '/customer/editCustInfo.do',
        dataType: 'json',
        data: {
            "custUsername": $("#custUsername").val(),
            "custName": $("#custName").val(),
            "custSex": $("input[name='custSex']:checked").val(),
            "custBirth": $("#custBirth").val(),
            "custPhone": $("#custPhone").val(),
            "custEmail": $("#custEmail").val(),
            "custAddress": $("#custAddress").val(),
            "pic": $("#custPic").val()
        },
        success: function (data) {
            if (data.status == 200) {
                alert(data.msg);
            }
            else {
                alert(data.msg);
            }
        }
    });
}

function editPassword() {
    var oldPassword = $('#custPassword').val();
    var newPassword = $('#newPassword').val();
    var newPassword1 = $('#newPassword1').val();
    if (oldPassword==""){
        alert("请输入原密码");
        return false;
    }
    if (newPassword==""){
        alert("请输入新密码");
        return false;
    }
    if (!(/^[a-zA-Z0-9_]{6,18}$/.test(newPassword))) {
        alert("密码由6-18个字母、数字、下划线组成!");
        return false;
    }
    if (newPassword!=newPassword1) {
        alert("两次输入密码不一致，请重新输入！")
        return false;
    }
    $.ajax({
        type: 'post',
        url: '/customer/changePassword.do',
        dataType: 'json',
        data: {
            "custPassword": oldPassword,
            "newPassword": newPassword
        },
        success: function (data) {
                alert(data.msg);
        }
    });
}


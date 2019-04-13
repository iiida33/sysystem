<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>圣婴网管理端</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="shortcut icon" href="../../../img/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../../static/lib/css/font.css">
    <link rel="stylesheet" href="../../../static/lib/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="../../../static/lib/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../static/lib/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="layui-anim layui-anim-up">
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">会员管理</a>
        <a>
          <cite>用户列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            注册时间：
            <input class="layui-input" placeholder="开始日" name="start" id="start">
            <input class="layui-input" placeholder="截止日" name="end" id="end">
            <input type="text" name="username" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <table class="layui-hide layui-table layui-form" id="demo" lay-filter="test"></table>

    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">修改密码</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>

</div>

<script>
    layui.use(['laydate', 'laypage', 'layer', 'table', 'laytpl', 'laydate', 'util', 'form'], function () {
        var $ = layui.jquery, form = layui.form;
        var util = layui.util;
        laypage = layui.laypage
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , laytpl = layui.laytpl
            , laydate = layui.laydate;
        table.render({
            elem: '#demo'
            , height: 480
            , url: '/customer/showAllCustomerMsg.do' //数据接口
            , title: '用户表'
            , page: true //开启分页
            , limits: [10, 15, 20]
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}
                , {field: 'custId', title: '用户ID', align: 'center', width: 80, fixed: 'left'}
                , {field: 'custUsername', title: '用户名', align: 'center', width: 100, fixed: 'left'}
                , {field: 'custName', title: '姓名', align: 'center', width: 90}
                , {field: 'custSex', title: '性别', align: 'center', width: 80}
                , {field: 'custPhone', title: '手机', align: 'center', width: 130}
                , {field: 'custEmail', title: '邮箱', align: 'center', width: 170}
                , {
                    field: 'custBirth', title: '生日', align: 'center', width: 150, templet: function (d) {
                        return (d.custBirth != null) ? layui.util.toDateString(d.custBirth, 'yyyy-MM-dd') : "";
                    }
                }
                , {field: 'custAddress', title: '地址', align: 'center', width: 250}
                , {
                    field: 'custCreate',
                    title: '注册时间',
                    align: 'center',
                    width: 150,
                    templet: function (d) {
                        return (d.custCreate != null) ? layui.util.toDateString(d.custCreate, 'yyyy-MM-dd') : "";
                    }
                }
                , {fixed: 'right', width: 150, title: '操作', align: 'center', toolbar: '#barDemo'}
            ]]
        });

        //监听行工具事件
        table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                , layEvent = obj.event; //获得 lay-event 对应的值
            if (layEvent === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    //向服务端发送删除指令
                    $.ajax({
                        type: 'get',
                        url: 'customer/deleteCustomer.do',
                        data: {"custId": obj.data.custId},
                        dataType: 'json',
                        success: function (result) {
                            if (result.status != "200") {
                                layer.msg(result.msg);
                            }
                            else {
                                layer.msg(result.msg);
                                obj.del(); //删除对应行（tr）的DOM结构
                                layer.close(index);
                            }
                        }
                    })
                });
            }
            else if (layEvent === 'edit') {
                // console.log(555555);
                // editPass(data);
                x_admin_show('修改用户密码','toPage.do?url=admin/member-password.jsp?custId='+data.custId+'&custUsername='+data.custUsername, 600,400);
            }
        });
    });

    function editPass(data) {
        layui.use(['layer', 'form'], function () {
            var $ = layui.jquery, layer = layui.layer, form = layui.form;//独立版的layer无需执行这一句
            layer.open({
                type: 2,
                title: '修改用户密码',
                area: ['650px', '350px'],
                fixed: false, //不固定
                maxmin: true,
                content: 'toPage.do?url=admin/member-password.jsp',
                success: function (layero, index) {
                    var body = layer.getChildFrame('body', index);
                    body.find('#custUsername').val(data.custUsername);
                    body.find('#custId').val(data.custId);
                    console.log(33333);
                }
            });
        })
    }

</script>
</body>
</html>
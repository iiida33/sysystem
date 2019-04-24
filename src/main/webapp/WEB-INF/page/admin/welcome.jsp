<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>圣婴网管理端</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="shortcut icon" href="../../../img/favicon.ico" type="image/x-icon" />
        <link rel="stylesheet" href="../../../static/lib/css/font.css">
        <link rel="stylesheet" href="../../../static/lib/css/xadmin.css">
        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script src="../../../static/lib/lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="../../../static/lib/js/xadmin.js"></script>
    </head>
    <body>
    <div class="x-body layui-anim layui-anim-up">
        <blockquote class="layui-elem-quote">欢迎管理员：
            <span class="x-red">${adminName}</span>！<span id="date"></span></blockquote>
        <fieldset class="layui-elem-field">
            <legend>数据统计</legend>
            <div class="layui-field-box">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
                                <div carousel-item="">
                                    <ul class="layui-row layui-col-space10 layui-this">
                                        <li class="layui-col-xs3">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>在售商品数</h3>
                                                <p>
                                                    <cite id="goodNum"></cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>会员数</h3>
                                                <p>
                                                    <cite id="customerNum"></cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>已完成订单数</h3>
                                                <p>
                                                    <cite id="orderFinishNum"></cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>待处理订单数</h3>
                                                <p>
                                                    <cite id="orderUnFiniNum"></cite></p>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </fieldset>
    </div>

    </body>
    <script type="text/javascript">
        window.onload=function(){
            var myDate = new Date();//获取系统当前时间
            var date = myDate.getFullYear()+"-"+ (myDate.getMonth()+1)+"-"+myDate.getDate()+" "+myDate.getHours()+":"+myDate.getMinutes()+":"+myDate.getSeconds();
            document.getElementById("date").innerHTML=date;
            layui.use(['form', 'layer'], function () {
                $ = layui.jquery;
                var form = layui.form
                    , layer = layui.layer;});
            $.ajax({
                type:"get",
                url:"admin/showWelcomeMsg.do",
                dataType:'json',
                success:function (data) {
                    // console.log(data);
                    document.getElementById('goodNum').innerHTML=data.goodNum;
                    document.getElementById('customerNum').innerHTML=data.customerNum;
                    document.getElementById('orderFinishNum').innerHTML=data.orderFinishNum;
                    document.getElementById('orderUnFiniNum').innerHTML=data.orderUnFiniNum;
                }
            })
        }
    </script>
</html>
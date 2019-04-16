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
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">商品管理</a>
        <a>
          <cite>商品列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 layui-form-pane">
            <div class="layui-form-item">
                <label class="layui-form-label">分类：</label>
                <div class="layui-input-inline">
                    <select name="cate1">
                        <option value="">一级分类</option>
                        <option value="杭州">杭州</option>
                        <option value="宁波">宁波</option>
                        <option value="温州">温州</option>
                        <option value="温州">台州</option>
                        <option value="温州">绍兴</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="cate2">
                        <option value="">二级分类</option>
                        <option value="西湖区">西湖区</option>
                        <option value="余杭区">余杭区</option>
                        <option value="拱墅区">临安市</option>
                    </select>
                </div>
                <button class="layui-btn"><i class="layui-icon">&#xe615;</i>搜索</button>
                <button class="layui-btn" type="button" id="add"><i class="layui-icon"></i>添加商品</button>
            </div>
        </form>
    </div>
    <table class="layui-table layui-form" id="goodTable" lay-filter="test"></table>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑商品信息</a>
        <a class="layui-btn layui-btn-warm layui-btn-xs" lay-event="edit">添加商品SKU</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
    <script type="text/html" id="stateTpl">
        {{# if (d.goodState==true){ }}
        <input type="checkbox" name="goodState" lay-skin="switch" data-id="{{d.goodId}}" value="{{d.goodState}}"
               lay-filter="stateSwitch" lay-text="上架|下架" checked/>
        {{# }else{}}
        <input type="checkbox" name="goodState" lay-skin="switch" data-id="{{d.goodId}}" value="{{d.goodState}}"
               lay-filter="stateSwitch" lay-text="上架|下架">
        {{#}}}
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
            elem: '#goodTable'
            , height: 480
            , url: 'good/showGoodList.do' //数据接口
            , title: '商品表'
            , page: true //开启分页
            , limits: [10, 15, 20]
            , cols: [[ //表头
                {field: 'goodId', title: '商品ID', align: 'center', width: 80}
                , {field: 'goodName', title: '商品名', align: 'center', width: 320}
                , {field: 'goodBrand', title: '品牌', align: 'center', width: 170}
                , {field: 'catName', title: '所属类别', align: 'center', width: 160}
                , {field: 'goodStock', title: '库存', align: 'center', width: 130}
                , {
                    field: 'goodState',
                    title: '上架状态',
                    unresize: true,
                    filter: "isShow",
                    align: 'center',
                    width: 130,
                    templet: '#stateTpl'
                }
                , {fixed: 'right', width: 250, title: '操作', align: 'center', toolbar: '#barDemo'}
            ]]
        });
        //监听上下架操作
        // form.on('switch(stateDemo)', function(obj){
        //     layer.tips(this.value + '：' + this.name + '：'+ obj.elem.checked, obj.othis);
        // });
        form.on('switch(stateSwitch)', function (obj) {
            var goodId = $(this).attr("data-id");
            var goodState = obj.elem.checked;
            // layer.tips(goodState+':'+goodId, obj.othis);
            $.ajax({
                type: 'get',
                url: 'good/changeGoodState.do',
                data:
                    {
                        "goodId": goodId
                        , "goodState": goodState
                    },
                dataType: 'json',
                success: function (result) {
                    if (result.status != "200") {
                        layer.msg(result.msg, {icon: 2, time: 1000}, function () {
                            location.replace(location.href);
                        });
                    }
                    else {
                        layer.msg(result.msg, {icon: 1, time: 1000}, function () {
                            location.replace(location.href);
                        });
                    }
                }
            })
        });

        //监听行工具事件
        table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                , layEvent = obj.event; //获得 lay-event 对应的值
            if (layEvent === 'del') {
                layer.confirm('真的删除商品么', function (index) {
                    var goodId = obj.data.goodId;
                    var goodState = obj.data.goodState;
                    var goodStock = obj.data.goodStock;
                    if (goodState) {
                        layer.msg("不能删除未下架商品！");
                        return false;
                    }
                    if (goodStock > 0) {
                        layer.msg("商品仍有库存，不能删除！");
                        return false;
                    }
                    //向服务端发送删除指令
                    $.ajax({
                        type: 'get',
                        url: 'good/deleteGood.do',
                        data: {"goodId": goodId}
                    });
                    layer.msg("删除成功！");
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                })
            }
            else if (layEvent === 'edit') {
                var id = data.goodId;
                x_admin_show('编辑商品信息', 'good/showGoodEditMsg.do', 800, 600);
            }
        })

    });
    $('#add').click(function () {
        x_admin_show('添加商品', 'good/goodEditPage.do',900, 600);
    })

</script>

</body>

</html>
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
    <link rel="stylesheet" href="../../../static/js/treeTable/design/css/layui.css">
    <script src="../../../static/js/treeTable/design/layui.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../../static/lib/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="layui-layout-body" style="padding: 10px">
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">分级管理</a>
        <a>
          <cite>多级分类</cite></a>
      </span>
    <a class="layui-btn  layui-btn-normal" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新" id="refresh"><i class="layui-icon" id="iRefresh">&#xe666;</i></a>
</div>
<br/>
<%--<a class="layui-btn layui-btn-primary" onclick="print();">打印缓存对象</a>--%>
<button class="layui-btn " onclick="x_admin_show('添加分类','toPage.do?url=admin/cate-add.jsp')"><i
        class="layui-icon"></i>添加分类
</button>
<div style="height: 550px">
    <table class="layui-hidden layui-table layui-form" id="treeTable" lay-filter="treeTable">
    </table>
</div>
<script type="text/html" id="barDemo">
    <button class="layui-btn layui-btn layui-btn-xs" onclick=""><i
            class="layui-icon">&#xe642;</i>编辑
    </button>
    <%--<button class="layui-btn layui-btn-warm layui-btn-xs" onclick=""><i--%>
    <%--class="layui-icon">&#xe642;</i>添加子栏目--%>
    <%--</button>--%>
    <button class="layui-btn-danger layui-btn layui-btn-xs" onclick=""
            href="javascript:;"><i class="layui-icon">&#xe640;</i>删除
    </button>
</script>
<script>
    var editObj = null, ptable = null, treeGrid = null, tableId = 'treeTable', layer = null;
    layui.config({
        base: './static/js/treeTable/design/extend/'
    }).extend({
        treeGrid: 'treeGrid'
    }).use(['jquery', 'treeGrid', 'layer'], function () {
        var $ = layui.jquery;
        treeGrid = layui.treeGrid;//很重要
        layer = layui.layer;
        ptable = treeGrid.render({
            id: tableId
            , elem: '#' + tableId
            , idField: 'id'
            , url: './category/showCategoryAll.do'
            , cellMinWidth: 100
            , treeId: 'catId'//树形id字段名称
            , treeUpId: 'precatId'//树形父id字段名称
            , treeShowName: 'catName'//以树形式显示的字段
            , treeOrder: 'catOrder'
            , height: "315"
            , cols: [[
                {field: 'catId', width: 100, title: 'ID'}
                , {field: 'catName', title: '分类名'}
                , {field: 'catOrder', title: '排序', width: 80}
                /*,{field:'precatId', title: 'pid'}*/
                , {
                    width: 200, title: '操作', align: 'center'
                    , templet: function (d) {
                        var html = '';
                        var edit = '<a class="layui-btn layui-btn layui-btn-xs" lay-event="edit" onclick=""><i class="layui-icon">&#xe642;</i>编辑 </a>'
                        // var addBtn = '<a class="layui-btn layui-btn-warm  layui-btn-xs" lay-event="add" onclick=""><i  class="layui-icon">&#xe642;</i>添加子分类 </a>'
                        var delBtn = '<a class="layui-btn-danger layui-btn layui-btn-xs" lay-event="del" onclick="" href="javascript:;"><i class="layui-icon">&#xe640;</i>删除</a>';
                        // return edit + addBtn + delBtn;
                        return edit + delBtn;
                    }
                }
            ]]
            , page: false
        });

        treeGrid.on('tool(' + tableId + ')', function (obj) {
            if (obj.event === 'del') {//删除行
                // console.log(obj);
                del(obj.data);
            } else if (obj.event === "add") {//添加行
                add(obj.data);
            } else if (obj.event === "edit") {//添加行
                edit(obj.data);
            }
        });

    });

    function del(data) {
        layer.confirm("确定删除分类吗？请确认该分类下无二级分类或商品！", {icon: 3, title: '提示'},
            function (index) {//确定回调
                /*obj.del();*/
                // var data = obj.data;
                // console.log(data.catId);
                $.ajax({
                    url: 'category/deleteCategory.do',
                    data: {
                        "catId": data.catId,
                        "isParent": data.isParent
                    },
                    dataType: 'json',
                    type: 'post',
                    success: function (result) {
                        var status = result.status;
                        if (status == "200") {
                            layer.msg(result.msg, {time: 5000});
                            location.replace(location.href);
                        }
                        else {
                            layer.msg(result.msg);
                        }
                    }
                });
                /*window.location.href = "http://localhost:8080/category/showCategoryAll.do" */
                layer.close(index);
            }, function (index) {//取消回调
                layer.close(index);
            }
        );
    }


    var i = 1000;

    //编辑
    function edit(data) {
        layui.use(['layer', 'form'], function () {
            var $ = layui.jquery, layer = layui.layer, form = layui.form;//独立版的layer无需执行这一句
            layer.open({
                type: 2,
                title: '编辑分类信息',
                area: ['450px', '400px'],
                fixed: false, //不固定
                maxmin: true,
                content: 'toPage.do?url=admin/cate-edit.jsp',
                success: function (layero, index) {
                    // console.log(layero);
                    // console.log(index);
                    var body = layer.getChildFrame('body', index);
                    // var iframeWin = window[layero.find('iframe')[0]['name']];
                    body.find('#catId').val(data.catId);
                    body.find('#catName').val(data.catName);
                    body.find('#catOrder').val(data.catOrder);
                }
            });
        })
    }

    // function print() {
    //     console.log(treeGrid.cache[tableId]);
    //     var loadIndex = layer.msg("对象已打印，按F12，在控制台查看！", {
    //         time: 3000
    //         , offset: 'auto'//顶部
    //         , shade: 0
    //     });
    // }
</script>
</body>

</html>
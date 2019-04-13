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
        <input id="catId" type="hidden"/>
        <div class="layui-form-item">
            <label for="catName" class="layui-form-label">
                <span class="x-red">*</span>类名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="catName" name="catName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="catOrder" class="layui-form-label">
                类别排序
            </label>
            <div class="layui-input-inline">
                <input type="text" id="catOrder" name="catOrder" value="1" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="catOrder" class="layui-form-label">
            </label>
            <button class="layui-btn" lay-filter="edit" lay-submit="">
                修改
            </button>
        </div>
    </form>
</div>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
              //监听提交
        form.on('submit(edit)', function (data) {
            var catId = $("#catId").val();
            var catName = $("#catName").val();
            var carOrder = $("#catOrder").val();
            // 监听提交
            $.ajax({
                type: 'post',
                url: 'category/editCategory.do',
                data: {
                    "catId": catId,
                    "catName": catName,
                    "catOrder": carOrder
                },
                dataType: 'json',
                success: function (data) {
                    var status = data.status;
                    // 说明存在同名
                    if (status != "200") {
                        // console.log(data);
                        layer.msg(data.msg);
                    } else {
                        layer.alert(data.msg, {
                                title: '修改信息'
                            },
                            function () {
                                window.parent.location.reload();
                                var index = parent.layer.getFrameIndex(window.name);
                                parent.layer.close(index);
                            }
                        );
                    }
                }
            });
            return false;
        });
    });
</script>
</body>
</html>

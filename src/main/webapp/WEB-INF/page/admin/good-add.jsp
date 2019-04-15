<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>商品添加</title>
    <link rel="stylesheet" href="../../../static/js/uploadPic/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../../static/js/uploadPic/font-awesome/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css" href="../../../static/js/uploadPic/css/common/header.css"/>
    <link rel="stylesheet" type="text/css" href="../../../static/js/uploadPic/css/goodsAdd.css"/>
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <!--主体-->
    <div class="layui-body" id="admin-body">
        <!-- 内容主体区域 -->
        <form class="layui-form goodsAddForm" action="" method="post">
            <div id="goodBaseMsg">
                <input type="hidden" name="goodId" id="goodId" value="1">
                <h1>商品信息</h1>
                <hr style="margin-bottom: 30px"/>
                <div class="layui-form-item">
                    <label class="layui-form-label">分类</label>
                    <div class="layui-input-inline">
                        <select name="cate1" id="cate1" lay-filter="cate1Change" style="width: 232px;height: 30px">
                            <option value="">一级分类</option>
                            <c:if test="${firstCategory!=null}">
                                <c:forEach items="${firstCategory}" var="fc">
                                    <%--<c:if test="${fc.pid==null}">   --%>
                                    <option value="${fc.catId }"> ${fc.catName }</option>
                                    <%--</c:if>--%>
                                </c:forEach>
                            </c:if>
                        </select>
                    </div>
                    <div class="layui-input-inline">
                        <select name="cate2" id="cate2" lay-filter="cate2Change" style="width: 232px;height: 30px">
                            <option value="">二级分类</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">商品名称</label>
                    <div class="layui-input-inline">
                        <input type="text" name="goodName" id="goodName" value="${goodName}" required
                               lay-verify="required" placeholder="请输入商品名称"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">品牌</label>
                    <div class="layui-input-inline">
                        <input type="text" name="goodBrand" id="goodBrand" value="${goodBrand}" placeholder="商品品牌"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">商品介绍</label>
                    <div class="layui-input-inline">
                        <textarea name="goodDescribe" id="goodDescribe" placeholder="商品介绍"
                                  class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">商品属性:</label>
                    <div id="propsMsg" class="layui-input-inline" style="width: 500px;padding-top: 40px;"></div>
                    <script id="propsTemplate" type="text/html">
                        {{# for(var i = 0; i < d.length; i++){ }}
                        <div style="float: left;padding-top: 10px;">
                            <label class="layui-form-label"
                                   style="width: 60px;text-align: left;">{{d[i].pnName}}</label>
                            <div class="layui-input-inline" style="width: 260px;">
                                <select name="propValue" id="propValue{{i}}" lay-filter="pvChange">
                                    <option value="">请选择</option>
                                    {{# for(var j = 0; j < d[i].propValues.length; j++){ }}
                                    <option value="{{d[i].propValues[j].pvId }}"> {{d[i].propValues[j].pvName }}
                                    </option>
                                    {{# } }}
                                </select>
                            </div>
                        </div>
                        {{# } }}
                    </script>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">商品图片</label>
                    <div class="layui-input-inline">
                        <%--<c:if test="${goodImage !=null}">--%>
                        <%--<img src="/goodPic/${goodImage}" width=100 height=100/>--%>
                        <%--<br/>--%>
                        <%--</c:if>--%>
                        <img id="goodImg" src="/goodPic/${goodImage}" alt="请上传图片" width="100px" height="100px"/>
                        <button type="button" class="layui-btn" id="goodPic">
                            <i class="layui-icon">&#xe67c;</i>上传图片
                        </button>
                    </div>
                </div>
            </div>
            <hr style="margin-bottom: 30px"/>
            <div id="goodSkuMsg">
                <h1>商品SKU信息</h1>
                <hr style="margin-bottom: 30px"/>
                <div class="layui-form-item">
                    <label class="layui-form-label">销售属性:</label>
                    <div id="salePropsMsg" class="layui-input-inline" style="width: 500px;padding-top: 40px;"></div>
                    <script id="salePropsTemplate" type="text/html">
                        {{# for(var i = 0; i < d.length; i++){ }}
                        <div class="layui-form-item" pane="" style="margin-left: 10px;">
                            <label class="layui-form-label"style="text-align: left;width: 50px;">{{d[i].pnName}}</label>
                            <div class="layui-input-block">
                                {{# for(var j = 0; j < d[i].propValues.length; j++){ }}
                                <input type="checkbox" name="saleProp{{i}}{{j}}" value="{{d[i].propValues[j].pvId }}"
                                       lay-skin="primary" title="{{d[i].propValues[j].pvName }}" lay-filter="salePropCB{{i}}">
                                {{# } }}
                            </div>
                        </div>
                        {{# } }}
                    </script>
                </div>
                <div class="layui-form">
                    <table class="layui-table">
                        <thead>
                        <tr>
                            <th id="salePropName"></th>
                            <th>sku编号</th>
                            <th>价格</th>
                            <th>库存</th>
                            <th>商品sku图片</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td width="60px"><label>sku编号</label></td>
                            <td><input type="text" name="skuNum" id="skuNum" value="${skuNum}" required
                                       lay-verify="required" placeholder="sku编号"
                                       autocomplete="off" class="layui-input"></td>
                            <td><input type="text" name="skuPrice" id="skuPrice" value="${skuPrice}" placeholder="价格"
                                       autocomplete="off" class="layui-input"></td>
                            <td><input type="text" name="skuStock" id="skuStock" value="${skuStock}" placeholder="库存"
                                       autocomplete="off" class="layui-input"></td>
                            <td>
                                <img id="goodSkuImg" src="/goodPic/${skuPic}" alt="请上传图片" width="100px" height="100px"/>
                                <button type="button" class="layui-btn" id="goodSkuPic">
                                    <i class="layui-icon">&#xe67c;</i>上传图片
                                </button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <hr style="margin-bottom: 30px"/>
            <div id="goodPicSet">
                <div class="layui-form-item">
                    <label class="layui-form-label">商品图片上传</label>
                    <div class="layui-input-block">
                        <button type="button" class="layui-btn" id="test1">
                            <i class="layui-icon">&#xe67c;</i>选择图片（最多选择6张，单张图片最大为10M）
                        </button>
                        <button type="button" class="layui-btn" id="test9">开始上传</button>
                        <button type="button" class="layui-btn" id="cleanImgs"><i class="fa fa-trash-o fa-lg"></i>清空图片预览
                        </button>
                    </div>
                    <blockquote class="layui-elem-quote layui-quote-nm"
                                style="width: 800px;margin-top: 10px;margin-left: 30px;">
                        预览图：
                        <div class="layui-upload-list" id="demo2"></div>
                    </blockquote>
                </div>
                <input type="text" id="imgUrls" name="imgUrls" style="display: none;" class="layui-input">
            </div>
            <hr style="margin-bottom: 30px"/>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" type="button" style="width: 400px;" id="btnSubmit">添加商品</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="../../../static/js/jquery-3.3.1.js"></script>
<script src="../../../static/js/uploadPic/js/jquery-1.11.1.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../../static/js/uploadPic/layui/layui.js"></script>
<script type="text/javascript" src="../../../static/js/uploadPic/js/common.js"></script>
<script type="text/javascript" src="../../../static/js/uploadPic/js/goodsMutiUpload.js"></script>
<script>
    //JavaScript代码区域
    layui.use(['element', 'form', 'laydate', 'laytpl', 'upload'], function () {
        var upload = layui.upload;
        var element = layui.element;
        var form = layui.form
            , laytpl = layui.laytpl;

        //商品图片上传
        var uploadInst = upload.render({
            elem: '#goodPic' //绑定元素
            , url: '/upload.do' //上传接口
            , done: function (res) {
                //上传完毕回调
                console.log(res);
                $("#goodImg").attr("src", res.data.src);
            }
            , error: function () {
                //请求异常回调
            }
        });
        //商品SKU图片上传
        var uploadInst2 = upload.render({
            elem: '#goodSkuPic' //绑定元素
            , url: '/upload.do' //上传接口
            , done: function (res) {
                //上传完毕回调
                console.log(res);
                $("#goodSkuImg").attr("src", res.data.src);
            }
            , error: function () {
                //请求异常回调
            }
        });
        //监听一级类别下拉框
        form.on('select(cate1Change)', function (data) {
            var cid = data.value;
            if (cid != "") {
                $.ajax({
                    type: 'POST',
                    dataType: 'json',
                    url: '/category/showChildCateAndProp.do',
                    data: {
                        "precatId": cid
                    },
                    success: function (data) {
                        var categories = data.categories;
                        var unSaleProps = data.unSaleProps;
                        var saleProps = data.saleProps;
                        console.log(unSaleProps);
                        var cate2Obj = document.getElementById("cate2");
                        cate2Obj.innerHTML = "";
                        for (var i = 0; i < categories.length; i++) {
                            var cid = categories[i].catId;
                            var cname = categories[i].catName;
                            cate2Obj.innerHTML = cate2Obj.innerHTML + "<option value='" + cid + "'>" + cname + "</option>";
                        }
                        form.render('select');
                        //商品属性显示模板
                        var getTpl = propsTemplate.innerHTML
                            , view1 = document.getElementById('propsMsg');
                        laytpl(getTpl).render(unSaleProps, function (html) {
                            view1.innerHTML = html;
                        });
                        form.render('select');
                        //商品销售属性显示模板
                        var getTp2 = salePropsTemplate.innerHTML
                            , view2 = document.getElementById('salePropsMsg');
                        laytpl(getTp2).render(saleProps, function (html) {
                            view2.innerHTML = html;
                        });
                        form.render('select');
                        form.render();
                    }
                });
            }
            else {
                var cate2Obj = document.getElementById("cate2");
                cate2Obj.innerHTML = "<option value=''>二级分类</option>";
                view1 = document.getElementById('propsMsg');
                view2 = document.getElementById('salePropsMsg');
                view1.innerHTML = "";
                view2.innerHTML = "";
                form.render();
            }
        });
        //监听二级类别下拉框
        form.on('select(cate2Change)', function (data) {
            var cid = data.value;
        });
        //监听复选框事件
        form.on('checkbox(salePropCB0)', function(data){
            console.log(data.elem); //得到checkbox原始DOM对象
            console.log(data.elem.checked); //是否被选中，true或者false
            console.log(data.value); //复选框value值，也可以通过data.elem.value得到
            console.log(data.othis); //得到美化后的DOM对象
        });
    });

</script>
</body>

</html>
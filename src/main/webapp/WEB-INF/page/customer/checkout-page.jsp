<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<!--[if IE]><![endif]-->
<!--[if lt IE 7 ]>
<html lang="en" class="ie6"><![endif]-->
<!--[if IE 7 ]>
<html lang="en" class="ie7"><![endif]-->
<!--[if IE 8 ]>
<html lang="en" class="ie8"><![endif]-->
<!--[if IE 9 ]>
<html lang="en" class="ie9"><![endif]-->
<!--[if (gt IE 9)|!(IE)]>
<html lang="en"> <!--<![endif]-->
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>圣婴网-Hi,babies!</title>
    <meta name="description" content="母婴产品网上商城">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Google Fonts
    ============================================ -->
    <link rel="stylesheet"
          href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600&amp;subset=latin,latin-ext" type="text/css"
          media="all"/>
    <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>

    <!-- Favicon-->
    <link rel="shortcut icon" type="image/x-icon" href="../../../img/favicon.ico">
    <!-- CSS  -->
    <!-- style CSS -->
    <link rel="stylesheet" href="../../../static/css/style.css">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="../../../static/css/bootstrap.min.css">
    <!-- owl.carousel CSS -->
    <link rel="stylesheet" href="../../../static/css/owl.carousel.css">
    <!-- owl.theme CSS -->
    <link rel="stylesheet" href="../../../static/css/owl.theme.css">
    <!-- owl.transitions CSS -->
    <link rel="stylesheet" href="../../../static/css/owl.transitions.css">
    <!-- font-awesome.min CSS -->
    <link rel="stylesheet" href="../../../static/css/font-awesome.min.css">
    <!-- meanmenu CSS -->
    <link rel="stylesheet" href="../../../static/css/meanmenu.min.css" media="all"/>
    <!-- animate CSS -->
    <link rel="stylesheet" href="../../../static/css/animate.css">
    <!-- nivo slider CSS -->
    <link rel="stylesheet" href="../../../static/css/nivo-slider.css" type="text/css"/>
    <link rel="stylesheet" href="../../../static/css/preview.css" type="text/css" media="screen"/>
    <!-- normalize CSS -->
    <link rel="stylesheet" href="../../../static/css/normalize.css">
    <!-- main CSS -->
    <link rel="stylesheet" href="../../../static/css/main.css">
    <!-- responsive CSS -->
    <link rel="stylesheet" href="../../../static/css/responsive.css">
    <script src="../../../static/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body class="check-out-page">
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->

<!-- Header Area-->
<jsp:include page="../../../WEB-INF/page/common/header.jsp"/>
<!-- Brade Come Start -->
<div class="braed-come">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="braed">
                    <a href="/"><i class="fa fa-home"></i></a>
                    <span class="navegation-page">></span>
                    建立订单
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Brade Come End -->
<!--Cut Page Medile Section Start-->
<div class="cut-page-medile-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12  col-md-12">
                <div class="cut-page-tab bg-bd">
                    <p class="tab-heading">建立订单</p>
                    <div class="tab-content">
                        <div role="tabpanel" class="" id="shipping">
                            <div>
                                <div class="checkOutTitle">确认收货地址:</div>
                                <div>
                                    <c:forEach items="${deliveryInfos}" var="deliveryInfo">
                                        <div>
                                            <input type="radio" name="addressId" id="addressId"
                                                   value="${deliveryInfo.delId}"/>
                                            <input type="text" name="address"
                                                   value="${deliveryInfo.delArea}${deliveryInfo.delAddress}"
                                                   readonly="readonly" style="border: none;width: 250px"/>&nbsp;
                                            <input type="text" name="people" value="${deliveryInfo.delReceiver}(收)"
                                                   readonly="readonly" style="border: none;width: 60px"/>&nbsp;
                                            <input type="text" name="people" value="${deliveryInfo.delPhone}"
                                                   readonly="readonly" style="border: none;width: 100px"/>
                                            <label><a href="#">修改</a></label>
                                        </div>
                                    </c:forEach>
                                    <c:if test="${deliverMsgLen<0}">
                                        <div>
                                            <label>暂无收货信息，请添加！</label>
                                        </div>
                                    </c:if>
                                    <c:if test="${deliverMsgLen>0&&deliverMsgLen<6}">
                                        <div style="margin-top: 10px;margin-left: 20px;">
                                            <button type="button" class="button">添加收货地址</button>
                                        </div>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                        <div role="tabpanel" class="" id="payment">
                            <div>
                                <div class="checkOutTitle">确认订单信息:</div>
                                <form>
                                    <table class="main-tabel table table-bordered">
                                        <thead class="fast-tabel">
                                        <tr>
                                            <th class="tr-pro"></th>
                                            <th class="tr-des">订单信息</th>
                                            <th class="tr-avail">商品属性</th>
                                            <th class="tr-price">单价</th>
                                            <th class="tr-qty">数量</th>
                                            <th class="tr-ammount">小计</th>
                                            <th class="tr-tras"></th>
                                        </tr>
                                        </thead>
                                        <tbody class="sceand-tabel">
                                        <c:forEach items="${shoppingCartGoodSkus}" var="shoppingCartGoodSku">
                                            <tr>
                                                <td class="td-img-tr">
			 										<span class="td-img">
			 											<img src="${shoppingCartGoodSku.goodSku.skuPic}" alt="img"
                                                             id="pic">
			 										</span>
                                                </td>
                                                <td class="td-p-title">
                                                    <span><a
                                                            href="#">${shoppingCartGoodSku.goodBrand} ${shoppingCartGoodSku.goodName}</a></span>
                                                </td>
                                                <td class="td-stok">
                                                    <span>${shoppingCartGoodSku.props}</span>
                                                </td>
                                                <td class="td-unite">
                                                    <span>${shoppingCartGoodSku.goodSku.skuPrice}</span>
                                                </td>
                                                <td class="td-quentety">
                                                    <div style="border: 0;margin-left: 20px">
                                                        <div class="dec qtybutton">-</div>
                                                        <input type="number" id="count"
                                                               style="float: left; width: 50px;height: 30px"
                                                               value="${shoppingCartGoodSku.cartCount}">
                                                        <div class="inc qtybutton">+</div>
                                                    </div>
                                                </td>
                                                <td class="td-t-amount">
                                                    <span id="eachMoney">${shoppingCartGoodSku.money}</span>
                                                </td>
                                                <td class="td-trash">
                                                    <a href="#"><i class="fa fa-trash"></i></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                        <tfoot class="thard-tabel">
                                        <tr>
                                            <td colspan="7" class="">
                                                <label>给商家留言：</label>
                                                <textarea name="remark" id="remark" cols="50" rows="3"></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="7" class="totel big-totol">合计:<span
                                                    id="countMoney">${tatalmoney}</span></td>
                                        </tr>
                                        </tfoot>
                                    </table>
                                </form>
                            </div>
                            <div class="bootom-section">
                                <button class="button" type="button" id="comitte">提交订单</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Cut Page Medile Section Start End-->
<!-- Footer Area Start-->
<jsp:include page="../../../WEB-INF/page/common/foot.jsp"/>
<!-- Footer Area End -->
<!-- JS -->
<!-- JS -->
<!-- jquery-1.11.3.min js  -->
<script src="../../../static/js/vendor/jquery-1.11.3.min.js"></script>
<!-- price-slider js -->
<script src="../../../static/js/price-slider.js"></script>
<!-- bootstrap js  -->
<script src="../../../static/js/bootstrap.min.js"></script>
<!-- jquery-meanmenu js -->
<script src="../../../static/js/jquery.meanmenu.js"></script>
<!-- owl.carousel.min js  -->
<script src="../../../static/js/owl.carousel.min.js"></script>
<!-- Nivo slider js  -->
<script src="../../../static/js/jquery.nivo.slider.js" type="text/javascript"></script>
<!-- elevateZoom js  -->
<script src="../../../static/js/jquery.elevateZoom-3.0.8.min.js"></script>
<!-- jquery.bxslider.min.js  -->
<script src="../../../static/js/jquery.bxslider.min.js"></script>
<!-- wow js  -->
<script src="../../../static/js/wow.js"></script>
<!-- jquery.scrollUp js  -->
<script src="../../../static/js/jquery.scrollUp.min.js"></script>
<!-- plugins js-->
<script src="../../../static/js/plugins.js"></script>
<!-- main js-->
<script src="../../../static/js/main.js"></script>
<script src="../../../static/js/jquery-3.3.1.js"></script>
<script src="../../../static/js/layer/layer.js"></script>
<script>
    $(function () {
        var m = $("#countMoney").text();
        var countMoney = parseFloat(m);
        var deliverID = 0;
        $(".cart-plus-minus-button").append('<div class="dec qtybutton">-</div><div class="inc qtybutton">+</div>');
        $(".qtybutton").on("click", function () {
            var $button = $(this);
            var oldValue = $button.parent().find("input").val();
            var totalMoney = 0.0;
            var price = $button.parent().parent().parent().find(".td-unite").text();
            price = parseFloat(price);
            if ($button.text() == "+") {
                var newVal = parseFloat(oldValue) + 1;
                totalMoney = price * newVal;
                countMoney = countMoney += (price * 1);
            } else {
                // Don't allow decrementing below zero
                if (oldValue > 1) {
                    var newVal = parseFloat(oldValue) - 1;
                    totalMoney = price * newVal;
                    countMoney -= (price * 1);
                } else {
                    newVal = 1;
                    totalMoney = price * newVal;
                    layer.msg("不能再减了！");
                }
            }
            $button.parent().find("input").val(newVal);
            $button.parent().parent().parent().find(".td-t-amount").text(totalMoney);
            $("#countMoney").text(countMoney)
            var cartId = $button.parent().parent().parent().find("input").val();
        });

        $(document).ready(function () {
            $('input[type=radio][name=addressId]').change(function () {
                deliverID = this.value;
            });
        });

        $("#comitte").click(function () {
            layer.confirm('确认提交？', {
                btn: ['确认', '取消'] //按钮
            }, function () {
                if (deliverID == 0) {
                    layer.msg('请选择一个快递地址！');
                    return false;
                }
                layer.msg('正在提交', {
                    time: 2000, //20s后自动关闭
                });
                var remark = $("#remark").val();
                var len =${requestScope.shopCartLen};
                var orderDetails = new Array();
                console.log(len);
                for (var i = 0; i < len; i++) {
                    var orderDetail = new Object();
                    var aa ="${requestScope.shoppingCartGoodSkus[i].skuId}";
                    console.log(aa);
                    orderDetail.skuId = "${requestScope.shoppingCartGoodSkus[i].skuId}";
                    orderDetail.orderdtlName= "${requestScope.shoppingCartGoodSkus[i].goodBrand}" + "${requestScope.shoppingCartGoodSkus[i].goodName}";
                    orderDetail.orderdtlProps= "${requestScope.shoppingCartGoodSkus[i].props}";
                    orderDetail.orderdtlCount= $("#count").val();
                    orderDetail.orderdtlPrice="${requestScope.shoppingCartGoodSkus[i].goodSku.skuPrice}";
                    orderDetail.orderdtlPrice= $("#eachMoney").text();
                    console.log(orderDetail);
                }
                var value = "${requestScope.shoppingCartGoodSkus[0].skuId}";
                console.log(value);
                // $.ajax({
                //     url: "/order/addOrder.do",
                //     type: "get",
                //     data: {
                //         "deliverID": deliverID
                //     }
                // });
            }, function () {
                layer.msg('已取消！', {
                    time: 2000, //2s后自动关闭
                });
            });
            // var cartIds = new Array();
            // for(var i = 0; i<$(".checkon").length; i++){
            //     var checkbox = $(".checkon")[i];
            //     if(checkbox.checked){
            //         // do something
            //         var id=checkbox.value;
            //         cartIds.push(id);
            //     }else{
            //         // do something
            //         // console.log(2222);
            //     }
            // }
            // console.log(cartIds);
            // var cartId =JSON.stringify(cartIds);
            // console.log(cartId);
            // window.location.href = "/order/toCheckOutPage.do?cartIds="+cartIds;
            // $.ajax({
            //     url: "/order/toCheckOutPage.do",
            //     type: "get",
            //     data: {
            //         "cartIds": cartId
            //     }
            // });
        })
    });
</script>
</body>

</html>


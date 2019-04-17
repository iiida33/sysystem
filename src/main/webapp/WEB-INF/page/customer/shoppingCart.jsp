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
                    购物车
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
                    <div class="tab-content">
                        <div role="tabpanel" class="" id="payment">
                            <div>
                                <div class="checkOutTitle">我的购物车</div>
                                <form>
                                    <table class="main-tabel table table-bordered">
                                        <thead class="fast-tabel">
                                        <tr>
                                            <th></th>
                                            <th class="tr-pro" colspan="3">商品信息</th>
                                            <th class="tr-price">单价</th>
                                            <th class="tr-qty">数量</th>
                                            <th class="tr-ammount">小计</th>
                                            <th class="tr-tras"></th>
                                        </tr>
                                        </thead>
                                        <tbody class="sceand-tabel">
                                        <c:if test="${state}">
                                            <c:forEach items="${shoppingCartGoodSkus}" var="shoppingCartGoodSku"
                                                       varStatus="ii">
                                                <tr>
                                                    <input type="hidden" name="catId"
                                                           value="${shoppingCartGoodSku.cartId}">
                                                    <td class="td-checkbox">
                                                        <input type="checkbox" class="checkon" value="${shoppingCartGoodSku.cartId}"/>
                                                    </td>
                                                    <td class="td-img-tr">
			 										<span class="td-img">
			 											<img src="${shoppingCartGoodSku.goodSku.skuPic}" alt="img"
                                                             style="height: 100px;width: 100px">
			 										</span>
                                                    </td>
                                                    <td class="td-p-title">
                                                        <a href="#">${shoppingCartGoodSku.goodBrand} ${shoppingCartGoodSku.goodName}</a>
                                                    </td>
                                                    <td class="td-stok">
                                                            ${shoppingCartGoodSku.props}
                                                    </td>
                                                    <td class="td-unite">
                                                            ${shoppingCartGoodSku.goodSku.skuPrice}
                                                    </td>
                                                    <td class="td-quentety">
                                                        <div style="border: 0;margin-left: 20px">
                                                            <div class="dec qtybutton">-</div>
                                                            <input type="number"
                                                                   style="float: left; width: 50px;height: 30px"
                                                                   value="${shoppingCartGoodSku.cartCount}">
                                                            <div class="inc qtybutton">+</div>
                                                        </div>
                                                    </td>
                                                    <td class="td-t-amount" id="test">
                                                            ${shoppingCartGoodSku.money}
                                                    </td>
                                                    <td class="td-trash">
                                                        <a href="/shoppingCart/deleteOneCartRecord.do?cartId=${shoppingCartGoodSku.cartId}">
                                                            <i class="fa fa-trash"></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </c:if>
                                        </tbody>
                                    </table>
                                </form>
                                <c:if test="${!state}">
                                    <h1 style="text-align: center">购物车空空如也！</h1>
                                </c:if>
                            </div>
                            <div class="bootom-section">
                                <button class="button" type="button" id="checkOut">结算</button>
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
            } else {
                // Don't allow decrementing below zero
                if (oldValue > 1) {
                    var newVal = parseFloat(oldValue) - 1;
                    totalMoney = price * newVal;
                } else {
                    newVal = 1;
                    totalMoney = price * newVal;
                    layer.msg("不能再减了！");
                }
            }
            $button.parent().find("input").val(newVal);
            $button.parent().parent().parent().find(".td-t-amount").text(totalMoney);
            var cartId = $button.parent().parent().parent().find("input").val();
            $.ajax({
                url: "/shoppingCart/changeShopCart.do",
                type: "post",
                data: {
                    "cartId": cartId
                    , "cartCount": newVal
                }
            });
        });

        $("#checkOut").click(function () {
            var aa = $("input[type='checkbox']").is(':checked');
            if (!aa) {
                layer.msg("请先选择结算商品！");
            }
            var cartIds = new Array();
            for(var i = 0; i<$(".checkon").length; i++){
                var checkbox = $(".checkon")[i];
                if(checkbox.checked){
                    // do something
                    var id=checkbox.value;
                    cartIds.push(id);
                }else{
                    // do something
                    // console.log(2222);
                }
            }
            console.log(cartIds);
            var cartId =JSON.stringify(cartIds);
            console.log(cartId);
            window.location.href = "/order/toCheckOutPage.do?cartIds="+cartIds;
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


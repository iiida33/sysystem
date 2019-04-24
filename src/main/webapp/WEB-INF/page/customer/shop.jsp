<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<!--[if IE]><![endif]-->
<!--[if lt IE 7 ]>
<html lang="en" class="ie6"> <![endif]-->
<!--[if IE 7 ]>
<html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8 ]>
<html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9 ]>
<html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html class="no-js" lang="">
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
    <!-- jquery-ui CSS
============================================ -->
    <link rel="stylesheet" href="../../../static/css/jquery-ui.css">
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
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
    <script src="http://cdn.staticfile.org/artTemplate.js/3.0.1/template.js"></script>
</head>
<body class="page-one">
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->


<!-- Header Area-->
<jsp:include page="../../../WEB-INF/page/common/header.jsp"/>
<!-- Brade Come Start -->
<div class="braed-come">
    <div class="container">
        <input type="hidden" value="${catId}" id="catId">
        <div class="row">
            <div class="col-lg-12 col-md-12">
                <div class="braed">
                    <a href="/"><i class="fa fa-home"></i></a>
                    <c:if test="${preId!=0}">
                        <span class="navegation-page">></span>
                        <a href="/toGoodList.do?catId=${category.catId}"> ${category.catName}</a>
                    </c:if>
                    <span class="navegation-page">></span>
                    ${catName}
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Page Medile Section Strat-->
<section class="page-medile-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="product-left">
                    <div class="beds-section bg-bd">
                        <h4 class="pp-left-heading"><a
                                href="/toGoodList.do?catId=${category.catId}">${category.catName}</a></h4>
                        <div class="category-menu" id="cate-toggle">
                            <ul>
                                <c:forEach var="childCategory" items="${category.categoryChild}">
                                    <c:choose>
                                        <c:when test="${childCategory.catId==catId}">
                                            <li style="background-color: aliceblue;">
                                                <a href="/toGoodList.do?catId=${childCategory.catId}">
                                                        ${childCategory.catName}
                                                </a>
                                            </li>
                                        </c:when>
                                        <c:otherwise>
                                            <li>
                                                <a href="/toGoodList.do?catId=${childCategory.catId}">${childCategory.catName}
                                                </a></li>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 col-md-9 col-sm-9">
                <div class="product-right">
                    <div class="product-right-tab bg-bd">
                        <ul class="tab-menu top-bg" role="tablist">
                            <li role="presentation" class="active tab-menu-li-one">
                                <a href="#arrival" role="tab" data-toggle="tab">
                                    <i class="fa fa-th-large"></i>
                                </a>
                            </li>
                            <li class="tab-menu-li"><span></span>
                                <select name="#" id="#">
                                    <option value="#">---</option>
                                    <option value="Lowest first">价格</option>
                                    <option value="Highest first">名称</option>
                                </select>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane  active" id="arrival">
                                <div class="row">
                                    <div id="goodShowDiv" class="right-all-product" style="margin-top: 0"></div>
                                    <script id="goodShowTpl" type="text/html">
                                        {{ each goods as good i}}
                                        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="/toPage.do?url=customer/single-product.jsp"><img src="{{good.goodImage}}" alt=""/></a>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i
                                                                    class="fa fa-heart"></i></span></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <div class="price" style="display: block">
                                                        <a href=""><h5>¥{{good.skuPrice}}</h5></a>
                                                    </div>
                                                    <a href="#"><p>{{good.goodBrand}} {{good.goodName}}</p></a>
                                                </div>
                                            </div>
                                        </div>
                                        {{/each}}
                                    </script>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Page Medile Section End-->
<!-- Footer Area Start-->
<jsp:include page="../../../WEB-INF/page/common/foot.jsp"/>
<!-- Footer Area End -->
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

<script>
    $(function () {
        var catId = $("#catId").val();
        $.ajax({
            url: "/good/showGoodMesByCate.do",
            type: "get",
            data: {"cateId": catId},
            dataType: "json",
            success: function (res) {
                var goods = {goods: res}
                console.log(goods);
                var str = template('goodShowTpl', goods);
                document.getElementById('goodShowDiv').innerHTML = str;
            }
        });
    });
</script>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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

    <!-- Google Fonts-->
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
<body class="single-page">
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
                    <a href="#"><i class="fa fa-home"></i></a>
                    <span class="navegation-page">></span>
                    <%--<span class="navegation-page">奶粉</span>--%>
                    <%--<span class="navegation-page">></span>--%>
                    商品详情
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Brade Come End -->
<!-- Page Medial Section Start-->
<section class="page-medile-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-9 col-md-9">
                <div class="bg-bd">
                    <div class="right-all-product" id="right-ap">
                        <div class="row">
                            <div class="zoomWrapper col-lg-6 col-md-6 col-sm-5">
                                <div id="img-1" class="zoomWrapper product-image">
                                    <a href="#">
                                        <img id="zoom1" src="../../../img/product/400g.jpg"
                                             data-zoom-image="../../../img/product/400g.jpg" alt="img"/>
                                    </a>
                                </div>
                                <div class="smol-slide">
                                    <div class="row">
                                        <div class="col-lg-offset-3 col-lg-6 col-md-offset-3 col-md-6 col-sm-offset-3 col-sm-6 col-xs-offset-2 col-xs-6">
                                            <ul class="bxslider" id="gallery_01">
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="../../../img/product/400g1.jpg"
                                                       data-zoom-image="../../../img/product/400g1.jpg"><img
                                                            src="../../../img/product/400g1.jpg"
                                                            alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="../../../img/product/400g2.jpg"
                                                       data-zoom-image="../../../img/product/400g2.jpg"><img
                                                            src="../../../img/product/400g2.jpg" alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="../../../img/product/400g3.jpg"
                                                       data-zoom-image="../../../img/product/400g3.jpg"><img
                                                            src="../../../img/product/400g3.jpg"
                                                            alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="../../../img/product/400g4.jpg"
                                                       data-zoom-image="../../../img/product/400g4.jpg"><img
                                                            src="../../../img/product/400g4.jpg"
                                                            alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-7">
                                <div class="price-box">
                                    <p class="price-box-heading">雀巢(Nestle) 婴儿配方奶粉</p>
                                    <div class="price">
                                        <h5>价格：</h5>
                                        <h5>¥300</h5>
                                    </div>
                                    <p class="desc">100%源自荷兰自家牧场，荷兰原装进口，包装6大焕新升级后锁留高达90%天然营养小分子</p>
                                    <div class="action">
                                        <div class="cart-box">
                                            <div class="quantity">
                                                <p class="product-condition">
                                                    数量
                                                </p>
                                                <div class="dec qtybutton">-</div>
                                                <input type="number" value="1">
                                                <div class="inc qtybutton">+</div>
                                            </div>
                                            <div class="product-text">
                                                <a href="/shoppingCart/shopCartPage.do?custId=${custId}"><p>添加购物车</p></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="p-size clear">
                                        <p class="product-condition clear">
                                            规格：
                                        </p>
                                        <div class="size-selact">
                                            <select name="#" id="#">
                                                <option value="">400g</option>
                                                <option value="">900g</option>
                                                <option value="">1200g</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!--<div class="color-list">-->
                                    <!--<p class="product-condition clear">-->
                                    <!--color-->
                                    <!--</p>-->
                                    <!--<ul>-->
                                    <!--<li class="a-active"><a class="orange" href="#"></a></li>-->
                                    <!--<li><a class="pink" href="#"></a></li>-->
                                    <!--</ul>-->
                                    <!--</div>-->
                                    <div class="p-item">
                                        <span>库存</span>
                                        <p class="product-condition">
                                            30件
                                        </p>
                                    </div>
                                    <div>
                                        <button class="button" id="purchase" style="width: 80px;height: 30px">直接购买</button>
                                    </div>
                                    <div class="single-rating">
                                        <div class="review">
                                            <ul class="clear">
                                                <li>
                                                    <a class="comment" href="#">查看评论</a>
                                                </li>
                                                <li>
                                                    <a class="pencil " href="#">更多参数信息</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="print">
                                        <ul class="clear">
                                            <li><a class="envelop" href="#"><i class="fa fa-envelope"></i></a></li>
                                            <li><a class="print" href="#"><i class="fa fa-print"></i></a></li>
                                            <li><a class="headt" href="#"><i class="fa fa-heart"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="reviw-tab bg-bd product-tab">
                    <ul class="tab-menu" role="tablist">
                        <li role="presentation" class="active"><a href="#data" aria-controls="data" role="tab"
                                                                  data-toggle="tab">参数信息</a></li>
                        <li role="presentation"><a href="#reviews" aria-controls="reviews" role="tab" data-toggle="tab">评价</a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="data">
                            <table class="tabel-data-sheet">
                                <tbody>
                                <tr class="odd">
                                    <td>奶源地</td>
                                    <td>国产</td>
                                </tr>
                                <tr class="even">
                                    <td>分类</td>
                                    <td>羊奶粉</td>
                                </tr>
                                <tr class="odd">
                                    <td>配方</td>
                                    <td>普通配方奶粉</td>
                                </tr>
                                <tr class="even">
                                    <td>适用年龄</td>
                                    <td>0-6个月</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="reviews">
                            <div class="tab-vew-reviw">
                                <ul>
                                    <li>
												<span class="reviw-text">
													 Grade 
												</span>
                                        <div class="rank">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                        </div>
                                        <div class="reviw-date">
                                            <h6>gdragaggd</h6>
                                            <span class="date">
														25/12/2014
													</span>
                                        </div>
                                    </li>
                                    <li class="right-reviw">
                                        <h6>gdra</h6>
                                        <p>gdra</p>
                                    </li>
                                </ul>
                                <div class="r-y-w">
                                    <a href="#"><p>评价</p></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-12">
                <div class="single-product-left">
                    <div class="to-seal">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="top-seal bg-bd">
                                    <h4 class="left-featured-head">推荐</h4>
                                    <div class="all-seal-product">
                                        <div class="seal-product-slide">
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/1.jpg"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>美素佳儿（Friso）幼儿配方牛奶粉 </p></a>
                                                    <div class="price">
                                                        <a href=""><h5>204.1</h5></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/380g.jpg"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>雀巢(Nestle)水解婴儿配方奶粉</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>153</h5></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/400g.jpg"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>雀巢(Nestle)婴儿配方奶粉</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>109</h5></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/850G.jpg"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>美赞臣(Mead Johnson)幼儿配方奶粉</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>252</h5></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/900g.jpg"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>a2婴幼儿奶粉</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>430</h5></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="seal-product-slide">
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img
                                                            src="../../../img/product/faded-short-sleeves-tshirt.jpg.png"
                                                            alt=""/> </a>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>Printed Chiffon Dress</p></a>
                                                    <div class="price">
                                                        <a href="#">
                                                            <h5>£ 23.37</h5>
                                                        </a>
                                                    </div>
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img
                                                            src="../../../img/product/printed-dress.riksa.jpg.png"
                                                            alt=""/> </a>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>Dress</p></a>
                                                    <div class="price">
                                                        <a href="#">
                                                            <h5>¥ 23.37</h5>
                                                        </a>
                                                    </div>
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img
                                                            src="../../../img/product/printed-chiffon-bad.jpg.png"
                                                            alt=""/> </a>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>Printed Chiffon</p></a>
                                                    <div class="price">
                                                        <a href="#">
                                                            <h5>£ 23.37</h5>
                                                        </a>
                                                    </div>
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img
                                                            src="../../../img/product/faded-short-sleeves-tshirt.jpg.png"
                                                            alt=""/> </a>
                                                </div>
                                                <div class="price-box">
                                                    <a href="#"><p>Chiffon Dress</p></a>
                                                    <div class="price">
                                                        <a href="#">
                                                            <h5>£ 23.37</h5>
                                                        </a>
                                                    </div>
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="bg-bd">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12">
                                <div class="tage-section">
                                    <div class="tag-heading">
                                        <h3>标签</h3>
                                    </div>
                                    <ul>
                                        <li><a href="#">童装</a></li>
                                        <li><a href="#">玩具</a></li>
                                        <li><a href="#">童鞋</a></li>
                                        <li><a href="#">奶粉</a></li>
                                        <li><a href="#">营养粉</a></li>
                                        <li><a href="#">纸尿裤</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Page Medial Section End-->
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
</body>
</html>


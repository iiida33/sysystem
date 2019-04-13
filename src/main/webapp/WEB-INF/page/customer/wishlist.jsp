﻿<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
<header class="header-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="headet-top">
                    <div class="htop-one login">
                        <a href="/login.do" id="LoginRegister" style="display: none">亲，请登录//免费注册</a>
                        <a href="/logout.do" id="LoginOut" style="display: none">退出登录</a>
                        <!--<a href="/register.do"></a>-->
                        <!--<a href="#" onclick="loginJump()">亲，请登录/</a>-->
                        <!--<a href="#" onclick="RegisterJump()">/免费注册</a>-->
                    </div>
                    <div class="htop-one">
                        <ul class="account">
                            <li><a href="#">管理员入口</a>
                            </li>
                        </ul>
                    </div>
                    <div class="htop-one last">
                        <ul class="account">
                            <li><a href="#">个人中心<i class="fa fa-caret-down"></i></a>
                                <ul>
                                    <li><a href="#">账号管理</a></li>
                                    <li><a href="#">我的订单</a></li>
                                    <li><a href="#">收藏夹</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="header-midile">
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <div class="lago">
                        <a href="#"><img src="../../../img/logo.png" alt="lago"/></a>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="search">
                        <form action="#">
                            <input type="text" placeholder="搜索内容">
                            <input type="submit" value="搜索">
                        </form>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <ul class="curt">
                        <li>
                            <a class="total-cart-b" href="#">
                                <span>2</span>
                                <p>购物车</p>
                                <label class="cart_money"></label>
                            </a>
                            <div class="curt-list">
                                <ul>
                                    <li class="curt-list-li">
                                        <a href="#"><img src="../../../img/product/printed-chiffon-dress.jpg.png"
                                                         alt="img"></a>
                                        <a href="#"><p>玩偶</p><span class="curt-list-item-color">*1</span></a>
                                        <span>S, 黄色</span>
                                        <h6>￥31</h6>
                                    </li>
                                    <li class="curt-list-li border-li">
                                        <a href="#"><img src="../../../img/product/printed-dress.chear.jpg.png"
                                                         alt="img"></a>
                                        <a href="#"><p>宝宝餐椅</p><span class="curt-list-item-color">*1</span></a>
                                        <span>L, 绿色</span>
                                        <h6>￥75</h6>
                                    </li>
                                    <li><p class="totel">总计</p><h6>￥106</h6></li>
                                </ul>
                                <button>结算</button>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="main-menu">
                    <ul id="navcontainer" class="nav floatleft">
                        <li class="active"><a href="/">首页</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- mobile-menu-area start -->
    <div class="mobile-menu-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="mobile-menu">
                        <nav id="dropdown">
                            <ul id="navcontainer1">
                                <li><a href="#">首页</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- mobile-menu-area end -->
</header>
<!-- Brade Come Start -->
<div class="braed-come">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="braed">
                    <a href="#"><i class="fa fa-home"></i></a>
                    <span class="navegation-page">></span>
                    wishlist
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
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="cut-page-tab bg-bd">
                    <div class="wish-content">
                        <div class="fist-wist">
                            <p class="tab-heading">My wishlist</p>
                            <label>name</label>
                            <input type="text">
                            <button class="button">save</button>
                        </div>
                        <div class="second-wist table-responsive">
                            <table class="main-tabel table table-bordered ">
                                <thead>
                                <tr>
                                    <th class=" ">name</th>
                                    <th class=" ">Qty</th>
                                    <th class=" ">viewed</th>
                                    <th class=" ">created</th>
                                    <th class=" ">diract link</th>
                                    <th class=" ">default</th>
                                    <th class=" ">delete</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <p>asad</p>
                                    </td>
                                    <td>
                                        <p>0</p>
                                    </td>
                                    <td>
                                        <p>0</p>
                                    </td>
                                    <td>
                                        <p>2015-10-05</p>
                                    </td>
                                    <td>
                                        <p>view</p>
                                    </td>
                                    <td>
                                        <i class="fa fa-check-square"></i>
                                    </td>
                                    <td>
                                        <i class="fa fa-times"></i>
                                    </td>
                                </tr>
                                </tbody>
                                <tbody>
                                <tr>
                                    <td>
                                        <p>BootExperts</p>
                                    </td>
                                    <td>
                                        <p>02</p>
                                    </td>
                                    <td>
                                        <p>5</p>
                                    </td>
                                    <td>
                                        <p>2015-05-25</p>
                                    </td>
                                    <td>
                                        <p>view</p>
                                    </td>
                                    <td>
                                        <i class="fa fa-check-square"></i>
                                    </td>
                                    <td>
                                        <i class="fa fa-times"></i>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Cut Page Medile Section Start End-->
<!-- Footer Area Start-->
<footer class="footer-area">
    <div class="footer-bg">
        <div class="container">
            <div class="bg-bd">
                <div class="row">
                    <div class="cl-logo">
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-1.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-2.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-3.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-4.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-5.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-1.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-2.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-3.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-4.jpg" alt=""/></a>
                        </div>
                        <div class="col-lg-12">
                            <a href="#"><img src="../../../img/client-lago/lago-5.jpg" alt=""/></a>
                        </div>
                    </div>
                </div>
                <div class="row top-speac">
                    <div class="widget">
                        <h5>联系我们</h5>
                        <address>
                            地址：<span class="color">广东省肇庆市端州区肇庆大道</span>&nbsp;&nbsp;&nbsp;
                            电话: <span class="color">0123-456-789</span>&nbsp;&nbsp;&nbsp;
                            邮箱: <span class="color">syshopping@163.com </span>
                        </address>
                    </div>
                    <!--</div>-->
                </div>
            </div>
        </div>
        <div class="container">
            <div class="copyright">
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                        <div class="copyright-text">
                            <p>Copyright &copy; 2019 梁培珊 201524132105 </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
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


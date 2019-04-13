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
                    <span class="navegation-page">奶粉</span>
                    <span class="navegation-page">></span>
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
                                             data-zoom-image="img/product/printed-chiffon-dress.jpg.png" alt="img"/>
                                    </a>
                                </div>
                                <div class="smol-slide">
                                    <div class="row">
                                        <div class="col-lg-offset-3 col-lg-6 col-md-offset-3 col-md-6 col-sm-offset-3 col-sm-6 col-xs-offset-2 col-xs-6">
                                            <ul class="bxslider" id="gallery_01">
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="img/product/printed-dress.chear.jpg.png"
                                                       data-zoom-image="img/product/printed-dress.chear.jpg.png"><img
                                                            src="../../../img/product/400g1.jpg"
                                                            alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="img/product/printed.jpg.png"
                                                       data-zoom-image="img/product/printed.jpg.png"><img
                                                            src="../../../img/product/400g2.jpg" alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="img/product/printed-dress.chear.jpg.png"
                                                       data-zoom-image="img/product/printed-dress.chear.jpg.png"><img
                                                            src="../../../img/product/400g3.jpg"
                                                            alt="zo-th-1"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="elevatezoom-gallery active" data-update=""
                                                       data-image="img/product/printed-summer-dress.jpg.png"
                                                       data-zoom-image="img/product/printed-summer-dress.jpg.png"><img
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
                                        <h5>¥109</h5>
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
                                                <a href="#"><p>添加购物车</p></a>
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
                                    <a href="#"><p>Write your review!</p></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="p-m-s bg-bd">
                    <div class="right-featured">
                        <div class="right-feature-head s-p-r-f">
                            <h3>Accessories</h3>
                        </div>
                        <div class="row">
                            <div class="single-all-product">
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img
                                                        src="../../../img/product/printed-chiffon-dress.jpg.png"
                                                        alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Blouse</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37</h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/dress.jpg.png" alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Summer Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img
                                                        src="../../../img/product/faded-short-sleeves-tshirt.jpg.png"
                                                        alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Faded Short Sleeves T-shirt</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed.jpg.png" alt=""/>
                                                </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Summer Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-dress.chear.jpg.png"
                                                                 alt=""/>
                                                </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Dresss</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="p-m-s bg-bd">
                    <div class="right-featured">
                        <div class="right-feature-head">
                            <h3>Featured Products</h3>
                        </div>
                        <div class="row">
                            <div class="single-all-product">
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img
                                                        src="../../../img/product/printed-chiffon-dress.jpg.png"
                                                        alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Blouse</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37</h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/dress.jpg.png" alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Summer Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img
                                                        src="../../../img/product/faded-short-sleeves-tshirt.jpg.png"
                                                        alt=""/> </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Faded Short Sleeves T-shirt</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed.jpg.png" alt=""/>
                                                </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Summer Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-slide">
                                    <div class="col-lg-4 col-md-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-dress.chear.jpg.png"
                                                                 alt=""/>
                                                </a>
                                                <div class="cart-box">
                                                    <div class="product-text">
                                                        <a href="#"><span class="heart"><i
                                                                class="fa fa-heart"></i></span></a>
                                                        <a href="#"><p>add to card</p></a>
                                                        <a href="#"><span class="retweet"><i class="fa fa-retweet"></i></span></a>
                                                    </div>
                                                    <div class="link">
                                                        <a href="#"><i class="fa fa-search-plus"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="price-box">
                                                <a href="#">
                                                    <div class="rank">
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart"></i>
                                                        <i class="fa fa-heart-o"></i>
                                                    </div>
                                                </a>
                                                <a href="#"><p>Printed Dresss</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                        </div>
                                    </div>
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
                                        <li><a href="#">Accessories</a></li>
                                        <li><a href="#">Clothing</a></li>
                                        <li><a href="#">Kids</a></li>
                                        <li><a href="#">Beds</a></li>
                                        <li><a href="#">shoes</a></li>
                                        <li><a href="#"></a></li>
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


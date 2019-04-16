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

<body class="home">
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://baidu.com/">upgrade
    your browser</a> to improve your experience.</p><![endif]-->

<!-- Header Area-->
<jsp:include page="../../../WEB-INF/page/common/header.jsp"/>
<!-- Home Slider Start-->
<section class="slider-wrap">
    <div class="container">
        <div class="slider-area">
            <div class="bend niceties preview-2">
                <div id="ensign-nivoslider" class="slides">
                    <img src="../../../img/slider/slider-1/1.png" alt="" title="#slider-direction-1"/>
                    <img src="../../../img/slider/slider-1/2.png" alt="" title="#slider-direction-2"/>
                </div>
                <!-- direction 1 -->
                <div id="slider-direction-1" class="t-cn slider-direction">
                    <div class="slider-progress"></div>
                    <div class="slider-content t-lfr s-tb slider-1">
                        <div class="title-container s-tb-c">
                            <h1 class="title1">可玩可学的儿童玩具</h1>
                            <h3 class="title2">给宝宝一个健康快乐的童年</h3>
                            <h4 class="title3">玩具不只是玩具</h4>
                            <button class="shop-button">现在购买</button>
                        </div>
                    </div>
                </div>
                <!-- direction 2 -->
                <div id="slider-direction-2" class="slider-direction">
                    <div class="slider-progress"></div>
                    <div class="slider-content t-lfr s-tb slider-2">
                        <div class="title-container s-tb-c title-compress">
                            <h1 class="title1">萌娃新主义</h1>
                            <h3 class="title2">EXPECT the UNEXPECTED</h3>
                            <h4 class="title3">好品质，放心穿</h4>
                            <button class="shop-button">现在购买</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Home Slider End -->
<!-- Promotion Area	Start -->
<section class="promotion-area">
    <div class="container">
        <div class="row">
            <div class="promotion">
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="toPage.do?url=customer/shop.jsp"><img src="../../../img/banner/banner1.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>品质奶粉</h3>
                            <p>奶粉与辅食，匠心搭配，给宝宝一个健康、强壮的身体</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="#"><img src="../../../img/banner/banner2.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>萌娃酷爽</h3>
                            <p>好店会选，精选好裤</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="#"><img src="../../../img/banner/banner3.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>潮童鞋服</h3>
                            <p>萌宝出游季</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="#"><img src="../../../img/banner/banner4.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>潮童酷玩</h3>
                            <p>宝贝的童年玩伴，宝箱有好货</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="#"><img src="../../../img/banner/banner5.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>萌品万象城</h3>
                            <p>育儿神器，妈妈优选</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="single-promotion">
                        <a href="#"><img src="../../../img/banner/banner6.jpg" alt=""/> </a>
                        <div class="singleh">
                            <h3>妈妈专区</h3>
                            <p>给妈妈最贴心的呵护</p>
                            <span><a href="#">了解更多</a></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Promotion Area End-->
<!-- Product Area Start -->
<section class="product-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12">
                <div class="product-tab bg-bd">
                    <ul class="tab-menu" role="tablist">
                        <li role="presentation" class="active">
                            <a href="#arrival" role="tab" data-toggle="tab">
                                最新商品
                            </a>
                        </li>
                        <li role="presentation">
                            <a href="#bestseller" role="tab" data-toggle="tab">畅销商品
                            </a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="arrival">
                            <div class="row">
                                <div class="all-product">
                                    <div class="product-slide">
                                        <div class="col-lg-3 col-sm-4">
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img
                                                            src="../../../img/product/printed-chiffon-dress.jpg.png"
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
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                    <a href="#"><p>小牛玩偶</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>40.37</h5></a>
                                                    </div>
                                                </div>
                                                <a href="#"><span class="leval">new</span></a>
                                            </div>
                                            <div class="single-product">
                                                <div class="product-image">
                                                    <a href="#"><img src="../../../img/product/printed-dress.jpg.png"
                                                                     alt=""/>
                                                    </a>
                                                    <div class="efface"></div>
                                                    <div class="cart-box">
                                                        <div class="product-text">
                                                            <a href="#"><span class="heart"><i class="fa fa-heart"></i></span></a>
                                                            <a href="#"><span class="retweet"><i
                                                                    class="fa fa-retweet"></i></span></a>
                                                        </div>
                                                        <div class="link">
                                                            <a href="#"><i class="fa fa-search-plus"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="price-box">
                                                    <div class="rank">
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart"></i></a>
                                                        <a href="#"><i class="fa fa-heart-o"></i></a>
                                                    </div>
                                                    <a href="#"><p>Printed Chiffon Dress</p></a>
                                                    <div class="price">
                                                        <a href=""><h5>£ 34.37<span>£ 40.60</span></h5></a>
                                                    </div>
                                                </div>
                                                <a href="#"><span class="leval">new</span></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-dress.chear.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Blouse</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37</h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-chiffon-bad.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 40.37<span>£ 44.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4  col-sm-4">
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-summer-dress.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4  col-sm-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/blouse.jpg.png" alt=""/> </a>
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">5%</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/faded-short-tshirt.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">5%</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4  col-sm-4">
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">5%</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">5%</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="bestseller">
                            <div class="row">
                                <div class="all-product">
                                    <div class="col-lg-3 col-md-4 col-sm-4">
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-dress.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/blouse.jpg.png" alt=""/> </a>
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4">
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/faded-short-tshirt.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Faded Short T-shirt</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 36.60<span>£ 40.60</span></h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-chiffon-bad.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37 </h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-dress.riksa.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37<span>£ 24.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-4 col-sm-4">
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/printed-summer-dress.jpg.png"
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 23.37</h5></a>
                                                </div>
                                                <span class="descount">seal</span>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                        <div class="single-product">
                                            <div class="product-image">
                                                <a href="#"><img src="../../../img/product/blouse.png" alt=""/> </a>
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
                                                <div class="rank">
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart"></i></a>
                                                    <a href="#"><i class="fa fa-heart-o"></i></a>
                                                </div>
                                                <a href="#"><p>Printed Chiffon Dress</p></a>
                                                <div class="price">
                                                    <a href=""><h5>£ 20.37<span>£ 22.60</span></h5></a>
                                                </div>
                                            </div>
                                            <a href="#"><span class="leval">new</span></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Product Area End -->
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


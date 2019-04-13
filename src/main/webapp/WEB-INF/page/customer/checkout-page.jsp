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
                    <a href="#"><i class="fa fa-home"></i></a>
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
                                    <div>
                                        <input type="radio" name="address" id="address1"/>
                                        <label>广东省肇庆市端州区黄岗街道肇庆学院</label>&nbsp;
                                        <label>梁培珊(收)</label>&nbsp;
                                        <label>17876253535</label>
                                    </div>
                                    <div>
                                        <input type="radio"name="address" id="address2"/>
                                        <label>广东省佛山市顺德区伦教街道</label>&nbsp;
                                        <label>梁33(收)</label>&nbsp;
                                        <label>17876253535</label>
                                    </div>
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
                                    <tr>
                                        <td class="td-img-tr">
			 										<span class="td-img">
			 											<img src="../../../img/product/400g.jpg" alt="img">
			 										</span>
                                        </td>
                                        <td class="td-p-title">
                                            <span><a href="#">雀巢(Nestle) 婴儿配方奶粉</a></span>
                                        </td>
                                        <td class="td-stok">
                                            <span>规格：400g</span>
                                        </td>
                                        <td class="td-unite">
                                            <span>109</span>
                                        </td>
                                        <td class="td-quentety">
                                            <div style="border: 0;margin-left: 20px">
                                            <div class="dec qtybutton">-</div>
                                            <input type="number" style="float: left; width: 50px;height: 30px" value="1">
                                            <div class="inc qtybutton">+</div>
                                            </div>
                                        </td>
                                        <td class="td-t-amount">
                                                <span>109</span>
                                        </td>
                                        <td class="td-trash">
                                            <a href="#"><i class="fa fa-trash"></i></a>
                                        </td>
                                    </tr>
                                    </tbody>
                                    <tfoot class="thard-tabel">
                                    <tr>
                                        <td colspan="7" class="">
                                            <label>给商家留言：</label>
                                            <textarea name="remark" cols="50" rows="3"></textarea>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="7" class="totel big-totol">合计：109</td>
                                    </tr>
                                    </tfoot>
                                </table>
                                </form>
                            </div>
                            <div class="bootom-section">
                                <button class="button" type="submit">提交订单</button>
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

</body>

</html>


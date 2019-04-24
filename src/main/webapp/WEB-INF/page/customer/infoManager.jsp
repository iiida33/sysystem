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

    <!-- Google Fonts -->
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
    <!---->
    <link rel="stylesheet" href="../../../static/css/infoManager.css">
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
    <script type="text/javascript" src="../../../static/js/My97DatePicker/4.8/WdatePicker.js"></script>
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
        <div class="row">
            <div class="col-lg-12 col-md-12">
                <div class="braed">
                    <a href="/"><i class="fa fa-home"></i></a>
                    <span class="navegation-page">></span>
                    个人中心
                </div>
            </div>
        </div>
    </div>
</div>

<section class="page-medile-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="product-left">
                    <div class="beds-section bg-bd">
                        <h4 class="pp-left-heading">个人中心</h4>
                        <div class="category-menu" id="cate-toggle">
                            <ul>
                                <li><a href="#" id="myAccount" class="active" onclick="myAccount();">账号管理</a></li>
                                <li><a href="#" id="myOrder" onclick="myOrder();">我的订单</a></li>
                                <li><a href="#" id="mycollect" onclick="mycollect();">收藏夹</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 col-md-9 col-sm-9">
                <div class="product-right">
                    <div class="product-right-tab bg-bd">
                        <div>
                            <div role="tabpanel" class="tab-pane active" id="arrival">
                                <div class="row">
                                    <div id="custInfo">
                                        <form <%--id="baseInfo" name="baseInfo" method="post"--%>>
                                            <p><label>编辑个人资料:</label></p>
                                            <div class="infoMas">
                                                <%--<p><label>当前头像：</label>--%>
                                                <%--<c:if test="${customer.custPic!=null}">--%>
                                                <%--<img src=/custPic/${customer.custPic}" width="80px" height="80px"/>--%>
                                                <%--</c:if>--%>
                                                <%--<input type="file" name="custPic" id="custPic">--%>
                                                <%--&lt;%&ndash;<a><img src="../../../img/head.jpg"/></a>&ndash;%&gt;--%>
                                                <%--&lt;%&ndash;<a href="">修改头像</a>&ndash;%&gt;--%>
                                                <%--</p>--%>
                                                <p><label>*用户名：</label><input type="text" name="custUsername"
                                                                              id="custUsername"
                                                                              value="${customer.custUsername}"/></p>
                                                <p><label>真实姓名：</label><input type="text" name="custName" id="custName"
                                                                              value="${customer.custName}"/></p>
                                                <p><label>性别：</label>男<input type="radio" name="custSex" value="男"
                                                                             id="male" ${customer.custSex=="男"?"checked":""}/>&nbsp;
                                                    女<input type="radio" name="custSex" value="女"
                                                            id="female" ${customer.custSex=="女"?"checked":""}/></p>
                                                <p><label>生日：</label>
                                                    <%--HH:mm:ss--%>
                                                    <input type="text" name="custBirth" id="custBirth"
                                                           value="<fmt:formatDate value="${customer.custBirth}" pattern="yyyy-MM-dd"/>"
                                                           class="Wdate"
                                                           onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
                                                           style="width:180px;">
                                                    <%--<input type="date" name="custBirth" id="custBirth" value="<fmt:formatDate value="${customer.custBirth}" pattern="yyyy-MM-dd"/>"/>--%>
                                                </p>
                                                <p><label>*手机号码：</label><input type="text" name="custPhone"
                                                                               id="custPhone"
                                                                               value="${customer.custPhone}"/></p>
                                                <p><label>电子邮箱：</label><input type="text" name="custEmail"
                                                                              id="custEmail"
                                                                              value="${customer.custEmail}"/></p>
                                                <p><label>居住地：</label><input type="text" name="custAddress"
                                                                             id="custAddress"
                                                                             value="${customer.custAddress}"/></p>
                                                    <input type="hidden" id="message" value="${msg}"/>
                                                <input type="button" value="提交" onclick="editInfo();"/>
                                            </div>
                                        </form>
                                        <form id="infoPass"<%-- action="/customer/changePassword.do" onsubmit="return editPassword() "--%>>
                                            <p><label>修改密码:</label></p>
                                            <div class="infoMas">
                                                <p><label>*原密码：</label><input type="password" id="custPassword"
                                                                              name="custPassword" required/></p>
                                                <p><label>*新密码:</label><input type="password" id="newPassword"
                                                                              name="newPassword"/><label></label></p>
                                                <p><label>*确认新密码：</label><input type="password" id="newPassword1"
                                                                                name="newPassword1"/><label></label></p>
                                                <input type="button" value="修改" onclick="editPassword()"/>
                                            </div>
                                        </form>
                                    </div>
                                    <div id="orderInfo" hidden>
                                        <div id="orderNav">
                                            <ul class="sidenav">
                                                <li><a class="active" href="#all">所有订单</a></li>
                                                <li><a href="#pending">待处理</a></li>
                                                <li><a href="#receive">待收货</a></li>
                                                <li><a href="#evaluate">待评价</a></li>
                                            </ul>
                                        </div>

                                        <div id="orderTitle">
                                            <table class="oTitle">
                                                <tr>
                                                    <th class="t1">商品</th>
                                                    <th class="t2">单价</th>
                                                    <th class="t3">数量</th>
                                                    <th class="t4">实付款</th>
                                                    <th class="t5">交易状态</th>
                                                    <th class="t6">交易操作</th>
                                                </tr>
                                            </table>
                                        </div>
                                        <div style="height: 30px"></div>
                                        <div id="orderContent">
                                            <table class="oContent" rules="rows">
                                                <tr>
                                                    <td colspan="6"
                                                        style="text-align:left;padding-left: 20px;line-height: 30px">
                                                        <input type="checkbox"/>
                                                        <label id="orderTime">2019-01-01</label>&nbsp;&nbsp;
                                                        <label>订单号:201904185784510</label>
                                                        <label id="orderNum"></label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="t1">商品</td>
                                                    <td class="t2">单价</td>
                                                    <td class="t3">数量</td>
                                                    <td class="t4">实付款</td>
                                                    <td class="t5">交易状态</td>
                                                    <td class="t6">交易操作</td>
                                                </tr>
                                                <tr>
                                                    <td class="t1">雀巢(Nestle) 婴儿配方奶粉</td>
                                                    <td class="t2">300.0</td>
                                                    <td class="t3">1</td>
                                                    <td class="t4">300.0</td>
                                                    <td class="t5">待处理</td>
                                                    <td class="t6"><a>删除</a></td>
                                                </tr>
                                                <tr>
                                                    <td class="t1">雀巢(Nestle 水解婴儿配方奶粉</td>
                                                    <td class="t2">318.2</td>
                                                    <td class="t3">1</td>
                                                    <td class="t4">318.2</td>
                                                    <td class="t5">待处理</td>
                                                    <td class="t6"><a>删除</a></td>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>
                                    <div id="colltionInfo" hidden>
                                        <div class="tab-content">
                                            <div class="row">
                                                <div class="right-all-product" style="margin-top: 5px">
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed-chiffon-dress.jpg.png"
                                                                        alt=""/>
                                                                </a>
                                                            </div>
                                                            <div class="price-box">
                                                                <a href="#"><p>奶牛玩偶</p></a>
                                                                <div class="price">
                                                                    <a href=""><h5>40.37</h5></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed-dress.jpg.png"
                                                                        alt=""/>
                                                                </a>
                                                                <div class="efface"></div>
                                                                <div class="cart-box">
                                                                    <div class="product-text">
                                                                        <a href="#"><span class="heart"><i
                                                                                class="fa fa-heart"></i></span></a>
                                                                        <a href="#"><p>add to card</p></a>
                                                                        <a href="#"><span class="retweet"><i
                                                                                class="fa fa-retweet"></i></span></a>
                                                                    </div>
                                                                    <div class="link">
                                                                        <a href="#"><i
                                                                                class="fa fa-search-plus"></i></a>
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
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed-dress.chear.jpg.png"
                                                                        alt=""/> </a>
                                                                <div class="cart-box">
                                                                    <div class="product-text">
                                                                        <a href="#"><span class="heart"><i
                                                                                class="fa fa-heart"></i></span></a>
                                                                        <a href="#"><p>add to card</p></a>
                                                                        <a href="#"><span class="retweet"><i
                                                                                class="fa fa-retweet"></i></span></a>
                                                                    </div>
                                                                    <div class="link">
                                                                        <a href="#"><i
                                                                                class="fa fa-search-plus"></i></a>
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
                                                    </div>
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed-chiffon-bad.jpg.png"
                                                                        alt=""/> </a>
                                                                <div class="cart-box">
                                                                    <div class="product-text">
                                                                        <a href="#"><span class="heart"><i
                                                                                class="fa fa-heart"></i></span></a>
                                                                        <a href="#"><p>add to card</p></a>
                                                                        <a href="#"><span class="retweet"><i
                                                                                class="fa fa-retweet"></i></span></a>
                                                                    </div>
                                                                    <div class="link">
                                                                        <a href="#"><i
                                                                                class="fa fa-search-plus"></i></a>
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
                                                                <span class="descount">seal</span>
                                                            </div>
                                                            <a href="#"><span class="leval">new</span></a>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed.jpg.png"
                                                                        alt=""/> </a>
                                                                <div class="cart-box">
                                                                    <div class="product-text">
                                                                        <a href="#"><span class="heart"><i
                                                                                class="fa fa-heart"></i></span></a>
                                                                        <a href="#"><p>add to card</p></a>
                                                                        <a href="#"><span class="retweet"><i
                                                                                class="fa fa-retweet"></i></span></a>
                                                                    </div>
                                                                    <div class="link">
                                                                        <a href="#"><i
                                                                                class="fa fa-search-plus"></i></a>
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
                                                    </div>
                                                    <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                        <div class="single-product">
                                                            <div class="product-image">
                                                                <a href="#"><img
                                                                        src="../../../img/product/printed-summer-dress.jpg.png"
                                                                        alt=""/> </a>
                                                                <div class="cart-box">
                                                                    <div class="product-text">
                                                                        <a href="#"><span class="heart"><i
                                                                                class="fa fa-heart"></i></span></a>
                                                                        <a href="#"><p>add to card</p></a>
                                                                        <a href="#"><span class="retweet"><i
                                                                                class="fa fa-retweet"></i></span></a>
                                                                    </div>
                                                                    <div class="link">
                                                                        <a href="#"><i
                                                                                class="fa fa-search-plus"></i></a>
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
<script src="../../../static/js/infoManager.js"></script>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script src="http://cdn.staticfile.org/artTemplate.js/3.0.1/template.js"></script>
<%--<script src="../../../static/js/getNavDate.js"></script>--%>
<header class="header-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="headet-top">
                    <div class="htop-one login">
                        <input id="custId" value="${custId}" type="hidden">
                        <label id="LoginRegister" style="display: none"><a href="/login.do">亲，请登录//免费注册</a></label>
                        <label id="LoginOut" style="display: none">${customerName}，欢迎您！<a
                                href="/logout.do">退出登录</a></label>
                    </div>
                    <div class="htop-one">
                        <ul class="account">
                            <li><a href="toPage.do?url=admin/index.jsp">管理员入口</a>
                            </li>
                        </ul>
                    </div>
                    <div class="htop-one last">
                        <ul class="account">
                            <li><a href="/customer/getCustInfo.do">个人中心<i class="fa fa-caret-down"></i></a>
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
                            <a class="total-cart-b" href="/shoppingCart/shopCartPage.do?custId=${custId}">
                                <%--<span>11</span>--%>
                                <p>购物车</p>
                            </a>
                            <div class="curt-list">
                                <ul id="shopCart"></ul>
                                <script id="shopCartPtl" type="text/html">
                                    {{each scData.shoppingCartGoodSkus as info i}}
                                    {{if i<2}}
                                    <li class="curt-list-li border-li">
                                        <a href="#"><img src="{{info.goodSku.skuPic}}"
                                                         alt="img"></a>
                                        <a href="#"><p>{{info.goodBrand}} {{info.goodName}}</p><span
                                                class="curt-list-item-color">*{{info.cartCount}}</span></a>
                                        <span>{{info.props}}</span>
                                        <h6>￥{{info.money}}</h6>
                                    </li>
                                    {{/if}}
                                    {{/each}}
                                    <li><h6>购物车内{{scData.count}}件商品</h6><h6>总计￥{{scData.totallMoney}}</h6></li>
                                </script>
                                <button onclick="toShoppingCartPage();">结算</button>
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
                    <script id="menuTemplate" type="text/html">
                        {{each value as info i}}
                        <li class="mega-menu">
                            <a href="/toGoodList.do?catId={{info.catId}}">{{info.catName}}</a>
                            <ul class="sub-menu">
                                {{each info.categoryChild as item j}}
                                <li><a href="/toGoodList.do?catId={{item.catId}}">{{item.catName}}</a></li>
                                {{/each}}
                            </ul>
                        </li>
                        {{/each}}
                    </script>
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
                                <li><a href="/">首页</a></li>
                            </ul>
                            <script id="mobileMenuTemplate" type="text/html">
                                {{each value as info i}}
                                <li>
                                    <a href="/goodClassPage.do?catId={{info.catId}}">{{info.catName}}</a>
                                    <ul class="sub-menu">
                                        {{each info.categoryChild as item j}}
                                        <li><a href="/goodClassPage.do?cateId={{item.catId}}">{{item.catName}}</a></li>
                                        {{/each}}
                                    </ul>
                                </li>
                                {{/each}}
                            </script>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- mobile-menu-area end -->
</header>
<script>
    $(function () {
        var custId = $("#custId").val();
        $.ajax({
            url: "/category/showCategory.do",
            type: "get",
            dataType: "json",
            success: function (res) {
                var value = {value: res};
                var str = template('menuTemplate', value);
                var strOri = document.getElementById('navcontainer').innerHTML;
                document.getElementById('navcontainer').innerHTML = strOri + str;

                var str1 = template('mobileMenuTemplate', value);
                var strOri1 = document.getElementById('navcontainer1').innerHTML;
                document.getElementById('navcontainer1').innerHTML = strOri1 + str1;
            }
        });

        if (custId != '' && custId != null) {
            $.ajax({
                url: "/shoppingCart/shoppingCartList.do",
                type: "get",
                data: {"custId": custId},
                dataType: "json",
                success: function (data) {
                    var scData = {scData: data};
                    console.log(scData);
                    var strSC = template('shopCartPtl', scData);
                    var oldStr = document.getElementById('shopCart').innerHTML;
                    document.getElementById('shopCart').innerHTML = strSC + oldStr;

                }
            });
        }

        function toShoppingCartPage() {
            $.ajax({
                url: "/shoppingCart/shopCartPage.do",
                type: "get",
                data: {"custId": custId},
            });
        }
    });
</script>

<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>圣婴网管理端</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="../../../img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../../static/lib/css/font.css">
    <link rel="stylesheet" href="../../../static/lib/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../../static/lib/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../static/lib/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">商品管理</a>
        <a>
          <cite>商品列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 layui-form-pane">
            <div class="layui-form-item">
                <label class="layui-form-label">分类：</label>
                <div class="layui-input-inline">
                    <select name="cate1">
                        <option value="">一级分类</option>
                        <option value="杭州">杭州</option>
                        <option value="宁波">宁波</option>
                        <option value="温州">温州</option>
                        <option value="温州">台州</option>
                        <option value="温州">绍兴</option>
                    </select>
                </div>
                <div class="layui-input-inline">
                    <select name="cate2">
                        <option value="">二级分类</option>
                        <option value="西湖区">西湖区</option>
                        <option value="余杭区">余杭区</option>
                        <option value="拱墅区">临安市</option>
                    </select>
                </div>
                <button class="layui-btn"><i class="layui-icon">&#xe615;</i>搜索</button>
                <button class="layui-btn"  lay-submit="" lay-filter="add"><i class="layui-icon"></i>添加商品</button>
            </div>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
    </xblock>
    <table class="layui-table layui-form" id="goodTable" lay-filter="test">
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th width="20">--%>
                <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</th>--%>
            <%--<th width="70">ID</th>--%>
            <%--<th>商品名</th>--%>
            <%--<th width="40">库存</th>--%>
            <%--<th width="50">排序</th>--%>
            <%--<th width="60">上架状态</th>--%>
            <%--<th width="220">操作</th>--%>
        <%--</thead>--%>
        <%--<tbody class="x-cate">--%>
        <%--<tr cate-id='1' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>1</td>--%>
            <%--<td>--%>
                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>--%>
                <%--奶粉--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<label>12</label>--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="上架|下架"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('添加SKU','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加SKU</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='10' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>10</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>1段--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='11' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>11</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>2段--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='12' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>12</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>3段--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='13' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>13</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>4段--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='14' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>14</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>孕妈奶粉--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='15' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>15</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>特配奶粉--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='16' fid='1' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>16</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>有机奶粉--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='2' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>2</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>营养辅食--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='17' fid='2' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>17</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>米粉/菜粉--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='18' fid='2' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>18</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>面条/粥--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='3' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>3</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>尿裤湿巾--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='19' fid='3' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>19</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>新生儿--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='20' fid='3' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>20</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>S--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='4' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>4</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>喂养用品--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='5' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>5</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>洗护用品--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='6' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>6</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>童装童鞋--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='7' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>7</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>童车童床--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='8' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>8</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>玩具--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr cate-id='9' fid='0' >--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>9</td>--%>
            <%--<td>--%>

                <%--<i class="layui-icon x-show" status='true'>&#xe623;</i>孕妈专区--%>
            <%--</td>--%>
            <%--<td><input type="text" class="layui-input x-sort" name="order" value="1"></td>--%>
            <%--<td>--%>
                <%--<input type="checkbox" name="switch"  lay-text="开启|停用"  checked="" lay-skin="switch">--%>
            <%--</td>--%>
            <%--<td class="td-manage">--%>
                <%--<button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>编辑</button>--%>
                <%--<button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>--%>
                <%--<button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'要删除的id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%----%>
    </table>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">修改密码</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</div>
<style type="text/css">
</style>
<script>
    layui.use(['form'], function(){
        form = layui.form;

    });

    /*用户-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }



    function delAll (argument) {

        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }
</script>

</body>

</html>
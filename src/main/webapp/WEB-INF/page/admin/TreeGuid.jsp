<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout Layui</title>
    <link rel="stylesheet" href="../../../static/js/treeTable/design/css/layui.css">
    <script src="../../../static/js/treeTable/design/layui.js"></script>
</head>
<body class="layui-layout-body" style="padding: 10px">

<a class="layui-btn layui-btn-primary"  onclick="add();">新增一行<a class="layui-btn layui-btn-primary" onclick="window.location.href='index.html';">刷新</a></a>
<a class="layui-btn layui-btn-primary"  onclick="print();">打印缓存对象</a>
<a class="layui-btn  layui-btn-normal"  href="javascript:location.replace(location.href);" title="刷新" id="refresh"><i class="layui-icon" id="iRefresh">&#xe666;</i>刷新</a>
<div style="height: 550px">
    <table class="layui-hidden layui-table layui-form" id="treeTable" lay-filter="treeTable" >


    </table>
</div>
	<script type="text/html" id="barDemo">
                <button class="layui-btn layui-btn layui-btn-xs" onclick=""><i
                        class="layui-icon">&#xe642;</i>编辑
                </button>
                <button class="layui-btn layui-btn-warm layui-btn-xs" onclick=""><i
                        class="layui-icon">&#xe642;</i>添加子栏目
                </button>
                <button class="layui-btn-danger layui-btn layui-btn-xs" onclick=""
                        href="javascript:;"><i class="layui-icon">&#xe640;</i>删除
                </button>
	</script>
<script>
    var editObj=null,ptable=null,treeGrid=null,tableId='treeTable',layer=null;
    layui.config({
        base: './static/js/treeTable/design/extend/'
    }).extend({
        treeGrid:'treeGrid'
    }).use(['jquery','treeGrid','layer'], function(){
        var $=layui.jquery;
        treeGrid = layui.treeGrid;//很重要
        layer=layui.layer;
        ptable=treeGrid.render({
            id:tableId
            ,elem: '#'+tableId
            ,idField:'id'
            ,url:'./category/showCategoryAll.do'
            ,cellMinWidth: 100
            ,treeId:'catId'//树形id字段名称
            ,treeUpId:'precatId'//树形父id字段名称
            ,treeShowName:'catName'//以树形式显示的字段
            ,height:"315"
            ,cols: [[
                {field:'catId',width:100, title: 'ID'}
				,{field:'catName',title: '分类名'}
                /*,{field:'precatId', title: 'pid'}*/
                ,{width:300,title: '操作', align:'center'                 
                	,templet: function(d){
                    var html='';
                    var edit = '<a class="layui-btn layui-btn layui-btn-xs" lay-event="edit" onclick=""><i class="layui-icon">&#xe642;</i>编辑 </a>'
                    var addBtn='<a class="layui-btn layui-btn-warm  layui-btn-xs" lay-event="add" onclick=""><i  class="layui-icon">&#xe642;</i>添加子栏目 </a>'
                    var delBtn='<a class="layui-btn-danger layui-btn layui-btn-xs" lay-event="del" onclick="" href="javascript:;"><i class="layui-icon">&#xe640;</i>删除</a>';
                    return edit+addBtn+delBtn;

                }}
            ]]
            ,page:false
        });

        treeGrid.on('tool('+tableId+')',function (obj) {
            if(obj.event === 'del'){//删除行
                console.log(obj);
                del(obj);
            }else if(obj.event==="add"){//添加行
                add(obj.data);
            }else if(obj.event==="edit"){//添加行
                add(obj.data);
            }
        });

    });

    function del(obj) {
        layer.confirm("你确定删除数据吗？如果存在下级节点则一并删除，此操作不能撤销！", {icon: 3, title:'提示'},
            function(index){//确定回调
                /*obj.del();*/
                var data =obj.data;
                console.log(data.catId)

                /*window.location.href = "http://localhost:8080/category/showCategoryAll.do" */
                layer.close(index);
            },function (index) {//取消回调
               layer.close(index);
            }
        );
    }


    var i=1000;
    //添加
    function add(pObj) {
        var param={};
        param.name='水果'+Math.random();
        param.id=++i;
        param.pId=pObj?pObj.id:0;
        treeGrid.addRow(tableId,pObj?pObj.LAY_TABLE_INDEX+1:0,param);
    }

    function print() {
        console.log(treeGrid.cache[tableId]);
        var loadIndex=layer.msg("对象已打印，按F12，在控制台查看！", {
            time:3000
            ,offset: 'auto'//顶部
            ,shade: 0
        });
    }
</script>
</body>
</html>
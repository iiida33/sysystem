// 1.入口函数
$(function() {
	var obj = {
		"aNav":[{
				"aName":"奶粉",
				"aUrl":"http://baidu.com",
				"bNav":[{
					"bName":"1级",
					"bUrl":"http://baidu.com"
				}, {
					"bName":"2级",
					"bUrl":"http://baidu.com"
				}]
			},{
				"aName":"玩具",
				"aUrl":"https://www.taobao.com",
				"bNav":[{
					"bName":"车子",
					"bUrl":"https://www.taobao.com"
				},{
					"bName":"娃娃",
					"bUrl":"https://www.taobao.com"
				}]
			},{
				"aName":"童装",
				"aUrl":"https://www.taobao.com",
				"bNav":[{
					"bName":"衣服",
					"bUrl":"https://www.taobao.com"
				}, {
					"bName":"鞋子",
					"bUrl":"https://www.taobao.com"
				}]
			}
		]
	};
// 	var html = template('navTmp', obj);
// 	alert(html);
	// $("#navontainer").html(htmlStr);
	// $('#navontainer').html(html);
// 	var str = document.getElementById('navontainer').innerHTML;
// 	$('#navontainer').html(str + html);
		var html = $.get('toPage.do?url=module/menuTemplate.html', function(data) {
			var render = template.compile(data);
			var str = render(obj);
			var strOri = document.getElementById('navcontainer').innerHTML;
            alert(strOri + str);
			document.getElementById('navcontainer').innerHTML = strOri + str;
		})
	// 

	// 2.Ajax 请求 (4个参数URL、type、dataType、请求成功和失败的函数)
	//     $.ajax({
	//         url:"",
	//         type:"get",
	//         dataType:"json",
	//         success:function(res){
	//             
	//             // console.log(res);
	// 
	//             /*
	//             注意：
	//             这里的 template参数：id="gameCenterTmp" , 表示对应的.html要渲染模板的id表记；
	//             参数2：表示 返回的数据，看情况。是对象就 {data:res}
	//             */ 
	//             var htmlStr = template("gameCenterTmp",{
	//                 data: res
	//             })
	//             // console.log(htmlStr);
	//             // 对模板渲染 （tabContent 是元素的id ）
	//             $("#tabContent ul").html(htmlStr);
	//         }
	//     })
})

// 1.入口函数
$(function() {
    console("test1");
    $.ajax({
        url: "/category/showCategory.do",
        type: "get",
        dataType: "json",
        success: function (res) {
            console("test2")
            var value = {value:res};
            var html = $.get('toPage.do?url=module/menuTemplate.html', function(data) {
                var render = template.compile(data);
                var str = render(value);
                var strOri = document.getElementById('navcontainer').innerHTML;
                document.getElementById('navcontainer').innerHTML = strOri + str;
            });
            var html1 = $.get('toPage.do?url=module/mobileMenuTemplate.html', function(data) {
                var render1 = template.compile(data);
                var str1 = render1(value);
                var strOri1 = document.getElementById('navcontainer1').innerHTML;
                document.getElementById('navcontainer1').innerHTML = strOri1 + str1;
            })
        }
    });
});

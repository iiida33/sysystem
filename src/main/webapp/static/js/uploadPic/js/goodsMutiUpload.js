/**
 * 图片上传数量及其大小等控制
 * 点击开始上传按钮(test9)，执行上传
 *
 */
var success = 0;
var fail = 0;
var imgurls = "";

$(function () {
    var imgsName = "";
    layui.use(['upload', 'layer'], function () {
        var upload = layui.upload;
        var layer = layui.layer;

        upload.render({
            elem: '#test1',
            url: '/upload.do',
            multiple: true,
            auto: false,
//			上传的单个图片大小
            size: 10240,
//			最多上传的数量
            number: 6,
//			MultipartFile file 对应，layui默认就是file,要改动则相应改动
            field: 'file',
            bindAction: '#test9',
            before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo2').append('<img src="' + result
                        + '" alt="' + file.name
                        + '"height="92px" width="92px" class="layui-upload-img uploadImgPreView">')
                });
            },
            done: function (res, index, upload) {
                //每个图片上传结束的回调，成功的话，就把新图片的名字保存起来，作为数据提交
                console.log(res.code);
                if (res.code == "1") {
                    fail++;
                } else {
                    success++;
                    imgurls = imgurls + "" + res.data.src + ",";
                    $('#imgUrls').val(imgurls);
                }
            },
            allDone: function (obj) {
                layer.msg("总共要上传图片总数为：" + (fail + success) + "\n"
                    + "其中上传成功图片数为：" + success + "\n"
                    + "其中上传失败图片数为：" + fail
                )
            }
        });
        //清空预览图片
        cleanImgsPreview();
        //保存商品
        goodsSave();

        /**
         * 清空预览的图片
         * 原因：如果已经存在预览的图片的话，再次点击上选择图片时，预览图片会不断累加
         * 表面上做上传成功的个数清0
         */
        function cleanImgsPreview() {
            $("#cleanImgs").click(function () {
                success = 0;
                fail = 0;
                $('#demo2').html("");
                $('#imgUrls').val("");
            });
        }

        /**
         * 保存商品
         */
        function goodsSave() {
            $('#btnSubmit').click(function () {
                var goodName = $("#goodName").val();
                var catId = $("#catId").val();
                var goodBrand = $("#goodBrand").val();
                var goodDescribe = $("#goodDescribe").val();
                var goodProps = $("#goodProps").val();
                var goodImage = $("#goodImg").attr("src");
                var skuProps = $("#skuProps").val();
                var skuPro = skuProps.split(",");
                var goodSkus = new Array();
                var goodSku = new Object();
                goodSku.skuNum = $("#skuNum1").val();
                goodSku.skuPrice = $("#skuPrice1").val();
                goodSku.skuStock = $("#skuStock1").val();
                goodSku.skuProps = skuPro[1];
                goodSkus.push(goodSku);
                if (skuPro[2] != null) {
                    goodSku.skuNum = $("#skuNum2").val();
                    goodSku.skuPrice = $("#skuPrice2").val();
                    goodSku.skuStock = $("#skuStock2").val();
                    goodSku.skuProps = skuPro[2];
                    goodSkus.push(goodSku);
                }
                var imgUrls = $('#imgUrls').val();
                console.log(imgUrls);
                $.ajax({
                    type: "POST",
                    url: "/good/saveGood.do",
                    data: {
                        "goodName": goodName,
                        "catId": catId,
                        "goodDescribe": goodDescribe,
                        "goodBrand": goodBrand,
                        "goodProps": goodProps,
                        "goodImage": goodImage,
                        "goodSkus": JSON.stringify(goodSkus),
                        "imgUrls": imgUrls,
                    },
                    success: function (msg) {
                        if (msg == "1") {
                            layer.alert("添加成功", {
                                    title: '添加信息'
                                },
                                function () {
                                    window.parent.location.reload();
                                    var index = parent.layer.getFrameIndex(window.name);
                                    parent.layer.close(index);
                                }
                            );
                        } else {
                            layer.msg("商品添加失败");
                        }
                    }
                });
            });
        }
    });

});

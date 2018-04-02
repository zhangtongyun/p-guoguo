$(function() {
    App.init();

    var Index = (function() {
        var me = {};

        // 处理一级菜单点击
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');

                // 添加选中 打开的样式
                //$(this).addClass('active');
            });
        };

        // 处理子菜单点击
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                    $('#mainFrame').attr('src',url);
                    var h = '<li> <i class="fa fa-home"></i> <a href="javascript:;">首页</a>';
                    if('btn-dashboard' != this.id){
                        h += '<i class="fa fa-angle-right"></i> </li><li> <a href="javascript:;">'+$(this).parent().parent().siblings()[0].innerText+' </a>' +
                            '<i class="fa fa-angle-right"></i> </li>'
                            + '<li> <a href="javascript:;">'+this.innerText+' </a> </li>';
                    }
                    h += '</li>';
                    $(".page-breadcrumb").html(h);
                }
            });
        };

        me.init = function() {
            me.handleMenuClick();
            me.handleSubMenuClick();
        };

        return me;
    })();

    Index.init();

    $('#btn-dashboard').trigger("click");
    $('#mainFrame').height(document.documentElement.clientHeight -160);

});



$(function () {

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();

});


var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    var ht = $(window).height()-40 - $(".panel-default").height();
    oTableInit.Init = function () {
        $('#tb_departments').bootstrapTable({
            url: '/test/getTestData',         //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParamsType:"",                 //获取参数方法  **queryParamsType  默认为 limit**
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记可供选择的每页的行数录行数（*）
            pageList: [10, 25, 50, 100],        //（*）
            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: ht,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                checkbox: true
            }, {
                field: 'bmmc',
                title: '部门名称',
                sortable:true
            }, {
                field: 'sjbm',
                title: '上级部门'
            }, {
                field: 'bmjb',
                title: '部门级别'
            }, {
                field: 'ms',
                title: '描述',
                visible:false
            },{
                field: 'operate',
                title: '操作',
                formatter: operateFormatter //自定义方法，添加操作按钮
            } ],
            onLoadSuccess: function (data) {
                $('[rel="popover"]').popover({placement:'top'});
            },
            onLoadError: function (status) {
            return false;
        }
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {  //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.pageSize,   //页面大小
            //offset: params.offset,
            page:params.pageNumber, //页码
            input: $("#txt_search_departmentname").val(),
            select1: $("#select1").val(),
            select2: $("#select2").val(),
            datetime:$("#datetime").val(),
            datetimeStart:$("#datetimeStart").val(),
            datetimeEnd:$("#datetimeEnd").val()
        };
        return temp;
    };
    return oTableInit;
};


var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        //初始化页面上面的按钮事件
        $("#btn_query").click(function(){
            $('#tb_departments').bootstrapTable('refreshOptions',{pageNumber:1});
        });

        //注册新增按钮的事件
            $("#btn_add").click(function () {
            $("#myModalLabel").text("新增");
            $('#myModal').modal();
        });

        $("#btn_delete").click(function(){
            del();
        })
    };

    return oInit;
};


function operateFormatter(value, row, index) {//赋予的参数
    return [
        ' <a href="javascript:void(0)" data-trigger="hover" class="btn btn-success" rel="popover" ' +
        'data-content="为我的网站创建一个提示框如此简单！" data-original-title="Bootstrap弹出框">'+row['bmmc']+'</a>'

    ].join('');
}

//注册删除按钮的事件
function del () {
    //取表格的选中行数据
    var arrselections = $("#tb_departments").bootstrapTable('getSelections');
    if (arrselections.length <= 0) {
        toastr.warning('请选择有效数据');
        toastr.success('提交数据成功');
        toastr.error('Error');
        toastr.info('info');
        return;
    }

    Ewin.confirm({ message: "确认要删除选择的数据吗？" }).on(function (e) {
        if (!e) {
            return;
        }
        $.ajax({
            type: "post",
            url: "/api/DepartmentApi/Delete",
            data: { "": JSON.stringify(arrselections) },
            success: function (data, status) {
                if (status == "success") {
                    toastr.success('提交数据成功');
                    $("#tb_departments").bootstrapTable('refresh');
                }
            },
            error: function () {
                toastr.error('Error');
            },
            complete: function () {

            }

        });
    });
};








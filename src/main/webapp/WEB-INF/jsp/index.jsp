<%@ page language="java" pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>项目管理系统</title>
    <%@ include file="mainHead.jsp" %>
    <script type="text/javascript">
        $.ajax({
            type: "POST",
            url: "functionList",
            success: function (msg) {
                $("#nav").accordion({animate: false});//为id为nav的div增加手风琴效果，并去除动态滑动效果
                $.each(msg.menus, function (i, n) {//$.each 遍历_menu中的元素
                    var menulist = '';
                    menulist += '<ul>';
                    $.each(n.menus, function (j, o) {
                        menulist += '<li><div><a ref="' + o.menuid + '"  rel="' + o.url + '" ><span class="icon ' + o.icon + '" >&nbsp;</span><span class="nav">' + o.menuname + '</span></a></div></li> ';
                    })
                    menulist += '</ul>';

                    $('#nav').accordion('add', {
                        title: n.menuname,
                        content: menulist,
                        iconCls: 'icon ' + n.icon
                    });
                });

                $('.easyui-accordion li a').click(function () {//当单击菜单某个选项时，在右边出现对用的内容
                    var tabTitle = $(this).children('.nav').text();//获取超链里span中的内容作为新打开tab的标题

                    var url = $(this).attr("rel");
                    var menuid = $(this).attr("ref");//获取超链接属性中ref中的内容
                    var icon = getIcon(menuid, icon);

                    addTab(tabTitle, url, icon);//增加tab
                    $('.easyui-accordion li div').removeClass("selected");
                    $(this).parent().addClass("selected");
                }).hover(function () {
                    $(this).parent().addClass("hover");
                }, function () {
                    $(this).parent().removeClass("hover");
                });

                //选中第一个
                var panels = $('#nav').accordion('panels');
                var t = panels[0].panel('options').title;
                $('#nav').accordion('select', t);


                //获取左侧导航的图标
                function getIcon(menuid) {
                    var icon = 'icon ';
                    $.each(msg.menus, function (i, n) {
                        $.each(n.menus, function (j, o) {
                            if (o.menuid == menuid) {
                                icon += o.icon;
                            }
                        })
                    })
                    return icon;
                }

                function addTab(subtitle, url, icon) {
                    if (!$('#tabs').tabs('exists', subtitle)) {
                        $('#tabs').tabs('add', {
                            title: subtitle,
                            content: createFrame(url),
                            closable: true,
                            icon: icon
                        });
                    } else {
                        $('#tabs').tabs('select', subtitle);
                        $('#mm-tabupdate').click();
                    }
                    tabClose();
                }

                function createFrame(url) {
                    var s = '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
                    return s;
                }

                function tabClose() {
                    /*双击关闭TAB选项卡*/
                    $(".tabs-inner").dblclick(function () {
                        var subtitle = $(this).children(".tabs-closable").text();
                        $('#tabs').tabs('close', subtitle);
                    })
                    /*为选项卡绑定右键*/
                    $(".tabs-inner").bind('contextmenu', function (e) {
                        $('#mm').menu('show', {
                            left: e.pageX,
                            top: e.pageY
                        });

                        var subtitle = $(this).children(".tabs-closable").text();

                        $('#mm').data("currtab", subtitle);
                        $('#tabs').tabs('select', subtitle);
                        return false;
                    });
                }


//弹出信息窗口 title:标题 msgString:提示信息 msgType:信息类型 [error,info,question,warning]
                function msgShow(title, msgString, msgType) {
                    $.messager.alert(title, msgString, msgType);
                }

                //绑定右键菜单事件
                function tabCloseEven() {
                    //刷新
                    $('#mm-tabupdate').click(function () {
                        var currTab = $('#tabs').tabs('getSelected');
                        var url = $(currTab.panel('options').content).attr('src');
                        $('#tabs').tabs('update', {
                            tab: currTab,
                            options: {
                                content: createFrame(url)
                            }
                        })
                    })
                    //关闭当前
                    $('#mm-tabclose').click(function () {
                        var currtab_title = $('#mm').data("currtab");
                        $('#tabs').tabs('close', currtab_title);
                    })
                    //全部关闭
                    $('#mm-tabcloseall').click(function () {
                        $('.tabs-inner span').each(function (i, n) {
                            var t = $(n).text();
                            $('#tabs').tabs('close', t);
                        });
                    });
                    //关闭除当前之外的TAB
                    $('#mm-tabcloseother').click(function () {
                        $('#mm-tabcloseright').click();
                        $('#mm-tabcloseleft').click();
                    });
                    //关闭当前右侧的TAB
                    $('#mm-tabcloseright').click(function () {
                        var nextall = $('.tabs-selected').nextAll();
                        if (nextall.length == 0) {
                            //msgShow('系统提示','后边没有啦~~','error');
                            alert('后边没有啦~~');
                            return false;
                        }
                        nextall.each(function (i, n) {
                            var t = $('a:eq(0) span', $(n)).text();
                            $('#tabs').tabs('close', t);
                        });
                        return false;
                    });
                    //关闭当前左侧的TAB
                    $('#mm-tabcloseleft').click(function () {
                        var prevall = $('.tabs-selected').prevAll();
                        if (prevall.length == 0) {
                            alert('到头了，前边没有啦~~');
                            return false;
                        }
                        prevall.each(function (i, n) {
                            var t = $('a:eq(0) span', $(n)).text();
                            $('#tabs').tabs('close', t);
                        });
                        return false;
                    });

                    //退出
                    $("#mm-exit").click(function () {
                        $('#mm').menu('hide');
                    })
                }
            }
        });

        //设置登录窗口
        function openPwd() {
            $('#w').window({
                title: '修改密码',
                width: 300,
                modal: true,
                shadow: true,
                closed: true,
                height: 160,
                resizable: false
            });
        }

        //关闭登录窗口
        function closePwd() {
            $('#w').window('close');
        }

        //        //修改密码
        //        function serverLogin() {
        //            var $newpass = $('#txtNewPass');
        //            var $rePass = $('#txtRePass');
        //
        //            if ($newpass.val() == '') {
        //                msgShow('系统提示', '请输入密码！', 'warning');
        //                return false;
        //            }
        //            if ($rePass.val() == '') {
        //                msgShow('系统提示', '请在一次输入密码！', 'warning');
        //                return false;
        //            }
        //
        //            if ($newpass.val() != $rePass.val()) {
        //                msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
        //                return false;
        //            }
        //
        //            $.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function (msg) {
        //                msgShow('系统提示', '恭喜,密码修改成功！<br>您的新密码为：' + msg, 'info');
        //                $newpass.val('');
        //                $rePass.val('');
        //                close();
        //            })
        //
        //        }

        $(function () {

            openPwd();

            $('#editpass').click(function () {
                $('#w').window('open');
            });

            $('#btnEp').click(function () {
                serverLogin();
            })

            $('#btnCancel').click(function () {
                closePwd();
            })

            $('#loginOut').click(function () {
                $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function (r) {

                    if (r) {
                        location.href = '/ajax/loginout.ashx';
                    }
                });
            })
        });
    </script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
<noscript>
    <div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
        <img src="images/noscript.gif" alt='抱歉，请开启脚本支持！'/></div>
</noscript>
<div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体"><span style="float:right; padding-right:20px;"
                                                                            class="head">欢迎 管理员 <a href="#"
                                                                                                   id="editpass">修改密码</a> <a
        href="#" id="loginOut">安全退出</a></span> <span style="padding-left:10px; font-size: 16px; "><img
        src="images/blocks.gif" width="20" height="20" align="absmiddle"/>客户关系管理系统</span></div>
<div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
    <div class="footer">版权所有，翻版必究</div>
</div>
<div region="west" hide="true" split="true" title="导航菜单" style="width:180px;" id="west">
    <div id="nav" class="easyui-accordion" fit="true" border="false">
        <!--  导航内容 -->

    </div>
</div>
<div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
    <div id="tabs" class="easyui-tabs" fit="true" border="false">

        <div title="欢迎使用" style="padding:20px;overflow:hidden; color:red; ">
            <h1 style="font-size:24px;">欢迎使用项目管理系统</h1>

        </div>
    </div>
</div>

<div id="mm" class="easyui-menu" style="width:150px;">
    <div id="mm-tabupdate">刷新</div>
    <div class="menu-sep"></div>
    <div id="mm-tabclose">关闭</div>
    <div id="mm-tabcloseall">全部关闭</div>
    <div id="mm-tabcloseother">除此之外全部关闭</div>
    <div class="menu-sep"></div>
    <div id="mm-tabcloseright">当前页右侧全部关闭</div>
    <div id="mm-tabcloseleft">当前页左侧全部关闭</div>
    <div class="menu-sep"></div>
    <div id="mm-exit">退出</div>
</div>
</body>
</html>
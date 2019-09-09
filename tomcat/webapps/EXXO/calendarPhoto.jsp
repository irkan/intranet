<%@page contentType="text/html" pageEncoding="UTF-8"%><jsp:useBean id="SLOGAN" class="BEANS.SLOGAN" scope="application"/><jsp:useBean id="CSS" class="BEANS.CSSTotal" scope="application"/>
<jsp:useBean id="CSS3" class="BEANS.css1Bean" scope="page"/><jsp:useBean id="LIST" class="BEANS.calendarPhoto" scope="page"/><%
    String slogan = SLOGAN.getSlogan(request);
    String list = LIST.getList(request);
    String s = request.getParameter("s");
    String back = LIST.back;
    String d = LIST.res;
    String id = request.getParameter("id");
    String owner = request.getParameter("owner");
    String name = LIST.name;
    if (owner == null) {
        owner = (String) session.getAttribute("id");
    }
    if (!LIST.ok) {
        response.sendRedirect("notPermited.html");
    }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>Əlavə et</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="content-style-type" content="text/css"/>
        <link rel="stylesheet" href="/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css" type="text/css" media="screen" />
        <script src="/FILES/alloy/build/aui/aui.js" type="text/javascript"></script>
        <link rel="stylesheet" href="index.css" type="text/css" />
        <link rel="stylesheet" href="blue.css" type="text/css" />
        <style type="text/css">
            @import url('css/topMenu.css');
            @import url('css/exxo.css');
            #content {position: relative;padding:0px;margin:0px 10px; width: 96%;}
            #container {font-size:12px;margin-top:0px;}
            .hover{background-color: red;color: white;}
            #container a {background-color: white; display: block; float: left;}
            .photo {width: 110px;height: 147px;margin: 2px;}
            #dopusks {font-size: 12px; margin-left: 10px;width: 168px; border: 1px solid #dedede; border-border: 1px solid #bfbfbf; background-color: rgb(252,252,252);padding-bottom: 20px;}
            #dopusks .emps {padding: 6px; cursor: pointer; padding-right: 30px;padding-left: 8px; border: 1px solid rgb(252,252,252);}
            #dopusks .emps:hover {color: red; background-image:url('drop.png'); background-repeat: no-repeat;background-color: white; border-radius: 5px; border: 1px solid rgb(240,240,240); background-position: 146px center;}
            #empsH {padding: 10px; color: gray; font-weight: bold; padding-left: 8px; padding-top:0; }
            #fname {padding: 8px; font-size: 10px;}
            #emptylist {color: #bfbfbf; text-align: center; margin-top: 20px; margin-bottom: 30px;}
        </style>
        <style>
            <%=CSS.getCSS(request)%>
        </style>
        <style>
            <%=CSS3.getCSS("company.jsp", request)%>
        </style>
    </head>
    <body id="calendarPhoto_jsp">
        <div id="content-wrapper">
            <div id="header">
                <table id="tableH">
                    <tbody>
                        <tr>
                            <td id="tdlogo">
                                <img src="logo.png" id="logo"></td>
                            <td>
                                <div id="head">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td id="slogan" valign="center"><%= slogan%></td>
                                                <td>
                                                    <jsp:include page="poisk" flush="true" />
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div id="foot">
                                    <ul class="topMenu">
                                        <jsp:include page="topMenu.xhtml" flush="true" />
                                        <li>
                                            <a href="<%=back%>" class="footmenu">Sonlandır</a>
                                        </li>
                                        <li> <a href="http://exxo.ru/howto/staff-howto.html#find" class="footmenu howto" target="_blank">?</a>
                                        </li>
                                    </ul>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <table id="grid" class="grid">
                <tbody id="atbody">
                    <tr id="tr">
                        <td id="menu-td" class="menu-td" valign="top">
                            <div id="dopusks" class="exxo-shadow">
                                <div id="fname">
                                    <%=name%>
                                </div>
                                <div id="empsH">Əməkdaşlar:</div>
                                <div id="empsDiv">
                                    <%=d%>
                                </div>
                            </div>
                        </td>
                        <td id="column-3" valign="top">
                            <div id="content">
                                <%=list%>
                            </div>
                        </td>
                    </tr> 
                </tbody>
            </table>
            <jsp:include page="FOOTER" flush="true" />
        </div>
        <script type="text/javascript">
            AUI().ready('aui-node', 'aui-io', function (A) {
                function dropRegistrat() {
                    dropAr = "";
                    A.all(".emps").each(function () {
                        this.on("click", function () {
                            if (confirm("Удалить?"))
                                empsDrop(this)
                        })
                    });
                    A.one('#dopusks').setStyle('height', A.one('#dopusks').getComputedStyle('height'));
                }
                function empsDrop(node) {
                    dropAr = node.getAttribute("id");
                    A.one("#empsDiv").unplug();
                    A.one("#empsDiv").plug(A.Plugin.IO, {uri: 'calCompareDrop', data: {dopusk: dropAr},
                        method: 'post', after: {'success': function () {
                                dropRegistrat()
                            }}});
                }
                dropRegistrat();
            });
        </script>
        <script type="text/javascript" src="scripts/poisk.js"></script>
        <script type="text/javascript" src="scripts/topMenu.js"></script>
    </body>
</html>
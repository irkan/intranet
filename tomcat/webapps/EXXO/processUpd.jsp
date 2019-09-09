<%@page contentType="text/html" pageEncoding="UTF-8"%><jsp:useBean id="SLOGAN" class="BEANS.SLOGAN" scope="application"/>
<jsp:useBean id="CSS" class="BEANS.CSSTotal" scope="application"/>
<jsp:useBean id="CSS3" class="BEANS.css1Bean" scope="page"/><jsp:useBean id="PA" class="BEANS.ProcessUpd" scope="page"/><%
    String slogan = SLOGAN.getSlogan(request);
    String role = (String) session.getAttribute("role");
    if (role.indexOf("a") < 0 && role.indexOf("h") < 0) {
        response.sendRedirect("notPermited.html");
    }
    String id = request.getParameter("id");
    if (id == null) {
        response.sendRedirect("notPermited.html");
    }
    PA.setParams(id, request);
    if (PA.R) {
        response.sendRedirect("notPermited.html");
    }
    String name = PA.name;
    String description = PA.description;
    String owner = PA.owner;
    String supervisor = PA.supervisor;
    String template = PA.template;
    int minToDo = PA.minToDo;
    int minToDeside = PA.minToDeside;
    String type = PA.type;
    int minToOpen = PA.minToOpen;
    int stoped = PA.stoped;
    String option = PA.option;
    String option1 = PA.option1;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>xidməti redaktə etmə forması</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="content-style-type" content="text/css"/>
        <link rel="stylesheet" href="/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css" type="text/css" media="screen" />
        <script src="/FILES/alloy/build/aui/aui.js" type="text/javascript"></script>
        <link rel="stylesheet" href="index.css" type="text/css" />
        <link rel="stylesheet" href="blue.css" type="text/css" />
        <style type="text/css">
            @import url('css/topMenu.css');
            @import url('css/exxo.css');
            #content {width:575px; margin-left: 10px; border-color: #DEDEDE #DEDEDE #BFBFBF #DEDEDE;border-width: 1px;border-style: solid;  background-color: white; padding-top:20px;}
            table.table {width: 100%; }
            td.left {text-align:right;padding:10px;padding-right:20px;}
            td.right {text-align:left;}
            .table tr {border-bottom: 1px solid #dfdfdf;}
            #submit-button{width:100%;text-align:center;}
            #ok{margin:15px;padding: 5px; cursor: pointer;}
            table.table {font-size: 12px;}
            td.left {color: gray; width: 200px;}
            td.right input[type=text] {width: 300px; padding: 2px;}
            td.right {padding: 5px;}
            #content textarea {width: 300px; height: 100px;padding: 2px;} 
            label {font-weight: normal;font-size:12px;}
            table.table tr:hover a {color:#972626;}
            .table a {color: #5B677D;text-decoration: none;}
            .table a:hover {text-decoration: underline;}    
            .strict {color:red;}
            #minToDeside,#minToOpen,#minToDo {width: 50px;}
        </style>
        <style>
            <%=CSS.getCSS(request)%>
        </style>
        <style>
            <%=CSS3.getCSS("processUpd.jsp", request)%>
        </style>
    </head>
    <body id="processUpd_jsp">
        <div id="content-wrapper">
            <div id="header">
                <table id="tableH">
                    <tbody>
                        <tr>
                            <td id="tdlogo"><img src="logo.png" id="logo"></td>
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
                                        <li><a href="services.jsp" class="footmenu">Sonlandır</a></li>
                                        <li> <a href="http://exxo.ru/howto/service-howto.html#edit" class="footmenu howto" target="_blank">?</a></li>
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
                            <div class="exxo-menu exxo-shadow" id="menu">
                                <jsp:include page="menu-serv.xhtml" flush="true" />
                            </div>
                            <div id="menuList"><a href="killService?id=<%= id%>" id="killService">Bu xidməti sil</a></div>
                        </td>
                        <td id="column-3" valign="top">
                            <div id="content" class="exxo-shadow">
                                <form method="post" id="form" name="form" action="processIns" class="exxo-form">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td class="left"><label>Ad</label></td>
                                                <td class="right"><input name="name" type="text" id="name" value="<%=name%>"></td></tr>
                                            <tr>
                                                <td class="left"><label>Açıqlama</label></td>
                                                <td class="right">
                                                    <textarea name="description" rows="5" cols="40">
                                                        <%if (description != null) {
                                                                out.print(description);
                                                            }%></textarea>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Sahibi</label></td>
                                                <td class="right">
                                                    <select name="owner"><%= option%></select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>İnspektor</label></td>
                                                <td class="right">
                                                    <select name="supervisor"><%= option1%></select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Şablon</label></td>
                                                <td class="right"><textarea name="template" rows="5" cols="40">
                                                        <%if (template != null) {
                                                                out.print(template);
                                                            } %>
                                                    </textarea>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Açılma vaxtı</label></td>
                                                <td class="right">
                                                    <input name="minToOpen" type="text" id="minToOpen" <%if (minToOpen != 0) {%>value="<%=minToOpen%>"<%}%>>
                                                    <select name="toOpen">
                                                        <option value="1" selected>dəqiqə</option>
                                                        <option value="60">saat</option>
                                                        <option value="1440">gün</option>
                                                        <option value="10080">dəqiqə</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Qərar vermək üçün vaxt</label></td>
                                                <td class="right">
                                                    <input name="minToDeside" type="text" id="minToDeside"  <%if (minToDeside != 0) {%>value="<%=minToDeside%>"<%}%>>
                                                    <select name="toDeside">
                                                        <option value="1" selected>dəqiqə</option>
                                                        <option value="60">saat</option>
                                                        <option value="1440">gün</option>
                                                        <option value="10080">həftə</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>İcra vaxtı</label></td>
                                                <td class="right">
                                                    <input name="minToDo" type="text" id="minToDo"    <%if (minToDo != 0) {%>value="<%=minToDo%>"<%}%>>
                                                    <select name="toDo">
                                                        <option value="1" selected>dəqiqə</option>
                                                        <option value="60">saat</option>
                                                        <option value="1440">gün</option>
                                                        <option value="10080">həftə</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Proses tipləri</label></td>
                                                <td class="right">
                                                    <select name="type">
                                                        <option value="simple" <%if (type.equals("simple")) {
                                                                out.print("SELECTED");
                                                            }%>>Açıldı</option>
                                                        <option value="desideIsDone" <%if (type.equals("desideIsDone")) {
                                                                out.print("SELECTED");
                                                            }%>>Həll edildi</option>
                                                        <option value="DoneIsDone" <%if (type.equals("DoneIsDone")) {
                                                                out.print("SELECTED");
                                                            }%>>İcra edildi</option>
                                                        <option value="answerIsDone" <%if (type.equals("answerIsDone")) {
                                                                out.print("SELECTED");
                                                            }%>>Cavab verildi</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="left"><label>Xidməti dayandır</label></td>
                                                <td class="right"><input name="stoped" type="checkbox" id="stoped" value="1"  
                                                                         <%if (stoped != 0) {
                                                                                 out.print("checked");
                                                                             }%>>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <div id="submit-button"><input type="submit" value="Yadda saxla" id="ok"></div>
                                </form>
                            </div>
                        </td>
                    </tr> 
                </tbody>
            </table>
            <jsp:include page="FOOTER" flush="true" />
        </div>
        <script type="text/javascript" src="scripts/poisk.js"></script>
        <script type="text/javascript" src="scripts/topMenu.js"></script>
    </body>
</html>
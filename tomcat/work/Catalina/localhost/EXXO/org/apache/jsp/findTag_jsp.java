/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-08-16 10:29:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      BEANS.SLOGAN SLOGAN = null;
      synchronized (application) {
        SLOGAN = (BEANS.SLOGAN) _jspx_page_context.getAttribute("SLOGAN", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (SLOGAN == null){
          SLOGAN = new BEANS.SLOGAN();
          _jspx_page_context.setAttribute("SLOGAN", SLOGAN, javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        }
      }
      BEANS.CSSTotal CSS = null;
      synchronized (application) {
        CSS = (BEANS.CSSTotal) _jspx_page_context.getAttribute("CSS", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (CSS == null){
          CSS = new BEANS.CSSTotal();
          _jspx_page_context.setAttribute("CSS", CSS, javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      BEANS.css1Bean CSS3 = null;
      CSS3 = (BEANS.css1Bean) _jspx_page_context.getAttribute("CSS3", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (CSS3 == null){
        CSS3 = new BEANS.css1Bean();
        _jspx_page_context.setAttribute("CSS3", CSS3, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }

    String slogan = SLOGAN.getSlogan(request);
    //    String element=request.getParameter("el");
    String s = request.getParameter("s");
    if (s == null) {
        s = "bloges";
    }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <title>Поиск по тегам</title>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"/FILES/alloy/build/aui/aui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"blue.css\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @import url('css/topMenu.css');\n");
      out.write("            #listTable td {padding: 5px;padding-left: 20px;padding-right: 20px; text-align: left;}\n");
      out.write("            #listTable  a {font-size:14px; text-decoration: none; color:black;}\n");
      out.write("            #listTable  a.bus {color:#0F1F99;}\n");
      out.write("            #listTable {font-size: 12px;}\n");
      out.write("            #listTable .tdTime {width:120px;}\n");
      out.write("            #listTable .time { font-size:11px;}\n");
      out.write("            .type_0, .type_1, .type_2, .type_3, .type_4 {width: 16px; border-right: 0; background-image: url(\"small/lock_unlock.png\"); background-repeat: no-repeat; background-position: center;}\n");
      out.write("            .type_3 {background-image: url(\"small/user_business_boss.png\")}\n");
      out.write("            .type_1 {background-image: url(\"small/flag_blue.png\")}\n");
      out.write("            .type_2 {background-image: url(\"small/group.png\")}\n");
      out.write("            .type_4 {background-image: url(\"small/envelope.png\")}\n");
      out.write("            #results table tr {border-top: 1px solid #DEDEDE;}\n");
      out.write("            #results table tr:first-of-type {border-top: 0;}\n");
      out.write("            #results table {width: 100%;background-color: white; border: 0;}\n");
      out.write("            #results table tr:nth-of-type(odd) {background-color: #F5F2F2;}\n");
      out.write("            #results a {text-decoration: none;}\n");
      out.write("            #results tr:hover a {color:#972626;}\n");
      out.write("            #results a:hover {text-decoration: underline;}\n");
      out.write("            #results a.blocked {text-decoration: line-through;}\n");
      out.write("            #results table tr:hover {background-color: #E3E2FD;}\n");
      out.write("            #results td {padding: 4px 10px; text-align: left;}\n");
      out.write("            #column-3 #content {border: 0;}\n");
      out.write("            .tdTime {font-size: 10px; width: 70px; color: #3B3B8F;}\n");
      out.write("            .aui-icon-dgeneral {background-image: url('small/lock_unlock.png');}\n");
      out.write("            .aui-icon-dproject {background-image: url('small/flag_blue.png');}\n");
      out.write("            .aui-icon-dgroup {background-image: url('small/group.png');}\n");
      out.write("            .aui-icon-dunit {background-image: url('small/user_business_boss.png');}\n");
      out.write("            .aui-icon-dprivat {background-image: url('small/envelope.png');}\n");
      out.write("            #results #picTable {width: 100%; }\n");
      out.write("            #results #picTable td {padding-right: 10px; padding-bottom: 5px; padding-top: 5px; font-size: 12px; text-align: left;}\n");
      out.write("            #results #picTable tr { border-bottom: 1px solid #dedede;}\n");
      out.write("            #results #picTable tr:last-of-type {border:0}\n");
      out.write("            #results #picTable tr:nth-of-type(odd) {background-color: #F5F2F2;}\n");
      out.write("            #results #picTable td.name {width: 250px; padding-left: 20px;  padding-right: 20px; font-size: 14px;}\n");
      out.write("            #results #picTable span.created {font-size: 10px;color: #3B3B8F;}\n");
      out.write("            #results td.ico {background-position: center center; background-repeat: no-repeat; width: 60px; height: 60px;}\n");
      out.write("            #results #picTable th {border:0; text-align: center; color: #3C3D58; height: 50px;;background-color: #E2E4EE; border-bottom: 1px solid #bfbfbf;}\n");
      out.write("            #results #picTable tr:hover {background-color: #E3E2FD;}\n");
      out.write("            #results #picTable tr:hover a {color:#972626;}\n");
      out.write("            #picTable a:hover {text-decoration: underline;}\n");
      out.write("            #results span.author {font-size: 10px;}\n");
      out.write("            div.alert {margin: 20px;font-size: 14px;}\n");
      out.write("            .item-hover {background: red;}\n");
      out.write("            .item-hover  a {color: white;}\n");
      out.write("            #main {position: relative;margin: 25px;width:auto;height: auto;margin-bottom: 10px;background-color: white;padding: 4px;overflow-y: auto;overflow-x: hidden;}\n");
      out.write("            .hov{ color:black; background-color: white;}\n");
      out.write("            .inno{margin:5px;margin-left:20px;}\n");
      out.write("            .cat {background-image: url(\"folder_closed.png\");background-position: left;background-repeat: no-repeat;padding-left: 20px;}\n");
      out.write("            .fil {background-image: url(\"img/tag.png\");background-position: left;background-repeat: no-repeat;padding-left: 20px;}\n");
      out.write("            .file-hover {color: red;}\n");
      out.write("            .filepath{color:gray;}\n");
      out.write("            table#small {width: 100%;}\n");
      out.write("            #tdmain {width:30%;}\n");
      out.write("            #tdinfo {width:70%;}\n");
      out.write("            #info{margin-left: 0px;padding: 4px;background-color: white; overflow: auto;}\n");
      out.write("            .tagsDiv {padding:3px; display: inline-block; background-color: white; border: 1px solid #bfbfbf;margin:3px;color:black;-moz-border-radius: 4px;\n");
      out.write("                      -webkit-border-radius: 4px;border-radius: 4px; padding-left: 20px; background-image: url('img/tag.png');\n");
      out.write("                      background-position: 2px center;\n");
      out.write("                      background-repeat: no-repeat;}\n");
      out.write("            #tdinfo #info {margin:0px;height: 70px; border:0;}\n");
      out.write("            #panel {margin:0px;height: 30px; width: 100%; background-color: #CFDDCF; }\n");
      out.write("            #results {margin:0px;margin-right:10px; margin-top: 16px; background-color: whitesmoke; overflow: auto;border-color: #DEDEDE #DEDEDE #BFBFBF #DEDEDE;\n");
      out.write("                      border-width: 1px;border-style: solid;}\n");
      out.write("            .tagsDiv:hover {border: 1px solid black;margin:3px;color:white;background-color:gray;cursor:pointer;}\n");
      out.write("            div.GREEN {color:green;}\n");
      out.write("            div.RED {color: red; }\n");
      out.write("            div.BLUE {color: blue; }\n");
      out.write("            #panel div {display:block; margin-left: 50px;}\n");
      out.write("            #imger {position: absolute;display: none;left:20px;top:20px;padding: 10px;background-color: black;z-index: 9999999;}\n");
      out.write("            #closser {color:red;width:100%;text-align:right;}\n");
      out.write("            table#FILESTABLE td {font-size: 12px;}\n");
      out.write("            table#FILESTABLE {width: 100%;}\n");
      out.write("            table#FILESTABLE tr.imges {height: auto;}\n");
      out.write("            table#FILESTABLE .first {width:20px;}\n");
      out.write("            table#FILESTABLE .fil {background-image: none;padding-left: 20px;font-size: 11px;color: gray;width: 30%; text-align: left;}\n");
      out.write("            table#FILESTABLE .fil a{font-size: 12px;margin-right: 20px;}\n");
      out.write("            table#FILESTABLE .fio {background-image: none; padding-left: 20px;font-size: 11px;\n");
      out.write("                                   color: black; width: 30%; text-align: left;}\n");
      out.write("            table#FILESTABLE .fio a{font-size: 12px; margin-right: 10px;}\n");
      out.write("            #closer {width:90%;}\n");
      out.write("            #imger {position: absolute;display: none;left:20px;top:20px;padding: 10px;background-color: black;z-index: 9999999;}\n");
      out.write("            table#FILESTABLE .image {background-image: url(\"small/photo.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .text {background-image: url(\"small/page_white_text.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .pdf {background-image: url(\"small/doc_pdf.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .doc {background-image: url(\"small/page_white_word.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .noresult {background-image: url(\"small/application2.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .xls {background-image: url(\"small/page_excel.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .zip {background-image: url(\"small/compress.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .rar {background-image: url(\"small/compress.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .ooo_doc {background-image: url(\"small/doc_offlice.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .ooo_ss {background-image: url(\"small/doc_table.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .audio {background-image: url(\"small/doc_music.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .video {background-image: url(\"small/films.png\");background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE .pp {background-image: url(\"small/page_white_powerpoint.png\"); background-position:  center center;background-repeat: no-repeat;}\n");
      out.write("            table#FILESTABLE td.created {font-size: 10px;color: #3B3B8F;}\n");
      out.write("            #topRight {margin-right: 10px; border-color: #DEDEDE #DEDEDE #BFBFBF #DEDEDE; border-width: 1px;border-style: solid;}\n");
      out.write("            .aui-icon-circulR {background-image: url('small/circulR.png'); background-position: center;}\n");
      out.write("            .aui-icon-circulG {background-image: url('small/circulG.png'); background-position: center;}\n");
      out.write("            .aui-icon-circulB {background-image: url('small/circulB.png'); background-position: center;}\n");
      out.write("            #panel1 button {width: 70px;}\n");
      out.write("            #panel1 button, #panel2 button {margin-top: 0px !important;margin-right: 0px; height: 22px;}\n");
      out.write("            #menu-navi {width: 95%; margin-left:10px; height: auto;}\n");
      out.write("            #menu-navi table {width:100%;}\n");
      out.write("            #menu-navi table td.oneNavi,#menu-navi table td.threeNavi  {width: 60px;}\n");
      out.write("            #menu-navi a {display: block; border: 1px solid #BFBFBF; width: 40px; height: 40px; margin: 10px; }\n");
      out.write("            #menu-navi a:hover {background-color: white;}\n");
      out.write("            a#backward {background-image: url('small/backward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px;}\n");
      out.write("            a#forward {background-image: url('small/forward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px; }\n");
      out.write("            a#backward:hover {background-image: url('small/backward.png'); }\n");
      out.write("            a#forward:hover {background-image: url('small/forward.png');}\n");
      out.write("            #menu-navi table tr:hover {background-color: transparent;}\n");
      out.write("            #menu-navi table:hover {background-color: transparent;}\n");
      out.write("            #panel2 span.aui-button-icon {margin-top: 0px;}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS.getCSS(request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS3.getCSS("findTag.jsp", request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"findTag_jsp\">\n");
      out.write("        <div id=\"content-wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <table id=\"tableH\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"tdlogo\">\n");
      out.write("                                <img src=\"logo.png\" id=\"logo\">\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"head\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td id=\"slogan\" valign=\"center\">");
      out.print( slogan);
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "poisk", out, true);
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"foot\">\n");
      out.write("                                    <ul class=\"topMenu\">\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topMenu.xhtml", out, true);
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"tags.jsp\" class=\"footmenu\">Redaktə et</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li> \n");
      out.write("                                            <a href=\"http://exxo.ru/howto/knowledge-management-howto.html#tags\" class=\"footmenu howto\" target=\"_blank\">?</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <table id=\"grid\" class=\"grid\">\n");
      out.write("                <tbody id=\"atbody\">\n");
      out.write("                    <tr id=\"tr\">\n");
      out.write("                        <td id=\"column-3\" valign=\"top\">\n");
      out.write("                            <table id=\"small\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td id=\"tdmain\"  valign=\"top\">\n");
      out.write("                                            <div id=\"main\" class=\"exxo-shadow\"></div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td id=\"tdinfo\"  valign=\"top\">\n");
      out.write("                                            <div id=\"topRight\" class=\"exxo-shadow\">\n");
      out.write("                                                <div id=\"info\"></div>\n");
      out.write("                                                <table id=\"panel\">\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div id=\"panel1\"></div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div id=\"op\">\n");
      out.write("                                                                <select name=\"tagAim\" id=\"tagAim\">\n");
      out.write("                                                                    <option value=\"bloges\" ");
if (s.equals("bloges")) {
      out.write("SELECTED ");
}
      out.write(">Mesajlarda axtarış</option>\n");
      out.write("                                                                    <option value=\"files\" ");
if (s.equals("files")) {
      out.write("SELECTED ");
}
      out.write(">Fayllarda axtarış</option>\n");
      out.write("                                                                    <option value=\"gallaries\" ");
if (s.equals("gallaries")) {
      out.write("SELECTED ");
}
      out.write(">Şəkillərdə axtarış</option>\n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div id=\"panel2\"></div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </table>\n");
      out.write("                                                    \n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"results\" class=\"exxo-shadow\"></div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr> \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        <div id=\"imger\"><div id=\"closser\"><span>BAĞLA</span></div><div id=\"imgerViewer\"></div></div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            AUI().ready('aui-io', 'aui-toolbar', 'aui-overlay-mask', 'anim', function (A) {\n");
      out.write("                var server = \"");
      out.print(s);
      out.write("\";\n");
      out.write("                var status = 1;\n");
      out.write("                var myHeight = A.DOM.winHeight() - 150;\n");
      out.write("                if (myHeight < 300)\n");
      out.write("                    myHeight = 300;\n");
      out.write("                var of = 0;\n");
      out.write("                var ROWS =");
      out.print(BASE.VER.getMaxRows1(request.getServletContext()));
      out.write(";\n");
      out.write("                var DATA = {of: of};\n");
      out.write("                reInfo(DATA);\n");
      out.write("                Reload(\"1\", null);\n");
      out.write("                function Reload(superior, id) {\n");
      out.write("                    A.one(\"#main\").unplug(A.Plugin.IO);\n");
      out.write("                    var data = {superior: superior};\n");
      out.write("                    if (id != null)\n");
      out.write("                        data = {id: id};\n");
      out.write("\n");
      out.write("                    A.one(\"#main\").plug(A.Plugin.IO, {uri: 'tagClassic', method: 'POST',\n");
      out.write("                        data: data,\n");
      out.write("                        on: {'end': function (event) {\n");
      out.write("                                A.all(\".cat\").each(function () {\n");
      out.write("                                    this.on(\"mouseover\", function () {\n");
      out.write("                                        this.addClass(\"file-hover\");\n");
      out.write("                                    })\n");
      out.write("                                });\n");
      out.write("                                A.all(\".fil\").each(function () {\n");
      out.write("                                    this.on(\"click\", function () {\n");
      out.write("                                        this.addClass(\"file-hover\");\n");
      out.write("                                        var fileID = this.get(\"id\");\n");
      out.write("                                        var DATA = {id: fileID, status: status, of: of};\n");
      out.write("                                        reInfo(DATA);\n");
      out.write("                                    })\n");
      out.write("                                });\n");
      out.write("                                A.all(\".item\").each(function () {\n");
      out.write("                                    this.on(\"mouseout\", function () {\n");
      out.write("                                        this.removeClass(\"file-hover\");\n");
      out.write("                                    })\n");
      out.write("                                });\n");
      out.write("                                A.all(\".cat\").each(function () {\n");
      out.write("                                    this.on(\"click\", function () {\n");
      out.write("                                        if (!this.hasClass(\"upper\"))\n");
      out.write("                                            Reload(this.get(\"id\"), null);\n");
      out.write("                                        else\n");
      out.write("                                            Reload(null, this.get(\"id\"));\n");
      out.write("                                    })\n");
      out.write("                                });\n");
      out.write("                            }}})\n");
      out.write("                }\n");
      out.write("                A.one(\"#main\").setStyle(\"height\", myHeight + \"px\");\n");
      out.write("                A.one(\"#results\").setStyle(\"height\", (myHeight - 140) + \"px\");\n");
      out.write("                function reInfo(data) {\n");
      out.write("                    A.one(\"#info\").unplug(A.Plugin.IO);\n");
      out.write("                    A.one(\"#info\").plug(A.Plugin.IO, {uri: 'tagFound', data: data, method: 'POST',\n");
      out.write("                        on: {'end': function () {\n");
      out.write("                                of = 0;\n");
      out.write("                                var data = {s: server};\n");
      out.write("                                reResults(data);\n");
      out.write("                                if (A.one(\".tagsDiv\") != null)\n");
      out.write("                                    A.all(\".tagsDiv\").each(function () {\n");
      out.write("                                        this.on(\"click\", function () {\n");
      out.write("                                            if (window.confirm('Удалить тег?')) {\n");
      out.write("                                                var id = this.getAttribute('id');\n");
      out.write("                                                of = 0;\n");
      out.write("                                                A.io.request(\"dropFoundTag\", {method: 'post', data: {id: id}, on: {'success': function () {\n");
      out.write("                                                            var data = {s: server};\n");
      out.write("                                                            reResults(data)\n");
      out.write("                                                        }}}\n");
      out.write("                                                );\n");
      out.write("                                                this.remove();\n");
      out.write("                                            }\n");
      out.write("                                        })\n");
      out.write("                                    });\n");
      out.write("                            }}});\n");
      out.write("                }\n");
      out.write("                function reResults(data) {\n");
      out.write("                    A.one(\"#results\").unplug(A.Plugin.IO);\n");
      out.write("                    A.one(\"#results\").plug(A.Plugin.IO, {uri: 'tagResults', method: 'POST', data: data, on: {\"end\": function () {\n");
      out.write("                                if (A.one(\"a.imger\"))\n");
      out.write("                                    A.all(\"a.imger\").each(function () {\n");
      out.write("                                        var href = this.getAttribute('href');\n");
      out.write("                                        this.setAttribute('href', 'javascript:')\n");
      out.write("                                        this.on(\"click\", function () {\n");
      out.write("                                            A.one('#imger').fx.run();\n");
      out.write("                                            var html = \"<img src='\" + href + \"'>\";\n");
      out.write("                                            A.one(\"#imgerViewer\").html(html).scrollIntoView( );\n");
      out.write("                                        });\n");
      out.write("                                    })\n");
      out.write("                                if (A.one(\"#forward\") != null)\n");
      out.write("                                    A.one(\"#forward\").on(\"click\", function () {\n");
      out.write("                                        of = of + ROWS;\n");
      out.write("                                        reResults({s: server, of: of});\n");
      out.write("                                    });\n");
      out.write("                                if (A.one(\"#backward\") != null)\n");
      out.write("                                    A.one(\"#backward\").on(\"click\", function () {\n");
      out.write("                                        of = of - ROWS;\n");
      out.write("                                        if (of < 0)\n");
      out.write("                                            of = 0;\n");
      out.write("                                        reResults({s: server, of: of});\n");
      out.write("                                    });\n");
      out.write("                            }}});\n");
      out.write("                }\n");
      out.write("                new A.Toolbar({activeState: false, children: [\n");
      out.write("                        {label: 'И', icon: 'circulG', handler: {fn: function (e) {\n");
      out.write("                                    A.one(\"#tdinfo #panel\").setStyle('backgroundColor', '#CFDDCF');\n");
      out.write("                                    status = 1;\n");
      out.write("                                }}},\n");
      out.write("                        {label: 'ИЛИ', icon: 'circulB', handler: {fn: function (e) {\n");
      out.write("                                    A.one(\"#tdinfo #panel\").setStyle('backgroundColor', '#DEDEE4');\n");
      out.write("                                    status = 2;\n");
      out.write("                                }}},\n");
      out.write("                        {label: 'НЕ', icon: 'circulR', handler: {fn: function (e) {\n");
      out.write("                                    A.one(\"#tdinfo #panel\").setStyle('backgroundColor', '#E4D7D7');\n");
      out.write("                                    status = 3;\n");
      out.write("                                }}}\n");
      out.write("                    ]}).render(A.one(\"#panel1\"));\n");
      out.write("                new A.Toolbar({activeState: false, children: [\n");
      out.write("                        {label: 'ОЧИСТИТЬ', icon: 'closethick', handler: {fn: function (e) {\n");
      out.write("                                    A.io.request('dropAllTags',\n");
      out.write("                                            {method: 'POST', on: {'success': function () {\n");
      out.write("                                                        var D = {};\n");
      out.write("                                                        reInfo(D);\n");
      out.write("                                                    }}});\n");
      out.write("                                }}},\n");
      out.write("                        {label: 'РАЗВЕРНУТЬ', icon: 'arrow-4-diag', handler: {fn: function (e) {\n");
      out.write("                                    var s = server;\n");
      out.write("                                    location = \"openTags.jsp?s=\" + s;\n");
      out.write("                                }}}\n");
      out.write("                    ]}).render(A.one(\"#panel2\"));\n");
      out.write("                A.one(\"#tagAim\").on(\"change\", function (e) {\n");
      out.write("                    server = this.get(\"value\");\n");
      out.write("                    of = 0;\n");
      out.write("                    var data = {s: server, of: of};\n");
      out.write("                    reResults(data);\n");
      out.write("                })\n");
      out.write("                var overlayMask = new A.OverlayMask().render();\n");
      out.write("                A.one('#imger').setStyle('opacity', '0');\n");
      out.write("                var div = A.one('#imger');\n");
      out.write("                var conf = {\n");
      out.write("                    from: {opacity: 0},\n");
      out.write("                    to: {opacity: 1},\n");
      out.write("                    on: {'start': function () {\n");
      out.write("                            if (!this.get('reverse')) {\n");
      out.write("                                overlayMask.set('target', document).show();\n");
      out.write("                                this.get('node').setStyle('display', 'block');\n");
      out.write("                            }\n");
      out.write("                        }},\n");
      out.write("                    after: {'end': function () {\n");
      out.write("                            this.set('reverse', !this.get('reverse'));\n");
      out.write("                            this.stop();\n");
      out.write("                            if (this.get('node').getStyle('opacity') == 0)\n");
      out.write("                                this.get('node').setStyle('display', 'none');\n");
      out.write("                            if (!this.get('reverse'))\n");
      out.write("                                overlayMask.set('target', document).hide();\n");
      out.write("                        }}};\n");
      out.write("                div.setStyle('opacity', '0');\n");
      out.write("                div.plug(A.Plugin.NodeFX, conf);\n");
      out.write("                A.one('#closser span').on('click', function (event) {\n");
      out.write("                    div.fx.run();\n");
      out.write("                });\n");
      out.write("                A.one(\".aui-overlaymask-content\").setStyle(\"height\", \"100%\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/poisk.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/topMenu.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-08-16 11:04:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blogInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (request.getParameter("r") == null) {
        response.sendRedirect("blogEditor.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=10\" />\n");
      out.write("        <title>Yeni mesaj</title>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"pragma\" content=\"no-cache\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"/FILES/alloy/build/aui/aui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"yui/build/assets/skins/sam/skin.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"yui/build/fonts/fonts-min.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/yahoo-dom-event/yahoo-dom-event.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/element/element-min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/container/container_core-min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/menu/menu-min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/button/button-min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"yui/build/editor/my-editor-min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @import url('css/topMenu.css');\n");
      out.write("            @import url('css/exxo.css');\n");
      out.write("            @import url('editor.css');\n");
      out.write("            div#topMenu {width: 100%; height: 36px; background-color: gray;background-image: url(\"img/spr.png\");background-position: bottom;background-repeat: repeat-x;}\n");
      out.write("            #foot {height: 30px;padding-top: 6px;margin: 0;background-color: transparent;width: auto;border: 0;text-align: left;padding-left: 275px;background-image: none;}\n");
      out.write("            .footmenu {font-size: 15px;text-decoration: none;color: white;background-color: transparent; padding: 5px; display: inline-block;}\n");
      out.write("            body {background-color:#EEEEF1;}\n");
      out.write("            #dopuski {background-color:white; padding: 0px; width: auto; margin: 0px; display: block; }\n");
      out.write("            #bus {padding:0px; padding-bottom: 0px; width: auto; margin: 0px; display: block;}\n");
      out.write("            #f {background-color:white; padding:0px; padding-bottom: 20px; padding-top: 0px; width: auto; margin: 0px; display: block; }\n");
      out.write("            label {display:block; margin-top: 0px;}\n");
      out.write("            #tema input[type=text] {width: 350px; border: 1px solid #bfbfbf; padding:4px; box-sizing: border-box; -moz-box-sizing: border-box;} \n");
      out.write("            input[type=submit] {padding: 4px;}\n");
      out.write("            textarea {width: 100%; overflow: auto;}\n");
      out.write("            #tagH {font-size: 12px; margin-left: 60px; font-weight: normal;}\n");
      out.write("            #tags {padding: 10px; margin: 40px; margin-top: 10px;}\n");
      out.write("            .tag {padding:3px; display: inline-block; background-color: greenyellow; border: 1px solid green;margin:3px;color:black;-moz-border-radius: 4px;\n");
      out.write("                  -webkit-border-radius: 4px;border-radius: 4px;}\n");
      out.write("            #tagChange {margin-top: 10px; padding: 10px; text-align: left; clear: both;}\n");
      out.write("            #tops {text-align: left; font-size: 12px; margin: 20px;}\n");
      out.write("            #content {width: 700px; margin-left: 20px; background-color: white; height: auto; padding: 20px; border-color: #DEDEDE #DEDEDE #BFBFBF #DEDEDE;border-width: 1px; border-style: solid; padding-bottom: 100px;}\n");
      out.write("            .hidden {display: none; }\n");
      out.write("            .emps:hover {cursor: pointer; color:red;}\n");
      out.write("            .emps {color: #2F2F70; display: inline-block; margin-right: 10px;}\n");
      out.write("            #dt, .invis {padding: 3px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgEmp span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"emp.png\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgEmp-selected span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"emp.png\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgMy span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"imgMy.gif\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgMy-selected span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"imgMy.gif\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgMyK span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"imgK.gif\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            .yui-skin-sam .yui-toolbar-container .yui-toolbar-imgMyK-selected span.yui-toolbar-icon {\n");
      out.write("                background-image: url(\"imgK.gif\");background-position: 1px 1px;background-repeat: no-repeat;left: 5px;}\n");
      out.write("            #close {color:red;width:auto;text-align:right; padding:5px; padding-right: 10px;}\n");
      out.write("            #inserter {padding: 20px;}\n");
      out.write("            #containerImg img.photo {margin: 2px;}\n");
      out.write("            .hov{color:black;background-color: white;}\n");
      out.write("            .inno{margin:5px;margin-left:20px;}\n");
      out.write("            .cat {background-position: left;background-repeat: no-repeat;display: inline-block; width: 180px;vertical-align: top;margin: 10px;font-weight: bold; }\n");
      out.write("            .fil {margin: 5px;float: left;font-style: italic;font-weight: bolder;}\n");
      out.write("            .file-hover {color: red;}\n");
      out.write("            .yui-editor-container .yui-editor-editable-container {width: 610px !important; padding-right: 0px; padding-left:90px;}\n");
      out.write("            #msgpost {width: 700px;}\n");
      out.write("            #editorContainer {background-color: white; width:700px;}\n");
      out.write("            #submitB input {padding: 5px;  cursor: pointer; margin: 0px;}\n");
      out.write("            #tdMenu {vertical-align: top; padding-top: 25px; padding-left: 15px;}\n");
      out.write("            #center {vertical-align: top; padding-top: 25px; padding-left: 10px;}\n");
      out.write("            .mytop {width: 100%; margin-top: 10px;}\n");
      out.write("            .mytop .one {width: 100px; vertical-align: middle;}\n");
      out.write("            .mytop select {width: 350px;box-sizing: border-box; -moz-box-sizing: border-box;}\n");
      out.write("            .mytop .two {width: 350px; text-align: left;}\n");
      out.write("            .mytop .three {text-align: right;}\n");
      out.write("            #empMenu button {height: 24px; padding-top: 5px; min-width: 26px;}\n");
      out.write("            #empMenu {margin-top: 10px; margin-bottom: 20px;}\n");
      out.write("            #menu-navi {width: 95%; margin-left:10px; height: auto;}\n");
      out.write("            #menu-navi table {width:100%;}\n");
      out.write("            #menu-navi table td.oneNavi,#menu-navi table td.threeNavi  {width: 60px;}\n");
      out.write("            #menu-navi span {display: block; border: 1px solid #BFBFBF; width: 40px; height: 40px; margin: 10px; }\n");
      out.write("            #menu-navi span:hover {background-color: white; cursor: pointer;}\n");
      out.write("            span#backward {background-image: url('small/backward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px;}\n");
      out.write("            span#forward {background-image: url('small/forward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px; }\n");
      out.write("            span#backward:hover {background-image: url('small/backward.png'); }\n");
      out.write("            span#forward:hover {background-image: url('small/forward.png');}\n");
      out.write("            #imges {position: absolute;background-color: transparent;  width: 100%; height: auto; z-index: 99999999;display:none; left:0px; top: 0px;}\n");
      out.write("            #imgesInner {position:relative;width:auto;height:auto;margin: 4px; background-color:rgb(250,250,250);border: 1px solid #bfbfbf; border-radius: 5px;}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS.getCSS(request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS3.getCSS("blogInsert.jsp", request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"yui-skin-sam\" id=\"blogInsert_jsp\">\n");
      out.write("        <div id=\"topMenu\">\n");
      out.write("            <div id=\"foot\">\n");
      out.write("                <ul class=\"topMenu\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topMenu.xhtml", out, true);
      out.write("\n");
      out.write("                    <li><a href=\"correspondence.jsp\" class=\"footmenu\">Sonlandır</a></li>\n");
      out.write("                    <li> <a href=\"http://exxo.ru/howto/mail-howto.html#send\" class=\"footmenu howto\" target=\"_blank\">?</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blogInsert.xhtml", out, true);
      out.write("\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print(BASE.VER.getMaxBloks(request.getServletContext()));
      out.write("\"  id=\"maxRows\" />\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\" src=\"scripts/topMenu.js\"></script>\n");
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
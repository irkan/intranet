/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-08-16 12:08:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class desk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      BEANS.DeskBean DESK = null;
      DESK = (BEANS.DeskBean) _jspx_page_context.getAttribute("DESK", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (DESK == null){
        DESK = new BEANS.DeskBean();
        _jspx_page_context.setAttribute("DESK", DESK, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }

    String fio = (String) session.getAttribute("fio");
    String list = DESK.getList(request);
    String slogan = SLOGAN.getSlogan(request);
    String of = request.getParameter("of");
    if (of == null) {
        of = "0";
    }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <title>Elanlar lövhəsi</title>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\">\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"/FILES/alloy/build/aui/aui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"blue.css\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #content {width:700px;height:auto;position: relative;padding:0px;margin:0px 10px;overflow-x: hidden;overflow-y: auto;}\n");
      out.write("            .hoverPlus {color  :red;}\n");
      out.write("            #editor {margin: 25px;padding:20px;position: absolute;z-index: 99998;top:20px;left:10%;width: 650px;color: black;background-color: white;\n");
      out.write("                     display: none;overflow: auto;}\n");
      out.write("            .close {color:red;width:100%;text-align:right; font-size: 12px; margin-bottom: 10px;}\n");
      out.write("            .text {font-size:12px;padding-bottom: 10px;text-align: left; padding-top: 10px;}\n");
      out.write("            .timer {font-size: 12px;text-align: left; padding-left: 20px; margin-bottom: 10px;}\n");
      out.write("            .HBlog{text-align: right;}\n");
      out.write("            .desc {margin-bottom: 20px;background-color: white;padding: 10px;padding-top: 5px;padding-bottom: 5px;clear: both;background-color: white;}\n");
      out.write("            .B {padding-left: 10px; text-decoration: none;}\n");
      out.write("            .desc:hover .B, .desc:hover .timer a {color: #972626;}\n");
      out.write("            .B:hover, .timer a:hover {text-decoration: underline;}\n");
      out.write("            #plus, #plusik {font-size: 12px;text-align: left; margin: 10px; margin-left: 15px;}\n");
      out.write("            #pl {padding-left: 5px; text-decoration: none; cursor: pointer;}\n");
      out.write("            #pl:hover {color: #972626; text-decoration: underline;}\n");
      out.write("            .timer a {margin-right: 20px;text-decoration: none;}\n");
      out.write("            .text {padding-left: 20px;min-height: 60px; border: 1px solid #dedede; border-radius: 5px; position: absolute; background-color: #FDF2F2; width: 560px; padding-right: 10px;}\n");
      out.write("            .desc {font-size: 12px; border: 1px solid #dedede; border-bottom: 1px solid #bfbfbf;}\n");
      out.write("            input#submit{margin: 20px auto; display: block; width: 110px; padding: 5px;}\n");
      out.write("            #editor textarea {width: 600px;}\n");
      out.write("            td.imgTd {padding: 4px; width: 75px; }\n");
      out.write("            td.imgTd img {width: 75px;height: 100px;}\n");
      out.write("            .desc table {width:100%;}\n");
      out.write("            .desc table td {vertical-align: top;}\n");
      out.write("            .text::before {content: ' ';height: 0;position: absolute;width: 0;border: 8px solid transparent;border-right-color: #dedede;right: 100%;top: 20px;}\n");
      out.write("            .text::after {content: ' ';height: 0;position: absolute;width: 0;border: 6px solid transparent;border-right-color: #FDF2F2;right: 100%;top: 22px;}\n");
      out.write("            #count {height: 20px; font-size: 16px; color: gray;}\n");
      out.write("            #menu-navi {width: 90%; margin-left:10px; height: auto;}\n");
      out.write("            #menu-navi table {width:100%;}\n");
      out.write("            #menu-navi table td.oneNavi,#menu-navi table td.threeNavi  {width: 60px;}\n");
      out.write("            #menu-navi a {display: block; border: 1px solid #BFBFBF; width: 40px; height: 40px; margin: 10px; }\n");
      out.write("            #menu-navi a:hover {background-color: white;}\n");
      out.write("            a#backward {background-image: url('small/backward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px;}\n");
      out.write("            a#forward {background-image: url('small/forward1.png'); background-position: center center; background-repeat: no-repeat;border-radius: 8px; }\n");
      out.write("            a#backward:hover {background-image: url('small/backward.png'); }\n");
      out.write("            a#forward:hover {background-image: url('small/forward.png');}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS.getCSS(request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS3.getCSS("desk.jsp", request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"yui3-skin-sam\" id=\"desk_jsp\">\n");
      out.write("        <div id=\"content-wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <table id=\"tableH\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"tdlogo\"><img src=\"logo.png\" id=\"logo\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"head\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td id=\"slogan\" valign=\"center\">");
      out.print( slogan);
      out.write("</td>\n");
      out.write("                                                <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "poisk", out, true);
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"foot\">\n");
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topMenu", out, true);
      out.write(" \n");
      out.write("                                    <a href=\"http://exxo.ru/howto/board-howto.html\" class=\"footmenu howto\" target=\"_blank\">?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <table id=\"grid\" class=\"grid\">\n");
      out.write("                <tbody id=\"atbody\">\n");
      out.write("                    <tr id=\"tr\">\n");
      out.write("                        <td id=\"menu-td\" class=\"menu-td\" valign=\"top\">\n");
      out.write("                            <div class=\"menu\" id=\"menu\"></div>\n");
      out.write("                            <div id=\"plus\">\n");
      out.write("                                <span class=\"aui-button-icon aui-icon aui-icon-plusthick\"></span><a id=\"pl\">Məlumat əlavə et</a>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td id=\"column-3\" valign=\"top\">\n");
      out.write("                            <div id=\"content\">\n");
      out.write("                                ");
      out.print(list);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FOOTER", out, true);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"menus\" class=\"yui3-menu\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"editor\"> \n");
      out.write("            <div class=\"close\" id=\"close\"><span>BAĞLA</span></div>\n");
      out.write("            <div id=\"count\"></div>\n");
      out.write("            <form action=\"desk\" method=\"post\" id=\"forma\" class=\"exxo-form\">\n");
      out.write("                <input type=\"hidden\" name=\"of\" value=\"");
      out.print(of);
      out.write("\">\n");
      out.write("                <textarea name=\"msgpost\" id=\"msgpost\" cols=\"50\" rows=\"10\"></textarea>\n");
      out.write("                <input type=\"hidden\" name=\"fio\" value=\"");
      out.print( fio);
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" id='submit' value=\"Yadda saxla\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            AUI().ready('anim', 'aui-overlay-mask', 'aui-io-request', function (A) {\n");
      out.write("                var MAXLENGTH = 255;\n");
      out.write("                var overlayMask = new A.OverlayMask().render();\n");
      out.write("                var myHeight = A.DOM.winHeight() - 150;\n");
      out.write("                if (myHeight < 300)\n");
      out.write("                    myHeight = 300;\n");
      out.write("                var div = A.one('#editor');\n");
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
      out.write("                A.one('#close span').on('click', function (event) {\n");
      out.write("                    div.fx.run();\n");
      out.write("                });\n");
      out.write("                A.one(\"#plus a\").on(\"click\", function () {\n");
      out.write("                    if (A.one('#forma [name=id]') != null)\n");
      out.write("                        A.one('#forma [name=id]').remove();\n");
      out.write("                    A.one('#msgpost').text('');\n");
      out.write("                    A.one('#count').text(MAXLENGTH);\n");
      out.write("                    A.one('#msgpost').set('value', '');\n");
      out.write("                    this.removeClass(\"hoverPlus\");\n");
      out.write("                    overlayMask.set('target', document).show();\n");
      out.write("                    A.one('#editor').scrollIntoView( );\n");
      out.write("                    A.one('#editor').fx.run();\n");
      out.write("                });\n");
      out.write("                A.all(\".edit\").each(function () {\n");
      out.write("                    var node = this;\n");
      out.write("                    var id = this.get(\"id\");\n");
      out.write("                    this.on(\"click\", function () {\n");
      out.write("                        A.one('#editor').fx.run();\n");
      out.write("                        A.one('#editor').scrollIntoView( );\n");
      out.write("                        A.one(\"#forma\").insert(\"<input type='hidden' name='id' value='\" + id + \"'>\");\n");
      out.write("                        A.one('#msgpost').text(node.get(\"parentNode\").next().one('.text').text());\n");
      out.write("                        A.one('#msgpost').set('value', node.get(\"parentNode\").next().one('.text').text());\n");
      out.write("                        newLength(newLength(this));\n");
      out.write("                    })\n");
      out.write("                });\n");
      out.write("                A.one(\"#content\").setStyle(\"minHeight\", myHeight + \"px\");\n");
      out.write("                A.one(\".aui-overlaymask-content\").setStyle(\"height\", \"100%\");\n");
      out.write("                //A.one(\"#count\").html(MAXLENGTH);\n");
      out.write("                A.one(\"#msgpost\").on(\"keyup\", function () {\n");
      out.write("                    newLength(this)\n");
      out.write("                });\n");
      out.write("                function newLength(node) {\n");
      out.write("                    //var t = node.text();\n");
      out.write("                    var t = node.get('value');\n");
      out.write("                    var l = t.length;\n");
      out.write("                    if (l > MAXLENGTH)\n");
      out.write("                        node.set('value', t.substring(0, MAXLENGTH));\n");
      out.write("                    A.one(\"#count\").text(MAXLENGTH - node.get('value').length);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/mainMenu.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/poisk.js\"></script> \n");
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

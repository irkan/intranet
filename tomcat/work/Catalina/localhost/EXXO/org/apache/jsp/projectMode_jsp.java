/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-08-16 12:20:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projectMode_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      BEANS.projectMode RM = null;
      RM = (BEANS.projectMode) _jspx_page_context.getAttribute("RM", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (RM == null){
        RM = new BEANS.projectMode();
        _jspx_page_context.setAttribute("RM", RM, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }

    String slogan = SLOGAN.getSlogan(request);
    String role = (String) session.getAttribute("role");
    if (role.indexOf("a") < 0 && role.indexOf("n") < 0) {
        response.sendRedirect("notPermited.html");
    }
    String list = RM.getList(request);
    String op = RM.getOp();
    String emp = RM.getEmp();

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <title>Список проектов. Редактировать!</title>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"/FILES/alloy/build/aui/aui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"blue.css\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @import url('css/topMenu.css');\n");
      out.write("            @import url('css/exxo.css');\n");
      out.write("            label {display:block;}\n");
      out.write("            #submit{padding: 3px;}\n");
      out.write("            th {color:white;background-color:  #426487;padding:5px;}\n");
      out.write("            #drop{position: absolute;text-align: center;padding: 10px;top:100px;left: 30%;width: 35em;background-color: red;\n");
      out.write("                  color: white;z-index: 99998;display: none; border: 1px solid white;}\n");
      out.write("            #drop input {padding: 5px; cursor: pointer;}\n");
      out.write("            #drop span{padding-bottom:10px;font-size:11pt;display:block;}\n");
      out.write("            #menuT {position: relative;width: 90%;display: block; background-color: white; margin-top: 20px;}\n");
      out.write("            #menuT select { margin: 10px; width: 175px;}\n");
      out.write("            label {display:block; font-size: 12px;}\n");
      out.write("            #tel,#short,#comment{width:90%;font-size: 12px;box-sizing: border-box;-moz-box-sizing: border-box;}\n");
      out.write("            #submit{padding: 3px;}\n");
      out.write("            #menuT form{display: block;}\n");
      out.write("            #drop{position: absolute;text-align: center;padding: 10px;top:100px;left: 30%;width: 35em;background-color: red;\n");
      out.write("                  color: white;z-index: 99998;display: none; border: 1px solid white;}\n");
      out.write("            #drop input {padding: 5px; cursor: pointer;}\n");
      out.write("            #drop span{padding-bottom:10px;font-size:12px;display:block;}\n");
      out.write("            #menuT>div {border: 1px solid #dedede; border-color: #dedede #dedede #bfbfbf #dedede; background-color: #E2E4EE;}\n");
      out.write("            #container {position: relative; margin-right: 0px; margin-top: 0px; font-size: 11px; width: 90%;}\n");
      out.write("            #content {font-size:12px;margin-top:0px;}\n");
      out.write("            #content table{width:100%;background-color: white;margin-top: 0px;}\n");
      out.write("            .first {width:50%;padding-top:10px;}\n");
      out.write("            .second{width:50%;padding-top:10px;}\n");
      out.write("            #content table td{padding: 4px;border-bottom-color: #DEDEDE;border-bottom-style: solid;border-bottom-width: 1px;}\n");
      out.write("            #button {margin: 10px; font-size: 12px;}\n");
      out.write("            #button {margin-top: 10px;}\n");
      out.write("            #button  button {width: 175px; text-align: left;}\n");
      out.write("            #edits {width: 250px;}\n");
      out.write("            #addNew{position: absolute;background-color: transparent;  width: 100%; height: auto; z-index: 99999999;display:none; left:0px; top: 0px;}\n");
      out.write("            #imgesInner {position:relative; width:350px; height:auto; margin: 20px auto; background-color: white; border: 1px solid #bfbfbf; border-radius: 5px;}\n");
      out.write("            #f {margin: 20px;}\n");
      out.write("            #f div {padding: 10px;}\n");
      out.write("            #f div.lable {padding-bottom: 0px; font-size: 12px;}\n");
      out.write("            #f input {padding: 3px;}\n");
      out.write("            #f input[type=submit] {width: 5em; padding: 4px; margin: 0px auto; display: block; cursor: pointer;}\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS.getCSS(request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.print(CSS3.getCSS("projectMode.jsp", request));
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"projectMode_jsp\">\n");
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
      out.write("                                            <a href=\"projects.jsp\" class=\"footmenu\">Sonlandır</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li> <a href=\"http://exxo.ru/howto/staff-howto.html#projects\" class=\"footmenu howto\" target=\"_blank\">?</a></li>\n");
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
      out.write("                        <td id=\"menu-td\" class=\"menu-td\" valign=\"top\">\n");
      out.write("                            <div class=\"exxo-menu exxo-shadow\" id=\"menu\">\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu-emp.xhtml", out, true);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td id=\"edits\" valign=\"top\">\n");
      out.write("                            <div id=\"menuT\" class=\"exxo-shadow\"><div>\n");
      out.write("                                    <form action=\"javascript:;\">\n");
      out.write("                                        <select id=\"offices\" name=\"offices\">\n");
      out.write("                                            <option value=\"0\" selected=\"selected\">--Выберите проект--</option>\n");
      out.write("                                            ");
      out.print(op);
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <select id=\"action\" name=\"action\" disabled=\"true\">\n");
      out.write("                                            <option value=\"0\" selected=\"selected\">--Выберите действие--</option>\n");
      out.write("                                            <option value=\"changeProject\">Изменить данные</option>\n");
      out.write("                                            <option value=\"dropProject\">Удалить проект</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </form>\n");
      out.write("                                    <div id=\"button\"></div>\n");
      out.write("                                    <div id=\"button1\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td id=\"column-3\" valign=\"top\">\n");
      out.write("                            <div id=\"container\" class=\"exxo-shadow\">\n");
      out.write("                                <div id=\"content\">\n");
      out.write("                                    ");
      out.print(list);
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FOOTER", out, true);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"addNew\">\n");
      out.write("            <div id=\"imgesInner\">\n");
      out.write("                <div id=\"close\" class=\"exxo-close\"><span>BAĞLA</span></div>\n");
      out.write("                <div id=\"f\">\n");
      out.write("                    <form action=\"addRes\" method=\"POST\" id=\"forma\" class=\"exxo-form\" >\n");
      out.write("                        <input type=\"hidden\" name=\"id\" id=\"id\">\n");
      out.write("                        <div><input id=\"short\" type=\"text\" name=\"short\" placeholder=\"название проекта\"></div>\n");
      out.write("                        <div class=\"lable\">Руководитель:</div>\n");
      out.write("                        <div><select id=\"comment\" name=\"boss\"><option id=\"notYet\" value=\"0\">не выбран</option>");
      out.print( emp);
      out.write("</select></div>\n");
      out.write("                        <div><input type=\"submit\" value=\"OK\" id=\"submit\"></div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"drop\"><span></span>\n");
      out.write("            <form action=\"dropProject\" method=\"POST\" id=\"dropForma\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" id=\"Drop_id\">\n");
      out.write("                <input type=\"submit\" value=\"Да\">\n");
      out.write("                <input type=\"button\" value=\"Нет\" id=\"no\">\n");
      out.write("            </form></div>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/poisk.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/topMenu.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            AUI().ready('aui-button-item', 'anim-node-plugin', 'aui-overlay-mask', function (A) {\n");
      out.write("                var node = A.one('#addNew');\n");
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
      out.write("                        }}}\n");
      out.write("                node.plug(A.Plugin.NodeFX, conf);\n");
      out.write("                new A.ButtonItem({\n");
      out.write("                    icon: 'plusthick', label: 'Добавить проект', handler: {fn: function (e) {\n");
      out.write("                            A.one(\"#short\").set(\"value\", \"\");\n");
      out.write("                            //A.all(\"#comment option\").each(function(){this.removeAttribute(\"SELECTED\")});\n");
      out.write("                            //A.one(\"#comment option#notYet\").setAttribute(\"SELECTED\",\"true\");\n");
      out.write("                            A.one(\"#comment\").set(\"value\", \"notYet\");\n");
      out.write("                            A.one(\"#forma\").setAttribute(\"action\", \"addProject\");\n");
      out.write("                            node.fx.run();\n");
      out.write("                        }, type: 'click'}\n");
      out.write("                }).render(A.one(\"#button\"));\n");
      out.write("                var overlayMask = new A.OverlayMask().render();\n");
      out.write("                A.one(\"#drop\").plug(A.Plugin.NodeFX, conf);\n");
      out.write("                A.one(\"#no\").on(\"click\", function (e) {\n");
      out.write("                    A.one('#drop').fx.run();\n");
      out.write("                });\n");
      out.write("                A.one('#addNew').setStyle('opacity', '0');\n");
      out.write("                A.one(\"#close span\").on(\"click\", function (e) {\n");
      out.write("                    node.fx.run();\n");
      out.write("                    //A.one('#addNew').setStyle('display','none');\n");
      out.write("\n");
      out.write("                });\n");
      out.write("                A.one(\"#offices\").on(\"change\", function (e) {\n");
      out.write("                    if (this.get(\"value\") != 0)\n");
      out.write("                        A.one(\"#action\").removeAttribute(\"disabled\");\n");
      out.write("                });\n");
      out.write("                A.one(\"#action\").on(\"change\", function (e) {\n");
      out.write("                    var of = A.one(\"#offices\").get(\"value\");\n");
      out.write("                    var ac = this.get(\"value\");\n");
      out.write("                    if (of != 0 && ac != 0) {\n");
      out.write("                        var s = '';\n");
      out.write("                        var c = '';\n");
      out.write("                        A.all(\"#content tr.datas\").each(function () {\n");
      out.write("                            if (this.one(\".first\").getAttribute(\"id\") == of) {\n");
      out.write("                                s = this.one(\".first\").text();\n");
      out.write("                                c = this.one(\".second\").getAttribute(\"id\");\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                        if (ac == \"changeProject\") {\n");
      out.write("                            A.one(\"#id\").set(\"value\", of);\n");
      out.write("                            A.one(\"#forma\").setAttribute(\"action\", ac);\n");
      out.write("                            A.one(\"#short\").set(\"value\", s);\n");
      out.write("                            A.one(\"#comment\").set(\"value\", c);\n");
      out.write("                            node.fx.run();\n");
      out.write("                        } else if (ac == \"dropProject\") {\n");
      out.write("                            A.one(\"#Drop_id\").set(\"value\", of);\n");
      out.write("                            var span = \"Хотите ли вы удалить проект \" + s + \"''?\";\n");
      out.write("                            A.one('#drop span').text(span);\n");
      out.write("                            A.one('#drop').fx.run();\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                A.one(\".aui-overlaymask-content\").setStyle(\"height\", \"100%\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
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

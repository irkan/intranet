/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-08-27 13:46:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qwestResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
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
    boolean editable = false;
    String role = (String) session.getAttribute("role");
    if (role.indexOf("a") >= 0 || role.indexOf("j") >= 0) {
        editable = true;
    }
    if (!editable) {
        response.sendRedirect("notPermited.html");
    }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <title>Результаты опроса</title>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"content-style-type\" content=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/FILES/alloy/build/aui-skin-classic/css/aui-skin-classic-all-min.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"/FILES/alloy/build/aui/aui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"blue.css\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #container {width: 80%; border: 1px solid #dedede; border-bottom: 1px solid #bfbfbf; background-color: white; margin-left: 10px; padding: 20px;}\n");
      out.write("            #container table {margin-top: 20px; margin-bottom: 30px;}\n");
      out.write("            #container table tr {border-left: 1px solid #dedede;border-right: 1px solid #dedede;}\n");
      out.write("            #topik {font-weight: bold;}\n");
      out.write("            #topik span {padding-right: 10px;}\n");
      out.write("        </style>\n");
      out.write("        <style>");
      out.print(CSS.getCSS(request));
      out.write("</style>\n");
      out.write("        <style>");
      out.print(CSS3.getCSS("qwestResults.jsp", request));
      out.write("</style>\n");
      out.write("    </head><body class=\"yui3-skin-sam\" id=\"qwestResults_jsp\">\n");
      out.write("        <div id=\"content-wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <table id=\"tableH\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"tdlogo\">\n");
      out.write("                                <img src=\"logo.png\" id=\"logo\"></td>\n");
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
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topMenu", out, true);
      out.write("\n");
      out.write("                                    <a href=\"qwestList.jsp\" class=\"footmenu\">Sonlandır</a>\n");
      out.write("                                    <a href=\"http://exxo.ru/howto/vote-howto.html\" class=\"footmenu howto\" target=\"_blank\">?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <table id=\"grid\" class=\"grid\">\n");
      out.write("                <tbody id=\"atbody\">\n");
      out.write("                    <tr id=\"tr\">\n");
      out.write("                        <td id=\"menu-td\" class=\"menu-td\" valign=\"top\"><div class=\"menu\" id=\"menu\"></div>\n");
      out.write("                        </td>\n");
      out.write("                        <td id=\"column-3\" valign=\"top\">   \n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "qwestResults.xhtml", out, true);
      out.write("      \n");
      out.write("                        </td>\n");
      out.write("                    </tr> \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FOOTER", out, true);
      out.write("\n");
      out.write("        </div><div id=\"menus\" class=\"yui3-menu\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\n");
      out.write("        </div>\n");
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

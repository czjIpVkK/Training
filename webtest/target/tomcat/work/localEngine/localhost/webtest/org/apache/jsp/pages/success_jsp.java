package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Title</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("登录成功~\n");
      out.write("\n");
      out.write("     <p>欢迎您\n");
      out.write("         ");
      out.print(request.getSession().getAttribute("sessionname"));
      out.write("\n");
      out.write("         !\n");
      out.write("     </p>\n");
      out.write("    ");

        if (request.getSession().getAttribute("type") == "user") {
    
      out.write("\n");
      out.write("<form action=\"/webtest/UserDetails\" method=\"POST\">\n");
      out.write("    <input name=\"userName\" type=\"hidden\" class=\"form-control\" value=\"");
      out.print(request.getSession().getAttribute("sessionname"));
      out.write("\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">更改用户信息</button>\n");
      out.write("</form>\n");
      out.write("    ");

        }
        else{
    
      out.write("\n");
      out.write("        <a href=\"/webtest/showGoodsType?gt_id=0\">管理商品类型</a>\n");
      out.write("<form action=\"/webtest/showGoodsType\" method=\"GET\">\n");
      out.write("    <input name=\"gt_id\" type=\"hidden\" value=\"0\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">管理商品类型</button>\n");
      out.write("</form>\n");
      out.write("<form action=\"/webtest/showgoods\" method=\"GET\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">管理商品</button>\n");
      out.write("</form>\n");
      out.write("<form action=\"/webtest/showuser\" method=\"GET\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">管理用户</button>\n");
      out.write("</form>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

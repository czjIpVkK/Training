package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("    <title>会员信息编辑</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"UpdateUserDetails\" method=\"POST\">\r\n");
      out.write("            <input  name=\"u_id\" type=\"text\" class=\"form-control\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <input  name=\"u_name\" type=\"text\" class=\"form-control\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <input  name=\"ut_id\" type=\"text\" class=\"form-control\" placeholder=\"用户种类\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ut_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <input  name=\"u_birthday\" type=\"date\" class=\"form-control\" placeholder=\"生日\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <!--input  name=\"u_Gender\" type=\"password\" class=\"form-control\"  placeholder=\"性别\"-->\r\n");
      out.write("            <p>性别</p>\r\n");
      out.write("            <select name=\"u_gender\">\r\n");
      out.write("                <option value=1>男</option>\r\n");
      out.write("                <option value=0>女</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <input  name=\"u_description\" type=\"text\" class=\"form-control\"  placeholder=\"个人介绍\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <input  name=\"u_credits\" type=\"text\" class=\"form-control\"  placeholder=\"积分\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_credits}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <input  name=\"u_balance\" type=\"text\" class=\"form-control\"  placeholder=\"打折\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_balance}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\">确认更改</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

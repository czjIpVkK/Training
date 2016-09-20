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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("    <title>会员信息编辑</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <form action=\"UpdateUserDetails\" method=\"POST\">\n");
      out.write("            <input  name=\"u_id\" type=\"hidden\" class=\"form-control\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("            <td><input  name=\"ut_name\" type=\"text\" class=\"form-control\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ut_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("></td>\n");
      out.write("            <td><input  name=\"u_birthday\" type=\"date\" class=\"form-control\"  value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("></td>\n");
      out.write("            <p>性别</p>\n");
      out.write("            <select name=\"u_gender\">\n");
      out.write("                <option value=1>男</option>\n");
      out.write("                <option value=0>女</option>\n");
      out.write("            </select>\n");
      out.write("            <input  name=\"u_description\" type=\"text\" class=\"form-control\"  placeholder=\"个人介绍\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("            <input  name=\"u_mobile\" type=\"text\" class=\"form-control\"  placeholder=\"电话\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("            <input  name=\"u_address\" type=\"text\" class=\"form-control\"  placeholder=\"地址\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("            <input  name=\"u_card_no\" type=\"text\" class=\"form-control\"  placeholder=\"身份证\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_card_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("            <p>积分</p>\n");
      out.write("            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_credits}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("            <p>打折</p>\n");
      out.write("            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u_balance}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\">确认更改</button>\n");
      out.write("    </form>\n");
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

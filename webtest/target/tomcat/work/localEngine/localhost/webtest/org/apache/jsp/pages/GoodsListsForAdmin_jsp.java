package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ynu.dto.Goodsinformation;
import com.ynu.dto.Page;

public final class GoodsListsForAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("    <meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function selectUser() {\r\n");
      out.write("            document.getElementById(\"pageForm\").action = \"selectUser.do\";\r\n");
      out.write("            document.getElementById(\"pageForm\").submit();\r\n");
      out.write("        }\r\n");
      out.write("        function turnPage(action) {\r\n");
      out.write("            var total = document.getElementById(\"totalPage\").value;\r\n");
      out.write("            ;\r\n");
      out.write("            var currentPage = document.getElementById(\"currentPage\").value;\r\n");
      out.write("            currentPage = parseInt(currentPage);\r\n");
      out.write("            page = parseInt(currentPage);\r\n");
      out.write("            switch (action) {\r\n");
      out.write("                case 'first':\r\n");
      out.write("                    page = 1;\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'prior':\r\n");
      out.write("                    page--;\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'next':\r\n");
      out.write("                    page++;\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'last':\r\n");
      out.write("                    page = total;\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'jump':\r\n");
      out.write("                    page = currentPage;\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'rows':\r\n");
      out.write("                    page = 1;\r\n");
      out.write("                    break;\r\n");
      out.write("            }\r\n");
      out.write("            if (page < 1) {\r\n");
      out.write("                page = 1;\r\n");
      out.write("                alert(\"已经到达首页\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            if (page > total) {\r\n");
      out.write("                page = total;\r\n");
      out.write("                alert(\"已经到达末页\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            document.getElementById(\"currentPage\").value = page;\r\n");
      out.write("            document.getElementById(\"pageForm\").action = \"turnPage.do\";\r\n");
      out.write("            document.getElementById(\"pageForm\").submit();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("    <table class=\"table table-striped\" border=\"1\" width=\"95%\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>g_id</th>\r\n");
      out.write("            <th>gt_name</th>\r\n");
      out.write("            <th>g_name</th>\r\n");
      out.write("            <th>g_description</th>\r\n");
      out.write("            <th>g_pic</th>\r\n");
      out.write("            <th>Edit</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <form id=\"pageForm\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /pages/GoodsListsForAdmin.jsp(87,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("goods");
      // /pages/GoodsListsForAdmin.jsp(87,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/GoodsListsForAdmin.jsp(87,16) '${goodsList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${goodsList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <tr>\r\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.gt_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                        <td><img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_pic }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"></td>\r\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.gs_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("                        <td><a href=\"");
            out.print(basePath);
            out.write("EditGoodsDetails?g_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">编辑</a>\r\n");
            out.write("                            <a href=\"");
            out.print(basePath);
            out.write("deleteGoods?g_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">删除</a>\r\n");
            out.write("                        </td>\r\n");
            out.write("                    </tr>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </br>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"left\"><input type=\"button\" value=\"首页\"\r\n");
      out.write("                                            onclick=\"turnPage('first')\"/> <input type=\"button\"\r\n");
      out.write("                                                                                 value=\"上一页\"\r\n");
      out.write("                                                                                 onclick=\"turnPage('prior')\"/>\r\n");
      out.write("                        <input\r\n");
      out.write("                                type=\"button\" value=\"下一页\" onclick=\"turnPage('next')\"/> <input\r\n");
      out.write("                                type=\"button\" value=\"末页 \" onclick=\"turnPage('last')\"/>   <input\r\n");
      out.write("                                type=\"hidden\" name=\"totalPage\" id=\"totalPage\"\r\n");
      out.write("                                value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.totalPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/> <input type=\"text\" size=\"3\"\r\n");
      out.write("                                                                    maxlength=\"5\" id=\"currentPage\"\r\n");
      out.write("                                                                    name=\"currentPage\"\r\n");
      out.write("                                                                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.currentPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                                                    onkeydown=\"if (window.event.keyCode==13) {turnPage('jump');}\"/>\r\n");
      out.write("                        /共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.totalPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('页');
      out.write(' ');
      out.write('共');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.rowsCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条记录   每页显示 <input\r\n");
      out.write("                                type=\"text\" size=\"3\" maxlength=\"5\" id=\"rowsPerPage\"\r\n");
      out.write("                                name=\"rowsPerPage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.rowsPerPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                onkeydown=\"if (window.event.keyCode==13) {turnPage('rows');}\"/>条记录\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
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

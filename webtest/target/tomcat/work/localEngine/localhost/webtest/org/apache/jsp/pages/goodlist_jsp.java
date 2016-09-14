package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ynu.dto.Goodsinformation;
import com.ynu.dto.Page;

public final class goodlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("    <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function selectUser() {\n");
      out.write("            document.getElementById(\"pageForm\").action = \"selectUser.do\";\n");
      out.write("            document.getElementById(\"pageForm\").submit();\n");
      out.write("        }\n");
      out.write("        function turnPage(action) {\n");
      out.write("            var total = document.getElementById(\"totalPage\").value;\n");
      out.write("            ;\n");
      out.write("            var currentPage = document.getElementById(\"currentPage\").value;\n");
      out.write("            currentPage = parseInt(currentPage);\n");
      out.write("            page = parseInt(currentPage);\n");
      out.write("            switch (action) {\n");
      out.write("                case 'first':\n");
      out.write("                    page = 1;\n");
      out.write("                    break;\n");
      out.write("                case 'prior':\n");
      out.write("                    page--;\n");
      out.write("                    break;\n");
      out.write("                case 'next':\n");
      out.write("                    page++;\n");
      out.write("                    break;\n");
      out.write("                case 'last':\n");
      out.write("                    page = total;\n");
      out.write("                    break;\n");
      out.write("                case 'jump':\n");
      out.write("                    page = currentPage;\n");
      out.write("                    break;\n");
      out.write("                case 'rows':\n");
      out.write("                    page = 1;\n");
      out.write("                    break;\n");
      out.write("            }\n");
      out.write("            if (page < 1) {\n");
      out.write("                page = 1;\n");
      out.write("                alert(\"已经到达首页\");\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            if (page > total) {\n");
      out.write("                page = total;\n");
      out.write("                alert(\"已经到达末页\");\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"currentPage\").value = page;\n");
      out.write("            document.getElementById(\"pageForm\").action = \"turnPage.do\";\n");
      out.write("            document.getElementById(\"pageForm\").submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"table-responsive\">\n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>LastName</th>\n");
      out.write("            <th>FirstName</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>AddressId</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("            <th>Edit</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <form id=\"pageForm\" method=\"post\">\n");
      out.write("            <table border=\"1\" width=\"95%\">\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /pages/goodlist.jsp(93,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("goods");
      // /pages/goodlist.jsp(93,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/goodlist.jsp(93,16) '${goodsList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${goodsList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.gt_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("                        <td><img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_pic }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"></td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.gs_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("                        <td><a href=\"");
            out.print(basePath);
            out.write("GoodsDetails?g_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.g_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">商品详情</a></td>\n");
            out.write("                    </tr>\n");
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
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\"><input type=\"button\" value=\"首页\"\n");
      out.write("                                            onclick=\"turnPage('first')\"/> <input type=\"button\"\n");
      out.write("                                                                                 value=\"上一页\"\n");
      out.write("                                                                                 onclick=\"turnPage('prior')\"/>\n");
      out.write("                        <input\n");
      out.write("                                type=\"button\" value=\"下一页\" onclick=\"turnPage('next')\"/> <input\n");
      out.write("                                type=\"button\" value=\"末页 \" onclick=\"turnPage('last')\"/>   <input\n");
      out.write("                                type=\"hidden\" name=\"totalPage\" id=\"totalPage\"\n");
      out.write("                                value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.totalPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/> <input type=\"text\" size=\"3\"\n");
      out.write("                                                                    maxlength=\"5\" id=\"currentPage\"\n");
      out.write("                                                                    name=\"currentPage\"\n");
      out.write("                                                                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.currentPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("                                                                    onkeydown=\"if (window.event.keyCode==13) {turnPage('jump');}\"/>\n");
      out.write("                        /共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.totalPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('页');
      out.write(' ');
      out.write('共');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.rowsCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条记录   每页显示 <input\n");
      out.write("                                type=\"text\" size=\"3\" maxlength=\"5\" id=\"rowsPerPage\"\n");
      out.write("                                name=\"rowsPerPage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.rowsPerPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("                                onkeydown=\"if (window.event.keyCode==13) {turnPage('rows');}\"/>条记录\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
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

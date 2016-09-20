package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <title>Login</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"Fashionpress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,\r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("    <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/pages/css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <!-- Custom Theme files -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/pages/css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("    <!-- Custom Theme files -->\r\n");
      out.write("    <!--webfont-->\r\n");
      out.write("    <link href='http://fonts.useso.com/css?family=Lato:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"header_top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"index.html\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/zhu.png\" alt=\"\"/></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"shopping_grid\">\r\n");
      out.write("                <a href=\"/webtest\"><li>登录</li></a>\r\n");
      out.write("                <a href=\"#\"><li><span class=\"m_1\">购物车</span>&nbsp;&nbsp;(0) &nbsp;<img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/bag.png\" alt=\"\"/></li></a>\r\n");
      out.write("                <div class=\"clearfix\"> </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"h_menu4\"><!-- start h_menu4 -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"toggleMenu\" href=\"#\">Menu</a>\r\n");
      out.write("            <ul class=\"nav\">\r\n");
      out.write("                <li><a href=\"index.html\" data-hover=\"首页\">首页</a></li>\r\n");
      out.write("                <li><a href=\"about.html\" data-hover=\"用户主页\">用户主页</a></li>\r\n");
      out.write("                <li><a href=\"contact.html\" data-hover=\"卖家主页\">卖家主页</a></li>\r\n");
      out.write("                <li><a href=\"register.html\" data-hover=\"联系客服\">联系客服</a></li>\r\n");
      out.write("                <li><a href=\"about.html\" data-hover=\"关于我们\">关于我们</a></li>\r\n");
      out.write("                <li><a href=\"contact.html\" data-hover=\"联系我们\">联系我们</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/nav.js\"></script>\r\n");
      out.write("        </div><!-- end h_menu4 -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"slider\">\r\n");
      out.write("    <div class=\"callbacks_container\">\r\n");
      out.write("        <ul class=\"rslides\" id=\"slider\">\r\n");
      out.write("\r\n");
      out.write("            <li><img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/hu.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                <div class=\"banner_desc\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/banner3.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                <div class=\"banner_desc\">\r\n");
      out.write("                    <h1>Ut wisi enim ad minim veniam, quis nostrud.</h1>\r\n");
      out.write("                    <h2>Mirum est notare quam littera gothica, quam nunc putamus.</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"column_center\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"search\">\r\n");
      out.write("            <div class=\"stay\">搜索</div>\r\n");
      out.write("            <div class=\"stay_right\">\r\n");
      out.write("                <input type=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("                <input type=\"submit\" value=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clearfix\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div class=\"content_top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col-md-3 sidebar_box\">\r\n");
      out.write("                <div class=\"sidebar\">\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                        <h3 class=\"menu_head\">商品菜单</h3>\r\n");
      out.write("                        <ul class=\"menu\">\r\n");
      out.write("                            <li class=\"item1\"><a href=\"#\"><img class=\"arrow-img\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/f_menu.png\" alt=\"\"/>闲置数码</a>\r\n");
      out.write("                                <ul class=\"cute\">\r\n");
      out.write("                                    <li class=\"subitem1\"><a href=\"#\">Cute Kittens </a></li>\r\n");
      out.write("                                    <li class=\"subitem2\"><a href=\"#\">Strange Stuff </a></li>\r\n");
      out.write("                                    <li class=\"subitem3\"><a href=\"#\">Automatic Fails </a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"item2\"><a href=\"#\"><img class=\"arrow-img\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/f_menu.png\" alt=\"\"/>家居日用</a>\r\n");
      out.write("                                <ul class=\"cute\">\r\n");
      out.write("                                    <li class=\"subitem1\"><a href=\"#\">Cute Kittens </a></li>\r\n");
      out.write("                                    <li class=\"subitem2\"><a href=\"#\">Strange Stuff </a></li>\r\n");
      out.write("                                    <li class=\"subitem3\"><a href=\"#\">Automatic Fails </a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"item3\"><a href=\"#\"><img class=\"arrow-img\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/f_menu.png\" alt=\"\"/>影音家电</a>\r\n");
      out.write("                                <ul class=\"cute\">\r\n");
      out.write("                                    <li class=\"subitem1\"><a href=\"#\">Cute Kittens </a></li>\r\n");
      out.write("                                    <li class=\"subitem2\"><a href=\"#\">Strange Stuff </a></li>\r\n");
      out.write("                                    <li class=\"subitem3\"><a href=\"#\">Automatic Fails</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"item4\"><a href=\"#\"><img class=\"arrow-img\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/f_menu.png\" alt=\"\"/>鞋服配饰</a>\r\n");
      out.write("                                <ul class=\"cute\">\r\n");
      out.write("                                    <li class=\"subitem1\"><a href=\"#\">Cute Kittens </a></li>\r\n");
      out.write("                                    <li class=\"subitem2\"><a href=\"#\">Strange Stuff </a></li>\r\n");
      out.write("                                    <li class=\"subitem3\"><a href=\"#\">Automatic Fails </a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"item5\"><a href=\"#\"><img class=\"arrow-img\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/f_menu.png\" alt=\"\"/>珠宝收藏</a>\r\n");
      out.write("                                <ul class=\"cute\">\r\n");
      out.write("                                    <li class=\"subitem1\"><a href=\"#\">Cute Kittens </a></li>\r\n");
      out.write("                                    <li class=\"subitem2\"><a href=\"#\">Strange Stuff </a></li>\r\n");
      out.write("                                    <li class=\"subitem3\"><a href=\"#\">Automatic Fails </a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--initiate accordion-->\r\n");
      out.write("                    <script type=\"text/javascript\">\r\n");
      out.write("                        $(function() {\r\n");
      out.write("                            var menu_ul = $('.menu > li > ul'),\r\n");
      out.write("                                    menu_a  = $('.menu > li > a');\r\n");
      out.write("                            menu_ul.hide();\r\n");
      out.write("                            menu_a.click(function(e) {\r\n");
      out.write("                                e.preventDefault();\r\n");
      out.write("                                if(!$(this).hasClass('active')) {\r\n");
      out.write("                                    menu_a.removeClass('active');\r\n");
      out.write("                                    menu_ul.filter(':visible').slideUp('normal');\r\n");
      out.write("                                    $(this).addClass('active').next().stop(true,true).slideDown('normal');\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    $(this).removeClass('active');\r\n");
      out.write("                                    $(this).next().stop(true,true).slideUp('normal');\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("                    </script>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"delivery\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/delivery.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                    <h3>Delivering</h3>\r\n");
      out.write("                    <h4>World Wide</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-9 content_right\">\r\n");
      out.write("                <div class=\"top_grid1\">\r\n");
      out.write("                    <div class=\"col-md-4 box_2\">\r\n");
      out.write("                        <div class=\"grid_1\"><a href=\"single.html\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p1.jpg\" class=\"img-responsive\" alt=\"\"/></div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </a></div>\r\n");
      out.write("                    <div class=\"col-md-8 box_1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p2.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"top_grid2\">\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p3.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p4.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p5.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a> </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"top_grid2\">\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p6.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p7.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p8.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h4 class=\"head\"><span class=\"m_2\">Popular</span> Products Now</h4>\r\n");
      out.write("                <div class=\"top_grid2\">\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p9.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a> </div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p10.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p11.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"top_grid2\">\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p12.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p13.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"col-md-4 top_grid1-box1\"><a href=\"single.html\">\r\n");
      out.write("                        <div class=\"grid_1\">\r\n");
      out.write("                            <div class=\"b-link-stroke b-animate-go  thickbox\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/pages/images/p14.jpg\" class=\"img-responsive\" alt=\"\"/> </div>\r\n");
      out.write("                            <div class=\"grid_2\">\r\n");
      out.write("                                <p>There are many variations of passages</p>\r\n");
      out.write("                                <ul class=\"grid_2-bottom\">\r\n");
      out.write("                                    <li class=\"grid_2-left\"><p>¥99<small>.33</small></p></li>\r\n");
      out.write("                                    <li class=\"grid_2-right\"><div class=\"btn btn-primary btn-normal btn-inline \" target=\"_self\" title=\"Get It\">加入购物车</div></li>\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer_bg\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"col-md-6 f_grid1\">\r\n");
      out.write("            <h3>关于我们</h3>\r\n");
      out.write("\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-6 f_grid3\">\r\n");
      out.write("            <h3>联系方式</h3>\r\n");
      out.write("            <ul class=\"list\">\r\n");
      out.write("                <li><p>Phone : 88888888</p></li>\r\n");
      out.write("                <li><p>Fax : 12345678</p></li>\r\n");
      out.write("                <li><p>Email : <a href=\"mailto:derj(at)qq.com\"> derj(at)qq.com</a></p></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"list1\">\r\n");
      out.write("                <li><p>Aliquam augue a bibendum ipsum diam, semper porttitor libero elit egestas gravida, ut quam, nunc taciti</p></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer_bottom\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"cssmenu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"active\"><a href=\"login.html\">Privacy Policy</a></li> .\r\n");
      out.write("                <li><a href=\"checkout.html\">Terms of Service</a></li> .\r\n");
      out.write("                <li><a href=\"checkout.html\">Creative Rights Policy</a></li> .\r\n");
      out.write("                <li><a href=\"login.html\">Contact Us</a></li> .\r\n");
      out.write("                <li><a href=\"register.html\">Support & FAQ</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"copy\">\r\n");
      out.write("            <p>Copyright &copy; 2015.Company name All rights reserved.<a target=\"_blank\" href=\"http://sc.chinaz.com/moban/\">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clearfix\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>\r\n");
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

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/18
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Fashionpress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="<%=request.getContextPath() %>/pages/css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Custom Theme files -->
    <link href="<%=request.getContextPath() %>/pages/css/style.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <!--webfont-->
    <link href='http://fonts.useso.com/css?family=Lato:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="header">
    <div class="header_top">
        <div class="container">
            <div class="logo">
                <a href="index.html"><img src="<%=request.getContextPath() %>/pages/images/zhu.png" alt=""/></a>
            </div>
            <ul class="shopping_grid">
                <a href="/webtest/login"><li>登录</li></a>
                <a href="#"><li><span class="m_1">购物车</span>&nbsp;&nbsp;(0) &nbsp;<img src="<%=request.getContextPath() %>/pages/images/bag.png" alt=""/></li></a>
                <div class="clearfix"> </div>
            </ul>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="h_menu4"><!-- start h_menu4 -->
        <div class="container">
            <a class="toggleMenu" href="#">Menu</a>
            <ul class="nav">
                <li><a href="index.html" data-hover="首页">首页</a></li>
                <li><a href="about.html" data-hover="用户主页">用户主页</a></li>
                <li><a href="contact.html" data-hover="卖家主页">卖家主页</a></li>
                <li><a href="register.html" data-hover="联系客服">联系客服</a></li>
                <li><a href="about.html" data-hover="关于我们">关于我们</a></li>
                <li><a href="contact.html" data-hover="联系我们">联系我们</a></li>
            </ul>
            <script type="text/javascript" src="js/nav.js"></script>
        </div><!-- end h_menu4 -->
    </div>
</div>
<div class="slider">
    <div class="callbacks_container">
        <ul class="rslides" id="slider">

            <li><img src="<%=request.getContextPath() %>/pages/images/hu.jpg" class="img-responsive" alt=""/>
                <div class="banner_desc">

                </div>
            </li>
            <li><img src="<%=request.getContextPath() %>/pages/images/banner3.jpg" class="img-responsive" alt=""/>
                <div class="banner_desc">
                    <h1>Ut wisi enim ad minim veniam, quis nostrud.</h1>
                    <h2>Mirum est notare quam littera gothica, quam nunc putamus.</h2>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="column_center">
    <div class="container">
        <div class="search">
            <div class="stay">搜索</div>
            <div class="stay_right">
                <input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
                <input type="submit" value="">
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<div class="main">
    <div class="content_top">
        <div class="container">
            <div class="col-md-3 sidebar_box">
                <div class="sidebar">
                    <div class="menu_box">
                        <h3 class="menu_head">商品菜单</h3>
                        <ul class="menu">
                            <li class="item1"><a href="#"><img class="arrow-img" src="<%=request.getContextPath() %>/pages/images/f_menu.png" alt=""/>闲置数码</a>
                                <ul class="cute">
                                    <li class="subitem1"><a href="#">Cute Kittens </a></li>
                                    <li class="subitem2"><a href="#">Strange Stuff </a></li>
                                    <li class="subitem3"><a href="#">Automatic Fails </a></li>
                                </ul>
                            </li>
                            <li class="item2"><a href="#"><img class="arrow-img" src="<%=request.getContextPath() %>/pages/images/f_menu.png" alt=""/>家居日用</a>
                                <ul class="cute">
                                    <li class="subitem1"><a href="#">Cute Kittens </a></li>
                                    <li class="subitem2"><a href="#">Strange Stuff </a></li>
                                    <li class="subitem3"><a href="#">Automatic Fails </a></li>
                                </ul>
                            </li>
                            <li class="item3"><a href="#"><img class="arrow-img" src="<%=request.getContextPath() %>/pages/images/f_menu.png" alt=""/>影音家电</a>
                                <ul class="cute">
                                    <li class="subitem1"><a href="#">Cute Kittens </a></li>
                                    <li class="subitem2"><a href="#">Strange Stuff </a></li>
                                    <li class="subitem3"><a href="#">Automatic Fails</a></li>
                                </ul>
                            </li>
                            <li class="item4"><a href="#"><img class="arrow-img" src="<%=request.getContextPath() %>/pages/images/f_menu.png" alt=""/>鞋服配饰</a>
                                <ul class="cute">
                                    <li class="subitem1"><a href="#">Cute Kittens </a></li>
                                    <li class="subitem2"><a href="#">Strange Stuff </a></li>
                                    <li class="subitem3"><a href="#">Automatic Fails </a></li>
                                </ul>
                            </li>
                            <li class="item5"><a href="#"><img class="arrow-img" src="<%=request.getContextPath() %>/pages/images/f_menu.png" alt=""/>珠宝收藏</a>
                                <ul class="cute">
                                    <li class="subitem1"><a href="#">Cute Kittens </a></li>
                                    <li class="subitem2"><a href="#">Strange Stuff </a></li>
                                    <li class="subitem3"><a href="#">Automatic Fails </a></li>
                                </ul>

                            </li>
                        </ul>
                    </div>
                    <!--initiate accordion-->
                    <script type="text/javascript">
                        $(function() {
                            var menu_ul = $('.menu > li > ul'),
                                    menu_a  = $('.menu > li > a');
                            menu_ul.hide();
                            menu_a.click(function(e) {
                                e.preventDefault();
                                if(!$(this).hasClass('active')) {
                                    menu_a.removeClass('active');
                                    menu_ul.filter(':visible').slideUp('normal');
                                    $(this).addClass('active').next().stop(true,true).slideDown('normal');
                                } else {
                                    $(this).removeClass('active');
                                    $(this).next().stop(true,true).slideUp('normal');
                                }
                            });

                        });
                    </script>
                </div>
                <div class="delivery">
                    <img src="<%=request.getContextPath() %>/pages/images/delivery.jpg" class="img-responsive" alt=""/>
                    <h3>Delivering</h3>
                    <h4>World Wide</h4>
                </div>

            </div>
            <div class="col-md-9 content_right">
                <div class="top_grid1">
                    <div class="col-md-4 box_2">
                        <div class="grid_1"><a href="single.html">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p1.jpg" class="img-responsive" alt=""/></div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                        </a></div>
                    <div class="col-md-8 box_1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p2.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="clearfix"> </div>
                </div>
                <div class="top_grid2">
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p3.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p4.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p5.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a> </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="top_grid2">
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p6.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p7.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p8.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="clearfix"> </div>
                </div>
                <h4 class="head"><span class="m_2">Popular</span> Products Now</h4>
                <div class="top_grid2">
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p9.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a> </div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p10.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p11.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="clearfix"> </div>
                </div>
                <div class="top_grid2">
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p12.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p13.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="col-md-4 top_grid1-box1"><a href="single.html">
                        <div class="grid_1">
                            <div class="b-link-stroke b-animate-go  thickbox">
                                <img src="<%=request.getContextPath() %>/pages/images/p14.jpg" class="img-responsive" alt=""/> </div>
                            <div class="grid_2">
                                <p>There are many variations of passages</p>
                                <ul class="grid_2-bottom">
                                    <li class="grid_2-left"><p>¥99<small>.33</small></p></li>
                                    <li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">加入购物车</div></li>
                                    <div class="clearfix"> </div>
                                </ul>
                            </div>
                        </div>
                    </a></div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer_bg">
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-6 f_grid1">
            <h3>关于我们</h3>

            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,</p>
        </div>

        <div class="col-md-6 f_grid3">
            <h3>联系方式</h3>
            <ul class="list">
                <li><p>Phone : 88888888</p></li>
                <li><p>Fax : 12345678</p></li>
                <li><p>Email : <a href="mailto:derj(at)qq.com"> derj(at)qq.com</a></p></li>
            </ul>
            <ul class="list1">
                <li><p>Aliquam augue a bibendum ipsum diam, semper porttitor libero elit egestas gravida, ut quam, nunc taciti</p></li>
            </ul>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<div class="footer_bottom">
    <div class="container">
        <div class="cssmenu">
            <ul>
                <li class="active"><a href="login.html">Privacy Policy</a></li> .
                <li><a href="checkout.html">Terms of Service</a></li> .
                <li><a href="checkout.html">Creative Rights Policy</a></li> .
                <li><a href="login.html">Contact Us</a></li> .
                <li><a href="register.html">Support & FAQ</a></li>
            </ul>
        </div>
        <div class="copy">
            <p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

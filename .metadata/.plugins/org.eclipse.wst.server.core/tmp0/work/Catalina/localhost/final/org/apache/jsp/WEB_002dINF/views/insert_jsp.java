/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-30 03:02:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/final1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final11/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1606010691226L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Title -->\r\n");
      out.write("      <title>Cafe人 - 카페를 좋아하는 사람들</title>\r\n");
      out.write(" ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/core-img/favicon2.png.jpg\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\">\r\n");
      out.write("    <script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(" #ment{background:#f8f8f8;margin-bottom:10px; font-size:20px; width:100%}\r\n");
      out.write(" h2{text-align:center; margin:auto; }\r\n");
      out.write(" #center{text-align:center; margin-top:30px;}\r\n");
      out.write(" #image2{width:100px;height:100px}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Preloader -->\r\n");
      out.write("    <div class=\"preloader d-flex align-items-center justify-content-center\">\r\n");
      out.write("        <div class=\"preloader-content\">\r\n");
      out.write("            <h3>Welecome Caffe人</h3>\r\n");
      out.write("            <div id=\"cooking\">\r\n");
      out.write("                <div class=\"bubble\"></div>\r\n");
      out.write("                <div class=\"bubble\"></div>\r\n");
      out.write("                <div class=\"bubble\"></div>\r\n");
      out.write("                <div class=\"bubble\"></div>\r\n");
      out.write("                <div class=\"bubble\"></div>\r\n");
      out.write("                <div id=\"area\">\r\n");
      out.write("                    <div id=\"sides\">\r\n");
      out.write("                        <div id=\"pan\"></div>\r\n");
      out.write("                        <div id=\"handle\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"pancake\">\r\n");
      out.write("                        <div id=\"pastry\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "secmenu.jsp", out, false);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"catagory-post-area section-padding-100\" >\r\n");
      out.write("       \r\n");
      out.write("      <div  class=\"container\">\r\n");
      out.write("       \r\n");
      out.write("      <div id=\"hi\" class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("   <form name=\"frm\" id = \"frm\" action=\"insert2\" method=\"post\"\r\n");
      out.write("      enctype=\"multipart/form-data\">\r\n");
      out.write("      <div id=\"ment\"><b>카페 등록</b></div>\r\n");
      out.write("      <table>\r\n");
      out.write("         <tr style=\"height:50px;\">\r\n");
      out.write("            <th width=100>카페이름</th>\r\n");
      out.write("            <td width=500><input type=\"text\" placeholder=\"카페 이름을 입력하세요\" name=\"cname\" size=50></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr style=\"height:50px;\">\r\n");
      out.write("            <th width=100>카페전화번호</th>\r\n");
      out.write("            <td width=500><input type=\"text\" placeholder=\"전화번호를 입력하세요\" name=\"ctel\" size=20></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         \r\n");
      out.write("         <tr style=\"height:50px;\">\r\n");
      out.write("            <th>카페 주소</th>\r\n");
      out.write("            <td>\r\n");
      out.write("               <input type=\"text\" id=\"address1\" placeholder=\"주소찾기\" size=30>\r\n");
      out.write("               <input type=\"text\" id=\"address2\" placeholder=\"상세주소\" size=30>\r\n");
      out.write("               <input type=\"hidden\" name=\"caddr\" id = \"caddr\">\r\n");
      out.write("            </td> \r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr style=\"height:50px;\">\r\n");
      out.write("            <th>카페 메뉴</th>\r\n");
      out.write("            \t\r\n");
      out.write("            <td>\r\n");
      out.write("         <input id = \"menu\" placeholder=\"메뉴\" style=\"margin-right:10px;\"><input id = \"price\"  placeholder=\"가격\" type = number><input type = \"button\" value=\"추가\" id = \"btnaddmenu\" style=\"margin-left:3px;\">\r\n");
      out.write("         <input type = hidden name=\"cmenu\" id = \"cmenu\">\r\n");
      out.write("            <table id = \"addmenu\">\r\n");
      out.write("           \r\n");
      out.write("            </table>\r\n");
      out.write("         </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("            <tr style=\"height:100px;\">\r\n");
      out.write("               <th>카페 소개글</th>\r\n");
      out.write("               <td><textarea  name = \"ccontent\" cols=\"35\" rows=\"4\" placeholder=\"Message\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("         <tr style=\"height:120px;\">\r\n");
      out.write("            <th width=100>대표이미지</th>\r\n");
      out.write("            <td width=500>\r\n");
      out.write("            <img src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/core-img/camera.png\" id = \"image\" style=\"width:100px; height:100px;\">\r\n");
      out.write("            <input type=\"file\" name=\"file\" style=\"display:none\"></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr style=\"height:110px; max-height:110px;overflow-y: auto;\">\r\n");
      out.write("            <th width=100 height=100>첨부이미지</th>\r\n");
      out.write("            <td style=\"height:110px; max-height:110px; width:800px;\"  >\r\n");
      out.write("            <input type=\"button\" id = \"btnImage\" value=\"+\" style=\"width:100px; height:100px;line-height:89px;border: 1px dashed #DBDBDB;cursor: pointer;opacity: 1;transform: scale(1);\">\r\n");
      out.write("            <input type=\"file\" name=\"files\" style=\"display:none\" multiple>\r\n");
      out.write("            <span id = \"listFile\"></span>\r\n");
      out.write("            </td>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </tr>\r\n");
      out.write("         \r\n");
      out.write("      </table>\r\n");
      out.write("      <div id=\"center\">\r\n");
      out.write("      <input type = \"submit\" value = \"저장\" style=\"background:#b0c364; width:80px; border-radius:5px; border:white\">\r\n");
      out.write("      <input type = \"reset\" value = \"취소\" style=\"background:#b0c364; width:80px; border-radius:5px; border:white\">\r\n");
      out.write("      <input type = \"button\" value = \"미리보기\" id = \"miribogi\" style=\"background:#b0c364; width:80px; border-radius:5px; border:white\">\r\n");
      out.write("              </div>\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("    <footer class=\"footer-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-12 col-sm-5\">\r\n");
      out.write("                    <!-- Copywrite Text -->\r\n");
      out.write("                    <p class=\"copywrite-text\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 col-sm-7\">\r\n");
      out.write("                    <!-- Footer Nav -->\r\n");
      out.write("                    <div class=\"footer-nav\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Recipes</a></li>\r\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### All Javascript Script ##### -->\r\n");
      out.write("    <!-- jQuery-2.2.4 js -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <!-- Popper js -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap js -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- All Plugins js -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/plugins.js\"></script>\r\n");
      out.write("    <!-- Active js -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/active.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("function openPop(){\r\n");
      out.write("\t \r\n");
      out.write("    var addr = $(\"#address1\").val()+\" \"+$(\"#address2\").val();\r\n");
      out.write("  \r\n");
      out.write("    $(\"#caddr\").val(addr);\r\n");
      out.write("    \r\n");
      out.write("    var menu =\"\";\r\n");
      out.write("    \r\n");
      out.write("    $(\"#addmenu .row\").each(function(index, item){\r\n");
      out.write("       var menuname = $(this).find(\".menuname\");   \r\n");
      out.write("       var menuprice = $(this).find(\".menuprice\");\r\n");
      out.write("       \r\n");
      out.write("       var str = menuname.text()+\",\"+menuprice.text()+\",\";\r\n");
      out.write("       \r\n");
      out.write("       menu += str;\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("  \r\n");
      out.write("    $(\"#cmenu\").val(menu);\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    var pop_title = \"popupOpener\" ;\r\n");
      out.write("     \r\n");
      out.write(" \r\n");
      out.write("    window.open(\"\", pop_title,\"width = 1500, height = 800, top = 100, left = 200, location = no\") ;\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    var frm = document.frm ;\r\n");
      out.write("    \r\n");
      out.write("    frm.target = pop_title ;\r\n");
      out.write("    frm.action = \"miribogi\" ;\r\n");
      out.write("     \r\n");
      out.write("    frm.submit() ;\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("}\r\n");
      out.write("$(\"#miribogi\").on(\"click\",function(){\r\n");
      out.write("    openPop();\r\n");
      out.write("     \r\n");
      out.write("});\r\n");
      out.write("$(\"#btnaddmenu\").on(\"click\",function(){\r\n");
      out.write("   var menu = $(\"#menu\").val();\r\n");
      out.write("   var price = $(\"#price\").val();\r\n");
      out.write("   \r\n");
      out.write("   var str=\"<tr class = row><td class =menuname>\"+menu+\"</td><td class =menuprice>\"+price+\"</td>\"+\"<td><input type=file name=imageFile><input type =button value = 삭제 class=btndeletemenu></td></tr>\";\r\n");
      out.write("   $(\"#addmenu\").append(str);\r\n");
      out.write("   \r\n");
      out.write("});\r\n");
      out.write("$(\"#addmenu\").on(\"click\",\".row .btndeletemenu\",function(){\r\n");
      out.write("var row = $(this).parent().parent().parent().parent();\r\n");
      out.write("   row.remove();\r\n");
      out.write("});\r\n");
      out.write("$(frm.address1).click(function(){\r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("        oncomplete: function(data) {\r\n");
      out.write("            $(frm.address1).val(data.address);\r\n");
      out.write("        }\r\n");
      out.write("    }).open();\r\n");
      out.write("});  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   $(frm).on(\"submit\",function(e){\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      var addr = $(\"#address1\").val()+\" \"+$(\"#address2\").val();\r\n");
      out.write("      $(frm.caddr).val(addr);\r\n");
      out.write("      \r\n");
      out.write("      var menu =\"\";\r\n");
      out.write("      \r\n");
      out.write("      $(\"#addmenu .row\").each(function(index, item){\r\n");
      out.write("         var menuname = $(this).find(\".menuname\");   \r\n");
      out.write("         var menuprice = $(this).find(\".menuprice\");\r\n");
      out.write("         \r\n");
      out.write("         var str = menuname.text()+\",\"+menuprice.text()+\",\";\r\n");
      out.write("         \r\n");
      out.write("         menu += str;\r\n");
      out.write("         \r\n");
      out.write("      \r\n");
      out.write("         \r\n");
      out.write("      });\r\n");
      out.write("   \r\n");
      out.write("      $(frm.cmenu).val(menu);\r\n");
      out.write("      if(!confirm(\"저장하시겠습니까?\")) return;\r\n");
      out.write("      frm.submit();\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   $(\"#btnImage\").on(\"click\",function(){\r\n");
      out.write("      $(frm.files).click();\r\n");
      out.write("   });\r\n");
      out.write("   $(\"#image\").on(\"click\",function(){\r\n");
      out.write("      $(frm.file).click();\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   $(frm.file).on(\"change\",function(){\r\n");
      out.write("      var file = $(frm.file)[0].files[0];\r\n");
      out.write("      $(\"#image\").attr(\"src\",URL.createObjectURL(file));\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   $(frm.files).on(\"change\",function(){\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      var files = $(frm.files)[0].files;\r\n");
      out.write("      var str=\"\";\r\n");
      out.write("      \r\n");
      out.write("      $.each(files,function(index, file){\r\n");
      out.write("         str += \"<img class=image2 id=image2 src='\"+URL.createObjectURL(file)+\"'>\";\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      $(\"#listFile\").html(str);\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("   });\r\n");
      out.write("   </script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/insert.jsp(17,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("path");
    // /WEB-INF/views/insert.jsp(17,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/insert.jsp(17,1) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}

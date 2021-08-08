package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MakeQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Make Quiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <form  name=\"makeQuizForm\" class=\"makeQuizForm\" action=\"make-quiz\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Question:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"question\" rows=\"7\" class=\"inputQuestion\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Option 1:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"option1\" class=\"inputOption\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Option 2:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"option2\" class=\"inputOption\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Option 3:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"option3\" class=\"inputOption\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Option 4:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"option4\" class=\"inputOption\"></textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"makeQuizLabels\">Answer(s):</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"makeQuizOption\" type=\"checkbox\" value=\"1\" name=\"answer\"/>\n");
      out.write("                                <span class=\"cbOption\">Option 1</span>\n");
      out.write("                                <input class=\"makeQuizOption\" type=\"checkbox\" value=\"2\" name=\"answer\"/>\n");
      out.write("                                <span class=\"cbOption\">Option 2</span>\n");
      out.write("                                <input class=\"makeQuizOption\" type=\"checkbox\" value=\"3\" name=\"answer\"/>\n");
      out.write("                                <span class=\"cbOption\">Option 3</span>\n");
      out.write("                                <input class=\"makeQuizOption\" type=\"checkbox\" value=\"4\" name=\"answer\"/>\n");
      out.write("                                <span class=\"cbOption\">Option 4</span>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"submit\" value=\"Save\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"makeQuizMessage\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <script type=\"text/javascript\">clearCheckbox();</script>\n");
      out.write("        <script type=\"text/javascript\">enableCheckbox();</script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EchoServlet
 */
@WebServlet("/EchoServlet")
public class EchoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EchoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
  
    //はじめにリクエストのエンコードを実施
    request.setCharacterEncoding("Shift-JIS");
    
  //ContentTypeを指定
    response.setContentType("text/html; charset=Shift-JIS");
    
  //HTTPレスポンスとして文字列を表示するライター
    PrintWriter pw = response.getWriter();
    
    //文字列を出力する
    pw.println("<html>");
    pw.println("<head>");
    pw.println("<title>EchoServlet</title>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1><font color=\"red\">Hello EchoServlet</font></h1>");
    //index.htmlからの値を取得して表示する
    String param=request.getParameter("param");
    pw.println(param);
    
    //入力値を標準出力する
    System.out.println(param);
   
    
    pw.println("</body>");
    pw.println("</html>");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // doGetメソッドに処理を委譲する
    this.doGet(request ,response);
  
  }

}

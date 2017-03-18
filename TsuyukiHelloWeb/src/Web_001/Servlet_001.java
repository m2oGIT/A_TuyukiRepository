package Web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_001
 */
@WebServlet("/Web_001/Servlet_001")
public class Servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_001() {
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
      
      String param1=request.getParameter("param1");
      String param2=request.getParameter("param2");
      pw.println(param1);
      pw.println(param2);
      
      //入力値を標準出力する
      System.out.println(param1);
      System.out.println(param2);
     
      
      pw.println("</body>");
      pw.println("</html>");
      
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    this.doGet(request ,response);
  }

}

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
    
    //�͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
      request.setCharacterEncoding("Shift-JIS");
      
    //ContentType���w��
      response.setContentType("text/html; charset=Shift-JIS");
      
    //HTTP���X�|���X�Ƃ��ĕ������\�����郉�C�^�[
      PrintWriter pw = response.getWriter();
      
      String param1=request.getParameter("param1");
      String param2=request.getParameter("param2");
      pw.println(param1);
      pw.println(param2);
      
      //���͒l��W���o�͂���
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


package Web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_002
 */
@WebServlet("/Web_001/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_002() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub

    // �͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Shift-JIS" );

    // ContentType���w��
    response.setContentType( "text/html; charset=Shift-JIS" );

    // HTTP���X�|���X�Ƃ��ĕ������\�����郉�C�^�[
    PrintWriter pw = response.getWriter();

    String param1 = request.getParameter( "param1" );

    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>EchoServlet</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );

    // �J���}�؂�o��
    String[] high1 = param1.split( ",", 0 );

    int n = high1.length;
    int high2 = 0;
    double weight1;

    // �g���Ƒ̏d������o��
    for ( int i = 0; i < n; i++ ) {

      // �g�����l�ϊ�
      high2 = Integer.parseInt( high1[i] );
      // �̏d�Z�o
      weight1 = ( high2 - 100 ) * 0.9;
      String weight2 = String.format("%.5f", weight1);
      // �o��
      pw.print( "�g��:" + high2 );
      pw.print( "  �̏d:" + weight2 );
      pw.print( "<br>" );
    }

    pw.println( "</body>" );
    pw.println( "</html>" );

  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    this.doGet( request, response );
  }

}

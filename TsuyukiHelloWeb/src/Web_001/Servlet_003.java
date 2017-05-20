
package Web_001;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_003
 */
@WebServlet("/Web_001/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_003() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // TODO Auto-generated method stub

    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Shift-JIS" );

    // ContentTypeを指定
    response.setContentType( "text/html; charset=Shift-JIS" );

    // HTTPレスポンスとして文字列を表示するライター
    PrintWriter pw = response.getWriter();

    String param1 = request.getParameter( "param1" );
    String param2 = request.getParameter( "param2" );
    String param3 = request.getParameter( "param3" );

    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>EchoServlet</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );

    if ( ( param1.equals( "" ) ) || ( param2.equals( "" ) ) || ( param3.equals( "" ) ) ) {

      pw.println( "不正な値が入力されました。" );

    } else {
      if ( ( param2.equals( "+" ) || param2.equals( "-" ) || param2.equals( "*" )
      || param2.equals( "/" ) ) ) {

        BigDecimal wk1 = new BigDecimal( param1 );
        BigDecimal wk3 = new BigDecimal( param3 );

        if ( (wk3.signum() == 0) && (param2.equals( "/" ))) {

          pw.println( "不正な値が入力されました。" );

        } else {

          BigDecimal out1 = null;

          switch ( param2 ) {
            case "+":
              out1 = wk1.add( wk3 );
              break;

            case "-":
              out1 = wk1.subtract( wk3 );
              break;

            case "*":
              out1 = wk1.multiply( wk3 );
              break;

            case "/":
              out1 = wk1.divide( wk3, 5, BigDecimal.ROUND_HALF_UP );
              break;
          }

          pw.println( param1 );
          pw.println( param2 );
          pw.println( param3 );
          pw.println( "=" + out1 );

        }
      } else {
        pw.println( "不正な値が入力されました。" );
      }
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

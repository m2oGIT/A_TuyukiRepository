
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

    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Shift-JIS" );

    // ContentTypeを指定
    response.setContentType( "text/html; charset=Shift-JIS" );

    // HTTPレスポンスとして文字列を表示するライター
    PrintWriter pw = response.getWriter();

    String param1 = request.getParameter( "param1" );

    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>EchoServlet</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );

    // カンマ切り出し
    String[] high1 = param1.split( ",", 0 );

    int n = high1.length;
    int high2 = 0;
    double weight1;

    // 身長と体重を割り出す
    for ( int i = 0; i < n; i++ ) {

      // 身長数値変換
      high2 = Integer.parseInt( high1[i] );
      // 体重算出
      weight1 = ( high2 - 100 ) * 0.9;
      String weight2 = String.format("%.5f", weight1);
      // 出力
      pw.print( "身長:" + high2 );
      pw.print( "  体重:" + weight2 );
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

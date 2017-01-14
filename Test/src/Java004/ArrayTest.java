/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author （作成者）a-tsuyuki <br />
 *         （クラス論理名）ArrayTest <br />
 *         （説明） コンソールより、整数を5回入力させ、最大値をコンソール出力する。 
 *         ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する。<br />
 *         更新履歴 2017/1/14 （更新者）：（説明） <br />
 */
public class ArrayTest {

  /**
   * （メソッド論理名）main <br />
   * （説明）コンソールより、整数を5回入力させ、最大値をコンソール出力する。 
   * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
    String str;
    int a, i;
    int b = 0;
    int c = 0;
    int d = 0;
    try {
      for ( i = 1; i < 6; i++ ) {
        System.out.print( i );
        System.out.print( "件目の値を入力して下さい : " );
        str = input.readLine();
        a = Integer.parseInt( str.trim() );

        b = Math.max( a, b );
        c = c + a;
      }
      System.out.print( "最大値は" );
      System.out.println( b );
      System.out.print( "合計値は" );
      System.out.println( c );
      d = c / ( i - 1 );
      System.out.print( "平均値は" );
      System.out.println( d );
    } catch ( NumberFormatException e ) {
      System.out.println( "整数ではありません。処理を終了します。" );
    } catch ( IOException e ) {
      System.out.println( "異常終了 " );
    }

  }
}

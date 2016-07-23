/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者）a-tsuyuki <br />
 *         （クラス論理名）Test09 <br />
 *         （説明）「実行時引数で渡された数値」までをループで回して、加算する。 <br />
 *         更新履歴 2016/07/23 （更新者）：（説明） <br />
 */
public class Test09 {

  /**
   * （メソッド論理名）main <br />
   * （説明）「実行時引数で渡された数値」までをループで回して、加算する。 <br />
   * 
   * @param args 実行時引数
   */

  public static void main( String[] args ) {

    String x = args[0];
    int y = Integer.parseInt( x );
    int j = 0;
    for ( int i = 0; i < y + 1; i++ ) {
      j = j + i;
      // System.out.println(i);
    }
    System.out.print( "1~" );
    System.out.print( y );
    System.out.println( "まで加算した数値を表示します。 " );
    System.out.print( "合計：" );
    System.out.println( j );

  }

}

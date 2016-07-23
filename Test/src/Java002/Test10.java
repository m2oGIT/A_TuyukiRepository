/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者）a-tsuyuki <br />
 *         （クラス論理名）Test10 <br />
 *         （説明）渡された2種類の整数の間の数を全て合計。 <br />
 *         更新履歴 2016/07/23 （更新者）：（説明） <br />
 */
public class Test10 {

  /**
   * （メソッド論理名）main <br />
   * （説明）渡された2種類の整数の間の数を全て合計。 <br />
   * 
   * @param args 実行時引数
   */

  public static void main( String[] args ) {

    String x1 = args[0];
    String x2 = args[1];
    int y1 = Integer.parseInt( x1 );
    int y2 = Integer.parseInt( x2 );
    int j = 0;
    for ( int i = y1; i < y2 + 1; i++ ) {
      j = j + i;
      // System.out.println(i);
    }
    System.out.print( y1 );
    System.out.print( "~" );
    System.out.print( y2 );
    System.out.println( "まで加算した数値を表示します。 " );
    System.out.print( "合計：" );
    System.out.println( j );

  }

}

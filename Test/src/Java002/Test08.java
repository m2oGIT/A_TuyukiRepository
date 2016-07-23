/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者）a-tsuyuki <br />
 *         （クラス論理名）Test08 <br />
 *         （説明）1~100までの数値を奇数の時のみ加算。 <br />
 *         更新履歴 2016/07/23 （更新者）：（説明） <br />
 */
public class Test08 {

  /**
   * （メソッド論理名）main <br />
   * （説明）1~100までの数値を奇数の時のみ加算。 <br />
   * 
   * @param args 実行時引数
   */

  public static void main( String[] args ) {

    int j = 0;
    for ( int i = 0; i < 101; i++ ) {
      if ( i % 2 != 0 ) {
        j = j + i;
      }
//      System.out.println( i );
    }
    System.out.println( "1~100の奇数を加算した数値を表示します。 " );
    System.out.print( "合計：" );
    System.out.println( j );

  }

}

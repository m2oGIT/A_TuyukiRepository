/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author （作成者）a-tsuyuki <br />
 *         （クラス論理名）Test13 <br />
 *         （説明）"*"を1ずつ追加し、"**********"になるまで実行し表示する。 <br />
 *         更新履歴 2017/1/14 （更新者）：（説明） <br />
 */
public class Test13 {

  /**
   * （メソッド論理名） main<br />
   * （説明）"*"を1ずつ追加し、"**********"になるまで実行し表示する。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    String str = "*";
    System.out.println( "1" );
    while ( !str.equals( "***********" ) ) {
      System.out.println( str );
      str = str + "*";
    }

    System.out.println( "2" );
    for ( String str2 = "*"; !str2.equals( "***********" ); str2 = str2 + "*" ) {
      System.out.println( str2 );
    }

  }

}

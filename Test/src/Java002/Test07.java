/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author （作成者）a-tsuyuki <br />
 *  （クラス論理名）Test07 <br />
 *  （説明）1~100までの数値をループで回して、加算する。 <br />
 *  更新履歴 2016/07/23 （更新者）：（説明） <br />
 */
public class Test07 {

  /**
   * （メソッド論理名）main <br />
   * （説明）1~100までの数値をループで回して、加算する。 <br />
   * @param args 実行時引数
   */
  
  public static void main( String[] args ) {
    
    int j;
    j = 0;
    for ( int i = 0; i < 101; i++ ) {
       j = j + i;
//       System.out.println(i);
    }
    System.out.print( "1~100を加算した数値を表示します。 "  );
    System.out.println( j );
    
  }

}

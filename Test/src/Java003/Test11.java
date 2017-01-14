/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author （a-tsuyuki） <br />
 *         （クラス論理名）Test11 <br />
 *         （説明）0.1を10回足した後、10倍にした結果を表示させるコードを作成する。 <br />
 *         更新履歴 2017/1/14 （更新者）：（説明） <br />
 */
public class Test11 {

  /**
   * （メソッド論理名）main <br />
   * （説明）0.1を10回足した後、10倍にした結果を表示させるコードを作成する。 <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    BigDecimal a = new BigDecimal( "0.1" );
    BigDecimal b = new BigDecimal( "0" );
    BigDecimal c = new BigDecimal( "10" );

    for ( int i = 1; i <= 10; i++ ) {

      b = b.add( a );
      // System.out.println(b);
      // System.out.println(result);
    }

    BigDecimal result = b.multiply( c );
    System.out.print( "結果： " + result );

  }

}

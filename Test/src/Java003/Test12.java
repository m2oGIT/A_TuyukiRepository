/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （a-tsuyuki） <br />
 *         （クラス論理名）Test12 <br />
 *         （説明）実行した日時を以下の形式で表示させる <br />
 *         更新履歴 2017/1/14 （更新者）：（説明） <br />
 */
public class Test12 {

  /**
   * （メソッド論理名）main <br />
   * （説明）実行した日時を以下の形式で表示させる <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    Date date = new Date();
    
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate );

  }

}

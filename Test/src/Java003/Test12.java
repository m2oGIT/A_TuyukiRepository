/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author �ia-tsuyuki�j <br />
 *         �i�N���X�_�����jTest12 <br />
 *         �i�����j���s�����������ȉ��̌`���ŕ\�������� <br />
 *         �X�V���� 2017/1/14 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test12 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j���s�����������ȉ��̌`���ŕ\�������� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    Date date = new Date();
    
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate );

  }

}

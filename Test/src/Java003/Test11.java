/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author �ia-tsuyuki�j <br />
 *         �i�N���X�_�����jTest11 <br />
 *         �i�����j0.1��10�񑫂�����A10�{�ɂ������ʂ�\��������R�[�h���쐬����B <br />
 *         �X�V���� 2017/1/14 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test11 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j0.1��10�񑫂�����A10�{�ɂ������ʂ�\��������R�[�h���쐬����B <br />
   * 
   * @param args ���s������
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
    System.out.print( "���ʁF " + result );

  }

}

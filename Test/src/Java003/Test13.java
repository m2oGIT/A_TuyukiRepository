/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *         �i�N���X�_�����jTest13 <br />
 *         �i�����j"*"��1���ǉ����A"**********"�ɂȂ�܂Ŏ��s���\������B <br />
 *         �X�V���� 2017/1/14 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test13 {

  /**
   * �i���\�b�h�_�����j main<br />
   * �i�����j"*"��1���ǉ����A"**********"�ɂȂ�܂Ŏ��s���\������B <br />
   * 
   * @param args ���s������
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

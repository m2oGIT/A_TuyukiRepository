/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *         �i�N���X�_�����jTest09 <br />
 *         �i�����j�u���s�������œn���ꂽ���l�v�܂ł����[�v�ŉ񂵂āA���Z����B <br />
 *         �X�V���� 2016/07/23 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j�u���s�������œn���ꂽ���l�v�܂ł����[�v�ŉ񂵂āA���Z����B <br />
   * 
   * @param args ���s������
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
    System.out.println( "�܂ŉ��Z�������l��\�����܂��B " );
    System.out.print( "���v�F" );
    System.out.println( j );

  }

}

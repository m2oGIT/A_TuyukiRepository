/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *         �i�N���X�_�����jTest10 <br />
 *         �i�����j�n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v�B <br />
 *         �X�V���� 2016/07/23 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test10 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j�n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v�B <br />
   * 
   * @param args ���s������
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
    System.out.println( "�܂ŉ��Z�������l��\�����܂��B " );
    System.out.print( "���v�F" );
    System.out.println( j );

  }

}

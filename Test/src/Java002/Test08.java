/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *         �i�N���X�_�����jTest08 <br />
 *         �i�����j1~100�܂ł̐��l����̎��̂݉��Z�B <br />
 *         �X�V���� 2016/07/23 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test08 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j1~100�܂ł̐��l����̎��̂݉��Z�B <br />
   * 
   * @param args ���s������
   */

  public static void main( String[] args ) {

    int j = 0;
    for ( int i = 0; i < 101; i++ ) {
      if ( i % 2 != 0 ) {
        j = j + i;
      }
//      System.out.println( i );
    }
    System.out.println( "1~100�̊�����Z�������l��\�����܂��B " );
    System.out.print( "���v�F" );
    System.out.println( j );

  }

}

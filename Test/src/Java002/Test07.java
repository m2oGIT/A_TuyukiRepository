/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *  �i�N���X�_�����jTest07 <br />
 *  �i�����j1~100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����B <br />
 *  �X�V���� 2016/07/23 �i�X�V�ҁj�F�i�����j <br />
 */
public class Test07 {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j1~100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����B <br />
   * @param args ���s������
   */
  
  public static void main( String[] args ) {
    
    int j;
    j = 0;
    for ( int i = 0; i < 101; i++ ) {
       j = j + i;
//       System.out.println(i);
    }
    System.out.print( "1~100�����Z�������l��\�����܂��B "  );
    System.out.println( j );
    
  }

}

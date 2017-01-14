/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author �i�쐬�ҁja-tsuyuki <br />
 *         �i�N���X�_�����jArrayTest <br />
 *         �i�����j �R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂���B 
 *         �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������B<br />
 *         �X�V���� 2017/1/14 �i�X�V�ҁj�F�i�����j <br />
 */
public class ArrayTest {

  /**
   * �i���\�b�h�_�����jmain <br />
   * �i�����j�R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂���B 
   * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������B <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
    String str;
    int a, i;
    int b = 0;
    int c = 0;
    int d = 0;
    try {
      for ( i = 1; i < 6; i++ ) {
        System.out.print( i );
        System.out.print( "���ڂ̒l����͂��ĉ����� : " );
        str = input.readLine();
        a = Integer.parseInt( str.trim() );

        b = Math.max( a, b );
        c = c + a;
      }
      System.out.print( "�ő�l��" );
      System.out.println( b );
      System.out.print( "���v�l��" );
      System.out.println( c );
      d = c / ( i - 1 );
      System.out.print( "���ϒl��" );
      System.out.println( d );
    } catch ( NumberFormatException e ) {
      System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
    } catch ( IOException e ) {
      System.out.println( "�ُ�I�� " );
    }

  }
}

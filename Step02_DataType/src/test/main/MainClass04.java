package test.main;
/*
 *  [ Java �⺻ ������ type ]
 * 
 * 	3. ������ (char)
 * 
 * - 65536 ������ �ڵ尪�� ���� �� �־ �����迡�� ����ϴ� ����
 * - �ѱ��ڸ� ǥ���� �� �ִ�.
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		// char �� ���� ����� ���ÿ� �� �����ϱ�
		// ���� �� ���ڸ� ǥ���� ���� '' (single ����ǥ)
		char ch1= 'a';
		char ch2= '1';
		char ch3= '@';
		char ch4= '��';
		char ch5= '��';
		
		// ���������δ� ���� code ������ ó���Ѵ�.
		int code1= ch1;		// �⺻������ short type
		int code2= ch2;		//short type < int type �̹Ƿ�
		int code3= ch3;		//�ڵ� casting �Ǿ ����.
		int code4= ch4;
	}
}

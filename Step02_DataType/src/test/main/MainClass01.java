package test.main;
/*
 *	[ Java ������ type ]
 *
 *	1. ������
 *	(���������� ���� ���� : �޸𸮸� ȿ�������� ����Ϸ���(/�ڷ� �� ���� �޸� ŭ)
 *	������ : byte, short, int, long 
 *  	- byte ������;  // -128 ~ 127
 *  	- short ������;  // -32768 ~ 32767
 *  	- int  ������; // -2147483648 ~ 2147483647
 *  	- long ������; // -9223372036854775808 ~ 92233720368547758	
 *
 *	�Ǽ��� : float, double
 *  - float ������; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double ������; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	// ��������� ���۵Ǵ� Ư���� main �޼ҵ�
	public static void main(String[] args) {
		// ������ ���� ���� ���� �����ϰ� �� �����ϱ�
		byte iByte= 10;
		short iShort= 10;
		int iInt= 10;
		long iLong= 10; // d �����ϸ� double type �̴�.
			
			// byte(���� ��)�� int(ū ��)�� ������ ���� ���� �� ���� (����)
			int tmp= iByte;
			// int(ū ��)�� byte(���� ��)�� ������ ���� ���� ���� (�Ұ�)
			//byte tmp2= iInt;
			
			// �ٵ� int(ū ������)�� ���� ������ ���� ��� �ִ� ���� ���, byte(���� ��)�� �ٽ� ������ ���� �� �־�
			// => casting(����ȯ) ������
			// (byte) ��� ��� int Ÿ�� ������, �� �ڸ��� �ִ� �ִ� byte Ÿ������ ������ casting ���ִ� ��
			// iInt => int type  /  (byte)iInt => byte type
			byte tmp2= (byte)iInt;
		
		// �Ǽ��� ���� ���� ���� �����ϰ� �� �����ϱ�
		float num1= 10.1f;
		double num2= 10.1d;
		double num3= 10.1; // d �����ϸ� double type �̴�.
		
		//float type �� double type ���� ��� (����)
		double tmp3= num1;
		
		// casting �����ڸ� ����ؾ� ���� �� �ִ�.
		// num2 => double type  /  (float)num2 => float type
		float tmp4= (float)num2;
	}
}

package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// ���� ����
		int kor= 95;
		// ���� ����
		int eng= 100;
		// ����, ���� ������ ����� ���ؼ� ����ϰ� �ʹٸ�?
		
		// �� ������ ��
		int sum= kor+eng;
		/*
		 *	���� ���� �����ϸ� ����� ����
		 *	������ �Ǽ��� �����ϸ� ����� �Ǽ�
		 */
		// ���
		// sum => ����, 2 => ���� ==> ������ ������ �����ϸ� ���� �ۿ� �� ����(�Ҽ��� ������)
		// => ���꿡 �����ϴ� ���� �߿� �ϳ��� �Ǽ��� �ٲپ� ��� ��
		// double ave= sum/2d;  �Ǵ� double ave= sum/2.0;  �Ǵ� double ave= sum/2.0d;
		double ave= sum/2.0;
		
		System.out.println("���:" + ave);
	}
		
}

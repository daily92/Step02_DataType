package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// ���� ������ type �� ���� �� �ִ� �� ���� ����� 
			//null �� ���� data type �� �� �� �־�
			//String maName; �̷��� �ϸ� �ƿ� ����������� �ʾ� (������ ���� ����)
		String myName= null;	// null �� �����ϸ� �ȴ�. (������ ���� ���� ����)
		
		boolean isRun= false;
		
		if(isRun) {
			myName= "�����";
		}
		
		// ������ ��� ���� null ���� �ƴ� ���� ���� 
		// �������� ������ �ؾ� �ϴ� ��찡 �ִ�.
		if(myName== null) {
			System.out.println("myName �� null �̳�?");
		}
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}

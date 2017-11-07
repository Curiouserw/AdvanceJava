package Java8NewFeatures.Lambda;

public class LambdaTest5 {
	private static int j;
	private int k;
	public static void main(String[] args) {
		LambdaTest5 t = new LambdaTest5();
		t.test();
	}
	
	public void test(){
		int num = 10;
		j = 20;
		k = 30;
		
		//lambda���ʽ�п��Է��ʳ�Ա����Ҳ���Է����ֲ�����
		Action5 a5 = (i)->System.out.println("������:i="+(i+num+j+k));
		
		Action5 action5=new Action5() {
			@Override
			public void run(int i) {
				
			}
		};
		
		a5.run(1);
		
		//������������ʵı���Ĭ�ϱ�Ϊfinal���ε� �����ٸı� ������벻ͨ��
//		num = 60;
		j = 50;
		k = 70;
	}
	
}

interface Action5{
	public void run(int i);
}


package Java8NewFeatures.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSimpleDemo {
//	private int num1=10;
	

	public static void main(String[] args) {
//		JButton btn=new JButton("Button");
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("btn was Clicked");
//				
//			}
//		});
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("this is run method");
//				
//			}
//	
//		}).start();
//		Runnable t1=()->System.out.println("this is run method for lambda");
//		new Thread(t1).start();
//		btn.addActionListener((ActionEvent e)->System.out.println("this is btn clicked for lambda"));
		
		List<String> course=Arrays.asList("Linux","XML","Corejava","Hadoop");
		course.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		course.sort((o1,o2)->o1.compareTo(o2));
		course.forEach(str->System.out.println(str));
		
		
		
//		Collections.sort(course);
//		for (String cou : course) {
//			System.out.println(cou);
//		}
//		
//		Arrays.asList("CoreJava","Linux","XML","hadoop").forEach(str->System.out.println(str));
		
//		BinaryOperator<Integer> oper=
//				(x,y)->x+y;
//		int i=oper.apply(10,20);
//		System.out.println(i);
//		//�����ƶ�
//		List<Long> list=new ArrayList<>();
//		
//		btn.addActionListener(e->System.out.println("==="+e.getSource()));
//		
//			Callable<Integer> call=()->{System.out.println("this is a thread");
//			return 10;
//			};
//		
//		Runnable r=()->{
//			System.out.println();
//			System.out.println();
//		};
//		ExecutorService service=Executors.newCachedThreadPool();
//		Future<Integer> future=service.submit(call);
		
		
//		public void mathod(){
//			int mun2=20;
//			num1=200;
//			num2=300;
//		}
		
			
	}

}

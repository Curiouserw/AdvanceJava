package Java8NewFeatures.Lambda;

import java.io.File;

public class LambdaSupplierDemo {
	public static void main(String[] args) {
		File f=new File("src/com/briup/lambda");
//		File[] fs=f.listFiles(new FileFilter(){
//			
//			@Override
//			public boolean accept(File pathname){
//				return pathname.getName().endsWith(".java")
//			}
//		});
//		Supplier<File[]> supper=()->{return f.listFiles(pathname)}
	}
}

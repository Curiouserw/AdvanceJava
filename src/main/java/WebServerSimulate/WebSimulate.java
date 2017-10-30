package WebServerSimulate;

import java.util.concurrent.CountDownLatch;
import org.apache.log4j.Logger;

public class WebSimulate implements Runnable {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);     
	private static final Logger logger=Logger.getLogger(WebSimulate.class);
	
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		Thread thread = new Thread(new WebSimulate());
		thread.start();
		for (int i = 0; i <100; i++) {
			logger.info("WebSimulateTestMain"+i+" "+"1.2.3.4");
			System.out.println("WebSimulateTestMain"+i+" "+"1.2.3.4");
		}
		
		long after = System.currentTimeMillis();
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������������ʱ�䣺"+(after-before));
		System.exit(0);
	}
	public void run() {
		for(int i=0;i<100;i++){
			logger.info("WebSimulateTestSec"+i+" "+"1.2.3.5");
			System.out.println("WebSimulateTestSec"+i+" "+"1.2.3.5");
		}
		countDownLatch.countDown();
	}
}

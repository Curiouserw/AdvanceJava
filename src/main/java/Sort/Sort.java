package Sort;

public class Sort {
	static  void maopao1() {
		int[] mu={4,2,8,6};
		for(int i=0;i<mu.length;i++){
			for(int j=i+1;j<mu.length;j++){
				if(mu[i]>mu[j]){
					int temp=mu[i];
					mu[i]=mu[j];
					mu[j]=temp;
				}
			}
		}
		for (int j : mu) {
			System.out.println(j);
		}
	}
	static void maopao2(){
		 int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	     for(int i=0;i<a.length-1;i++){
	    	 for(int j=0;j<a.length-1-i;j++){
	    		 if(a[j]>a[j+1]){
	    			 a[j]^=a[j+1];
	    			 a[j+1]^=a[j];
	    			 a[j]^=a[j+1];
//	    			 int temp=a[j];
//	    			 a[j]=a[j+1];
//	    			 a[j+1]=temp;
	    		 }
	    	 }
	     }
	     for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Sort.maopao1();
		System.out.println("----------------");
		Sort.maopao2();
	}

}

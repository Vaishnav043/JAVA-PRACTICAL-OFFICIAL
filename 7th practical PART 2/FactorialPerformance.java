class FactorialPerformance{

	 static int recursive_method(int n){
       int result;
       if(n>0){
        if (n==0 || n==1){
            return 1;
        }else{
             result =n * recursive_method(n-1);
          }
        }else{
        return 0;
        }

        return result;
    }

    static int iterative_method(int n){
        int result = 1;
        if(n>0){
        if(n==0 || n==1){
            return 1;
        }
        for(int i=2; i<=n;i++){
            result = result * i;    
        }
        }else{
            return 0;
        }
        return result;
    }


	public static void main (String[] args){
		int noOfTimes=1000;
		long s1_tt=0, s2_tt=0,st,et;
		float s1_avg,s2_avg;
           
			for (int i=0;i<noOfTimes;i++){
				st=System.nanoTime();
				recursive_method(9999);
				et=System.nanoTime();
				s1_tt+=et-st;
			}
				s1_avg=(float)s1_tt/noOfTimes;

			for (int i=0;i<noOfTimes;i++){
				st=System.nanoTime();
				iterative_method(9999);
				et=System.nanoTime();
				s2_tt+=et-st;
			}
				s2_avg=(float)s2_tt/noOfTimes;
			
            	System.out.println(s1_avg);
				System.out.println(s2_avg);
}

}
class StringMethods{
    public static void main (String [] args){
         
         long start1 = System.nanoTime();
         String s = "UTSAV";
         for(int i=1; i<=2026; i++){
           s = s + "_"+ i;
         }
         long end1 = System.nanoTime();
        System.out.println("String Time: " + (end1-start1));

        long start2 = System.nanoTime();
        StringBuffer sbf = new StringBuffer("UTSAV");
        for (int i=1; i<=2026; i++){
            sbf.append("_").append(i);
        }
        long end2 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end2-start2));

        long start3 = System.nanoTime();
        StringBuilder sbi = new StringBuilder("UTSAV");
        for(int i=1; i<=2026; i++){
            sbi.append("_").append(i);
        }
        long end3 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end3-start3) );

    }
}
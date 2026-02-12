import java.util.*;

class Sy2024bit015{

    static void pp1(int size){  //SHIFTED RECTANGLE
    for(int i=1;i<=size;i++){
        for (int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=size;j++){
            System.out.print("*");
        }
        System.out.println();
    }
System.out.println();
    }
    

    static void pp2(int size){      //DIAMOND
      
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("+"+" ");
            }
            System.out.println();
        }

        for (int i=size-1; i>=1; i--){
            for (int j=1; j<=size-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("+"+" ");
            }
            System.out.println();
        }
        System.out.println();
System.out.println();
    }
    

    static void pp3(int size){        //NUMBER TRIANGLE
         int count =1;
        for (int i=1; i<=size; i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+ " ");
                count+=1;
            }
            System.out.println();
        }
System.out.println();
    }
    

    static void pp4(int size){
        for(int i=1;i<=size;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(size-i);j++){
            System.out.print(" ");
             
        }
        for (int j=1 ;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
     System.out.println();  
      
    }
    
    static void pp5(int size){
        int count=1;
        //int no=count;
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }

        for (int i=size; i>=1; i--){
            for (int j=1; j<=size-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                count-=1;
                System.out.print(count+" ");
                
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no. ");
        int size= sc.nextInt();
        pp1(size);
        pp2(size);
        pp3(size);
        pp4(size);
        pp5(size);
    }

}




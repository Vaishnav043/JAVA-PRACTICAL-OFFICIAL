import java.util.*;

class Factorial{
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
        System.out.println (recursive_method(-5));
        System.out.println (recursive_method(7));
        System.out.println(iterative_method(-5));
        System.out.println(iterative_method(7));
    }
}

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        long[] arr = new long[10];
        final long arrMax = (int)Math.pow(10, 10);
        System.out.println((double) Math.pow(10,10));
        //Scanner
        Scanner s = new Scanner(System.in);
        int len  = s.nextInt();
        if(len > 10){
            System.out.println("Array size cannot be more than 10");
            System.out.println("enter the size of the array");
            len  = s.nextInt();
        }               
        for(int i=0; i<len; i++){
            arr[i]=s.nextLong();
            if(arr[i] < arrMax || arr[i] < 0){
                System.out.println("array element cannot exceed 10^10");
            }
        }
        long sum=0;
        for(int i=0; i<len;i++){
            sum = sum + arr[i];
        } 
        System.out.println(sum);
    }

    

        

    
}

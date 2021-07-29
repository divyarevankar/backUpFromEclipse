import java.util.*;
public class TipCalculator {
	public static void main(String args[] ) throws Exception {
	        Scanner sc= new Scanner(System.in);
	        int q=sc.nextInt();//number of test cases
	        while(q>0){
	            q--;
	        int x=sc.nextInt(); //total order
	        int a=sc.nextInt(); //A's capacity
	        int[] A=new int[x];// A's order
	        int b=sc.nextInt();//B's capacity
	        int[] B=new int[x];//B's order
	        int tip=0;
	        for(int i=0;i<2*x;i++){
	            if(i<x){
	                A[i]=sc.nextInt();
	            }
	            else{
	                int s=i-x;
	                B[s]=sc.nextInt();
	                if(A[s]>B[s] && a>0){
	                    tip+=A[s];
	                    a--;
	                }
	                else if(B[s]>A[s] && b>0){
	                    tip+=B[s];
	                    b--;
	                }
	                else{
	                    tip+=A[s];
	                }
	            }
	        }
	        System.out.print(tip);
	        }
	    }
	}



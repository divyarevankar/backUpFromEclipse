import java.util.*;
public class ArraySwap {
	    public static void main(String args[] ) throws Exception {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int m = s.nextInt();
	        int[][] a = new int[10][10];
	        int[][] b = new int[10][10];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                a[i][j] = s.nextInt();
	                if(a[i][j] < 0 || a[i][j] > 100){
	                    
	                }
	            }
	        }
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<=m;j++){
	                b[j][i] = a[i][j];
	            }
	        }
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(b[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	    }
	}


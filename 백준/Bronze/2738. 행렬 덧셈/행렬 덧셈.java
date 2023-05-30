import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int N=s.nextInt();
        int M=s.nextInt();		//N, M 입력
       
        int A[][]=new int[N][M];	//A행렬 값 입력
        int B[][]=new int[N][M];	//B행렬 값 입력
   
        for(int i=0;i<N;i++)
        	for(int j=0;j<M;j++)
        		A[i][j]=s.nextInt();
        
        for(int i=0;i<N;i++)
        	for(int j=0;j<M;j++)
        		B[i][j]=s.nextInt();
        
        for(int i=0;i<N;i++) {		//출력
        	for(int j=0;j<M;j++)
        		System.out.print(A[i][j]+B[i][j]+" ");
        	System.out.println();
        
        }
        
    }
}
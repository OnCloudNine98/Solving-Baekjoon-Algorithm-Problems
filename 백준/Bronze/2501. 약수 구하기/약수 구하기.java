import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
         ArrayList arr=new ArrayList();		//Arraylist선언
         
         int N=s.nextInt();					//K,N 값 입력
         int K=s.nextInt();
         
         for(int i=1;i<=N;i++)				//입력값 N이 약수일경우에만 arr에 입력
        	 if(N%i==0)
        		 arr.add(i);
         
         if(arr.size()<K)					//약수의 개수(배열의 길이)보다 K 가 
        	 System.out.println(0);			//클 경우에는 0 출력
         else
        	 System.out.println(arr.get(K-1));	//그러지 않을 경우는 K-1번째 출력
      
        
         
    }
}
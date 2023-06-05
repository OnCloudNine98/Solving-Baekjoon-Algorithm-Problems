import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int N = s.nextInt();
        int Num[] = new int[N];						//수들을 입력할 배열
        for(int i=0;i<N;i++)
        	Num[i]=s.nextInt();
        
        		
        int cnt=0;									//소수의 개수 변수 선언
        for(int i=0;i<N;i++) {
        	ArrayList ali_arr = new ArrayList();	//수들의 약수를 넣어줄 배열 선언
        	for(int j=1; j<=Num[i] ; j++)			//약수를 넣어줄 for문
        		if(Num[i]%j==0)
        			ali_arr.add(j);
        			
        	if(ali_arr.size()==2)					//약수의 총개수가 2개이면 소수 카운트
        		cnt++;
        	}
         
         System.out.println(cnt);
    }
}
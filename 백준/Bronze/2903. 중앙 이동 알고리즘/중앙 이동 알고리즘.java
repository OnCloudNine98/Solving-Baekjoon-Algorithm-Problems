import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int N=s.nextInt();	//N 입력
        		
        int sum=2;			//정사각형 한면의 점의 개수
        
        for(int i=1;i<=N;i++)	//규칙을 활용한 한면의 점의 개수 를 구하는 반복문
        	sum += sum-1;
        
        System.out.println((int)Math.pow(sum, 2));
    }
}
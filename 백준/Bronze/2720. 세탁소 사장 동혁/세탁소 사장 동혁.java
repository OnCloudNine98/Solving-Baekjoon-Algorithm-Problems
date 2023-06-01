import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int T=s.nextInt();		//T 값 입력
        
        int TestCase[]= new int[T];	//TestCase배열 선언
        
        
        for(int i=0;i<TestCase.length;i++) {
        	TestCase[i]=s.nextInt();
        }
        for(int i=0;i<TestCase.length;i++) {		// 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수		
        	System.out.print(TestCase[i]/25+" ");	// 출력 반복문
        	TestCase[i] %= 25;
        	System.out.print(TestCase[i]/10+" ");
        	TestCase[i] %= 10;
        	System.out.print(TestCase[i]/5+" ");
        	TestCase[i] %= 5;
        	System.out.print(TestCase[i]/1+" ");
        	TestCase[i] %= 1;
        	System.out.println();
        }
        
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        String B =new String();			//B	입력
        
        int N = 0;						//N 입력
        
        int sum=0;						//10진법 수
        int num=0;						//지수 변수
        
        B = s.next();
        N =	s.nextInt();
        
        for(int i=B.length()-1;i>=0;i--)				//문자를 아스키 코드로 접근하여 반복문
        	if(B.charAt(i)>='A' && B.charAt(i)<='Z')			
        		sum+= ( (int)(B.charAt(i)-'A')+10 ) * Math.pow( N ,num++);
        	else 
        		sum+= (int)(B.charAt(i) -'0') * Math.pow( N , num++);
			
        System.out.println(sum);
        			
    }
}
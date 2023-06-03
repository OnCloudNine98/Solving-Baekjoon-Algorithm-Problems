import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        
        
        int N = s.nextInt();			//N 입력
        
        int B=s.nextInt();				//B	입력


        ArrayList<Integer> mid= new ArrayList<Integer>();		//N진수 값 저장 배열
        
        while(N >0 ){
        	mid.add(N%B);
        	N /= B;
        	
        }
        
        for(int i=mid.size()-1;i>=0;i--)						//int값을 문자로 전환
        	if(mid.get(i)<10)
        		System.out.print(mid.get(i));
        	else
        		System.out.print((char)( mid.get(i)+55 ) );
    }
}
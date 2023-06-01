import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int A=s.nextInt();	//세 정수 A, B, V 변수
        int B=s.nextInt();
        int V=s.nextInt();
        
        
        int day=(V-B)/(A-B);			//걸린 기간 변수
       
        if((V-B)%(A-B)!=0)
        		day++;
        
        System.out.println(day);
    }
}
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        
        
        String A = s.next();			//A 입력
        
        String B= s.next();				//B	입력

        BigInteger bigNum1= new BigInteger(A);		//BigInteger사용
        BigInteger bigNum2= new BigInteger(B);


        System.out.println(bigNum1.add(bigNum2));
    }
}
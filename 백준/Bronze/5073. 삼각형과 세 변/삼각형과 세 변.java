import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner s = new Scanner(System.in);
	    
        //입력받은 삼각형의 세 변의 길이
        int length[] =  new int[3];
        
        do{
            for(int i=0 ; i<3; i++)
                length[i]=s.nextInt();
            Arrays.sort(length);
            if(length[0]==0)
                break;
            else if(length[2] >=length[0] + length[1])
                System.out.println("Invalid");
            else if(length[0]==length[1] && length[1]==length[2])
                System.out.println("Equilateral");
            else if(length[0]==length[1] && length[1] !=length[2] || length[0] !=length[1] && length[1] ==length[2])
                System.out.println("Isosceles");
            else if(length[0]!=length[1] && length[1] !=length[2])
                System.out.println("Scalene");

            
        }while(true);
        
	}
}
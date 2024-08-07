import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    
	public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //입력받은 삼각형의 세각 변수
        int length[] = new int[3];
        
        //삼각형의 세각 총합합
        int sum=0;
        
        Boolean Equilateral = false;
        Boolean Isosceles = false;
        Boolean Scalene = false;
        
        
        for(int i=0;i<3;i++){
            length[i] = Integer.parseInt(br.readLine() );
            sum += length[i];
        }
        if(length[0]==60 && length[1]==60 && length[2]==60 )
            Equilateral=true;
            
        if(length[0] == length[1] || length[0] == length[2] || length[1] == length[2] )
            Isosceles=true;
            
        if(length[0] != length[1] && length[0] != length[2] && length[1] != length[2] )
            Scalene=true;
        
        
        if(sum!=180)
            bw.write("Error");
        else if(Equilateral)
            bw.write("Equilateral");
        else if(Isosceles)
            bw.write("Isosceles");
        else if(Scalene)
            bw.write("Scalene");
            
        bw.flush();
	}
}
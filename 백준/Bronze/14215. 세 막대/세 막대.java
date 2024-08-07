import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    
	public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        
        Integer length[]=new Integer[3];
        
        for(int i=0;i<3;i++){
            length[i]=s.nextInt();
        }
        
        Arrays.sort(length, Collections.reverseOrder());
        
        if(length[0]<length[1]+length[2])
            System.out.println(length[0]+length[1]+length[2]);
        else
            System.out.println(length[1]+length[2] + length[1]+length[2] -1   );

	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
        //x,y 좌표의 최소 최대값 변수 
        int minx,maxx,miny,maxy;
        
        
        String input;
        String[] parts;

	    
	    int loop=Integer.parseInt(br.readLine());
	    
	    for(int i=0;i<loop;i++){
	        input = br.readLine();
	        

	        parts=input.split(" ");
	        
	        int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            
            
	        x.add(num1 );
	        y.add(num2 );

	    }
	    minx=x.get(0);
	    maxx=x.get(0);
	    miny=y.get(0);
	    maxy=y.get(0);
	    
	    for(int i=1;i<loop;i++){
	       if(x.get(i)<minx)
	            minx=x.get(i);
	       if(x.get(i)>maxx)
	            maxx=x.get(i);
	            
	       if(y.get(i)<miny)
	            miny=y.get(i);
	       if(y.get(i)>maxy)
	            maxy=y.get(i);
	           
	        
	    }
		if(loop == 1 )
		    bw.write(String.valueOf(0)); 
	    else
	        bw.write(String.valueOf( (maxx-minx) * (maxy-miny) ));
	        
        bw.flush();
	   
	}
}
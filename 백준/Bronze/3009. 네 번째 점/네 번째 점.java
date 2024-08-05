
import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
	    int x[]=  new int[2];
	    int y[]=  new int[2];
	    int midx=0;
	    int midy=0;
	    int resultx=0;
	    int resulty=0;
	    
	    boolean nextxRes=false;
	    boolean nextyRes=false;
	    
	    x[0]= in.nextInt();
	    y[0]= in.nextInt();
	    
		

	    
        midx=in.nextInt();
        midy=in.nextInt();
	      
	    if(midx!=x[0])
	      x[1]=midx;
	      else nextxRes=true;
        if(midy!=y[0])
	      y[1]=midy;  
	      else nextyRes=true;
        
        midx=in.nextInt();
        midy=in.nextInt();
        
        if(nextxRes)
            resultx=midx;
        else{
            if(midx==x[0])
    	      resultx=x[1];
    	    else resultx=x[0];
        }
        
        if(nextyRes)
            resulty=midy;
        else{
            if(midy==y[0])
    	      resulty=y[1];
    	    else resulty=y[0];
        }
	   
		System.out.print(resultx+" "+resulty);
	}
}
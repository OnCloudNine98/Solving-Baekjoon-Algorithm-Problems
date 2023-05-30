import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        String  crd[][]=new String[20][3];
        float tot_cnt=0;						//총학점
        float tot_crd=0;						//학점 의 총합
        
        
        for(int i=0; i<crd.length;i++){			//각 열을 문자열 배열에 입력
        	crd[i][0]=s.next();
        	crd[i][1]=s.next();
        	crd[i][2]=s.next();
	        }
        for(int i=0; i<crd.length;i++) {     	//학점의 등급을 수치화 시켜 각각 대입
		        switch(crd[i][2]) {
		        case "A+"	: crd[i][2]="4.5";
		        	break;
		        case "A0"	: crd[i][2]="4.0";
		        	break;
		        case "B+"	: crd[i][2]="3.5";
		        	break;
		        case "B0"	: crd[i][2]="3.0";
		        	break;
		        case "C+"	: crd[i][2]="2.5";
		        	break;
		        case "C0"	: crd[i][2]="2.0";
		        	break;
		        case "D+"	: crd[i][2]="1.5";
		        	break;
		        case "D0"	: crd[i][2]="1.0";
		        	break;
		        case "F"	: crd[i][2]="0.0";
		        	break;
		        case "P"	:   crd[i][1]="0.0";
		        			
		        				crd[i][2]="0.0";
		        	break;	       
	        	
        	}
        }
        
        for(int i=0; i<crd.length;i++){
        		tot_cnt+=Float.valueOf(crd[i][1]);
        		tot_crd+=Float.valueOf(crd[i][1])*Float.valueOf(crd[i][2]);
        	}
        System.out.println( String.format("%,.6f",tot_crd/tot_cnt ) );
   
        
    }
}
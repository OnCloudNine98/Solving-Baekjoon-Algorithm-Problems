import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
         ArrayList inp_arr=new ArrayList();		//Arraylist선언
         
         while(true) {
        	 int inp=s.nextInt();
        	 if(inp==-1)
        		 break;
        	 else 
        		 inp_arr.add(inp);
         }
        	 
         for(int i=0;i<inp_arr.size();i++) {
        	ArrayList aliquot_arr=new ArrayList();					//약수 배열
        	int sum=0;												//약수들의 총합
        	for(int j=1; j<=(int)inp_arr.get(i)-1 ; j++)
        		if((int)inp_arr.get(i)%j==0) {						//약수들을 약수 배열에 넣는 for문
        			 aliquot_arr.add(j);
        			 sum+=j;
        		 	}
        	
        	
        	
        	if(sum==(int)inp_arr.get(i)) {							//입력값이 완전수의 경우
        		System.out.print(inp_arr.get(i)+" = ");				//완전수의 약수들을 출력하는 반복문
        		for(int k=0;k<aliquot_arr.size();k++) {
        			if(k!=aliquot_arr.size()-1)
        				System.out.print(aliquot_arr.get(k)+" + ");
        			else 
        				System.out.print(aliquot_arr.get(k));
        		}
        	}
         
        	else
        		System.out.print(inp_arr.get(i)+" is NOT perfect.");
        				
        				
        	System.out.println();
         }
         
    }
}
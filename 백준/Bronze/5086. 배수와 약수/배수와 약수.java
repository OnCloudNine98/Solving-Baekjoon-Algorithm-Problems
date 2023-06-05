import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
         ArrayList arr=new ArrayList();
         

         int idx=0;				//일종의 index 선언
         
         while(true) {
        	 int inp1=s.nextInt();		//값을 두개 받음
        	 int inp2=s.nextInt();
        	 
        	 
        	 if(inp1!=0 && inp2!=0)		//입력값이 0인지 확인해서 대입 ,인덱스 증가
        	 {
        		 arr.add(inp1);
        		 arr.add(inp2);
        		 idx+=2;
        	 }
        	 else{
        		 arr.add(inp1);
        		 arr.add(inp2);
        		 break;
        	 }
        		
         }
        
        
         for(int i=0; i< idx ; i+=2) {	//배수,약수 따지는 반복 if문
        	 if((int)arr.get(i) % (int)arr.get(i+1)==0)
        		 System.out.println("multiple");
        	 else if((int)arr.get(i+1) % (int)arr.get(i)==0)
        		 System.out.println("factor");
        	 else
        		 System.out.println("neither");
         }
         
    }
}
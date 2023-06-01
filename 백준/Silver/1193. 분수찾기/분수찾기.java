import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
       int X=s.nextInt();	//첫줄 X 입력
       
       int a,b;			//분자a , 분모b 변수
       
       int r=1;				//대각선 열 번호
       int mid=0;			//분자+분모값 변수
       
       while(true) {		
    	   if(r*(r+1)/2 <X)
    		   r++;
    	   else break;
       }
       
       X=X-(r-1)*r/2;  		//대각선 열에서의 순서    
       mid=r+1;				//각 열 의 합
       
       if(mid%2==0){
    	   b=X;
    	   a=mid-b;
       }else {
	       a=X;
	       b=mid-a;
       }
       System.out.println(a+"/"+b);
       
       
       
    }
}
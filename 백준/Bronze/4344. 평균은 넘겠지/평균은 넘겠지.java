import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int c= s.nextInt();			//c 값 입력;
        
        int scr[][]= new int[c][];		//점수 배열;
        
        int n=0;					//n 값 선언;
        
        int avg[]= new int[c];		//각열 의 점수의 평균
        int cnt[]= new int[c];		//각열 의 평균을 넘는 수 카운트
        
        for(int i=0;i<c;i++) {		   	
        	n = s.nextInt();		//n 을 입력해줘     	
        	scr[i]=new int[n];
        	for(int j=0;j<n;j++) {
        		scr[i][j]=s.nextInt();	//n횟수 만큼 점수배열에 점수를 입력하고
        		avg[i]+=scr[i][j];		//avg배열에 점수의 합들을 대입
        		}
        	}
        for(int i=0; i<avg.length;i++) 
        	avg[i] /= scr[i].length;	//avg 배열에 각각의 평균을 대입
        	
        
        for(int i=0;i<c;i++) {
        	for(int j=0;j<scr[i].length;j++) {
        		if(scr[i][j] >avg[i])	//각 열마다 평균이 넘는 개수를 구하는 배열
        			cnt[i]+=1;
        		}	
        	}
        	
        for(int i=0;i<c;i++) {
        	float mid=(float)cnt[i]/ scr[i].length *100;
        	System.out.println( String.format("%.3f", mid) +"%");
        	
        	}
        
    }
}
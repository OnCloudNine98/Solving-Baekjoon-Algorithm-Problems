import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int paper[][]=new int[100][100];	//도화지 배열 선언
        
        int cnt= s.nextInt();	//색종이 수 카운트
        
        int colPap[][]= new int[cnt][2];	//색종이 죄측 하단 좌표
        
        int col=0;				//색칠된 부분 넓이 개수
       
        for(int i=0;i< colPap.length;i++) {	//색종이 좌표 입력
        	colPap[i][0]=s.nextInt();		//행
        	colPap[i][1]=s.nextInt();		//열
        	}
        
        
        for(int i=0;i< colPap.length;i++) {						//paper 배열값이 1인것들의 개수
        	for(int j=colPap[i][0];j<colPap[i][0]+10;j++)
        		for(int k=colPap[i][1];k<colPap[i][1]+10;k++)
        			if(++paper[j][k]==1)
            			col++;
        
        	}
        
        		
        
        System.out.println(col);
        			
    }
}
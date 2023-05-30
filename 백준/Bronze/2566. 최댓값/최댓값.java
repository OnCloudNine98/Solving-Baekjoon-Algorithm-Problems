import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);

        int board[][] = new int[9][9];
        int bigg=0;								//최고 값 저장 변수
        
        int h=0,y=0;							//값이 제일 클때의 행열 정보 값
        
        for(int i=0; i<board.length;i++)
        	for(int j=0; j<board[i].length;j++)
        		board[i][j]=s.nextInt();
        
        bigg=board[0][0];
        		
        for(int i=0; i<board.length;i++)		//배열의 각 수중 가장 큰수와 그때의 행과열을 구하는 반복문
        	for(int j=0; j<board[i].length;j++) 		
        		if(bigg<=board[i][j]) {
        			bigg=board[i][j];
        			h=i;
        			y=j;
        			
        		}
        System.out.println(bigg);	
        System.out.println( (h+1)+" "+(y+1) );
        	
    }
}
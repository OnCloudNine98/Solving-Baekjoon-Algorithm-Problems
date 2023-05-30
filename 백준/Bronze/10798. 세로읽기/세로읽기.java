import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);

        int row=5;							//총 입력 줄개수
        
        Integer row_cnt[]= new Integer[5];			//문자열 최대 개수 구하기 위한 문자열 바열
        int big_row_cnt=0;
        
        
        String board[] = new String[row];			//문자열 입력할 배열 선언
        
        for(int i=0;i<row;i++)						//각 행을 문자열 배열에 입력
        	board[i]=s.nextLine();
        
        
        
        for(int i=0;i<row;i++)								//가장 긴 문자열의 개수 구하기
        	row_cnt[i]=board[i].length();
        
        Arrays.sort( row_cnt, Collections.reverseOrder());	//배열의 개수를 정렬
        
        big_row_cnt=row_cnt[0];								//가장 긴 문자열 개수 를 변수에 대입
        

			
		
        for(int i=0;i<big_row_cnt;i++)						//문자열을 세로로 출력하는 반복문
        	for(int j=0;j<row;j++)							
        		if(i>=board[j].length() )					//빈문자열은 비교 할수 없으므로continue로 스킵
        			continue;
        		else
        			System.out.print(board[j].charAt(i));

        
    }
}
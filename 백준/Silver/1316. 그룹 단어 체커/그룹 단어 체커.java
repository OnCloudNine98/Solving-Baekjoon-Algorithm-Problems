import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        int inp = s.nextInt();					//N 입력      
        String str[] = new String[inp];			//문자열들을 담을 배열 선언
        char ch[][] = new char[inp][];		//문자열들의 문자를 넣어줄 배열
        
        int cnt=0; 								//그룹 단어 개수 초기화
        
        
        
        
        
        for(int i=0; i<str.length;i++)			//문자열 입력
            str[i]=s.next();		
        
        for(int i=0; i<str.length;i++)			//각 문자열의 개수 만큼
        	ch[i]=new char[str[i].length()];	//문자 배열을 비정방배열 로 선언
        
        
        
        
        
        for(int i=0; i<str.length;i++)			
        	for(int j=0; j<str[i].length();j++)
        		ch[i][j]=str[i].charAt(j);
        

        
        for(int i=0; i<ch.length;i++) {				//문자열 입력
        	boolean grp=true;						//그룹 단어 인지 나타내는 변수
            if(ch[i].length==1 || ch[i].length==2)	//문자열의 길이가 1이나 2이면 그룹 단어 취급
            	cnt++;
            
            else {
            	
            	for(int j=2; j<ch[i].length;j++) {		
            		if(ch[i][j]!=ch[i][j-1] ) {			//ch[i][2] 부터 ch[i][끝 index] 까지
            			for(int k=0 ; k<j-1 ;k++) {		//하나 하나씩 전전 인덱스랑 값을 비교하여 같은 값이 나오면 grp=false
            				if(ch[i][j]==ch[i][k]) {
            					grp=false;
            					break;
            				}
            			}
            		}	        			           			
          		           		
            	}
            	
            	if(grp==true) 
    				cnt++;
    			else
    				continue;
 
            	
            }
           	
        	grp= true;
        }
        
        
        
        System.out.println(cnt);
   
        
    }
}
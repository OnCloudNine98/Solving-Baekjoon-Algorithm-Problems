// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		int width = (w-x>=x) ? x : w-x;
		int height = (h-y>=y)? y : h-y;
		
		int result =  (height >= width) ?  width  : height;
		System.out.print(result);
	}
}
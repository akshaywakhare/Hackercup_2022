package Qualifying;
import java.util.*;
import java.io.*;
public class b1 {
// For fast input output
static class FastReader {
BufferedReader br;
StringTokenizer st;
public FastReader()
{ try {br = new BufferedReader(
new FileReader("input.txt"));
PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
System.setOut(out);}
catch(Exception e) { br = new BufferedReader(new InputStreamReader(System.in));}
}
String next()
{
while (st == null || !st.hasMoreElements()) {
try {st = new StringTokenizer(br.readLine());}
catch (IOException e) {
e.printStackTrace();}
}
return st.nextToken();
}
int nextInt() { return Integer.parseInt(next()); }
long nextLong() { return Long.parseLong(next()); }
double nextDouble() {return Double.parseDouble(next()); }
String nextLine()
{
String str = "";
try {
str = br.readLine();
}
catch (IOException e) {
e.printStackTrace();
}
return str;
}
}
// end of fast i/o code
public static void main(String[] args) {
FastReader sc = new FastReader();
int t = sc.nextInt();
// System.out.println(t);
int m=1;
while (t-- > 0)
{ 	//System.out.println ("cc");
	int r = sc.nextInt ();
	int c = sc.nextInt ();
	   String[][] arr = new String[r][c];
	// String ss = sc.nextLine ();
	int ans = 0;

	for (int i = 0; i < r; i++)
	  {
	    String line = sc.nextLine ();
		// System.out.println(line); 
	      String[] s = line.split ("");
	    for (int j = 0; j < c; j++)
	      {
		arr[i][j] = s[j];
		if (arr[i][j].equals ("^"))
		  ans++;


	      }

	  }
	if ((c == 1 || r == 1) && ans >= 1)
	  {
	    System.out.println ("Case #" + m + ": Impossible");
	  }
	else
	  {
	    System.out.println ("Case #" + m + ": Possible");
	    if (ans == 0)
	      {
		for (int i = 0; i < r; i++)
		  {
		    for (int j = 0; j < c; j++)
		      {
			System.out.print (arr[i][j]);
		      }
		    System.out.println ();

		  }
	      }
	    else
	      {
		for (int i = 0; i < r; i++)
		  {
		    for (int j = 0; j < c; j++)
		      {
			System.out.print ("^");
		      }
		    System.out.println ();

		  }

	      }
	  }
      
  
  m++;

}
}
}
package Qualifying;
import java.util.*;
import java.io.*;
public class b2 {
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
int m=1;
while (t-- > 0)
{
	int r = sc.nextInt ();
	int c = sc.nextInt ();
	  String[][] arr = new String[r][c];
 	int ans = 0;

	for (int i = 0; i < r; i++)
	  {
	    String line = sc.nextLine ();
	      String[] s = line.split ("");
	    for (int j = 0; j < c; j++)
	      {
		arr[i][j] = s[j];
		if (arr[i][j].equals ("^")){
		  ans++;}  
	      }

	  }
	  
	  
	if ((c == 1 || r == 1) && ans >= 1)
	  {
	    System.out.println ("Case #" + m + ": Impossible");
	  }
	else
	  {
	    
	    if (ans == 0)
	      {System.out.println ("Case #" + m + ": Possible");
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
	          String[][] brr= new String[r][c];
	          
	           for (int i = 0; i < r; i++)
		  {
		    for (int j = 0; j < c; j++)
		      {
		 if(arr[i][j].equals("."))brr[i][j]="^";
		 else brr[i][j]=arr[i][j]; 
			   }
		    

		  }
	          
	          
	          boolean f=true;
	          for (int i = 0; i < r; i++)
		  {
		    for (int j = 0; j < c; j++)
		      {
		    	if(brr[i][j].equals("^")){
		    	    if(! check(i,j,brr)){ 
                    if(!arr[i][j].equals("^")){brr[i][j]=".";j=-1;i=0;}
                    else{ f=false;break;}
			}}
// 			System.out.print(i+""+j+" ");
			   }
		    

		  } 
	          
	          
	    if(f){System.out.println ("Case #" + m + ": Possible");
	    for (int i = 0; i < r; i++)
		  {
		    for (int j = 0; j < c; j++)
		      {
			System.out.print (brr[i][j]);
		      }
		    System.out.println ();

		  }}          
		else{ System.out.println ("Case #" + m + ": Impossible");}

	      }
	  }
      
  
  m++;
} }
public static boolean check(int i,int j,String[][] a){
    int c=0;
    if(i!=0&&a[i-1][j].equals("^"))c++;
     if(j!=0&&a[i][j-1].equals("^"))c++;
      if(i!=a.length-1&&a[i+1][j].equals("^"))c++;
       if(j!=a[0].length-1&&a[i][j+1].equals("^"))c++;
 
     return c>1;
 }


}

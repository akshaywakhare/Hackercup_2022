package Qualifying;
 import java.util.*;
 import java.io.*;
 public class a {
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
 while (t-- > 0) {
    int n = sc.nextInt ();
	int k = sc.nextInt ();
	int[] arr = new int[n];
	  Set < Integer > a = new HashSet <> ();
	  Set < Integer > b = new HashSet <> ();

	for (int i = 0; i < n; i++)
	  {
	    arr[i] = sc.nextInt (); 
	  }
    
   	boolean f = sol(arr,0,a,b,k);
	if (f)
	  System.out.println ("Case #" + m + ": YES");
	else
	  System.out.println ("Case #" + m + ": NO");
	m++;  }
 }
 public static boolean sol(int[] arr,int i,Set<Integer> a,Set<Integer> b,int k){
    if(i>=arr.length)return true;
     int c = arr[i];
  if (a.contains (c))
        {
      if (b.contains (c) || b.size () >= k)
        {
        return false;
        }
      else  { b.add (c);
             return sol(arr,i+1,a,b,k); }
        }
else if (b.contains (c))
        {
      if (a.contains (c) ||a.size () == k)
        {
        return false;
        }
      else  { a.add (c);
             return sol(arr,i+1,a,b,k); }
        }
else {boolean f=false;
  if(a.size()<k){ a.add (c);
  f=f||sol(arr,i+1,a,b,k);  
   a.remove(c);}
   
   if(b.size()<k){ b.add (c);
    f=f||sol(arr,i+1,a,b,k);
        b.remove(c);}
             return f;
        }

}
 }
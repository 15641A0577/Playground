import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       LinkedHashSet<String> hs =new   LinkedHashSet<String>();
        String month=br.readLine();
      String[] arr=month.split(",");
      for(int i=0;i<arr.length;i++)
      {
        hs.add(arr[i]);
      }
       System.out.println(hs);
    }
}
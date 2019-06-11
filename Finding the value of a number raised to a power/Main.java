import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base= sc.nextInt();
         int exp = sc.nextInt();
      int count=0,res=1;
      while(count<exp)
      {
        res=res*base;
        count++;
      }
      
      System.out.println(res);
    }
}
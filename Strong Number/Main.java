import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int original_num=num;
      int sum=0;
      while(num>0)
      {
        int last_digit=num%10;
        int fact=1;
        for(int i=1;i<=last_digit;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        num=num/10;
      }
      if(original_num==sum)
      {
        System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }
      
	}
}
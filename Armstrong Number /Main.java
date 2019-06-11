import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      /*int copy_number=num;
      int digit_count=0;
      if(num==0)
      {
      System.out.println(num);
	  }
      else
      {
        while(num > 0)
        {
          digit_count++;
          num=num/10;
        }
      }
      num=copy_number;
      int sum=0;
      int pow=1;
      while(num>0)
      {
        int rem=num%10;
        for(int i=1;i<=digit_count;i++)
        {
          pow=pow*rem;
        }
        sum=sum+pow;
        pow=1;
        num=num/10;
      }
      if(sum==copy_number)
      {
        System.out.println("Armstrong number");
      }
      else
      {
           System.out.println("Not a Armstrong number");   
      }*/
      int temp;
      int total=0;
      int  number = num;
      for(;number!=0;number/=10)
      {
        temp=number%10;
        total=total+temp*temp*temp;
        
      }
      if(total==num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
   
    }
}
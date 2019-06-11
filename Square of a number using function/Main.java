import java.util.Scanner;
class Main
{
  public static int squares_of_num(int m)
  {
    int squ_of_num=m*m;
    return squ_of_num;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int output=squares_of_num(n);
      System.out.println(output);
	} 
}
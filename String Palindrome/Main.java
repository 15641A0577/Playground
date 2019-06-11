import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
      //String str2 = scan.nextLine();
        //StringBuilder sb = new StringBuilder(str);
        int str_len = str.length();
        // Reverse a given string
        int end=str_len-1;
      int front=0;
      boolean is_palindrome=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          is_palindrome=false;
          break;
        }
        front++;
        end--;
      }
      if(is_palindrome==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
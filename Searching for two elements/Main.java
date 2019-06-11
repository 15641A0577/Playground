import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        // Get the size of an array
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        int search_ele1=in.nextInt();
       int search_ele2=in.nextInt();
       int ele_1_indx=-1;
       int ele_2_indx=-1;
        for(int i = 0; i <= arr_size - 1; i++)
        {
            if(search_ele1 == arr[i])
            {
                ele_1_indx = i;
            }
          if(search_ele2 == arr[i])
            {
                ele_2_indx = i;
            }
        }
        System.out.println(ele_1_indx);
        System.out.println(ele_2_indx);
    }
    }
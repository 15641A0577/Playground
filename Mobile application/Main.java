class MyModel1 
{
  int CameraPixels =2;
  int displaySize= 5;
  public  MyModel1()
  {
    System.out.println("Features of MyModel 1");
      System.out.println("Camera mega pixels: "+CameraPixels);
  }  
}
class MyModel2 extends MyModel1 
{
     int CameraPixels = 5;
   String lock="Fingerprint";
  public  MyModel2()
  {
    System.out.println("Features of MyModel 2");
      System.out.println("Camera mega pixels: "+CameraPixels);
        System.out.println("Lock mechanism: "+lock);
          System.out.println("Display size: "+displaySize);
  }  
  
}
class MyModel2T extends MyModel2 
{
     int CameraPixels = 16;
  int displaySize=6;
  public  MyModel2T()
  {
    System.out.println("Features of MyModel 2T");
      System.out.println("Camera mega pixels: "+CameraPixels);
       System.out.println("Lock mechanism: "+lock);
          System.out.println("Display size: "+displaySize);
  }  
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel2T mobile=new MyModel2T();
    }
}
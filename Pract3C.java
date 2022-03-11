public class Pract3C {
  public static void main(String args[])
  {
    int num[] = new int[]{10,20,30,5};
    int small = num[0];
    int large = num[0];
    for(int i=0; i<num.length; i++)
    {
        if(large<num[i])
        {
        large = num[i];
    }
    else{
        small = num[i];
    }
}
    System.out.println("Largest Number are:" + large);
    System.out.println("Smallest number are: " + small);
    }
}
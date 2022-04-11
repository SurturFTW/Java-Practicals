public class Pract6C{
  public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};

    System.out.println("Matrix A:");
    for (int i=0;i<3;i++){
      System.out.print(" ");
      for(int j=0;j<3;j++){
        System.out.print(" "+a[i][j]+" ");
        }
        System.out.println();
      }

      System.out.println("Matrix B:");
        for (int i=0;i<3;i++){
          System.out.print(" ");
          for(int j=0;j<3;j++){
            System.out.print(" "+b[i][j]+" ");
          }
        System.out.println();
        }

        System.out.println("Matrix Multiplication:");
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
              c[i][j]= c[i][j]+a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+" "); 
        }
       System.out.println();
      } 
  }
}

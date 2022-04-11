class matrix{
  public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};
    System.out.print("Matrix A:");

    for (int i=0;i<3;i++){
      System.out.println(" ");
      for(int j=0;j<3;j++){
        System.out.print(" "+a[i][j]+" ");
        }
      }
      System.out.println();

      System.out.print("Matrix B:");
      for (int i=0;i<3;i++){
        System.out.println(" ");
        for(int j=0;j<3;j++){
          System.out.print(" "+b[i][j]+" ");
        }
      }
      System.out.println();

    int c[][]=new int[3][3];
    System.out.println("Matrix Addition:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        c[i][j]=a[i][j]+b[i][j];
        System.out.print(c[i][j]+"  "); 
        }
        System.out.println();
    }
  }
}

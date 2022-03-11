import java.util.*;

class Pract6B{
  public void show(int m[][]){
    for(int i = 0; i<3; i++){
      System.out.println(" ");
      for (int j = 0; j<3; j++){
        System.out.print("  " + m[i][j] + "  ");
      }
    }
    //System.out.println("_____________________");
  }

  public void add(int m1[][], int m2[][]){
    for(int i = 0; i<3; i++){
      System.out.println(" ");
      for(int j = 0; j<3; j++){
        System.out.print("  " + (m1[i][j] + m2[i][j]) + "  ");
      }
    }
    //System.out.println("_____________________");
  }
  public static void main(String[] args) {
    int matrix1[][] = new int [3][3];
    int matrix2[][] = new int [3][3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i<3; i++){
      for(int j = 0; j<3; j++){
        System.out.println("Matrix 1" + "[" + (i+1) + "]" + "[" + (j+1) + "] = ");
        matrix1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i<3; i++){
      for(int j = 0; j<3; j++){
        System.out.println("Matrix 2" + "[" + (i+1) + "]" + "[" + (j+1) + "] = ");
        matrix2[i][j] = sc.nextInt();
      }
    }
    
    Pract6B m1 = new Pract6B();
    m1.show(matrix1);
    m1.show(matrix2);
    m1.add(matrix1, matrix2);
  }
}
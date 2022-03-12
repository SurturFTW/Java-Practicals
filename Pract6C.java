import java.util.*;

class Pract6C{
  public void show(int m[][]){
    for(int i = 0; i<3; i++){
      System.out.println(" ");
      for (int j = 0; j<3; j++){
        System.out.print("  " + m[i][j] + "  ");
      }
    }
    System.out.println("\n_____________________");
  }

  public void mul(int m1[][], int m2[][]){
    int m[][] = new int[3][3];
    for(int i = 0; i<3; i++){
      for(int j = 0; j<3; j++){
        for (int k = 0; k<3; k++){
          m[i][j] += (m1[i][k] * m2[k][j]);
        }
      }
    }
    for(int i = 0; i<3; i++){
      System.out.println(" ");
      for (int j = 0; j<3; j++){
        System.out.print(" " + (m[i][j]) + " ");
      }
    }
    System.out.println("\n_____________________");
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
    
    Pract6C m1 = new Pract6C();
    System.out.println("Matrix 1 : ");
    m1.show(matrix1);
    System.out.println("Matrix 2 : ");
    m1.show(matrix2);
    System.out.println("Matrix After Multiplication : ");
    m1.mul(matrix1, matrix2);
  }
}
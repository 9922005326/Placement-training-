import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[][] arr1= new int[3][3];
        int[][] arr2= new int[3][3];
        int[][] temp= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<3; j++){
                temp[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}

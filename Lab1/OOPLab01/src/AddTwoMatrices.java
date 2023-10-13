// Exercise 6.6
import java.util.Scanner;

public class AddTwoMatrices {	   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Size of matrix
        System.out.print("Enter matix size (m x n): ");
        int m = keyboard.nextInt();
        int n = keyboard.nextInt();

        // Matrix 1
        int[][] iMatrix1 = new int[m][n];
        System.out.println("Enter matrix 1: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("M1[%d][%d] = ", i, j);
                iMatrix1[i][j] = keyboard.nextInt();
            }
        }

        // Matrix 2
        int[][] iMatrix2 = new int[m][n];
        System.out.println("Enter matrix 2: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("M2[%d][%d] = ", i, j);
                iMatrix2[i][j] = keyboard.nextInt();
            }
        }

        // Calculate sum of two matrices
        int[][] iSum= new int[m][n];
        for(int i=0; i<m; i++) {
        	for (int j=0; j<n; j++)
        		iSum[i][j] = iMatrix1[i][j] + iMatrix2[i][j];
        }
        
        // Show matrix 1
        System.out.println("Matrix 1: ");
        for (int i=0; i < iMatrix1.length; i++) {
            for (int j=0; j < iMatrix1[i].length; j++) {
                System.out.print(iMatrix1[i][j] + " ");
            }
            System.out.println();
        }

        // Show matrix 2
        System.out.println("Matrix 2: ");
        for (int i=0; i < iMatrix2.length; i++) {
            for (int j=0; j < iMatrix2[i].length; j++) {
                System.out.print(iMatrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Show sum
        System.out.println("Sum of 2 matrices: ");
        for (int i=0; i < iSum.length; i++) {
            for (int j=0; j < iSum[i].length; j++) {
                System.out.print(iSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
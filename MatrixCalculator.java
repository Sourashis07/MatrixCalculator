import java.util.Scanner;

public class MatrixCalculator{

    public static void readMatrix(int[][] matrix, Scanner sc, String name) {
        System.out.println("Enter elements of Matrix " + name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, String name) {
        System.out.println("Matrix " + name + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        readMatrix(A, sc, "A");
        readMatrix(B, sc, "B");

        printMatrix(A, "A");
        printMatrix(B, "B");

        int[][] sum = add(A, B);
        int[][] diff = subtract(A, B);
        int[][] product = multiply(A, B);

        System.out.println("Enter Code: 1. Add 2.Subsctraction 3.Multiplication");
        int option=sc.nextInt();
        switch (option) {
            case 1 -> printMatrix(sum, "A + B");
            case 2 -> printMatrix(diff, "A - B");
            case 3 -> printMatrix(product, "A x B");
            default -> {
                System.out.println("Wrong Option Selected");;
            }
        }
        sc.close();
    }
}

//Created because i was bored! Lol. Enjoy :)

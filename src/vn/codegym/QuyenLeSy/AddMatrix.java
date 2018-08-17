package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Nhập vào kích thước của ma trận: ");
        size = scanner.nextInt();

        double[][] matrix1 = new double[size][size];
        double[][] matrix2 = new double[size][size];
        double[][] matrix3 = new double[size][size];

        System.out.println("Nhập vào danh sách phẩn tử của ma trận 1: ");
        Input(matrix1, scanner);

        System.out.println("Nhập vào danh sách phẩn tử của ma trận 2: ");
        Input(matrix2, scanner);

        //Cộng 2 ma trận lại với nhau
        for (int row = 0; row < matrix3.length; row++)
        {
            for (int column = 0; column < matrix3[row].length; column++)
            {
                matrix3[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        System.out.println("Ma trận thứ nhất là: ");
        Output(matrix1);
        System.out.println("Ma trận thứ hai là: ");
        Output(matrix2);
        System.out.println("Tổng ma trận một và hai là: ");
        Output(matrix3);


    }

    public static void Input(double[][] matrix, Scanner scanner){
        for (int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                System.out.print("matrix["+row+"]["+column+"] = ");
                matrix[row][column] = scanner.nextDouble();
            }
        }
    }


    public static void Output(double[][] matrix){
        for (int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                System.out.print(matrix[row][column] + "\t\t");
                if(column == (matrix.length - 1))
                {
                    System.out.println("\n");
                }
            }
        }
    }
}

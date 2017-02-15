package src.java02.less02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
        final int MATRIX_SIZE = 4;
        strToMatrix(s);
        int[][] mtrx;
        mtrx = strToMatrix(s);
        actionsOnTheElements(mtrx);
        try{
            if(strToMatrix(s).length == MATRIX_SIZE){
                System.out.println("Размерность матрицы задана верно!");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неверно задана размерность матрицы, или количество элементов!");
            e.printStackTrace();
        }

    }

    public static int[][] strToMatrix(String str){
        String[] tmp = str.split("\n");
        String[][] strArr = new String [4][];
        for (int i = 0; i < tmp.length; i++) {
            strArr[i] = tmp[i].split(" ");
        }
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println();
        }
        int matrix[][] = new int[strArr.length][strArr.length];
        for (int i = 0; i < strArr.length ; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                matrix[i][j] = Integer.parseInt(strArr[i][j]);
            }
        }

        return matrix;
    }

    public static int actionsOnTheElements(int [][] matrix){
        int sum = 0;
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        result = sum/2;
        System.out.println(result);
        return result;
    }
}

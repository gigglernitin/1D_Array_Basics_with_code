// TWOD_ARRAYS

import java.util.*;
import java.lang.*;
import java.io.*;


class Two_D_Arrays
{
    public static void largestSmallest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell "+ i + ","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top 
            for(int j=startCol; j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // Representation of 2D ArrayStoreException
        int matrix [][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        largestSmallest(matrix);
        // Spiral matrix
        printSpiral(matrix);

    }
}

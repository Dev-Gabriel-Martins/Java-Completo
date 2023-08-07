package Matrixs;
import java.util.*;

public class matrix1 {
    public static void main(String args[]){
        var sc = new Scanner(System.in);

        System.out.println("Enter array order");
        int n = sc.nextInt();

        int [][]matx = new int[n][n];
        
        int countNegNum = 0;

        System.out.println("Enter array value: ");
        for (int i=0; i < n; i++){
           for(int j=0; j <n; j++){
                int value = sc.nextInt();    
                    matx[i][j] = value;
                    if(value < 0){
                        countNegNum++;
                    }
            }
        }
        
        System.out.println("Diagonal matriz: ");            
         for (int i=0; i < n; i++){
           for(int j=0; j <n; j++){
            if(i == j){
                System.out.print(matx[i][j]);
            }    
            
            }   
                   
        }
        System.out.println();
        System.out.println("Numbers negatives: " + countNegNum + " ");

        System.out.println("Matrix result: ");            
         for (int i=0; i < n; i++){
            System.out.println();
           for(int j=0; j <n; j++){
                System.out.print( " " + matx[i][j]+ " ");
            }   
                   
        }
    
    }
}

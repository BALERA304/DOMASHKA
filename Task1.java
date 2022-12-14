import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt();
        int y = sca.nextInt();
        twoArray(x,y, sca);
    }
    
    public static void twoArray(int x,int y, Scanner sc){
        int [][] arr = new int[x][y];
        for (int i = 0;i<x;i++){
            for (int k =0;k < y;k++){
                arr[i][k] = sc.nextInt();
            }
        }
        
        
        System.out.println("Двухмерный массив twoArr:  " + Arrays.deepToString(arr)); //Вывод двумерного массива через вспомогательный метод Arrays
    }
}

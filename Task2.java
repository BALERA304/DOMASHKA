import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 4, 8, 7, 5, 6, 3};
        System.out.println("Не отсортированный массив: " + Arrays.toString(unsortedArray)); 
        bubbleSort(unsortedArray); 
    }
    public static void bubbleSort(int [] arrToSort){ 
        int changeCounter; 
        do {
            changeCounter = 0;
            for (int index = 0; index < arrToSort.length - 1; index++) { 
                if (arrToSort[index] > arrToSort[index + 1]){
                    int temp = arrToSort[index]; 
                    arrToSort[index] = arrToSort[index + 1];
                    arrToSort[index + 1] = temp; 
                    changeCounter++; 
                }
            }
        } while (changeCounter > 0); 
        System.out.println("Готовый массив: " + Arrays.toString(arrToSort)); 
    }
}

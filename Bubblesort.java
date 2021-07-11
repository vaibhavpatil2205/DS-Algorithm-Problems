

import java.util.Scanner;

public class Bubblesort {

    private  static Scanner scanner = new Scanner(System.in);
    private static int[] newArray;


    private static int userInput() {
        int input = scanner.nextInt();
        return input;
    }

    private static void bubbleSort() {
        int temp = 0;
        for (int i = 0; i<newArray.length;i++){
            for(int j = 1;j<(newArray.length-i);j++){
                if (newArray[j-1]>newArray[j]){
                    temp = newArray[j-1];
                    newArray[j-1]= newArray[j];
                    newArray[j]=temp;
                }
            }

        }
    }
    private static void printArray() {
        for(int i=0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Bubble Sort Program");
        System.out.println("How many values you want to enter: ");
        int size =userInput();
        newArray = new int[size];
        for (int i =0; i<size; i++){
            System.out.println("Enter the value: ");
            newArray[i]=userInput();
        }

        System.out.println("Elements Before sorting :");
        printArray();
        bubbleSort();
        System.out.println("Elements After sorting :");
        printArray();
    }
}

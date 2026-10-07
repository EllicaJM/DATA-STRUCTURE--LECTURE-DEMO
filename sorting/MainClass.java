/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class MainClass {
    public static void main(String[] args) {
        int[] numbers = {9,12,2,4,5,8,0};
        BubbleSort bubbleSort = new BubbleSort(numbers);
        System.out.print("Original Array: ");
        bubbleSort.print();
        System.out.println();
        bubbleSort.sort();
        System.out.print("\nSorted Array: ");       
        bubbleSort.print();
}
}
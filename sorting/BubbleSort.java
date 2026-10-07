/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class BubbleSort {
    int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void swapped(int index){
            int n =  numbers[index];
            numbers[index] = numbers[index+1];
            numbers[index+1] = n;
    }
    public void print(){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    public void sort(){
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.printf("Iteration: %d\n", + i+1);
            for (int j = 0; j < numbers.length-1; j++) {
                
                System.out.printf("Index %d-> ", j, numbers[j]);
                if (numbers[j] < numbers[j+1]) {
                    swapped(j);
                }
                print();
                System.out.println();
            }
            
        }
    }

}

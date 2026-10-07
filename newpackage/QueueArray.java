/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueArray;

import data.Product;

/**
 *
 * @author User
 */
public class QueueArray {
   private int capacity;
   private final Product[] queue;
   private int front;
   private int rear;
   private int size;
    
    public QueueArray(int capacity){
       this.capacity = capacity;
       this.queue = new Product[capacity];
       this.front = 0;
       this. rear = -1;
       this. size = 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void enqueue(Product product) {
        if(!isFull()) {
            System.out.println("Queue is Full! cannot add: " + product.Name);
        }
        rear = (rear + 1) % capacity;
        queue[rear] = product;
        size++;
        System.out.println("Enqueued" + product.Name);
    }

    private static class Product {

        private String Name;

        public Product() {
        }
    }
}

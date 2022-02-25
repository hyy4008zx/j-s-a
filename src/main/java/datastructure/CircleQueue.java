package datastructure;

import java.util.Scanner;

/**
 * @Author: huyanyang
 * @Date: 2022/02/09/17:19
 * @Description:
 */
public class CircleQueue {
    int front;
    int rear;
    int maxSize;
    int arr[];

    public CircleQueue(int maxSize) {
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear+1)%maxSize  == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int value) throws Exception {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        arr[rear] = value;
        rear=(rear+1)%maxSize;
        System.out.printf("add queue %d\n", value);
    }

    public void getQueue() throws Exception {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        System.out.printf("get queue is arr[%d] = %d\n", front, arr[front]);
        front=(front+1)%maxSize;
    }

    public void headQueue() throws Exception {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        System.out.printf("head queue is %d\n", front);
    }

    public void showQueue() throws Exception {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        System.out.println("my queue data is :");
        for (int i = front; i < front+size(); i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }

    public static void main(String[] args) throws Exception {
        CircleQueue queue = new CircleQueue(3);
        queue.addQueue(3);
        queue.addQueue(2);
//        queue.addQueue(1);
//        System.out.println(queue.rear);
        queue.getQueue();
//        queue.addQueue(2);
        queue.addQueue(3);
        queue.getQueue();
        queue.getQueue();
        queue.addQueue(1);
//        queue.headQueue();
        queue.showQueue();
    }
}
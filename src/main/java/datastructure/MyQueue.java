package datastructure;

/**
 * @Author: huyanyang
 * @Date: 2022/02/09/16:05
 * @Description:
 */
public class MyQueue {

    int front;
    int rear;
    int maxSize;
    int arr[];

    public MyQueue(int maxSize) {
        front = -1;
        rear = -1;
        this.maxSize = maxSize;
        arr=new int[maxSize];
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int value) throws Exception {
        if(isFull()){
            throw new RuntimeException("queue is full");
        }
        rear++;
        arr[rear]=value;
        System.out.printf("add queue %d\n",value);
    }

    public void getQueue() throws Exception {
        if(isEmpty()){
           throw new RuntimeException("queue is empty");
        }
        front++;
        System.out.printf("get queue is arr[%d] = %d\n",front,arr[front]);
    }

    public void headQueue() throws Exception {
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        System.out.printf("head queue is %d\n",front+1);
    }

    public void showQueue() throws Exception {
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        System.out.println("my queue data is :");
        for (int i = front+1; i <=rear ; i++) {
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue(3);
        queue.addQueue(3);
//        queue.addQueue(2);
//        queue.addQueue(1);
        System.out.println(queue.rear);
//        queue.getQueue();
//        queue.getQueue();
        queue.headQueue();
        queue.showQueue();
    }
}

package com.company;

public class queue {
    private int[] data;
    private int front;
    private int end;
    private static final int default_size=10;
    public queue()
    {
        data = new int [default_size];
        front=0;
        end=-1;
    }
    public boolean enqueue(int item)
    {
        if(isfull())
        {
            return false;
        }
        data[++end]=item;
        return true;
    }
    public int dequeue() throws Exception
    {
        if(isempty()){
            throw new Exception("Removing from empty queue");
        }
        return data[front++];
    }
    public void display()
    {
        for (int i = front; i <=end ; i++) {
            System.out.print(data[i]+", ");
        }
        System.out.println("END");
        System.out.println();
    }
    public boolean isempty()
    {
        return front>end;
    }
    public boolean isfull()
    {
        return end==data.length - 1;
    }
}

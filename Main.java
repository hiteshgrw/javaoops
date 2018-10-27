package com.company;

public class Main {

    public static void main(String[] args) {
	queue queue = new queue();
	queue.enqueue(41);
	queue.display();
	queue.enqueue(12);
	queue.display();
	queue.enqueue(51);
	queue.enqueue(49);
	queue.display();
	try
    {
        for (int i = 0; i <6 ; i++) {
            queue.dequeue();
            queue.display();
        }
    }catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
}

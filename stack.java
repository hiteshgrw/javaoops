package com.company;

public class stack {
    private int [] data;
    private int top = -1;
    private static final int default_size = 10;
    public stack(){
        this.data = new int[default_size];
    }
    public boolean push(int item){
        if(isfull()){
            return false;
        }
        data[++top]=item;
        return true;
    }
    public int pop(){
        return data[top--];
    }
    public int top(){
        return data[top];
    }
    public boolean isfull(){
        return top==data.length-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("END");
        System.out.println();
    }

}

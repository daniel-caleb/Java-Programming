/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._10_2023;

/**
 *
 * @author Meshewa
 */

class two{
public void summ(){
System.out.println("Hello from parent");
}
}
class three extends two{
public void summ(){
System.out.println("Hello from Child");
}
}
class four extends three{
public void summ(){
System.out.println("Hello from Child 2");
}
}

public class App {
    
    public static void calc(){
    System.out.println(6+7);
    }
    public static void calc(int x){
    System.out.println(x*x);
    }
    public static void calc(int j,int k){
    System.out.println(j+k);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        calc();
        calc(8);
        calc(5,6);
        two obj1=new two();
        obj1.summ();
        three obj2=new three();
        obj2.summ();
        four obj3=new four();
        obj3.summ();
    }
    
}

package com.company;


interface  shape{
     void area(int d);
     void volume();

}
class sqr implements shape{
    public void area(int d){
        int area = d*d;
    }
    public void volume(){
        System.out.println("This is volume ");
    }
}
public class chw_54_interface {
    public static void main(String[] args) {
        shape r = new sqr();
        r.volume();
    }
}

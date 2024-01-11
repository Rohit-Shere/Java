package com.company;


class Phone{
    public void playMusic(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Phone is on now");
    }
}
class SmartPhone extends Phone{

    public void playVideo(){
        System.out.println("Video is playing now...");
    }
    public void on(){
        System.out.println("SmartPhone is on now");
    }
}
public class chw_49_dynamicMethodsDispatch {
    public static void main(String[] args) {
        Phone obj= new SmartPhone();
        obj.on();
        obj.playMusic();
        SmartPhone m1= new SmartPhone();
        m1.playVideo();
        m1.playMusic();
    }
}

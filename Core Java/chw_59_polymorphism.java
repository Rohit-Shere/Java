package com.company;


interface myCamera {
      void   recordVideo();
      void takeSnap();
       private void greet(){
           System.out.println("Good Morning");
      }
     default void record4kVideo(){
           greet();
         System.out.println("recording video...");
      }

}
interface myWifi2{
    String[] gerNetworks();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(long i){
        System.out.println("Connecting to"+i);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class mySmartPhone extends myCellPhone implements myWifi2,myCamera {
    @Override
    public void recordVideo() {
        System.out.println("recording a normal video...");
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking a snap...");
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }
    public String[] gerNetworks(){
        System.out.println("Getting a list of networks ...");
        String [] networks = {"Rohit ","Ghe Bhava Ghe", "Sumit ", "Pratap","Pradip","Gopal"};
        return networks;
    }

}

public class chw_59_polymorphism {
    public static void main(String[] args) {
//        myCamera a= new mySmartPhone();
//        a.recordVideo();

        mySmartPhone b= new mySmartPhone();
        b.callNumber(87670957);
        b.connectToNetwork("Wifi1");
        b.gerNetworks();
        b.pickCall();
        b.takeSnap();
        b.record4kVideo();

    }
}

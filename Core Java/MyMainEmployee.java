package com.company;

public class MyMainEmployee {
    int id;
    String name;

    MyMainEmployee() {
        id = 19;
        name = "Rohit";
    }

    MyMainEmployee(int myid, String myname) {
        id = myid;
        name = myname;

    }

    MyMainEmployee(int myid) {
        id = myid;
    }

    public void setId(int i) {
        this.id = i;

    }

    public void setName(String k) {
        this.name = k;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

package com.practice.springcore.reference;

public class Ref {
    private int x;
    private B ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public Ref(){
        super();
    }

    @Override
    public String toString() {
        return "Ref{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}

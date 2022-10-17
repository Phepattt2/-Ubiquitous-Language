package com.solid.lsp;

public class Square extends Geometry {

    private int side ;

    Square(int side) {
        this.setSide(side);
    }

    public int getArea(){
        return this.side*this.side ; 
    }
    public int getSide(){
        return this.side ;
    }


    public void setSide(int side) {
        this.side = side ; 
    }
}

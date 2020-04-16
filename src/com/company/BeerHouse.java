package com.company;

public class BeerHouse {

    private int stock;
    private boolean condition = true;
    BeerConsumer beerConsumer;
    BeerProducter beerProducter;

    public BeerHouse(int stock) {
        this.stock = stock;
    }

    //Recibe una birra del productor y la agrega al stock
    public synchronized void receive() {
        while (stock == 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock++;
        System.out.println("Recibimos una entrega, hay: " + stock + " birras en stock.");

    }

    //Le sirve una birra al consumidor y la resta del stock
    public synchronized void serve() {
        if (stock == 0) {
            this.condition = false;
        } else {
            stock--;
            System.out.println("Se le sirvió una birra a un cliente, quedan: " + stock);
            notifyAll();
        }
    }

    public boolean isCondition() {
        return condition;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}

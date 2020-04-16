package com.company;

public class BeerProducter implements Runnable {

    BeerHouse beerHouse;

    public BeerProducter(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    @Override
    public void run() {
        while (beerHouse.isCondition()) {
            try {
                beerHouse.receive();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

}

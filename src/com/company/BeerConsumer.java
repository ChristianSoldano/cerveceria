package com.company;

public class BeerConsumer implements Runnable {

    BeerHouse beerHouse;

    public BeerConsumer(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    @Override
    public void run() {
        while (beerHouse.isCondition()) {
            try {
                beerHouse.serve();
                Thread.sleep(100);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
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

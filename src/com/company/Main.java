package com.company;

/**
 * La cerveceria tiene 100 birras como maximo para entregar
 * El BeerProducter llena el stock de birras, como maximo 100
 * El consumidor consume las birras (nunca para)
 * El sistema debera parar cuando el stock sea 0
 */

public class Main {

    public static void main(String[] args) {

    BeerHouse beerHouse = new BeerHouse(100);
    BeerProducter beerProducter = new BeerProducter(beerHouse);
    BeerConsumer beerConsumer = new BeerConsumer(beerHouse);
    BeerConsumer beerConsumer2 = new BeerConsumer(beerHouse);

    Thread producter = new Thread(beerProducter);
    Thread consumer = new Thread(beerConsumer);
    Thread consumer2 = new Thread(beerConsumer2);

    producter.start();
    consumer.start();
    consumer2.start();





    }


}

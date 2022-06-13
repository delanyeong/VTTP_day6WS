package vttp2022.day06ws;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Deck d = new Deck();
        System.out.println("==== before");
        System.out.println(d);
        d.shuffle();
        System.out.println("==== after");
        System.out.println(d);

        List<Card> cards = d.take(5);
        System.out.println("==== take 5");
        System.out.println(cards);

    }
}

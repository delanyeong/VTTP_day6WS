package vttp2022.day06ws;

import java.util.*;
import java.io.*;

public class Card {


    //implicit static, like a constant
    public enum Suit { Clubs, Diamonds, Hearts, Spades };
    //card names
    public static final String[] CARD_NAMES = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    //value of each card
    public static final int [] CARD_VALUE = {
        1,2,3,4,5,6,7,8,9,10,10,10,10
    };

    private final Suit suit;
    private final String name;
    private final int value;

    public Card(Suit s, String n, int v) {
        suit =s;
        name = n;
        value = v;
    }

    

    
    public Suit getSuit() {
        return suit;
    }
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString () {
        return "%s, %s, %d".formatted(suit,name,value);
    }




    // instance variables
    // String rank;
    // String suit;

    // // methods
    // public static final String[] RANKS = {
    //         null, "Ace", "2", "3", "4", "5", "6", "7",
    //         "8", "9", "10", "Jack", "Queen", "King" };

    // public static final String[] SUITS = {
    //         "Clubs", "Diamonds", "Hearts", "Spades" };

    // // constructor
    // public Card(String rank, String suit) {
    //     this.rank = rank;
    //     this.suit = suit;
    // }

    // public String getRank() {
    //     return rank;
    // }

    // public void setRank(String rank) {
    //     // random rank for loop
    //     int idxr = new Random().nextInt(RANKS.length);
    //     rank = (RANKS[idxr]);
    //     this.rank = rank;
    // }

    // public String getSuit() {
    //     return suit;
    // }

    // public void setSuit(String suit) {
    //     // random suit for loop
    //     int idxs = new Random().nextInt(SUITS.length);
    //     suit = (SUITS[idxs]);
    //     this.suit = suit;
    // }

    // public static String[] getRanks() {
    // return RANKS;
    // }

    // public static String[] getSuits() {
    // return SUITS;
    // }

}

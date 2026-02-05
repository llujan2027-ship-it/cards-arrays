/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardsarrays;

/**
 *
 * @author llujan2027
 */

import java.util.Random;
public class CardsArrays {

    public static void main(String[] args) {
        //deck[suit][rank]
        String[][] deck = new String[4][13];
        
        //Create deck with all 52 cards
        for(int suit = 0; suit < deck.length; suit++){
            //Spades, Hearts, Clubs, Diamonds
            String suitName;
            
            for(int rank = 0; rank < deck[suit].length; rank++){
                //Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
                String rankName;
                
                //Sort by each suit
                switch(suit){
                    case 0 -> {
                        //Descending suit value
                        //Set suit name
                        suitName = "Spades";
                        switch(rank){
                            //Start with 1, go to 13
                            case 0-> {
                                //Set rank name
                                rankName = "Ace";
                                //Initialize array spot
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 1-> {
                                rankName = "Two";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 2-> {
                                rankName = "Three";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 3-> {
                                rankName = "Four";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 4-> {
                                rankName = "Five";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 5-> {
                                rankName = "Six";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 6-> {
                                rankName = "Seven";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 7-> {
                                rankName = "Eight";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 8-> {
                                rankName = "Nine";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 9-> {
                                rankName = "Ten";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 10-> {
                                rankName = "Jack";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 11-> {
                                rankName = "Queen";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 12-> {
                                rankName = "King";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                        }
                    }
                    case 1 -> {
                        suitName = "Hearts";
                        switch(rank){
                            case 0-> {
                                rankName = "Ace";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 1-> {
                                rankName = "Two";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 2-> {
                                rankName = "Three";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 3-> {
                                rankName = "Four";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 4-> {
                                rankName = "Five";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 5-> {
                                rankName = "Six";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 6-> {
                                rankName = "Seven";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 7-> {
                                rankName = "Eight";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 8-> {
                                rankName = "Nine";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 9-> {
                                rankName = "Ten";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 10-> {
                                rankName = "Jack";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 11-> {
                                rankName = "Queen";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 12-> {
                                rankName = "King";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                        }
                    }
                    case 2 -> {
                        suitName = "Clubs";
                        switch(rank){
                            case 0-> {
                                rankName = "Ace";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 1-> {
                                rankName = "Two";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 2-> {
                                rankName = "Three";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 3-> {
                                rankName = "Four";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 4-> {
                                rankName = "Five";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 5-> {
                                rankName = "Six";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 6-> {
                                rankName = "Seven";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 7-> {
                                rankName = "Eight";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 8-> {
                                rankName = "Nine";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 9-> {
                                rankName = "Ten";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 10-> {
                                rankName = "Jack";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 11-> {
                                rankName = "Queen";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 12-> {
                                rankName = "King";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                        }
                    }
                    case 3 -> {
                        /*You can only look at the word "suit" for so long before
                        it becomes an incomprehensible pile of letters*/
                        suitName = "Diamonds";
                        switch(rank){
                            case 0-> {
                                rankName = "Ace";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 1-> {
                                rankName = "Two";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 2-> {
                                rankName = "Three";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 3-> {
                                rankName = "Four";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 4-> {
                                rankName = "Five";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 5-> {
                                rankName = "Six";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 6-> {
                                rankName = "Seven";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 7-> {
                                rankName = "Eight";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 8-> {
                                rankName = "Nine";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 9-> {
                                rankName = "Ten";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 10-> {
                                rankName = "Jack";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 11-> {
                                rankName = "Queen";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                            case 12-> {
                                rankName = "King";
                                deck[suit][rank] = (rankName+" of "+suitName);
                            }
                        }
                    }
                }
            }
        }
        /*for(int suit=0; suit < deck.length; suit++){
            for(int rank=0; rank < deck[suit].length; rank++){
                System.out.print(deck[suit][rank] + "\t");
                System.out.println();
            }
        }*/
        deckShuffle(deck);
        
        Hand hand1 = new Hand("Billy", deck[0][0], deck[0][1], deck[0][2], deck[0][3], deck[0][4]);
        Hand hand2 = new Hand("Bob", deck[0][5], deck[0][6], deck[0][7], deck[0][8], deck[0][0]);
        Hand hand3 = new Hand("Barbara", deck[0][10], deck[0][11], deck[0][12], deck[1][0], deck[1][1]);
        Hand hand4 = new Hand("Bernadette", deck[1][2], deck[1][3], deck[1][4], deck[1][5], deck[1][6]);
        
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);
    }
    
    public static String[][] deckShuffle(String[][] deck){
        //Randomizer class initiation
        Random rand = new Random();
        
        //Cycle through spots in the deck
        for(int suit = 0; suit < deck.length; suit++){
            for(int rank = 0; rank < deck[suit].length; rank++){
                //Choose random card suit and rank to swap places with
                int randomSuit = rand.nextInt(deck.length);
                int randomRank = rand.nextInt(deck[randomSuit].length);
                //store card to be swapped with
                String temp = (deck[randomSuit][randomRank] + "\t");
                //Set swap card with current card
                deck[randomSuit][randomRank] = deck[suit][rank];
                //Set original card to swapped card
                deck[suit][rank] = temp;
            }
        }
        /*for(int suit=0; suit < deck.length; suit++){
            for(int rank=0; rank < deck[suit].length; rank++){
                System.out.print(deck[suit][rank] + "\t");
                System.out.println();
            }
        }*/
        return deck;
    }
}

//Hands to have cards dealt to
class Hand{
    private String card1;
    private String card2;
    private String card3;
    private String card4;
    private String card5;
    private String name;
    
    public Hand(String name){
        this.name = name;
    }
    
    public Hand(String name, String card1, String card2, 
            String card3, String card4, String card5){
        this.name = name;
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
    }
    
    @Override
    public String toString(){
        String myString = "";
        myString = this.name + ":\n"
                + card1 + "\n" + card2 + "\n" + card3 + "\n"
                + card4 + "\n" + card5 + "\n";
        return myString;
    }
}

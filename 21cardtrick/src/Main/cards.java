package Main;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class cards implements Cardgame {
    private final List<String> cards;
    private static cards myCards;
    @SuppressWarnings("empty-statement")
    private cards(){
        cards=new ArrayList<>();
        cards.add("ClubsAce");
        cards.add("Clubs2");
        cards.add("Clubs3");
        cards.add("Clubs4");
        cards.add("Clubs5");
        cards.add("Clubs6");
        cards.add("Clubs7");
        cards.add("Clubs8");
        cards.add("Clubs9");
        cards.add("Clubs10");
        cards.add("ClubsJack");
        cards.add("ClubsQueen");
        cards.add("ClubsKing");
        cards.add("DiamondsAce");
        cards.add("Diamonds2");
        cards.add("Diamonds3");
        cards.add("Diamonds4");
        cards.add("Diamonds5");
        cards.add("Diamonds6");
        cards.add("Diamonds7");
        cards.add("Diamonds8");
        cards.add("Diamonds9");
        cards.add("Diamonds10");
        cards.add("DiamondsJack");
        cards.add("DiamondsQueen");
        cards.add("DiamondsKing");
        cards.add("HeartsAce");
        cards.add("Hearts2");
        cards.add("Hearts3");
        cards.add("Hearts4");
        cards.add("Hearts5");
        cards.add("Hearts6");
        cards.add("Hearts7");
        cards.add("Hearts8");
        cards.add("Hearts9");
        cards.add("Hearts10");
        cards.add("HeartsJack");
        cards.add("HeartsQueen");
        cards.add("HeartsKing");
        cards.add("SpadesAce");
        cards.add("Spades2");
        cards.add("Spades3");
        cards.add("Spades4");
        cards.add("Spades5");
        cards.add("Spades6");
        cards.add("Spades7");
        cards.add("Spades8");
        cards.add("Spades9");
        cards.add("Spades10");
        cards.add("SpadesJack");
        cards.add("SpadesQueen");
        cards.add("SpadesKing");
    } //singlton performed here

    public static cards getCards(){
        if(myCards==null)
            myCards=new cards();
        return myCards;
    }

    public void Displaycards(){
        System.out.println("UnShuffled <all cards> Cards");
        for(String x: cards){
            System.out.println(x);
        }
    }
    public String[] get21Card(){
        Collections.shuffle(myCards.cards);//from the collection of cards shuffle
        String[] res=new String[52];//after shuffling we will creat array result
        int i=0;
        for(String c:myCards.cards){
            res[i++]=c;//insert into result the shuffled cards
        }
        String[] choosenCards=Arrays.copyOf(res, 21);//here we will copy from result to the length 21
        return choosenCards;//return the chosen 21 shuffled cards
    }
}

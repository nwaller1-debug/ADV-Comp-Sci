import java.util.ArrayList;
import java.util.Scanner;

public class DeckAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int x = 0;
        for (Card card : deck) {
            if (card.abilityCount() == 1) {
                x ++;
            }
        }
        if (x > 3) {
            return false;
        }
        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        int bas = 0;
        int rip = 0;
        int cleave = 0;
        for (Card card : deck) {
            if (card.hasBastion()) {
                bas ++;
            }
            if (card.hasRipple()) {
                rip ++;
            }
            if (card.hasRipple()) {
                cleave ++;
            }
        }
        if (bas > 1 || rip > 1 || cleave > 1) {
            return false;
        }

        return true;
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.getStrength() < 1) {
                return false;
            }
            if (card.getToughness() < 1) {
                return false;
            }
            if ((card.getStrength() + card.getToughness()) > 6) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck.size() != 5) {
            return false;
        }
        if (
            checkNoDuplicateAbilities(deck) 
            & checkNoMoreThanThreeAbilityCards(deck) 
            & checkOneAbilityPerCard(deck) 
            & checkStatsInRange(deck)
        ){
            return true;
        }

        return false;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return deck
    //   of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new NamedCard("C1", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("C2", CardType.PARCHMENT, 3, 3, false, false, false));
        deck.add(new NamedCard("C3", CardType.BLADE, 3, 3, false, false, false));
        deck.add(new NamedCard("C4", CardType.GRANITE, 3, 3, false, false, false));
        deck.add(new NamedCard("C5", CardType.BLADE, 3, 3, false, false, false));
        return deck;
        
        
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        String name;
        String type = "";
        int toughness = 0;
        int strength = 0;
        String bast;
        String rip;
        String clev;
        CardType type1;
        Ability ability;
        Boolean isBast = false;
        Boolean isRip = false;
        Boolean isClev = false;
        Boolean isValidDeck1 = false;
        ArrayList<Card> deck = new ArrayList<Card>();
        

        while (isValidDeck1) {
            for (int i = 0; i < 5; i++) {
                System.out.println("What is the card's name? ");
                name = sc.next();
                System.out.println("What is the card's type ");
                type = sc.next();
                System.out.println("What is the card's strength ");
                strength = sc.nextInt();
                System.out.println("What is the card's toughmess ");
                toughness = sc.nextInt();
                System.out.println("does the card have the bastion ability ");
                bast = sc.next();
                System.out.println("does the card have the ripple ability ");
                rip = sc.next();
                System.out.println("does the card have the cleave ability ");
                clev = sc.next();
                type1 = CardType.fromText(type);
                if (isYes(bast)) {
                    isBast = true;
                }
                if (isYes(rip)) {
                    isRip = true;
                }
                if (isYes(clev)) {
                    isClev = true;
                }
                deck.add(new NamedCard(name, type1, strength, toughness, isBast, isRip, isClev));
            }
            
            isValidDeck1 = isValidDeck(deck);
        }
        
        
        
        return deck;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null) return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}

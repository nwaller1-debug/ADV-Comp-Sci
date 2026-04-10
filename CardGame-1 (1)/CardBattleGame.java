import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        double x = rng.nextDouble();
        String start;
        if (x > 0.5) {
            start = "player";
        } else {
            start = "bot";
        }
        drawAndPlayIfNeeded(playerDeck, botDeck);
        return null;

    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.active == null) {
            self.active = self.deck.get(0);
            self.active.applySelfOnPlay(self.active.resolvedAbility());
            attackOnce(self, other);
        }
        if (other.active == null) {
            other.active = other.deck.get(0);
            other.active.applySelfOnPlay(other.active.resolvedAbility());
            attackOnce(other, self);
        }
    
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        defender.active.takeDamage(attacker.active.computeDamageAgainst(defender.active));
        if (defender.active.isDefeated()) {
            defender.active = null;
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DeckAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Player player1 = new Tank("Tank");
        Player player2 = new Berserker("Berserker");
        Player player3 = new Archer("Archer");

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);


        while (players.size() > 1) {
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);

                Player target = null;
                while (target == null || target == player || target.getHealthPoint() <= 0) {
                    target = players.get((int) (Math.random() * players.size()));
                }
                player.attack(target);

                players.removeIf(p -> p.getHealthPoint() <= 0);
                if (players.size() == 1) {
                    break;
                }
                
            }
            Thread.sleep(1000);
            System.out.println();
        }


        System.out.println("Winner: " + players.get(0).getName());
    }
}

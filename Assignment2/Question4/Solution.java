package Assignment2.Question4;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Player p1 = new Player("Mike", 1);
        Player p2 = new Player("Ada", 1);
        Player p3 = new Player("John", 2);
        Player p4 = new Player("Sheldon", 3);
        Player p5 = new Player("Yif", 4);
        Player[] players = {p1, p2, p3, p4, p5};

        Comparator<Player> comparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if (o1.score != o2.score) {
                    return o2.score - o1.score;
                }
                else {
                    return o1.name.compareTo(o2.name);
                }
            }
        };

        Arrays.sort(players, comparator);
        printPlayers(players);
    }

    public static void printPlayers(Player[] players) {
        for (Player player : players) {
            System.out.println("Name " + player.name + " , " + player.score + ".");
        }
    }
}

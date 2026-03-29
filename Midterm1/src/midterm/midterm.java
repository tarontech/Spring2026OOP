/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;
import java.util.Random;
/**
 *
 * @author taron
 */

public class midterm {

    public static void main(String[] args) {

        System.out.println("Lottery Game:\n");

        int selectionCount = 18;
        int selectionBound = 64;

        int lotterySelection[] = new int[selectionCount];

        Random rand = new Random();

        // generate winning numbers 
        for (int i = 0; i < selectionCount; i++) {
            lotterySelection[i] = rand.nextInt(selectionBound) + 1;
            System.out.print(lotterySelection[i] + " ");
        }

        int winningBonus = rand.nextInt(selectionBound) + 1;
        System.out.println(); 

        // take 3
        int take3[] = new int[3];
        int bonus3 = rand.nextInt(selectionBound) + 1;

        for (int i = 0; i < 3; i++) {
            take3[i] = rand.nextInt(selectionBound) + 1;
        }

        System.out.print("Take 3: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(take3[i] + " ");
        }
        System.out.println("| Bonus: " + bonus3);

        // take 4
        int take4[] = new int[4];
        int bonus4 = rand.nextInt(selectionBound) + 1;

        for (int i = 0; i < 4; i++) {
            take4[i] = rand.nextInt(selectionBound) + 1;
        }

        System.out.print("Take 4: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(take4[i] + " ");
        }
        System.out.println("| Bonus: " + bonus4);

        // take 5
        int take5[] = new int[5];
        int bonus5 = rand.nextInt(selectionBound) + 1;

        for (int i = 0; i < 5; i++) {
            take5[i] = rand.nextInt(selectionBound) + 1;
        }

        System.out.print("Take 5: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(take5[i] + " ");
        }
        System.out.println("| Bonus: " + bonus5);

        System.out.println();

        // results
        checkGame(lotterySelection, winningBonus, take3, bonus3, 1000, "Take 3");
        checkGame(lotterySelection, winningBonus, take4, bonus4, 10000, "Take 4");
        checkGame(lotterySelection, winningBonus, take5, bonus5, 100000, "Take 5");
    }

    public static void checkGame(int winning[], int winningBonus, int ticket[], int bonus, int basePrize, String label) {

        int matchCount = 0;

        // count matches
        for (int i = 0; i < ticket.length; i++) {
            for (int j = 0; j < winning.length; j++) {
                if (ticket[i] == winning[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        // WIN case
        if (matchCount == ticket.length) {
            int prize = basePrize;

            if (bonus == winningBonus) {
                prize *= 10;
                System.out.println(label + ": WIN (Matched " + matchCount + " with bonus) = $" + prize);
            } else {
                System.out.println(label + ": WIN (Matched " + matchCount + ") = $" + prize);
            }
        }
        // LOSE case
        else {
            System.out.println(label + ": LOSE (Matched " + matchCount + ") = $0");
        }
    }
}

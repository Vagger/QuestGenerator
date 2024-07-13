import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String quests = "bbbbbbbbbsbbbbbbbbsbbbsbbbsbbbbsbsbbsbsbbsbbsbsbsbsbssbsbsbsbsbsssbsssbssbssbsssssbssssssbssssssssss";

        System.out.println("Hey!");
//        System.out.println("Hey! Enter a number of quests for your game: ");
//        System.out.print("==> ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        List<Integer> silverIndexes = findSilverIndexes(quests);

//        String generatedQuests = generateRewards(quests, n);
//
//        System.out.println("Here are the generated quests for your game!");
//        System.out.print("==> ");
//        System.out.println(generatedQuests);

//        sc.close();

    }

    private static List<Integer> findSilverIndexes(String quests) {
        List<Integer> silverIndexes = new ArrayList<>();
        for (int i = 0; i<quests.length(); i++) {
            if (quests.charAt(i) == 's') {
                silverIndexes.add(i);
            }
        }
        System.out.println("Silver quests for [" + quests + "] are distributed at " + silverIndexes + " indexes.");
        double silverPercentage = percentageOfSilvers(silverIndexes.size(), quests.length());
        System.out.println("The " + silverPercentage + "% of the initial quests are silver.");
        System.out.println("Based on this, let's find out the distribution for your quests and generate the output.");
        return silverIndexes;
    }

    private static double percentageOfSilvers(double silversCount, double count) {
        return (silversCount * 100) / count;
    }

//    private static String generateRewards(String sequence, int count) {
//        String rewards = "b".repeat(count);
//        if (count == sequence.length()) {
//            rewards = sequence;
//        }
//        return rewards;
//    }
}
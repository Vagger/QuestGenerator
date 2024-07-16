package main.algorithms;

import java.util.ArrayList;
import java.util.List;

public class IndexMapperAlgorithm {

    /*
    * NOTE
    * This works only for lower numbers divisible by our example string's size.
    * Halfway through it was notable that this algorithm is probably not the best way to solve the problem.
    * */
    public static String generateRewards(String quests, int n) {

        System.out.println("For " + quests.length() + " quests we have this distribution:\n[" + quests + "]");

        List<Integer> silverIndexes = findGivenSilverIndexes(quests);
        int ratio = quests.length()/n;

        List<Integer> newSilverIndexes = findNewSilverIndexes(silverIndexes, ratio, n);

        return generateRewardsInternal(newSilverIndexes, n);
    }

    private static List<Integer> findGivenSilverIndexes(String quests) {
        List<Integer> silverIndexes = new ArrayList<>();
        for (int i = 0; i<quests.length(); i++) {
            if (quests.charAt(i) == 's') {
                silverIndexes.add(i);
            }
        }
        System.out.println("Silver quests for [" + quests + "]\n are distributed at " + silverIndexes + " indexes.");
        double silverPercentage = percentageOfSilvers(silverIndexes.size(), quests.length());
        System.out.println("The " + silverPercentage + "% of the initial quests are silver.");
        System.out.println("Based on this, let's find out the distribution for your quests and generate the output.");

        System.out.println("---------------------------------------------------------------------------------------");

        return silverIndexes;
    }

    private static List<Integer> findNewSilverIndexes(List<Integer> givenIndexes, int ratio, int n) {
        List<Integer> newSilverIndexes = new ArrayList<>();
        int i = 0;
//        for (int i = 0; i < givenIndexes.size(); i += ratio) {
        while (i < givenIndexes.size()) {
            newSilverIndexes.add(givenIndexes.get(i)/ratio);
            i += ratio;
        }
        System.out.println("Silver quests for our game should be distributed at " + newSilverIndexes + " indexes.");
        double silverPercentage = percentageOfSilvers(newSilverIndexes.size(), n);
        System.out.println("The " + silverPercentage + "% of the generated quests are silver.");
        return newSilverIndexes;
    }

    private static double percentageOfSilvers(double silversCount, double count) {
        return (silversCount * 100) / count;
    }

    private static String generateRewardsInternal(List<Integer> silverIndexes, int count) {
        StringBuilder rewards = new StringBuilder("b".repeat(count));
        for (Integer silverIndex : silverIndexes) {
            rewards.setCharAt(silverIndex, 's');
        }
        System.out.println("Here is the generated sequence for " + count + " quests:");
        System.out.println(">>> " + rewards);
        return rewards.toString();
    }
}

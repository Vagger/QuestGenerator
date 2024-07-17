package test;

import main.algorithms.InterpolationAlgorithm;
import main.utils.LevensteinDistanceRecursive;
import main.utils.StringComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpolationAlgorithmTest {

    @Test
    void generateRewardsForThreeQuests() {
        String exampleString = "bbs";
        System.out.println("Example string: \n" + exampleString);
        assertEquals(exampleString.length(), 3);

        String rewards = InterpolationAlgorithm.generateRewards(exampleString.length());
        System.out.println("Generated rewards: \n" + rewards);

        System.out.println("There are " + compareStrings(exampleString, rewards) + " differences found.");
    }

    @Test
    void generateRewardsForHundredQuests() {
        String exampleString = "bbbbbbbbbsbbbbbbbbsbbbsbbbsbbbbsbsbbsbsbbsbbsbsbsbsbssbsbsbsbsbsssbsssbssbssbsssssbssssssbssssssssss";
        System.out.println("Example string: \n" + exampleString);
        assertEquals(exampleString.length(), 100);

        String rewards = InterpolationAlgorithm.generateRewards(exampleString.length());
        System.out.println("Generated rewards: \n" + rewards);

        System.out.println("There are " + compareStrings(exampleString, rewards) + " differences found.");

    }

    private int compareStrings(String string1, String string2) {
        return StringComparator.compareDifferenceCount(string1, string2);
    }

}
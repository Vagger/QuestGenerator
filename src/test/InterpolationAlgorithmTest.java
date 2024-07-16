package test;

import main.algorithms.InterpolationAlgorithm;
import main.utils.LevensteinDistanceRecursive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpolationAlgorithmTest {

    @Test
    void generateRewardsForThreeQuests() {
        String exampleString = "bbs";
//
//        InterpolationAlgorithm.generateRewards(3);
        System.out.println(LevensteinDistanceRecursive.compute_Levenshtein_distance("bbb", exampleString));
    }

}
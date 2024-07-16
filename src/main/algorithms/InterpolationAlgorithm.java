package main.algorithms;

public class InterpolationAlgorithm {

    public static String generateRewards(int n) {

        // build a string based on probabilistic approach

        return buildRewards(n);
    }

    private static String buildRewards(int n) {
        StringBuilder rewards = new StringBuilder(n);

        // define a probabilistic function based on interpolation
        for (int i = 0; i < n; i++) {
            // todo write a probability function
        }
        return rewards.toString();
    }
}

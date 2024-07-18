package main.algorithms;

public class InterpolationAlgorithm {

    public static String generateRewards(int n) {
        return buildRewards(n);
    }

    private static String buildRewards(int n) {
        StringBuilder rewards = new StringBuilder(n);

        // define a probabilistic function based on interpolation
        for (int i = 0; i < n; i++) {
            if (getBronzeProbability(i, n) > 0.5) {
                rewards.append('b');
            } else {
                rewards.append('s');
            }
        }
        return rewards.toString();
    }

    private static double getBronzeProbability(int i, int N) {
        // todo improve
        return 0.5 * (1 + Math.cos(Math.PI * i / N));
    }

}

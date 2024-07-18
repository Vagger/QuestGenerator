package main;

import main.algorithms.InterpolationAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey!");
        System.out.println("Enter a number of quests for your game: ");
        System.out.print("==> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String rewards = InterpolationAlgorithm.generateRewards(n);
        System.out.println("This is how your rewards look like for " + n + " quests!");
        System.out.println("==> " + rewards);

        sc.close();

    }
}
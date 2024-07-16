import algorithms.IndexMapperAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String quests = "bbbbbbbbbsbbbbbbbbsbbbsbbbsbbbbsbsbbsbsbbsbbsbsbsbsbssbsbsbsbsbsssbsssbssbssbsssssbssssssbssssssssss";

        System.out.println("Hey!");
        System.out.println("Enter a number of quests for your game: ");
        System.out.print("==> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        IndexMapperAlgorithm.generateRewards(quests, n);

        sc.close();

    }
}
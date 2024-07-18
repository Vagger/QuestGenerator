# Quest Reward Generator
## Overview
The Quest Reward Generator is a Java application designed to produce a sequence of quest rewards. The rewards transition smoothly from a higher probability of bronze chests ("b") at the beginning to a higher probability of silver chests ("s") towards the end. This is achieved using a probability function that changes over the sequence.

## Features
Generates a string of quest rewards with a distribution that transitions from mostly bronze to mostly silver.
Utilizes a cosine function to achieve a smooth probability transition.

## Installation

#### Clone the repository:
> git clone https://github.com/your-username/quest-reward-generator.git
cd quest-reward-generator

#### Compile the Java code:
> javac QuestRewardGenerator.java

#### Run the application:
> java QuestRewardGenerator

## Usage
The main method in QuestRewardGenerator runs the generator for N = 100 by default and prints the resulting sequence of quest rewards. You can modify the value of N to generate sequences of different lengths.

## Example
> public static void main(String[] args) {
int N = 100;
System.out.println(generateQuestRewards(N));
}
Running the above code will generate and print a string of 100 quest rewards, transitioning smoothly from mostly "b" (bronze chests) to mostly "s" (silver chests).

## How It Works
### InterpolationAlgorithm
#### buildRewards Method:

Takes an integer N representing the total number of quests.
Constructs a StringBuilder to efficiently build the result string.
Iterates over each quest position, calculates the probability of getting a bronze chest using the getBronzeProbability method, and appends the appropriate character ('b' or 's') to the result.
    
#### getBronzeProbability Method:

Takes the current quest index i and the total number of quests N.
Uses a cosine function to smoothly decrease the probability from 1 to 0 as i goes from 0 to N.
The function 0.5 * (1 + Math.cos(Math.PI * i / N)) gives a probability that starts at 1 when i is 0 and approaches 0 as i approaches N.

## Customization
You can adjust the probability function in the getBronzeProbability method to better fit any specific requirements for the distribution of rewards.

## Helpful Links I've used
https://stackoverflow.com/questions/29165567/how-do-sine-functions-work-in-java
https://www.geeksforgeeks.org/java-program-to-implement-levenshtein-distance-computing-algorithm/
https://youtu.be/j155J5x6Pq0?si=JngMbQCBupQLgECL

_This ReadMe has been written with the help of ChatGPT, so a big shout out to it as well!_
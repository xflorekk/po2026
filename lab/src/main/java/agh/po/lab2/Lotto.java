package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {


    public static ArrayList<Integer> generateLottoNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        while (numbers.size() < 6) {
            int k = r.nextInt(1, 50);
            if (!numbers.contains(k)) {
                numbers.add(k);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        //E1
        ArrayList<Integer> randomNumbers = generateLottoNumbers();

        if (args.length != 6) {
            System.out.println("Please enter exactly 6 numbers!");
            return;
        }

        ArrayList<Integer> userNumbers = new ArrayList<>();
        for (String arg : args) {
            userNumbers.add(Integer.parseInt(arg));
        }

        //E2
        int hits = 0;
        for (int num : userNumbers) {
            if (randomNumbers.contains(num)) {
                hits++;
            }
        }
        System.out.println("Your numbers: " + userNumbers);
        System.out.println("Lotto numbers: " + randomNumbers);
        System.out.println("Number of hits: " + hits);

        //E3
        long attempts = 0;
        long startTime = System.currentTimeMillis();

        while (true) {
            attempts++;
            ArrayList<Integer> drawn = generateLottoNumbers();
            if (drawn.containsAll(userNumbers)) {
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Number of draws to get 6/6 hits: " + attempts);
        System.out.println("Time of running: " + totalTime + " ms");
    }
}

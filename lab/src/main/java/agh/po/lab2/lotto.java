package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class   lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lo = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <= 6; i++) {
            int k = r.nextInt(1,50);
            if(!lo.contains(k)) {
                lo.add(r.nextInt(1, 50));
            }
        }

        ArrayList<Integer> u_lo = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.
        }
        System.out.println(lo);
    }
}

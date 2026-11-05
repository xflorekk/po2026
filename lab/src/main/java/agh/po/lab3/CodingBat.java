package agh.po.lab3;

import java.util.Locale;

public class CodingBat {
    //Warmup 1
    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }

    //Warmup 2
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }

        if (i + 1 < str.length() && str.charAt(i + 1) == 'x') {
            return true;
        }

        return false;
    }

    public int countEvens(int[] nums) {
        int even_n = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2 ==0) {
                even_n++;
            }
        }
        return even_n;
    }
    public String helloName(String name) {
        String gr3 = "Hello "+name+"!";
        return gr3;
    }

    public static void main(String[] args) {
        CodingBat codingBat=new CodingBat();
        codingBat.doubleX("xxxx");
    }
}

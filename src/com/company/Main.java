package com.company;

public class Main {
    static public int numberOfSteps(int num) {
        int res = 0;
        while (num > 0){
            num = (num % 2 == 0) ? num/2:  num - 1;
            res++;
        }

        return res;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(numberOfSteps(123));
    }
}

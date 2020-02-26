package com.company;

public class Main {

    public static void main(String[] args) {
        int val = 6;
        int result = getMinSteps(val);
        System.out.println(result);
    }

    /**
     * index 1 is 0 this is given.
     * so for ever number try to subtract by 1, divide by 3, divide by 2 and whosoever's number of step is
     * less store that result in table.
     * This is tabulation approach i.e bottom to top approach
     * i.e here we fist solve 1, so the ans is 0
     * then we get 2 -> 2/2 = 1 who's value is 0 so this is acheived n 1 step and it is stored in table
     * then we go to 3 -> 3/3 = 1 so again step is 1
     * for 4, it will do table[4-1] = 1, then it will check for divide by 3 and divide by 2 and who's value
     * is less will be stored in table.
     * [0,    1, 2, 3, 4, 5, 6]
     * [null, 0,
     * @param val
     * @return
     */
    public static int getMinSteps(int val) {
        //create a table that will store the value of minimum step
        int[] table = new int[val + 1];
        table[1] = 0;
        for (int i = 2; i < table.length; i++) {

            //check -1
            int option = table[i - 1];

            //check / 3
            if (i % 3 == 0) {
                int num = table[i / 3];
                option = Math.min(num, option);
            }

            //check /2
            if (i % 2 == 0) {
                int num = table[i / 2];
                option = Math.min(option, num);
            }

            table[i] = option + 1;
        }
        return table[val];
    }


}

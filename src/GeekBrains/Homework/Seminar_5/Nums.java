package GeekBrains.Homework.Seminar_5;

import java.util.LinkedHashMap;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

public class Nums {
    public static LinkedHashMap<Integer, Character> numberMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        numberMap.put(1000, 'M');
        numberMap.put(500, 'D');
        numberMap.put(100, 'C');
        numberMap.put(50, 'L');
        numberMap.put(10, 'X');
        numberMap.put(5, 'V');
        numberMap.put(1, 'I');

        System.out.println(getRoman(1999));
    }

    public static String getRoman(int initNum){
        int size = Integer.toString(initNum).length();
        StringBuilder sb = new StringBuilder();
        for(int i : numberMap.keySet()) {
            if (initNum / i > 0) {
                for (int j = 0; j < initNum / i; j++){
                    if (initNum / 900 == 1) {
                        sb.append("CM");
                        initNum -= 900;
                    }
                    else if (initNum / 90 == 1) {
                        sb.append("XC");
                        initNum -= 90;
                    }
                    else if (initNum / 9 == 1) {
                        sb.append("IX");
                        initNum -= 9;
                    }
                    else if (initNum / 4 == 1) {
                        sb.append("IV");
                        initNum -= 4;
                    }
                    else
                        sb.append(numberMap.get(i));
                }
                initNum = initNum % i;
            }
        }
        return sb.toString();
    }
}


package com.company;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int neg=0;
        int zero= 0;
        for (Integer i : arr) {

            if (i>0) {
                pos= pos +1;
                continue;
            }else
            if (i==0) {
                zero=zero +1;
                continue;
            }else
            if (i<0) {
                neg=neg+1;

            }
        }
        int t= arr.size();
        System.out.println(pos/t);


    }

}


public class Solution {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.plusMinus(arr);

            bufferedReader.close();
        }


}
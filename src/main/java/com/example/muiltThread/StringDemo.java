package com.example.muiltThread;

import java.util.Arrays;

public class StringDemo {


    private static int[] getNext(String partten){
        int[] nextArr = new int[partten.length()];
        nextArr[0] = 0;
        for (int i=1,k=0;i<partten.length();i++){
            if(partten.charAt(i)==partten.charAt(k)){
                k++;
            }
            while(k>0 && partten.charAt(k)!=partten.charAt(i)){
                k = nextArr[k-1];
            }
            nextArr[i] = k;
        }
        return nextArr;
    }



    private static void deal(String tarStr, String partten) {
        // 手撕kmp
        int[] next = getNext(partten);
        System.out.println(Arrays.toString(next));
        for (int i=0,j=0;i<tarStr.length();i++){
            while(j>0 && tarStr.charAt(i)!=partten.charAt(j)){
                j = next[j-1];
            }
            if(tarStr.charAt(i)==partten.charAt(j)){
                j++;
            }
            if(j==partten.length()){
                System.out.println(i-j+1);
                j = 0;
            }
        }
    }

    public static void main(String[]args){
        deal("YOU", "Y");
    }
}

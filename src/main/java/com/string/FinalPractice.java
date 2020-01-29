package com.string;

public class FinalPractice {
    public static void main(String[] args) {
        String[] input = new String[]{"Canada","India","Toronto","New York","China","Malaysia","South Korea","Mexico"};
        FinalPractice obj1 = new FinalPractice();
        for(int i=0; i<input.length; i++) {
           //System.out.println(obj1.doubleReverse(input[i]));
           //System.out.println(obj1.stringSwap(input[i]));
            System.out.println(obj1.reverseString(input[i]));
        }
    }

    public String doubleReverse(String s){
        char[] t = s.toCharArray();
        for(int i =0; i< t.length; i+=2){
            if (i+2<=t.length){
                char temp = t[i];
                t[i] = t[i + 1];
                t[i + 1] = temp;
            }
        }
            if(t.length % 2 == 1){
            String firstPart = s.substring(0,t.length/2);
            String secondPart = s.substring(t.length/2, t.length-1);
            String final2 = doubleReverse(firstPart) + t[t.length-1] + doubleReverse(secondPart);
            return final2;
        }
        String finalString = new String(t);
        return finalString;
    }

    public String reverseString(String s){
        char[] t = s.toCharArray();
        for(int i=0,j=t.length-1; i<t.length/2; i++,j--){
            char temp = t[i];
            t[i]=t[j];
            t[j] = temp;
        }
         return new String(t);
    }
    public String stringSwap(String s){
        char[] t= s.toCharArray();
        String evens = "";
        String odds = "";
        for(int i =0; i <t.length; i++){
            if(i % 2 == 0){
               evens += t[i];
            }
            else
                odds += t[i];
        }
        return reverseString(evens)+reverseString(odds);
    }
}

package com.company;

public class Main {
    private static int n;
    private static int result;
    private static int sumLucasResult=0;
    private static int lower=5;
    private static int upper=15;
public static void main(String[] args) {
	//
    n=20;  // Nte Lucaszahl
    result = calcLucasN(n);
    System.out.println((result>0)? "Die "+n+".Lucaszahl lautet: "+ result : "Berechnung der Lucaszahl für 0/negative Eingabe nicht implementiert");

    sumLucasResult=calcSumLucasN(lower,upper); // Summe Lucaszahlen von bis
    System.out.println((sumLucasResult>0)? "Die Summer der "+lower+". bis zur "+upper+". Lucaszahl lautet: "+ sumLucasResult : "ERROR: check Lower and upper Parameters");
    }

public static int calcLucasN(int n){
    int l1 =2;
    int l2 =1;
    int l3 =0;
    if(n>1){
        for(int i = 2; i < n; ++i){
            l3 = l2;
            l2 += l1;
            l1 = l3;
        }
        return l2;
    }
    else if (n == 1)
        return 2;
    else
       return 0;
}

public static int calcSumLucasN(int lower, int upper){
  int sumLucas=0;
    if(upper>lower && upper>0 && lower>0) {
        for (int i = lower; i <= upper; i++) {
            sumLucas += calcLucasN(i);
        }
        return sumLucas;
    }
    else
        return 0;
}


}





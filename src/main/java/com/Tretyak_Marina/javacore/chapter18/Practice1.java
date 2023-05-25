package main.java.com.Tretyak_Marina.javacore.chapter18;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter first collection of integers separated by a space: ");
        String str1 = console.nextLine();
        String[] firstArr = str1.split(" ");

        System.out.println("Enter second collection of integer separated by a space: ");
        String str2 = console.nextLine();
        String[] secondArr = str2.split(" ");

        ArrayList<Integer> resultList = new ArrayList<>();
        for (String strelem : firstArr) {
            if (Arrays.asList(secondArr).contains(strelem)) {
                int intelem = Integer.parseInt(strelem);
                resultList.add(intelem);
            }
        }

        System.out.println("Result collection: ");
        Collections.sort(resultList);
        System.out.println(resultList.toString());
    }
}
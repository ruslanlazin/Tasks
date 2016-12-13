package ua.pp.lazin.collections.task12;

import java.util.LinkedList;

/**
 * Created by Ruslan on 12/2/2016.
 */
public class Main {


    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(1);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(9);
        list2.add(2);
        list1.iterator();

        int minLength = Math.min(list1.size(), list2.size());
        int maxLength = Math.max(list1.size(), list2.size());

        LinkedList<Integer> result = new LinkedList<>();
        int karryFlag = 0;
        for (int i = 0; i < minLength; i++) {
            result.add(i, (karryFlag + list1.get(i) + list2.get(i)) % 10);
            karryFlag = (list1.get(i) + list2.get(i)) / 10;
        }
        if (karryFlag == 1) {
            result.add(1);
        }

        System.out.println(result);
    }


}

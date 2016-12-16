package ua.pp.lazin.collections.task12;

/**
 * Created by Ruslan on 12/2/2016.
 *
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1’s digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */

public class Runner {
    public static void main(String[] args) {
        Node headOfSummandOne = new Node(3);
        headOfSummandOne.next = new Node(1);
        headOfSummandOne.next.next = new Node(5);
        headOfSummandOne.next.next.next = new Node(9);

        Node headOfSummandTwo = new Node(5);
        headOfSummandTwo.next = new Node(9);
        headOfSummandTwo.next.next = new Node(2);
        headOfSummandTwo.next.next.next = new Node(9);

        Node headOfResult = ListSummator.add(headOfSummandOne, headOfSummandTwo);

        printListOfNodes(headOfResult);
    }


    public static void printListOfNodes(final Node head) {
        Node iterator = head;
        StringBuilder sb = new StringBuilder();
        while (iterator != null) {
            sb.append(iterator.value).append(' ');
            iterator = iterator.next;
        }
        System.out.println(sb);
    }
}

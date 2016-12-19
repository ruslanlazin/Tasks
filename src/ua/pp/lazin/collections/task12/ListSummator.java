package ua.pp.lazin.collections.task12;

/**
 * @author Ruslan Lazin
 */
public class ListSummator {
    public static Node add(Node summandOne, Node summandTwo) {

        int carryFlag = 0;
        Node result = new Node();
        Node currentNode = result;

        while (summandOne != null || summandTwo != null) {
            int summandOneValue = summandOne != null ? summandOne.value : 0;
            int summandTwoValue = summandTwo != null ? summandTwo.value : 0;
            currentNode.value = (summandOneValue + summandTwoValue + carryFlag) % 10;
            carryFlag = (summandOneValue + summandTwoValue + carryFlag) / 10;

            if (summandOne != null) {
                summandOne = summandOne.next;
            }
            if (summandTwo != null) {
                summandTwo = summandTwo.next;
            }
            if (summandOne != null || summandTwo != null|| carryFlag != 0 ) {
                currentNode.next = new Node(carryFlag);
                currentNode = currentNode.next;
            }
        }
        return result;
    }
}

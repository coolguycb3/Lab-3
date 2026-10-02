public class Main {
    public static void main(String[] args) {
        dummylink list = new dummylink();

        // Add items
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

        // Display the list
        System.out.println("Original list:");
        list.show();

        // Display in reverse
        System.out.println("Reverse list:");
        list.showReverse();

        // Test find
        System.out.println("Find 30: " + list.find(30));
        System.out.println("Find 50: " + list.find(50));

        // Remove the first occurrence of 20
        System.out.println("Remove 20: " + list.getout(20));
        System.out.println("List after removing 20:");
        list.show();

        // Remove a value that does not exist
        System.out.println("Remove 50: " + list.getout(50));

        // Remove the first and last items
        list.getout(10);
        list.getout(40);

        System.out.println("After removing first and last:");
        list.show();

        // Remove everything
        list.getout(20);
        list.getout(30);

        System.out.println("Empty list:");
        list.show();

        System.out.println("Find in empty list: " + list.find(10));
        System.out.println("Remove from empty list: " + list.getout(10));
    }
}
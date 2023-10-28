
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Displaying the elements of the ArrayList
        System.out.println("Elements in the ArrayList: " + list);

        // Adding an element at a specific position (index 1)
        list.add(1, 15);

        // Displaying the updated elements of the ArrayList
        System.out.println("Elements after adding: " + list);

        // Removing an element from the ArrayList
        list.remove(2);

        // Displaying the updated elements of the ArrayList
        System.out.println("Elements after removing: " + list);

        // Searching for an element in the ArrayList
        int index = list.indexOf(20);
        if (index != -1) {
            System.out.println("Element 20 found at index: " + index);
        } else {
            System.out.println("Element 20 not found in the ArrayList.");
        }
    }
}

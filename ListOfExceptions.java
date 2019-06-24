import java.util.ArrayList;

/**
 * ListOfExceptions
 */
public class ListOfExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        int i = 0;
        try {
            for (i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Value taken from the try: " + castedValue);
            }
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
            System.out.println("Value is " + myList.get(i) + " in the list, at index " + i);
        }

        System.out.println("The program continued normally here!");
    }
}
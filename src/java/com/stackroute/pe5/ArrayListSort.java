//Write a program to implement set interface which sorts the given randomly ordered names in

// ascending order. Convert the sorted set in to an array list
//Input : Harry Olive Alice Bluto Eugene
//Output :
//Sorted Set : Alice Bluto Eugene Harry Olive
//Array list from Set : Alice Bluto Eugene Harry Olive
//-------------------------------------------------------------------------------


    import java.util.*;

    public class ArrayListSort {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();
        System.out.println("enter input");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] input1 = input.split(" ");
        for (int i = 0; i < input1.length; i++) {
            // Adding elements into HashSet using add()
            set.add(input1[i]);
        }


        System.out.println("Original HashSet: "
                + set);

        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);
    }
}

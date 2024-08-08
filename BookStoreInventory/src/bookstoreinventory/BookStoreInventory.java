/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstoreinventory;

/**
 *
 * @author connor adams
 */
import javax.swing.JOptionPane;

public class BookStoreInventory 
{
 // Phase 1: Array of book titles
    private static String[] books = 
    {
        "Harry Potter",
        "The Great Gatsby",
        "To Kill a Mockingbird",
        "Pride and Prejudice",
        "Othello"
    };
   
    public static void main(String[] args) 
    {
        // Phase 4: User Interaction for Sorting Order
        String[] options = {"Ascending", "Descending"};
        int choice = JOptionPane.showOptionDialog(null,
                "Choose the sorting order:",
                "Sort Books",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == 0) {
            // Sort in ascending order
            insertionSortAscending(books);
            JOptionPane.showMessageDialog(null, "Books sorted in ascending order:\n" + displayBooks(books));
        } else if (choice == 1) {
            // Sort in descending order
            insertionSortDescending(books);
            JOptionPane.showMessageDialog(null, "Books sorted in descending order:\n" + displayBooks(books));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid selection.");
        }
    }

    // Phase 2: Insertion Sort Algorithm for Ascending Order
    private static void insertionSortAscending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Phase 3: Insertion Sort Algorithm for Descending Order
    private static void insertionSortDescending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to display the sorted array as a single string
    private static String displayBooks(String[] books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }
}
     
    
    


import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of names: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];

        // Input names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter 'A' for ascending or 'D' for descending order: ");
        char choice = scanner.nextLine().toUpperCase().charAt(0);

        if (choice == 'A') {
            // Sort in ascending order
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (names[i].compareTo(names[j]) > 0) {
                        String temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
        } else if (choice == 'D') {
            // Sort in descending order
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (names[i].compareTo(names[j]) < 0) {
                        String temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D'.");
            return;
        }

        // Display the sorted names
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
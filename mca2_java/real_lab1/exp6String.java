import java.util.Arrays;
import java.util.Scanner;

public class Exp6String {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
	System.out.print("Enter the size of array :");
	int a=s.nextInt();
	System.out.println("Enter the String.");
	Strng st = new Strng(a);
        st.display();

        st.sort();
        System.out.println("Sorted array:");
        st.display();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search: ");
        String key = scanner.nextLine();
        int index = st.search(key);

        if (index >= 0) {
            System.out.println("String found at index " + index);
        } else {
            System.out.println("String not found");
        }
    }
}

class Strng {
    Scanner s = new Scanner(System.in);
    String[] array;

    Strng(int a) {
        array = new String[a];
        for (int i = 0; i < a; i++) {
            array[i] = s.nextLine();
        }
    }

    void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
void sort() {
        int n = array.length;
        String temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
 int search(String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}

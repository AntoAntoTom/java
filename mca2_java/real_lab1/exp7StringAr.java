import java.util.Scanner;


class exp7StringAr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        StringManipulator manipulator = new StringManipulator(userString);


        manipulator.displayLength();
        manipulator.capitalizeFirstLetter();
        manipulator.isPalindrome();
        manipulator.countCharacters();
        manipulator.deleteConsonants();
        manipulator.isCharacterPresent('a');
        manipulator.compareIgnoreCase("HeLLo");
        manipulator.endsWith("world");


        scanner.close();
    }
}

class StringManipulator {
	 String inputString;

    public StringManipulator(String inputString) {
        this.inputString = inputString;
    }

    public void displayLength() {
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
    }

    public void capitalizeFirstLetter() {
        String result = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
        System.out.println("String with first letter capitalized: " + result);
    }

    public void isPalindrome() {
        String reversedString = new StringBuilder(inputString).reverse().toString();
        if (inputString.equalsIgnoreCase(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public void countCharacters() {
        int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }

    public void deleteConsonants() {
        String result = inputString.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("String with consonants deleted: " + result);
    }

    public void isCharacterPresent(char target) {
        if (inputString.indexOf(target) != -1) {
            System.out.println("The character '" + target + "' is present in the string.");
        } else {
            System.out.println("The character '" + target + "' is not present in the string.");
        }
    }

    public void compareIgnoreCase(String anotherString) {
        if (inputString.equalsIgnoreCase(anotherString)) {
            System.out.println("The strings are equal (ignoring case).");
        } else {
            System.out.println("The strings are not equal (ignoring case).");
        }
    }

    public void endsWith(String suffix) {
        if (inputString.endsWith(suffix)) {
            System.out.println("The string ends with the content of another string.");
        } else {
            System.out.println("The string does not end with the content of another string.");
        }
    }
}

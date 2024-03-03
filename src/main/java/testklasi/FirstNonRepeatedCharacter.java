package testklasi;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "programming";

        char firstNonRepeatedChar = findFirstNonRepeatedChar(input);

        if (firstNonRepeatedChar != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated characters found.");
    }

}
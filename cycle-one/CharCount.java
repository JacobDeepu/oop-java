public class CharCount {
    public static void main(String args[]) {
        String string = "malayalam";
        char character = 'a';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Frequency of given character is " + count);
    }
}

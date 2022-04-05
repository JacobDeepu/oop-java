public class Palindrome {
    public static void main(String args[]) {
        String string, reverse = "";
        string = "malayalam";
        for (int i = string.length() - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        if (string.equals(reverse))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}

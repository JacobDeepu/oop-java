public class Reverse {
    public static void main(String args[]) {
        String string, reverse = "";
        string = "malayalam";
        for (int i = string.length() - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        System.out.println(reverse + " is the reverse of " + string);
    }
}

package Module2;

public class Fuzzy {
    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }

    public static boolean fuzzySearch(String input, String text) {


        if (input.length() > text.length()) {

            return false;
        }
        for (char ch : input.toCharArray()) {
            int i = text.indexOf(ch);
            if (i == -1) {

                return false;

            }
            text = text.substring(text.indexOf(ch)+1);

        }

        return true;
    }
}

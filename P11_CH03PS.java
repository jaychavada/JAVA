public class P11_CH03PS {
    public static void main(String[] args) {
        // que 01.....
        String name = "JACK SPARROW";
        System.out.println(name.toLowerCase());

        // que 02.....
        String text = "Hello friends This is jay";
        text = text.replace(" ", "_");
        System.out.println(text);

        // que 03...
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>", "Arjun");
        System.out.println(letter);

        // que 04....
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // que 05...
        String letter2 = "Hello sir, \n\t This java course. \n\t Thanks!";
        System.out.println(letter2);
    }
}

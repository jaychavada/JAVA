public class P10_strings_methods {
    public static void main(String[] args) {
        //.........STRINGS METHODS..........
        
        String a = "Mahadevdevhar";
        System.out.print("Entered String: ");
        System.out.println(a);
        System.out.println("\n");

        int value = a.length();
        System.out.print("Length of string: ");
        System.out.println(value);
        System.out.println("\n");

        String lString = a.toLowerCase();
        System.out.print("Lowercase: ");
        System.out.println(lString);
        System.out.println("\n");
        
        String uString = a.toUpperCase();
        System.out.print("Uppercase: ");
        System.out.println(uString);
        System.out.println("\n");

        String nonTrimmedString = "      jaychavada        ";
        System.out.print("Nontrimmed string: ");
        System.out.println(nonTrimmedString);
        System.out.println("\n");

        String trimmedString = nonTrimmedString.trim();
        System.out.print("Trimmedstring: ");
        System.out.println(trimmedString);
        System.out.println("\n");

        System.out.println("substrings: ");
        System.out.println(a.substring(3));
        System.out.println(a.substring(2, 5));
        System.out.println("\n");

        System.out.println("Replace in string: ");
        System.out.println(a.replace('h', 'j'));
        System.out.println(a.replace("had","mad" ));
        System.out.println("\n");

        System.out.println("Starting and Ending of string: ");
        System.out.println(a.startsWith("Mah"));
        System.out.println(a.endsWith("dev"));
        System.out.println("\n");

        System.out.println("character of string at entered index: ");
        System.out.println(a.charAt(5));

        System.out.print("Indexes of string: ");
        System.out.println(a.indexOf("h"));
        System.out.println(a.indexOf("h", 2));
        System.out.println(a.lastIndexOf("v"));
        System.out.println(a.lastIndexOf("dev", 6));
        System.out.println("\n");

        System.out.print("Comparison in string with upper and lower checking ");
        System.out.println(a.equals("Mahadevdevhar"));
        System.out.print("Comparison in string without upper and lower checking ");
        System.out.println(a.equalsIgnoreCase("mahadevDEVhaR"));

        //............ESCAPE SEQUENCES............
        System.out.print("HERE IS THE ESCAPE SEQUENCES DIFFERENT TYPES ");
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ single backslace");
        System.out.println("I am escape sequence \n New line");
        System.out.println("I am escape sequence \t tab");
        
    }
}

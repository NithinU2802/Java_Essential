import java.util.Collections;

class StringClass {
    public static void main(String[] arg) {
        String s1 = "Nithin", s2 = "Nithin";
        String s3 = new String("Nithin");

        // String vs String
        System.out.println(s1 == s2); // true - matches as literal can't created again
        System.out.println(s1.equals(s2)); // true - as Wrapper obj compare value with each other

        // String vs another obj String
        System.out.println(s1 == s3); // false - as the new literal is created for s3
        System.out.println(s3.equals(s2)); // true - equals as both obj compare with each other

        // String Operations
        String s4 = "uN";
        // s1=s1.concat(s4); assign value to s1 also works
        System.out.println(s1.concat(s4)); // Nithin U

        // check ignoreCase
        System.out.println(s1.equalsIgnoreCase("nithin")); // true

        // works on every matched strings
        s1 = "Nithininin";
        System.out.println(s1.replace("in", "ni")); // Nithni
        System.out.println(s1);

        // compareTo
        System.out.println(s3.compareTo(s2));
        System.out.println(s4.compareTo(s3));

        // toUpperCase() and toLowerCase()
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.startsWith("Ni"));
        System.out.println(s1+" "+s1.endsWith("in"));

        // substring, indexOf, trim() and split() of string
        System.out.println(s1.substring(0, 2));
        System.out.println(("  Nithin From KRCT   ").trim());
        System.out.println(s1.indexOf("Ni"));
        System.out.println(("Nithin U Java Program").split(" ").length); // return address of the array

        // New Methods
        System.out.println(s1.repeat(3));
        System.out.println(String.join(" ", Collections.nCopies(3,s1)));
        System.out.println(("").isBlank());
        System.out.println((" Nithin From KRCT  ").strip());

        // StringBuilder methods
        StringBuilder sb=new StringBuilder();
        sb.append("Nithin");
        sb.insert(1, "Demo");
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        System.out.println(sb.delete(0, 4));

        // text block
        System.out.println("""
                I'm Nithin
                KRCT
                Trichy
                """);
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        // mutable vs immutable
        String name = "James Eric Couch";

        //trim
        String trimmedName = name.trim();

        //charAt
        System.out.println(name.charAt(5));

        //contains return true or false if the string contains the parameter string
        System.out.println(name.contains("Co"));

        //indexOf
        System.out.println(name.indexOf("x"));

        //replace
        System.out.println(name.replace("c", "x"));

        //split
        String[] x = name.split(" ");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);

        String filePath = "C:/Users/ericc/source/repos/JavaArrays/src/com/company/Main.java";
        String otherFilePath = "C:/root/subdir/otherMain.java";

        String[] filePathParts = filePath.split("/");
        String[] otherFilePathParts = otherFilePath.split("/");

        System.out.println(filePathParts[8]);
        System.out.println(filePathParts[9]);


        System.out.println(filePathParts[filePathParts.length-1]);
        System.out.println(otherFilePathParts[otherFilePathParts.length-1]);

        String speech = "Now is the time for all good men to come to the aid of their country.";

        // length
        System.out.println(speech.length());
        System.out.println(speech.split(" ").length);

        System.out.println(speech.split(" ")[0]);

        // toLowerCase / toUpperCase
        System.out.println(name.toLowerCase());

        // substring
        System.out.println(speech.substring(20,32) + " " + speech.substring(48));

        // escape characters
        // Ice Cube says, "Today was a good day."
        System.out.println("Ice Cube says, \"Today was a good day.\"");
        System.out.println("Eric is a good teacher \nGary is a good teacher as well");
        System.out.println("Eric is pretty \tgood teacher");
    }
}

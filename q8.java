public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "hello, world!";
        System.out.println("Length of str1: " + str1.length()); 
        System.out.println("Uppercase of str2: " + str2.toUpperCase()); 
        System.out.println("Lowercase of str2: " + str2.toLowerCase());
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 after replacing 'o' with '0': " + str1.replace('o', '0')); 
        System.out.println("str2 contains 'Java': " + str2.contains("Java")); 
        System.out.println("Substring of str1 from index 7: " + str1.substring(7));
        System.out.println("Substring of str1 from index 7 to 12: " + str1.substring(7, 12));
        String str4 = "   Hello, Java!   ";
        System.out.println("str4 after trimming: '" + str4.trim() + "'"); 
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str2 ends with 'Programming': " + str2.endsWith("Programming")); 
        char[] charArray = str1.toCharArray();
        System.out.println("Character array of str1: ");
        for (char c : charArray) {
            System.out.print(c + " "); 
        }
    }
}

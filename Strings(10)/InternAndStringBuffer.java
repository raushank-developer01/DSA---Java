package Strings;

public class InternAndStringBuffer {
    public static void main(String[] args) {
        String str1 = "Rahul";
        String str2 = "Rahul"; // internpool allocate same object if value are equals; 
        String str3 = new String("Rahul");

        System.out.println("It is " +( str1 == str2) + " that string1 and string2 are equal");
        System.out.println("It is " + (str1 == str3) + " that string1 and string3 are equal");

        StringBuffer sb = new StringBuffer("Raj");
        sb.append("an");

        System.out.println(sb);

    }
}

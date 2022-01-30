import java.util.Arrays;

public class programiz_course {
    //string methods
    public static void main(String[] args){
        String a = "123456";
        String b = "3456";
        String c = "6789";
        //contains
        boolean result = (a.contains(b));
        System.out.println(result);
        //substring
        System.out.print(a.substring(0,3));
        //join
        System.out.println(String.join(" "+a,b,c));
        //replace
        System.out.println(a.replace("1","01"));
        //replace all
        String replace = "\\d+";
        System.out.println(a.replaceAll(replace,"a"));
        //charAt
        System.out.println(b.charAt(0));
        //GetBytes()
        byte[] array;
        array = a.getBytes();
        System.out.println(Arrays.toString(array));
        //hash code
        String str1 = "Java";
        String str2 = "Java Programming";
        String str3 = "";

        System.out.println(str1.hashCode()); // 2301506
        System.out.println(str2.hashCode()); // 1377009627

        System.out.println(str3.hashCode()); // 0


    }

}

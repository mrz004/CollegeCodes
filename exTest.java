public class exTest
{
    public static void main (String args[])
    {
        String str="Kunal";
        String str1="Phonix InfoTech";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,3));
        System.out.println(str.startsWith("Ku"));
        System.out.println(str.endsWith("abc"));
        System.out.println(str.equals("KUNAL"));
        System.out.println(str.equalsIgnoreCase("KUNAL"));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.LastIndexOf('e'));
        System.out.println("Hello".concat(str));
        System.out.println(str.compareTo(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('l','m'));
        System.out.println(str1.contains("Info"));
        System.out.println("Hello".trim());
    }
}
class StringFunc{
    public static void main(String[] args) {
        String a = "hello", a1 = "hello", b = "Hello", c = "hi";

        System.out.println("\na.charAt(5) : " + a.charAt(3));
        System.out.println("\na.compareTo(a1) : " + a.compareTo(a1));
        System.out.println("\na.compareTo(c) : " + a.compareTo(c));
        System.out.println("\na.equals(a1) : " + a.equals(a1));
        System.out.println("\na.equals(b) : " + a.equals(b));
        System.out.println("\na.equalsIgnoreCase(b) : " + a.equalsIgnoreCase(b));
        System.out.println("\nc.length() : " + c.length());
        System.out.println("\na.replace('l', 'p') : " + a.replace('l', 'p'));
        System.out.println("\na.startWith(H) : " + a.startsWith("H"));
        System.out.println("\na.startWith(h) : " + a.startsWith("h"));
        System.out.println("\na.endsWith(h) : " + a.endsWith("h"));
        System.out.println("\na.endsWith(o) : " + a.endsWith("o"));
        System.out.println("\na.indexOf('l') : " + a.indexOf('l'));
        System.out.println("\na.substring(2) : " + a.substring(2));
        System.out.println("\na.lastIndexOf('l') : " + a.lastIndexOf('l'));
        System.out.println();
    }
}
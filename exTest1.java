public class exTest1
{
    public static void main (String args[])
    {
        StringBuffer sb=new StringBuffer("Kunal");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(2));
        sb.setCharAt(2,'s');
        System.out.println(sb);
        System.out.println(sb.append("hi"));
        StringBuffer sb1=new StringBuffer("Java language");
        System.out.println(sb1.insert(5,"Programming"));
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println(sb2.reverse());
        StringBuffer sb3=new StringBuffer("Pune");
        System.out.println(sb3.deleteCharAt(1));
        StringBuffer sb4=new StringBuffer("Pune City");
        System.out.println(sb4.replace(0,4,"Nasik"));
        StringBuffer sb5=new StringBuffer("Kunal");
        System.out.println(sb5.substring(1));
        System.out.println(sb5.substring(1,3));

        

    }
}
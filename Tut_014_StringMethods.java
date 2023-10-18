public class Tut_14_StringMethods {
    public static void main(String[] args) {
        String name = "Satviki";
        int len = name.length();
        System.out.println(len);

        String lname = name.toLowerCase();
        System.out.println(lname);

        String upname = name.toUpperCase();
        System.out.println(upname);

        String non_trim = "      LOL     ";
        System.out.println(non_trim);
        String trim = non_trim.trim();
        System.out.println(trim);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace("i","a"));
        System.out.println(name.replace("at","ier"));

        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("l"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("vi"));
        System.out.println(name.indexOf("k",3));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.lastIndexOf("i",2));
        System.out.println(name.equals("Satviki"));
        System.out.println(name.equalsIgnoreCase("satviki"));

        // 7
        //satviki
        //SATVIKI
        //      LOL
        //LOL
        //viki
        //atvi
        //Satvaka
        //Sierviki
        //true
        //false
        //k
        //3
        //5
        //6
        //-1
        //true
        //true

    }
}

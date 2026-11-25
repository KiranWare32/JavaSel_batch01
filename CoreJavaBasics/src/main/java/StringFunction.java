public class StringFunction
{
    public static void main(String[] args) {
        String title = "Swag Labs";
        System.out.println(title.length());    //9
        System.out.println(title.toUpperCase()); //SWAG LABS
        System.out.println(title.contains("Labs")); //true
        System.out.println(title.startsWith("Labs")); //false
        System.out.println(title.substring(2,6)); //ag  L
        System.out.println(title.replace("Labs", "Shop")); //Swag Shop
        System.out.println("       admin      ".trim()); //admin

        System.out.println("--------------------------------------------------------------------");

        //Compare a String
        String expected = "Hello Admin";
        String actual = new String("Hello Admin");
        System.out.println(actual == expected); //false
        System.out.println(actual.equals(expected));//true
        System.out.println("hello admin".equalsIgnoreCase(expected)); //true

    }
}

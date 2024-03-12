public class Constructors {
    //Shirt class
    private static String color;
    private static char size;

    Constructors(){
        System.out.println("Inside constructor");
    }

    public static void putOn(){
        System.out.println("Shirt is ON");
    }

    public static void takeOff(){
        System.out.println("Shirt is Off");
    }

    public static void setColor(String newColor){
        color = newColor;
        System.out.println(color);
    }
    public static void setSize(char newSize){
        size = newSize;
        System.out.println(size);
    }

}

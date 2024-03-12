public class Shirt {
    public static String color;
    public static char size;
    Shirt(String color, char size){
        this.color = color;
        this.size = size;
    }
    public static void setColor(String color){
        System.out.println("color is " + color);

    }
    public static void setSize(char size){
        System.out.println("size is " + size);
    }
}
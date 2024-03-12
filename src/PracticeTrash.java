class Monkey{
    static String monkeyName = "Spider Monkey";
    static void sayMonkeyName(){
        System.out.println(monkeyName);
    }
}
public class PracticeTrash {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();

        Monkey[] monkeys = {m1,m2,m3};
        for(Monkey m : monkeys){
            m.sayMonkeyName();
        }
    }
}

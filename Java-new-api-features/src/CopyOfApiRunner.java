import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {

        Singleton a = Singleton.getSingleton();
        Singleton b = Singleton.getSingleton();
        if (a == b){
            System.out.println("MAtched");
        }
        else {
            System.out.println("MAtched not");
        }

        List names = new ArrayList();
        names.add("Ankit");
        names.add("Manglik");
        names.add("Anav");


//        List list = List.of("A","B");
//        doNotChange(names);
        doNotChange(List.copyOf(names));
        System.out.println(names);


    }

    private static void doNotChange(List names) {
        names.add("Method values");
    }
}
class Singleton {
    public static Singleton shared = null;
    private Singleton() {

    }
    public static Singleton getSingleton(){
        if (shared == null)
            shared = new Singleton();
        return shared;
    }

}

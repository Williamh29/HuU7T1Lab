import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("John");
        Cat cat2 = new Cat("Nick");
        Cat cat3 = new Cat("Bob");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        Cat cat4 = new Cat("Nemo");
    }
}

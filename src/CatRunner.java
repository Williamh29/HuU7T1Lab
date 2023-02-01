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
        Cat swapCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(cat4);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);
        for (int i = 0; i < cats.size(); i++) {
            String capName = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(capName);
        }
        System.out.println(cats);
        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}

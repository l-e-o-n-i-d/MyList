package ex7;

public class Main {
    public static void main(String[] args) {
        MyList<String> cars = new MyList<>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Toyota");
        cars.add("Mazda");
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        cars.remove(2);
        System.out.println(cars.size());
        System.out.println();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}

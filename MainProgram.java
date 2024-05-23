import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        Toy toy1 = new Toy(0, "Кукла", 25);
        Toy toy2 = new Toy(1, "Машина", 40);
        Toy toy3 = new Toy(2, "Робот", 3);
        Toy toy4 = new Toy(3, "Лего", 10);
        Toy toy5 = new Toy(4, "Игрушка", 50);
        Toy toy6 = new Toy(5, "Настольная игра", 5);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToyForPrice() {
        RandomChooser random = new RandomChooser();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\GeekBrains\\ToyStore\\Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}

import java.util.*;


public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Zadanie 3");
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "piłka"));
        items.add(new Item(2, "książka"));
        items.add(new Item(3, "plecak"));
        items.add(new Item(4, "kubek"));
        items.add(new Item(5, "samochód"));
        items.add(new Item(6, "telefon"));
        items.add(new Item(7, "kamień"));
        items.add(new Item(8, "okno"));
        items.add(new Item(9, "głośnik"));
        items.add(new Item(10, "mikrofon"));

        List<Item> firstFiveItems = items.subList(0, 5);

        Set<Item> itemFirstFiveSet = new HashSet<>(firstFiveItems);

        System.out.println("\npierwsze 5 przedmiotów [id : nazwa]");
        for (Item item : itemFirstFiveSet) {
            System.out.println(item.getId() + " : " + item.getName());
        }
    }
}

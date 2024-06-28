import java.util.*;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        System.out.println("Zadanie 2");
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "piłka"));
        items.add(new Item(2, "książka"));
        items.add(new Item(3, "plecak"));
        items.add(new Item(4, "kubek"));
        items.add(new Item(5, "samochód"));

        System.out.println("\nwykorzystanie get() i show()");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();

        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        Set<Map.Entry<Integer,String>> entrySet = itemMap.entrySet();

        System.out.println("\nwykorzystanie entrySet() [id : nazwa]");
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}



import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> items;

    public Wallet(String name) {
        this.name = name;


        this.items = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {

        return items.size();
    }

    public void addItem(IScan item) {
        this.items.add(item);
    }

}

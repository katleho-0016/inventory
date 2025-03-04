import java.util.ArrayList;
import java.util.Optional;

public class inventory {
    ArrayList<items> stored_list =new  ArrayList<items> ();
    // takes in item and quantity
    public inventory(){

    }

    public void addInventory(items item){
        this.stored_list.add(item);
    }

    public Optional<items> getItem(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        for (items item : stored_list) {
            if (name.equals(item.getName())) {
                return Optional.of(item);
            }
        }

        System.out.println("Item does not exist with name: "+name);
        return Optional.empty();
    }

    public void sellItem(items item){
        if (stored_list.contains(item)) {
            int index = this.stored_list.indexOf(item);
            stored_list.get(index).setQuantity(item.getQuantity()-1);
            if (stored_list.get(index).getQuantity() < 1){
                stored_list.remove(item);
            }
        else{
            System.out.println("Item does not exist in inventory");
            }
        }
    }


    public void getInventory(){
        for (items item: this.stored_list){
            System.out.println(item);
        }
    }
}

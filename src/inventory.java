import java.util.ArrayList;
public class inventory {
    ArrayList<items> stored_list =new  ArrayList<items> ();
    // takes in item and quantity
    public inventory(){

    }

    public void addInventory(items item){
        this.stored_list.add(item);
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

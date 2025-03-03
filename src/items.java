import java.util.Random;

public abstract class items {
    private String name; //name of the object
    final int id; //unique identifier
    private int quantity;
    public items(String name, int quantity){
        this.name = name;
        Random ran = new Random();
        this.id = ran.nextInt(10000);
        this.quantity = quantity ;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Name: "+this.getName()+
                "\nProduct id: "+this.getId()+
                "\nQuantity available: "+this.getQuantity();
    }

}

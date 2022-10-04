package session4_exercises.problem5;

public class Fridge {
    private int temperature;
    private Item[] items;

    public Fridge(int temperature) {
        this.temperature = temperature;
        this.items = new Item[100];
    }

    public int getTemperature() {
        return temperature;
    }

    public void setItems(int index, Item item){
        this.items[index] = item;
    }

    public void takeVegetableFromFridge(Vegetable vegetable, int stock, int weight) {
        if (vegetable.getStock() - stock >= 0 && vegetable.getWeight() - weight >= 0) {
            vegetable.setStock(vegetable.getStock() - stock);
            vegetable.setWeight(vegetable.getWeight() - weight);
        } else {
            System.out.println("Så meget har du slet ikke din fattigrøv.");
        }
    }

    public void takeFluidFromFridge(Fluid fluid, int stock, int mL) {
        if (fluid.getStock() - stock >= 0 && fluid.getmL() - mL >= 0) {
            fluid.setStock(fluid.getStock() - stock);
            fluid.setmL(fluid.getmL() - mL);
        } else {
            System.out.println("Så meget har du slet ikke din fattigrøv.");
        }
    }

    public void addFluidToFridge(Fluid fluid, int stock, int mL) {
        fluid.setStock(fluid.getStock() + stock);
        fluid.setmL(fluid.getmL() + mL);
    }

    public void addVegetableToFridge(Vegetable vegetable, int stock, int weight) {
        vegetable.setStock(vegetable.getStock() + stock);
        vegetable.setWeight(vegetable.getWeight() + weight);
    }

    public Item getItem(int id) {
        return items[id];
    }
}

public class Soup extends Food{

    private String filling;
    private int price;

    public Soup(String filling, int price) {
        this.filling = filling;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Суп " + filling + ", " + "цена: " + price);
    }
}

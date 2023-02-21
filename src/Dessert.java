public class Dessert extends Food{
    private String jam;
    private int portion;

    public Dessert(String jam, int portion) {
        this.jam = jam;
        this.portion = portion;
    }

    @Override
    public void print() {
        System.out.println("Дессерт с начинкой: " + jam + ", " + "порция: " + portion);
    }
}

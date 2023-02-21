public class SecondCourse extends Food{

    private String sideDish;
    private int portion;

    public SecondCourse(String sideDish, int portion) {
        this.sideDish = sideDish;
        this.portion = portion;
    }

    @Override
    public void print() {
        System.out.println("Второе блюдо " + sideDish + ", " + "порция: " + portion);
    }
}

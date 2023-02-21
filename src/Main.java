public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Soup"), createObject("SecondCourse"), createObject("Dessert")};
        for(Printable printable: printables){
            printable.print();
        }
    }

    public static Printable createObject(String className){
        switch (className){
            case "Soup":
                Soup soup = new Soup("с грибами",200);
                return soup;
            case "SecondCourse":
                SecondCourse secondCourse = new SecondCourse("с рисом",2);
                return secondCourse;
            case "Dessert":
                Dessert dessert = new Dessert("клубника",1);
                return dessert;
        }
        return null;
    }
}
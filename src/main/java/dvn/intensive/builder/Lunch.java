package dvn.intensive.builder;

public class Lunch {
    private String salad;
    private String soup;
    private String mainDish;
    private String beverage;
    private String desert;

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    @Override
    public String toString() {
        return "salad: " + salad +
                ", soup: " + soup +
                ", main dish: " + mainDish +
                ", beverage: " + beverage +
                ", desert: " + desert;
    }
}
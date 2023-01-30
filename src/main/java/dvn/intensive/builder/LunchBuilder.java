package dvn.intensive.builder;

public interface LunchBuilder {
    Lunch reset();
    LunchBuilder addSalad();
    LunchBuilder addSoup();
    LunchBuilder addMainDish();
    LunchBuilder addBeverage();
    LunchBuilder addDesert();

}

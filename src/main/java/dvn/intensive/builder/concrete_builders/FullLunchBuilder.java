package dvn.intensive.builder.concrete_builders;

import dvn.intensive.builder.LunchBuilder;
import dvn.intensive.builder.Lunch;

public class FullLunchBuilder implements LunchBuilder {
    private Lunch lunch;

    @Override
    public Lunch reset() {
        lunch = new Lunch();
        return lunch;
    }

    @Override
    public LunchBuilder addSalad() {
        lunch.setSalad("Cesar");
        return this;
    }

    @Override
    public LunchBuilder addSoup() {
        lunch.setSoup("Borsch");
        return this;
    }

    public LunchBuilder addMainDish() {
        lunch.setMainDish("Lasagna");
        return this;
    }

    @Override
    public LunchBuilder addBeverage() {
        lunch.setBeverage("Coffee");
        return this;
    }

    @Override
    public LunchBuilder addDesert() {
        lunch.setDesert("Cookie");
        return this;
    }
}
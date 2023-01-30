package dvn.intensive.builder.concrete_builders;

import dvn.intensive.builder.LunchBuilder;
import dvn.intensive.builder.Lunch;

public class LightLunchBuilder implements LunchBuilder {

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

    @Override
    public LunchBuilder addMainDish() {
        lunch.setMainDish("not in order");
        return this;
    }

    @Override
    public LunchBuilder addBeverage() {
        lunch.setBeverage("not in order");
        return this;
    }

    @Override
    public LunchBuilder addDesert() {
        lunch.setDesert("not in order");
        return this;
    }
}
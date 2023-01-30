package dvn.intensive.builder;

public class Director {
    public Lunch getLunch(LunchBuilder lunchBuilder) {
        Lunch lunch = lunchBuilder.reset();
        lunchBuilder.addSoup()
                .addSalad()
                .addMainDish()
                .addBeverage()
                .addDesert();
        return lunch;
    }
}
public class Meal
{
    private Burger burger;
    private Item drink;
    private Item side;
    
    public Meal(Burger burger, Item drink, Item side)
    {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
    
    public double getTotalPrice()
    {
        return burger.getTotalPrice() + drink.getBasePrice() + side.getBasePrice();
    }
    
    public void printMeal()
    {
        System.out.println("---- MEAL ----");
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("TOTAL PRICE: " + getTotalPrice());
    }
}

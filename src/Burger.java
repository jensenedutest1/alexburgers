public class Burger extends Item
{
    private Item topping1;
    private Item topping2;
    
    public Burger(String name, double price)
    {
        super(name, ItemType.BURGER, price);
    }
    
    @Override
    public String getName()
    {
        return super.getName() + " Burger";
    }
    
    public double getTotalPrice()
    {
        return getBasePrice() + (topping1 == null ? 0 : topping1.getBasePrice())
                + (topping2 == null ? 0 : topping2.getBasePrice());
    }
    
    public void setToppings(Item topping1, Item topping2)
    {
        this.topping1 = topping1;
        this.topping2 = topping2;
    }
    
    protected void printToppings()
    {
        if (topping1 != null) topping1.printItem();
        if (topping2 != null) topping2.printItem();
    }
    
    @Override
    public void printItem()
    {
        super.printItem();
        printToppings();
    }
}

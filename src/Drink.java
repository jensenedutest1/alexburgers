public class Drink extends Item
{
    public Drink(String name, double price)
    {
        super(name, ItemType.DRINK, price);
    }
    
    @Override
    public String getName()
    {
        return super.getName() + " Drink";
    }
}

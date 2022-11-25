public class Topping extends Item
{
    public Topping(String name, double price)
    {
        super(name, ItemType.TOPPING, price);
    }
    
    @Override
    public String getName()
    {
        return super.getName() + " Topping";
    }
}

public class SideDish extends Item
{
    public SideDish(String name, double price)
    {
        super(name, ItemType.SIDE, price);
    }
    
    @Override
    public String getName()
    {
        return super.getName() + " Side Dish";
    }
}

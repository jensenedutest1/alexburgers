public class DeluxeBurger extends Burger
{
    private Item extra1;
    
    public DeluxeBurger(String name, double price)
    {
        super(name, price);
    }
    
    @Override
    public double getTotalPrice()
    {
        return super.getTotalPrice() + (extra1 == null ? 0 : extra1.getBasePrice());
    }
    
    public void setExtras(Item extra1)
    {
        this.extra1 = extra1;
    }
    
    protected void printExtras()
    {
        if (extra1 != null) extra1.printItem();
    }
    
    @Override
    public void printItem()
    {
        super.printItem();
        printExtras();
    }
}

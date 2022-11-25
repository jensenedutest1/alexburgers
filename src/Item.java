public class Item
{
    private String name;
    private ItemType type;
    private double price;
    
    public Item(String name, ItemType type, double price)
    {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public ItemType getType()
    {
        return type;
    }
    
    public void setType(ItemType type)
    {
        this.type = type;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public double getBasePrice()
    {
        return price;
    }
    
    public void printItem()
    {
        System.out.println(getName() + " ... " + price);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Item mayo = new Item("Mayo", ItemType.TOPPING, 0.3);
        Item ketchup = new Item("Ketchup", ItemType.TOPPING, 0.2);
        Burger regularBurger = new Burger("Reggie", 5);
        regularBurger.setToppings(mayo, ketchup);
        Item coke = new Item("Coca Cola", ItemType.DRINK, 1);
        Item fries = new Item("Fries", ItemType.SIDE, 2);
        
        Meal regularMeal = new Meal(regularBurger, coke, fries);
        regularMeal.printMeal();
        
        System.out.println();
        
        DeluxeBurger deluxeBurger = new DeluxeBurger("Dellie", 6);
        deluxeBurger.setToppings(mayo, ketchup);
        Item mustard = new Item("Mustard", ItemType.TOPPING, 0.4);
        deluxeBurger.setExtras(mustard);
        Item sprite = new Item("Sprite", ItemType.DRINK, 1);
        Item tacos = new Item("Tacos", ItemType.SIDE, 2.5);
        
        Meal deluxeMeal = new Meal(deluxeBurger, sprite, tacos);
        deluxeMeal.printMeal();
    }
}
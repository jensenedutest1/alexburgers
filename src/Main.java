public class Main
{
    public static void main(String[] args)
    {
        Item mayo = new Topping("Mayo", 0.3);
        Item ketchup = new Topping("Ketchup", 0.2);
        Burger regularBurger = new Burger("Reggie", 5);
        regularBurger.setToppings(mayo, ketchup);
        Item coke = new Drink("Coca Cola", 1);
        Item fries = new SideDish("Fries", 2);
        
        Meal regularMeal = new Meal(regularBurger, coke, fries);
        regularMeal.printMeal();
        
        System.out.println();
        
        DeluxeBurger deluxeBurger = new DeluxeBurger("Dellie", 6);
        deluxeBurger.setToppings(mayo, ketchup);
        Item mustard = new Topping("Mustard", 0.4);
        deluxeBurger.setExtras(mustard);
        Item sprite = new Drink("Sprite", 1);
        Item tacos = new SideDish("Tacos", 2.5);
        
        Meal deluxeMeal = new Meal(deluxeBurger, sprite, tacos);
        deluxeMeal.printMeal();
    }
}
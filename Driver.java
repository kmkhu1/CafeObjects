public class Driver
{
    public static void main(String[] args)
    {
        MenuItem constructorTest = new MenuItem();                                  //testing the default constructor
        System.out.println(constructorTest.toString());
        System.out.println("Testing the parameterized constructor");
        MenuItem choice = new MenuItem("sea food", "food from the sea",50,"catch from the sea and cook");
        System.out.println(choice.toString());
        
        
        System.out.println("Testing the mutator methods");
        choice.setName("Chicken");
        choice.setDescription("Delicious bird");
        choice.setPreperationMethod("Deep fryed in oil");
        choice.setPrice(30);
        System.out.println(choice.toString());
        
        System.out.println("Testing the accessor methods");
        System.out.println(choice.getName());
        System.out.println(choice.getDiscription());
        System.out.println(choice.getPrice());
        System.out.println(choice.getPreperationMethod());
        
        MenuSystem foodMenu = new MenuSystem();
        foodMenu.displayMenu();
    }
}
import java.util.Scanner;
public class MenuSystem
{
    private int userChoice;
    private Scanner keyboard;
    public MenuSystem()
    {
        userChoice = 1;
        keyboard = new Scanner(System.in);
    }
    
    public void displayMenu()
    {
        
        do
        {
            System.out.println("\nWelcome to Cafe Manager! \n Please select an option \n 1)Add an Order \n 2)View an Order \n 3) Close an Oredr \n 4)Staff training"+
            "\n 5) Add a menu item \n 6) Quit \n");
            userChoice = keyboard.nextInt();
            switch(userChoice)
            {
                case 1: addAnOrder();
                break;
                case 2: viewAnOrder();
                break;
                case 3: closeAnOrder();
                break;
                case 4: staffTraining();
                break;
                case 5: addMenuItem();
                break;
                case 6: quit();
                break;
                default: System.out.println("please enter only numbers 1 to 6");
            }
        }
        while(userChoice != 6);
                                              
    }
    
    private static void addAnOrder()
    {
        System.out.println("Order added");
    }
    
    private static void viewAnOrder()
    {
        System.out.println("Order viewed");
    }
    
    private static void closeAnOrder()
    {
        System.out.println("Order closed");
    }
    
    private static void staffTraining()
    {
        System.out.println("Staff Trained");
    }
    
    private static void addMenuItem()
    {
        System.out.println("Menu item added");
    }
    
    private static void quit()
    {
        System.out.println("Quitting now");
    }
    
    public String toString()
    {
        return("User Choice: " + userChoice + "Scanner: " + keyboard); 
    }
}
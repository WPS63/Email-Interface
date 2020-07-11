import java.util.*;
public class email
{
    public static void main(String args[])
    {
        //declare new object
        emailAddress user = new emailAddress();
        //get name(first last), department
        user.setName();
        user.setDepartment();
        user.setAddress();
        //open menu
        user.showMenu();
    }
}
class emailAddress
{
    //class variables
    String password;
    int boxCapacity;
    String department;
    String address;
    String firstName;
    String lastName;
    
    //constructor
    emailAddress()
    {
        String password = "";
        int boxCapacity = 100;
        String department = "";
        String address = ""; 
        String firstName = "";
        String lastName = "";
    }
    void generateRandomPW()
    {
        String randomOptions = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder sb = new StringBuilder(9);
        for(int i = 0; i < 9; i++)
        {
            int index = (int)(randomOptions.length() * Math.random());
            
            sb.append(randomOptions.charAt(index));
        }
        password += sb.toString();
        System.out.println("Your default pw is: " + password);
    }
    //setters
    void setName()
    {
        System.out.println("What is your first name?");
        Scanner sc1 = new Scanner(System.in);
        firstName = sc1.next();
        System.out.println("What is your last name?");
        Scanner sc2 = new Scanner(System.in);
        lastName = sc2.next();
    }
    void setDepartment()
    {
        System.out.println("What department do you work in?");
        Scanner sc1 = new Scanner(System.in);
        department = sc1.next();    
        
    }
    void setAddress()
    {
        //will need scanner to get first and last arguments
        address = firstName + "."  + lastName + "@email.com";   
    }
    void setPassword()
    {
        String pw = "";
        System.out.println("Please enter your new password");
        Scanner sc = new Scanner(System.in);
        pw = sc.next();
        password = pw;
        System.out.println("password changed successfully to: " + password);
    }
    void setmailboxCapacity()
    {
        int capacity = 0;
        System.out.println("Enter what you would like to change your mailbox capacity to: ");
        Scanner sc = new Scanner(System.in);
        capacity = sc.nextInt();
        //scanner to get new capacity
        if(capacity > 0 && capacity < 5001)
        {
            boxCapacity = capacity;
            System.out.println("Success");
        }
        else{System.out.println("Please enter a capacity between 1 and 5000");}
    }
    void changeEmailAddress()
    {
        String newEmail = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your new email address");
        newEmail = sc.next();
        address = newEmail + "@email.com";
        System.out.println("your new email is: " + address);
    }
    //getters
    void getName()
    {
        //display name
        System.out.println(firstName + " " + lastName);
    }
    void getAddress()
    {
        //display address
        System.out.println(address);
    }
    void getDepartment()
    {
        System.out.println(department);
    }
    void getBoxCapacity()
    {
        //display cap
        System.out.println(boxCapacity);
    }
    void showMenu()
    {
        int selection = 0;
        System.out.println("1: Change Email");
        System.out.println("2: Change password");
        System.out.println("3. Change your mailbox capacity");
        System.out.println("4. Display your information");
        System.out.println("5. Exit the email control portal");
        System.out.println("Please enter your selection: ");
        Scanner sc1 = new Scanner(System.in);
        selection = sc1.nextInt();
        
        if(selection == 1)
        {
            changeEmailAddress();
        }
        else if(selection == 2)
        {
            setPassword();
        }
        else if(selection == 3)
        {
            setmailboxCapacity();
        }
        else if(selection == 4)
        {
            getName();
            getAddress();
            getDepartment();
        }
        else if(selection == 5)
        {
            System.exit(0);
        }
        else{System.out.println("Invalid selection");}
        System.out.println("Make another selection or exit the program by pressing 5");
        hideMenu();
    }
    void hideMenu()
    {
        int selection = 0;
        Scanner sc1 = new Scanner(System.in);
        selection = sc1.nextInt();
        
        if(selection == 1)
        {
            changeEmailAddress();
        }
        else if(selection == 2)
        {
            setPassword();
        }
        else if(selection == 3)
        {
            setmailboxCapacity();
        }
        else if(selection == 4)
        {
            getName();
            getAddress();
            getDepartment();
        }
        else if(selection == 5)
        {
            System.exit(0);
        }
        else{System.out.println("Invalid selection");}
        System.out.println("Make another selection or exit the program by pressing 5");
        hideMenu();
        
    }
    
}
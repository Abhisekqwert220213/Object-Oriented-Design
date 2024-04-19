/**
 * Abhisek Paul - Undergraduate student of 2nd year in Khulna University with student ID 220213.
 */
package Solid_Principle;

public class Customer {
    private String name;
    private String email;

    /**
     * Constructs a Customer object with the given name and email.
     * @param name The name of the customer.
     * @param email The email address of the customer.
     */
    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     * Retrieves the name of the customer.
     * @return The name of the customer.
     */
    public String getname(){
        return name;
    }

    /**
     * Sets the name of the customer.
     * @param name The new name for the customer.
     */
    public void setname(String name){
        this.name = name;
    }

    /**
     * Retrieves the email address of the customer.
     * @return The email address of the customer.
     */
    public String getEmail(){
        return email;
    }

    /**
     * Sets the email address of the customer.
     * @param email The new email address for the customer.
     */
    public void setEmail(String email){
        this.email = email;
    }
}

/**
 * Represents an email service for sending emails.
 */
package Solid_Principle;

public class EmailService {
    /**
     * Sends an email to the specified recipient with the given message.
     * @param recipient The email address of the recipient.
     * @param message The content of the email message.
     */
    public void sendEmail(String recipient, String message){
        System.out.println("Sending email to: "+recipient);
        System.out.println("Message: "+ message);
    }
}

/**
 * Main class to demonstrate sending an email to a customer.
 */
package Solid_Principle;

public class Main {
    public static void main(String[] args){
        // Creating a customer object
        Customer customer = new Customer("John Doe","john@example.com");

        // Creating an email service object
        EmailService emailService = new EmailService();

        // Sending a welcome email to the customer
        emailService.sendEmail(customer.getEmail(),"Hello "+ customer.getname() + ",thank you for being our customer !");
    }
}

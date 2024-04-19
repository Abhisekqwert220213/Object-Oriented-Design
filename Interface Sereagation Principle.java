/**
 * Abhisek Paul - Undergraduate student of 2nd year in Khulna University with student ID 220213.
 */
package Solid_Principle_Interface_Segragation;

/**
 * Main class to demonstrate Interface Segregation Principle (ISP) implementation.
 */
public class Main {

    public static void main(String[] args) {
        // Using a multifunctional printer
        MultifunctionPrinter multifunctionPrinter = new MultifunctionPrinter();
        multifunctionPrinter.print();
        multifunctionPrinter.scan();
        multifunctionPrinter.fax();

        // Using a basic printer
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
    }
}

/**
 * Represents a Fax interface for faxing functionality.
 */
package Solid_Principle_Interface_Segragation;

public interface Fax {
    /**
     * Sends a fax.
     */
    void fax();
}

/**
 * Represents a Printer interface for printing functionality.
 */
package Solid_Principle_Interface_Segragation;

public interface Printer {
    /**
     * Prints a document.
     */
    void print();
}

/**
 * Represents a Scanner interface for scanning functionality.
 */
package Solid_Principle_Interface_Segragation;

public interface Scanner {
    /**
     * Scans a document.
     */
    void scan();
}

/**
 * Class representing a basic printer that only implements the Printer interface.
 * This implementation adheres to the Interface Segregation Principle as it only implements the necessary functionality for printing.
 */
package Solid_Principle_Interface_Segragation;

class BasicPrinter implements Printer {
    /**
     * Prints a document using the basic printer.
     */
    @Override
    public void print() {
        System.out.println("\nUsing basic Printer :");
        System.out.println("Printing...");
    }
}

/**
 * Class representing a multifunctional printer that implements all interfaces.
 * This implementation adheres to the Interface Segregation Principle as it separates the interfaces for different functionalities,
 * allowing clients to use only the interfaces they need without being forced to implement unnecessary methods.
 */
package Solid_Principle_Interface_Segragation;

class MultifunctionPrinter implements Printer, Scanner, Fax {
    /**
     * Prints a document using the multifunctional printer.
     */
    @Override
    public void print() {
        System.out.println("Using Multifunctionprinter :");
        System.out.println("Printing...");
    }

    /**
     * Scans a document using the multifunctional printer.
     */
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    /**
     * Sends a fax using the multifunctional printer.
     */
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

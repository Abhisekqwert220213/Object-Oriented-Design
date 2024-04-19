/**
 * Abhisek Paul - Undergraduate student of 2nd year in Khulna University with student ID 220213.
 */
package Solid_Principle.DIP;

/**
 * Main class to demonstrate Dependency Inversion Principle (DIP) implementation.
 */
public class Main {
    
    public static void main(String[] args) {
        // Create instances of low-level classes
        FileOperation reader = new FileReader();
        FileOperation writer = new FileWriter();

        // High-level class depends on abstractions (interfaces), not concrete implementations
        FileManager fileManager1 = new FileManager(reader);
        FileManager fileManager2 = new FileManager(writer);

        // Execute operations
        fileManager1.execute(); // Output: Reading data from file...
        fileManager2.execute(); // Output: Writing data to file...
    }
}

/**
 * Represents a FileWriter class that implements FileOperation interface.
 */
package Solid_Principle.DIP;

public class FileWriter implements FileOperation {
    @Override
    public void performOperation(){
       System.out.println("Writing data to file : ");
    }
}

/**
 * Represents a FileReader class that implements FileOperation interface.
 */
package Solid_Principle.DIP;

public class FileReader implements FileOperation {
    @Override
    public void performOperation(){
        System.out.println("Reading data from file :");
    }
}

/**
 * Interface representing file operations.
 */
package Solid_Principle.DIP;

public interface FileOperation {
    /**
     * Perform file operation.
     */
    public void performOperation();
}

/**
 * Represents a FileManager class that executes file operations.
 */
package Solid_Principle.DIP;

public class FileManager {
    
    private FileOperation fileOperation;
    
    /**
     * Constructs a FileManager object with the specified FileOperation.
     * @param fileOperation The file operation to be performed.
     */
    public FileManager(FileOperation fileOperation){
        this.fileOperation =  fileOperation;
    }
    
    /**
     * Executes the file operation.
     */
    public void execute(){
        fileOperation.performOperation();
    }
}


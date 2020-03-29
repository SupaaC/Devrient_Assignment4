/*
 * create an instance of DuplicateRemover: duplicateRemover
 * 
 * use this instance to write to the output file
 * 
 */

import java.io.IOException;

public class Application {
    
	public static void main(String[] args) throws IOException {
    	
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
    
    }
}

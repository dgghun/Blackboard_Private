
package blackboard;

import Factory.FileReaderFactory;
import blackboard.Model.I_FileReader;

/**
 *
 * @author David_Garcia
 */
public class Blackboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileReaderFactory factory = new FileReaderFactory();
        
        I_FileReader csvFile = factory.getFileReader("csv");
        I_FileReader qfxFile = factory.getFileReader("qfx");
        I_FileReader ofxFile = factory.getFileReader("ofx");

        final String FILE_1 = "C:\\Users\\David_Garcia\\Downloads\\Checking1.qfx";
        final String FILE_2 = "C:\\Users\\David_Garcia\\Downloads\\sample-noheader.csv";
        final String FILE_3 = "C:\\Users\\David_Garcia\\Downloads\\Checking1.csv";
        
//        System.out.println(csvFile.getFileInfo(FILE_3));
        qfxFile.getFileInfo(FILE_1);
        
       
        System.out.print("\n\n");
    }
    
}


package blackboard.Model;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *  CSV File reader using Apache Commons CSV
 * NEED TO ADJUST TO HOW OUR IMPLEMENTATION
 */
public class File_CSV implements I_FileReader{
    
    
    public File_CSV(){}

    @Override
    public String getFileInfo(String filePath) {
        
        String strToReturn;
         try{
             
            if(filePath.length() < 4 || !filePath.endsWith(".csv"))
                return "ERROR: CSV file not selected";
                
            System.out.println("Reading file: " + filePath + "\n");
            Reader reader = Files.newBufferedReader(Paths.get(filePath));   //read file
            
            //Parse file w/ options for reading header auto detection
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
            
            
            
            Iterable<CSVRecord> csvRecord =  csvParser.getRecords();    //Get record itereator
            
            // Do something with the records
            for(CSVRecord record : csvRecord){
                System.out.println("RECORD " + record.getRecordNumber() + ": " + record.toString());
                System.out.println("Column 0: " + record.get(0).trim());
                System.out.println("Column 1: " + record.get(1).trim());
                System.out.println("Column 2: " + record.get(2).trim());
                System.out.println("Column 3: " + record.get(3).trim());
                System.out.println("Column 4: " + record.get(4).trim());
                System.out.println("\n");    
            }
            
        }catch(Exception e){
            return "\nERROR:" + e.toString();
        }
        return "\n Your file: '" + filePath + "' was read successfully!";   
    }
    
  
}

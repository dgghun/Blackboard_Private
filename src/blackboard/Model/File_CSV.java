
package blackboard.Model;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *  CSV File reader using Apache Commons CSV
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
                System.out.println(record.getRecordNumber() + ": " + record.toString());
            }
            
        }catch(Exception e){
            return "\nERROR:" + e.toString();
        }
        return "\n Your file: '" + filePath + "' was read successfully!";   
    }
    
  
}

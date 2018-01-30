
package Factory;

import blackboard.Model.File_CSV;
import blackboard.Model.File_OFX;
import blackboard.Model.File_QFX;
import blackboard.Model.I_FileReader;

/**
 *
 */
public class FileReaderFactory {
    
    public I_FileReader getFileReader(String fileType){
        if(fileType == null)
            return null;
        else if(fileType.equalsIgnoreCase("CSV"))
            return new File_CSV();
        else if(fileType.equalsIgnoreCase("QFX"))
            return new File_QFX();
        else if(fileType.equalsIgnoreCase("OFX"))
            return new File_OFX();
        else return null;
        
    }
}

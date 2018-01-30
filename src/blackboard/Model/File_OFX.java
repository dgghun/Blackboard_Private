
package blackboard.Model;

/**
 *
 */
public class File_OFX implements I_FileReader{


    public File_OFX(){}
    
   @Override
    public String getFileInfo(String filePath) {
        return "Your file name is: " + filePath;   
    }
    
}

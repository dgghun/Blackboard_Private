
package blackboard.Model;

/**
 *
 */
public class File_QFX implements I_FileReader{

    public File_QFX(){}
    
  @Override
    public String getFileInfo(String filePath) {
        return "Your file name is: " + filePath;   
    }
    
}

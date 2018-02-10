
package blackboard.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;

/**
 *
 */
public class File_QFX implements I_FileReader{

    public File_QFX(){}
    
  @Override
    public String getFileInfo(String filePath) {
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(Paths.get(filePath).toString()));
            System.out.println("Reading file: " + filePath + "\n");    
            
            String str;
          
            //read string in by line
            while((str = br.readLine()) != null){
                
                if(str.trim().equalsIgnoreCase("<STMTTRN>")){
                    
                    Boolean flag = true;
                    while((str = br.readLine()) != null && flag){
                        if(str.trim().equalsIgnoreCase("</STMTTRN>"))
                            flag = false;
                        else
                            System.out.println(str.trim());
                    }
                    System.out.println("\n");
                }
            }
        }catch(Exception e){
            return "\nERROR:" + e.toString();
        }
        
        return "Your file name is: " + filePath;   
    }
    
    
}

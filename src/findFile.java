import java.io.File;
import java.util.Scanner;

public class findFile{

        public File readFile(String filePath) throws FileNotFound{

            File file=new File(filePath);
            // If the path is incorrect it will throw an customize error.
            if(!file.exists()){
                throw  new FileNotFound("Invalid File Directory!!");
            }

            else{
                return file;
            }


    }


}

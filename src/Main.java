import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        findFile findFile=new findFile();

        try {
            File file=findFile.readFile("/Users/vivekmondal/Documents/VivekMondal_Documents/Natural_Language_Processing_CHATBOT/UPDATED_NLP_COURSE/06-Deep-Learning/melville-moby_dick.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
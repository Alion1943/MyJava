import java.io.File;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) {

        File file = new File("E:/123.txt");
        System.out.println(file.exists()?"存在":"不存在");

        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.exists()?"存在":"不存在");
        System.out.println(file.getAbsolutePath());


    }
}

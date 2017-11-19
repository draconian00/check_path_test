import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Path : ");
        String p_arg = sc.nextLine();
        Path p = Paths.get(p_arg);

        System.out.println("path : " + p);
        System.out.println("isAbsolute : " + p.isAbsolute());
        System.out.println("toUri : " + p.toUri());
        System.out.println("toRealPath : " + p.toRealPath());


        File f = p.toFile();

        System.out.println("file : " + f.getName());
        System.out.println("isExist : " + f.exists());
        System.out.println("isDir : " + f.isDirectory());
    }
}

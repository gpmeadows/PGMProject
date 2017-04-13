import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

/**
 * Created by gmeadows on 4/10/17.
 */
public class PGM extends Image {
    private int[][] pixels;

    // Default constructor
    public PGM(){
        magic = "";
        width = 0;
        height = 0;
        depth = 0;
        pixels = null;
    }

    // Overloading constructor
    public PGM (String file) {
        Scanner sc;
        try {
            File file_ptr = new File(file);
            sc = new Scanner(file_ptr);

            // Read Magic number
            magic = sc.next();

            // Read width and height
            width = Integer.parseInt(sc.next());
            height = Integer.parseInt(sc.next());

            // Read depth
            depth = Integer.parseInt(sc.next());

            // Read pixel values
            pixels = new int[height][width];
            // use loop to read the pixels


        } catch (FileSystemNotFoundException E) {
            System.out.println("Could not find the file");
        }
    }
}

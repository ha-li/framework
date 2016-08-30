import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by DevAdmin on 8/19/2016.
 */
public class ClassLoaderFileReading {


    public void printFile(BufferedReader bf) throws IOException {
        String line;
        while( (line=bf.readLine()) != null ) {
            System.out.println(line);
        }

        System.out.println("EOF reached");
    }

    public void fileNotFoundException(String fileName) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public void classLoaderFileReading(String fileName) {
        URL path = ClassLoader.getSystemResource(fileName);
        try {
            if (null == path) {
                throw new FileNotFoundException("Failed to find file " + fileName);
            }

            BufferedReader bf = new BufferedReader(new FileReader(path.getFile()));
            printFile(bf);

        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void thisClassLoaderFileReading(String fileName) {
        URL path = this.getClass().getResource(fileName);
        try {
            if(null == path) {
                throw new FileNotFoundException("Failed to find file " + fileName);
            }

            BufferedReader bf = new BufferedReader(new FileReader(path.getFile()));
            printFile(bf);
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClassLoaderFileReading fileReading = new ClassLoaderFileReading();
        fileReading.fileNotFoundException("sys.properties");
        fileReading.classLoaderFileReading("local/sys.properties");
        fileReading.thisClassLoaderFileReading("local/sys.properties");
    }
}

import java.io.*;

public class fileReadAndWrite {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

        FileWriter fw = new FileWriter("output.txt"); // opens/creates file
        fw.write("Hello, Java I/O!\n");
        fw.write("Another line.\n");
        fw.close();

        FileWriter f = new FileWriter("log.txt", true); // append mode
        f.write("New entry\n");
        f.close();

    }
}
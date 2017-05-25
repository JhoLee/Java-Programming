/**
 * @date : 2017. 5. 25.
 */
/**
 * <pre>
 *  
 *    |_ FileWriterEx.java
 * 
 * </pre>
 * @date : 2017. 5. 25. 오후 1:38:13
 * @version : 
 * @author : Jho
 */

import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);

        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("c:\\tmp\\test.txt");
            while ((c = in.read()) != -1) {
                fout.write(c);
            }
            in.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.print("test");
    }

}

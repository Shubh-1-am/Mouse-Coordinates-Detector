import java.io.*;
import java.util.Arrays;

public class Mouse {

    private static final String PATH = "/dev/input/mice";

    public static void main(String[] args) {

        File file = new File(PATH);
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[3];
        int mouse, x, y,left,right,middle;

        try {
            fileInputStream = new FileInputStream(file);
            while (fileInputStream.read(bFile, 0, bFile.length) != -1) {
                mouse = bFile[0];
                x = bFile[1];
                y = bFile[2];
                left = bFile[0] & 0x1;
                right = bFile[0] & 0x2;
                middle = bFile[0] & 0x4;
                System.out.println("["+mouse+","+x+","+y+","+left+","+right+","+middle+"]");
//                printCoordinates(mouse,x,y);
            }

            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




}

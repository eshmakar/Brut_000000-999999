import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\java\\0.txt", true);
        System.out.println("Идет выполнение...");
        for (int i = 1; i <= 9; i++) {
            fw.write("00000"+i+"\n");
        }
        for (int i = 10; i <= 99; i++) {
            fw.write("0000"+i+"\n");
        }
        for (int i = 100; i <= 999; i++) {
            fw.write("000"+i+"\n");
        }
        for (int i = 1000; i <= 9999; i++) {
            fw.write("00"+i+"\n");
        }
        for (int i = 10000; i <= 99999; i++) {
            fw.write("0"+i+"\n");
        }
        for (int i = 100000; i <= 999999; i++) {
            fw.write(i+"\n");
        }

        fw.close();
        System.out.println("Готово!`");

    }
}
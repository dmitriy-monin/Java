package GeekBrains.ООП.Семинар_2.ДЗ;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output {
    public static void outputData(Tree data, Aim aim) {
        List<Link> links = data.getLinks();
        /**
         * Вывод в консоль
         */
        if (aim == Aim.CONSOLE) {
            for (Link el : links) {
                System.out.println(el);
            }
        }

        /**
         * Вывод в файл
         */
        if (aim == Aim.FILE) {
            try(FileWriter writer = new FileWriter("output.txt", false)) {
                for (Link el : links) {
                    writer.write(el.toString());
                    writer.write("\n");
                    writer.flush();
                }
            }
            catch(IOException ex) {
                System.err.println();
            }
        }
    }
}

package GeekBrains.ООП.Семинар_1;

import java.util.List;

public class Output {
    public static void output_data(Tree data, Aim aim) {
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
            try(java.io.FileWriter writer = new java.io.FileWriter("output.txt", false)) {
                for (Link el : links) {
                    writer.write(el.toString());
                    writer.write("\n");
                    writer.flush();
                }
            }
            catch(java.io.IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

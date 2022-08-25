package GeekBrains.ООП.Семинар_4.ДЗ;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Export implements Exporter{

    @Override
    public void exportFile(List<String> lines) {
        try(FileWriter writer = new FileWriter("output.csv", false)) {
            for (String el : lines) {
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

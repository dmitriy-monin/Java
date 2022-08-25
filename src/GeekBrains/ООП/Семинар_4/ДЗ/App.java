package GeekBrains.ООП.Семинар_4.ДЗ;

public class App {
    public static void main(String[] args) {
        var documentRepository = new DocumentRepository();

        documentRepository.save(new CsvDocument());
        documentRepository.save(new JsonDocument());
        documentRepository.deleteById(1L);



    }
}

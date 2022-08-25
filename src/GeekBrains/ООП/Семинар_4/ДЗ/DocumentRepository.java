package GeekBrains.ООП.Семинар_4.ДЗ;


import java.time.LocalDateTime;

public class DocumentRepository implements Repository<Document, Long> {
    @Override
    public void save(Document document) {
        var data = new Date();
        data.setDocument(document);
        data.setCreatedData(LocalDateTime.now());
        data.setId(1); // add Id generator
        DataBase.putData(data);
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Document findById(Long aLong) {
        return null;
    }

    @Override
    public Long updateById(Document document, Long aLong) {
        return null;
    }
}

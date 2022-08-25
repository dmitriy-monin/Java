package GeekBrains.ООП.Семинар_4.ДЗ;

import java.time.LocalDateTime;

public class Date {
    private long id;
    private LocalDateTime createdData;
    private Document document;

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedData(LocalDateTime createdData) {
        this.createdData = createdData;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}

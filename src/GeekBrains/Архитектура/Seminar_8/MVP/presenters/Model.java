package GeekBrains.Архитектура.Seminar_8.MVP.presenters;

import GeekBrains.Архитектура.Seminar_8.MVP.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return номер бронирования
     */
    int reservationTable(Date reservationDate, int tableNo, String name);
}

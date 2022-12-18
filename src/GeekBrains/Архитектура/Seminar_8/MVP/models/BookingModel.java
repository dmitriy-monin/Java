package GeekBrains.Архитектура.Seminar_8.MVP.models;

import GeekBrains.Архитектура.Seminar_8.MVP.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class BookingModel implements Model {


    private Collection<Table> tables;
    private ArrayList reservations = new ArrayList<>();

    public Collection<Table> loadTables(){
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }


    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return номер бронирования
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        Optional<Table> table = loadTables().stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            Reservation reservation = new Reservation(reservationDate, name);
            table.get().getReservations().add(reservation);
            reservations.add(reservation.getId());
            return reservation.getId();
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public void editReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        if (reservations.contains(oldReservation)){
            reservations.remove(oldReservation-1);
        } else {
        throw new RuntimeException("Некорректный номер брони.");
        }
    }
}

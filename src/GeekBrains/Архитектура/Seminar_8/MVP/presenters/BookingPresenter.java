package GeekBrains.Архитектура.Seminar_8.MVP.presenters;

import GeekBrains.Архитектура.Seminar_8.MVP.models.Table;
import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получить список всех столиков
     */
    public void loadTables(){
        tables = model.loadTables();
    }

    /**
     * Отобразить список столиков
     */
    public void updateView(){
        view.showTables(tables);
    }

    protected void printReservationTableResult(int reservationNo, int tableNo){
        view.printReservationTableResult(reservationNo, tableNo);
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservationDate, tableNo, name);
        printReservationTableResult(tableNo, reservationNo);
    }

    @Override
    public void editReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        model.editReservationTable(oldReservation, reservationDate, tableNo, name);
        System.out.printf("Бронь #%d отменена. ", oldReservation);
        onReservationTable(reservationDate, tableNo, name);
    }
}

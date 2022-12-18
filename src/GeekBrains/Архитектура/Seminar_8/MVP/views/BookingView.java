package GeekBrains.Архитектура.Seminar_8.MVP.views;

import GeekBrains.Архитектура.Seminar_8.MVP.models.Table;
import GeekBrains.Архитектура.Seminar_8.MVP.presenters.View;
import GeekBrains.Архитектура.Seminar_8.MVP.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;

    /**
     * Отобразить список столиков
     * @param tables столики
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Действие пользователя (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * ДОМАШНЯЯ РАБОТА: Доработать метод changeReservationTable, протянуть возможность изменения
     * резерва столика на уровне компонент BookingPresenter и BookingModel
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void editReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.editReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    public void printReservationTableResult(int tableNo, int reservationNo){
        System.out.printf("Столик #%s успешно забронирован. Номер вашей брони #%d\n", tableNo, reservationNo);
    }


}

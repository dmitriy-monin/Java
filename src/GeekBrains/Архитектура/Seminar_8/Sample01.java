package GeekBrains.Архитектура.Seminar_8;

import GeekBrains.Архитектура.Seminar_8.MVP.models.BookingModel;
import GeekBrains.Архитектура.Seminar_8.MVP.presenters.BookingPresenter;
import GeekBrains.Архитектура.Seminar_8.MVP.views.BookingView;

import java.util.Date;

public class Sample01 {

    public static void main(String[] args) {
        BookingModel bookingModel = new BookingModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Станислав");

    }

}

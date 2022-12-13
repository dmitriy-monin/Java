package GeekBrains.Архитектура.Seminar_6.databases;

import GeekBrains.Архитектура.Seminar_6.notes.infrastructure.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }
}

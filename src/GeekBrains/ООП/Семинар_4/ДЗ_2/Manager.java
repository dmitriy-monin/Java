//package GeekBrains.ООП.Семинар_4.ДЗ_2;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.UUID;
//
//public class Manager {
//    public static void main(String[] args) {
//
//        AuthorList al = new AuthorList();
//        TaskList tl = new TaskList();
//
//        al.add("Ivan", "Ivanov");
//        al.add("Pyotr", "Petrov");
//
//        UUID IvanIivanov = al.getAuthor("Ivan", "Ivanov");
//        tl.add(new Task(IvanIivanov, "Very important task", new Date(), Priority.HIGH));
//        tl.add(new Task(IvanIivanov, "Just task", new Date(), Priority.MIDDLE));
//        tl.add(new Task(IvanIivanov, "No important task", new Date(), Priority.LOW));
//
//        tl.exportTasks("src/com/TaskManager/tryExport", new FormatCSV());
//        tl.importTasks("src/com/TaskManager/tryExport", new FormatCSV());
//    }
//
//    public static class FormatJSON extends Importable.TextFormat {
//        @Override
//        public void exportAs(ArrayList<Task> tasks, String path) {
//
//        }
//
//        @Override
//        public ArrayList<Task> importFrom(String path) {
//            return null;
//        }
//    }
//}
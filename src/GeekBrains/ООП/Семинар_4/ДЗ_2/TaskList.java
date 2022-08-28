//package GeekBrains.ООП.Семинар_4.ДЗ_2;
//
//import org.jetbrains.annotations.NotNull;
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class TaskList {
//    private ArrayList<Task> taskList = null;
//
//    public TaskList() {
//        this.taskList = new ArrayList<>();
//    }
//
//    public ArrayList<Task> getTaskList() {
//        return taskList;
//    }
//
//    public void add(Task task) {
//        taskList.add(task);
//    }
//
//    public void importTasks(String path, @NotNull Importable.TextFormat format) {
//        taskList.addAll((Collection<? extends Task>) format.importFrom(path));
//    }
//
//    public void exportTasks(String path, @NotNull Importable.TextFormat format) {
//        format.exportAs(taskList, path);
//    }
//
//}
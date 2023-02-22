import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private static int count = 1;
    private int id;
    private String name;
    private Date birthday;
    private ArrayList<String> commands = new ArrayList<>();

    public Animal(String name, Date birthday) {
        this.id = count++;
        this.name = name;
        this.birthday = birthday;
    }

    public void learnCommand(String command){
        commands.add(command);
    }

    public void showCommands(){
        System.out.printf("%s знает команды:\n", name);
        for(String command : commands){
            System.out.println(command);
        }
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return String.format("id: %d; Имя: %s; День рождения: %s", id, name, birthday);
    }
}

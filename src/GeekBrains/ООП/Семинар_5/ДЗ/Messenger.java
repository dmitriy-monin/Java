import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class Messenger {

    static Logger LOGGER = Logger.getLogger(Messenger.class.getSimpleName());
    List<Message> messageList;

    List<Person> usersList;
    int messageCounter;

    public Messenger() {
        this.messageList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

    public void sendMessage(Person sender, Person resever, String text) {
        LOGGER.info("User %s sent message to user %s , with text %s".formatted(sender.getName(), resever.getName(), text));
        messageCounter++;
        Message message = new Message();
        message.setID(messageCounter);
        message.setSender(sender);
        message.setResever(resever);
        message.setText(text);
        messageList.add(message);
    }

    public void regestrUser(Person person){
        usersList.add(person);
        person.setMessanger(this);
    }


    public void deleteMessage(Person person, int ID){
        if (person.getRole() == Role.ADMIN || person.getRole() == Role.MODERATOR){
            messageList.removeIf(message -> message.getID() == ID);
        }

    }
    public void renameMassage(Person person, int ID, String text){
        if(person.getRole() == Role.ADMIN){
            for(Message msg : messageList){
                if(msg.getID() == ID){
                    msg.setText(text);
                }
            }
        }

}

}

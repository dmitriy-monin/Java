public class Message {
    private int ID;
    private String text;
    private Person sender;
    private Person resever;

    @Override
    public String toString() {
        return "Message{" +
                "ID=" + ID +
                ", text='" + text + '\'' +
                ", sender=" + sender.getName() +
                ", resever=" + resever.getName() +
                '}';
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getResever() {
        return resever;
    }

    public void setResever(Person resever) {
        this.resever = resever;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

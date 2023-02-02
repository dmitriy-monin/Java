package GeekBrains.Алгоритмы.Seminar_3;

public class MyLinkedList {

    private Node head; // Ссылка на первый элемент

    public Node getHead() {
        return head;
    }

    public void revert(){
        if (head != null && head.getNext() != null)
            revert(head.getNext(), head);
    }

    private void revert(Node current, Node prev){
        if (current.getNext() == null){
            head = current;
        } else {
            revert(current.getNext(), current);
        }
        current.setNext(prev);
        prev.setNext(null);
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if (head != null)
            node.setNext(head);
        head = node;
    }

    public void removeFirst(){
        if (head != null)
            head = head.getNext();
    }


    public Node contains(int value){
        Node node = head;
        while (node != null){
            if (node.getValue() == value)
                return node;
            node = node.getNext();
        }
        return null;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
        }
        else {
            Node last = head;
            while (last.getNext() != null){
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    public void removeLast(){
        if (head == null)
            return;

        Node node = head;

        while (node.getNext() != null){
            if (node.getNext().getNext() == null)
            {
                node.setNext(null);
                return;
            }
            node = node.getNext();
        }

        head = null;

    }


}

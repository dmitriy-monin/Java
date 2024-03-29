package GeekBrains.Алгоритмы.Seminar_4;

public class MyRBTree {
    /**
     * Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее красно-черное дерево.
     * И реализовать в нем метод добавления новых элементов с балансировкой.
     *
     * Красно-черное дерево имеет следующие критерии:
     * • Каждая нода имеет цвет (красный или черный)
     * • Корень дерева всегда черный
     * • Новая нода всегда красная
     * • Красные ноды могут быть только левым ребенком
     * • У краной ноды все дети черного цвета
     *
     * Соответственно, чтобы данные условия выполнялись, после добавления элемента в дерево необходимо произвести
     * балансировку, благодаря которой все критерии выше станут валидными.
     * Для балансировки существует 3 операции – левый малый поворот, правый малый поворот и смена цвета.
     */
    private Node root;


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean add(int value){
        if (root != null){
            boolean result = addNode(root, value);
            root = balancing(root);
            root.setColor(Color.BLACK);
            return result;
        } else {
            root = new Node();
            root.setColor(Color.BLACK);
            root.setValue(value);
            return true;
        }
    }

    private boolean addNode(Node node, int value){
        if (node.getValue() == value)
            return false;
        else {
            if (node.getValue() > value){
                if (node.getLeftChild() != null){
                    boolean result = addNode(node.getLeftChild(), value);
                    node.setLeftChild(balancing(node.getLeftChild()));
                    return result;
                } else {
                    node.setLeftChild(new Node());
                    node.getLeftChild().setValue(value);
                    return true;
                }
            } else {
                if (node.getRightChild() != null){
                    boolean result = addNode(node.getRightChild(), value);
                    node.setRightChild(balancing(node.getRightChild()));
                    return result;
                } else {
                    node.setRightChild(new Node());
                    node.getRightChild().setValue(value);
                    return true;
                }
            }
        }
    }

    private Node balancing(Node node){
        Node result = node;
        boolean needBalancing;
        do {
            needBalancing = false;
            if (result.getRightChild() != null && result.getRightChild().getColor() == Color.RED &&
                    (result.getLeftChild() == null || result.getLeftChild().getColor() == Color.BLACK)){
                needBalancing = true;
                result = rightTurn(result);
            }
            if (result.getLeftChild() != null && result.getLeftChild().getColor() == Color.RED &&
                    result.getLeftChild().getLeftChild() != null && result.getLeftChild().getLeftChild().getColor()
                    == Color.RED){
                needBalancing = true;
                result = leftTurn(result);
            }
            if (result.getLeftChild() != null && result.getLeftChild().getColor() == Color.RED &&
                    result.getRightChild() != null && result.getRightChild().getColor() == Color.RED){
                needBalancing = true;
                colorChange(result);
            }
        }
        while (needBalancing);
        return result;
    }

    private Node rightTurn(Node node){
        Node rightChild = node.getRightChild();
        Node betweenChild = rightChild.getLeftChild();
        rightChild.setLeftChild(node);
        node.setRightChild(betweenChild);
        rightChild.setColor(node.getColor());
        node.setColor(Color.RED);
        return rightChild;
    }

    private Node leftTurn(Node node){
        Node leftChild = node.getLeftChild();
        Node betweenChild = leftChild.getRightChild();
        leftChild.setRightChild(node);
        node.setLeftChild(betweenChild);
        leftChild.setColor(node.getColor());
        node.setColor(Color.RED);
        return leftChild;
    }

    private void colorChange(Node node){
        node.getRightChild().setColor(Color.BLACK);
        node.getLeftChild().setColor(Color.BLACK);
        node.setColor(Color.RED);
    }


}

class Node{

    public Node() {
        this.color = Color.RED;
    }

    private int value;
    private Color color;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append(getValue()).append(" ").append(getColor());
        return res.toString();
    }
}

enum Color{
    RED,
    BLACK
}

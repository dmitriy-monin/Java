package GeekBrains.Алгоритмы.Seminar_4;

public class MyHashMap<K, V> {

    private static final int INIT_BUCKET_COUNT = 16;
    private Bucket<K, V>[] buckets;

    private class Entity{
        private K key;
        private V value;
    }

    private class Bucket<K, V>{

        private Node head;

        private class Node{
            private Node next;
            private Entity value;
        }

        /**
         * Поиск значения элемента
         * @param key Ключ элемента
         * @return Результат
         */
        public V get(K key){
            Node node = head;
            while (node != null){
                if (node.value.key.equals(key)){
                    return (V)node.value.value;
                }
            }
            return null;
        }

        /**
         * Добавление нового элемента
         * @param entity Элемент
         * @return Результат добавления
         */
        public boolean add(Entity entity){
            Node node = new Node();
            node.value = entity;
            if (head != null){
                Node currentNode = head;
                while (true){
                    if (currentNode.value.key.equals(entity.key)){
                        return false;
                    }
                    if (currentNode.next == null){
                        currentNode.next = node;
                        return true;
                    }
                    else {
                        currentNode = currentNode.next;
                    }
                }
            }
            else {
                head = node;
                return true;
            }

        }

        /**
         * Удаление элемента
         * @param key Ключ
         * @return Результат удаления
         */
        public boolean remove(K key){
            if (head == null)
                return false;
            if (head.value.key.equals(key)){
                head = head.next;
                return true;
            }
            else {
                Node node = head;
                while (node.next != null){
                    if (node.next.value.key.equals(key)){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
            }
            return false;
        }
    }

    public MyHashMap(){
        this(INIT_BUCKET_COUNT);
    }

    public MyHashMap(int initSize){
        buckets = new Bucket[initSize];
    }

    private int calculateBucketIndex(K key){
        int i = key.hashCode() % buckets.length;
        if (i < 0)
            i *= -1;
        return i;
    }

    /**
     * Поиск значения по ключу в хеш-таблице
     * @param key ключ
     * @return значение
     */
    public V get(K key){
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket != null){
            return bucket.get(key);
        }
        return null;
    }

    /**
     * Добавление нового элемента в хеш-таблицу
     * @param key Ключ
     * @param value Значение
     * @return Результат добавления элемента
     */
    public boolean put(K key, V value){
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null){
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        return bucket.add(entity);
    }

    /**
     * Удаление элемента из хеш-таблицы
     * @param key Ключ
     * @return Результат удаления
     */
    public boolean remove(K key){
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket != null){
            return bucket.remove(key);
        }
        return false;
    }
}

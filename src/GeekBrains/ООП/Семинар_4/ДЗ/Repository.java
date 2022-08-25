package GeekBrains.ООП.Семинар_4.ДЗ;

public interface Repository<T, ID> {
    void save(T t);
    void deleteById(ID id);
    T findById(ID id);
    ID updateById(T t, ID id);
}

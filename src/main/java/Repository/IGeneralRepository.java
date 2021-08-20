package Repository;


import java.util.List;

public interface IGeneralRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);
    List<T> findByName(String firstName);
    void remove(Long id);
}

package d11_genericity_interface;

public  interface Data<E> {
    void add(E s);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}

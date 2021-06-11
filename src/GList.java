public interface GList {


    int getLength();

    int insertLast(Object value);

    Object getFirst();

    int deleteFirst();

    boolean search(Object value);

    void print();

}

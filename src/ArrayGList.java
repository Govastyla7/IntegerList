import java.util.Objects;

public class ArrayGList<T> implements GList {


    private int laenge;
    private T a[];

    public ArrayGList(int laenge) {
        this.laenge = laenge;
        a = new T[laenge];
    }

    @Override
    public int getLength() {
        return laenge;
    }

    //Fügt value bei der ersten lehren Stelle ein.
    public int insertLast(Object value) {
        for (int i = 0; i < laenge; i++) {
            if (a[i] == null) {
                a[i] = value;
                return 0;
            }
        }
        return -1;

    }

    @Override
    public Object getFirst() {
        for (int i = 0; i < laenge; i++) {
            if (a[i] != null) {
                return a[i];
            }

        }
        return -9999;
    }

    @Override
    public int deleteFirst() {
        for (int i = 0; i < laenge; i++) {
            if (a[i] != null) {
                a[i] = 0;
                return 0;
            }

        }
        return -1;
    }


    @Override
    public boolean search(Object value) {
        for (int i = 0; i < laenge; i++) {
            if (a[i] == value) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void print() {
        for (int i = 0; i < laenge; i++) {
            System.out.print(a[i] + ", ");

        }
        System.out.println("\n");

    }

}

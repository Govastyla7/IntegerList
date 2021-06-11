public class ArrayIntegerList implements IntegerList {


    protected int laenge;
    protected int a[];

    public ArrayIntegerList(int laenge) {
        this.laenge = laenge;
         a = new int[laenge];
    }


    @Override
    public int getLength() {
        return laenge;
    }

    //Fügt value bei der ersten lehren Stelle ein.
    public int insertLast(int value) {
        for (int i = 0; i < laenge; i++) {
            if (a[i] == 0) {
                a[i] = value;
                return 0;
            }
        }
        return -1;

    }

    @Override
    public int getFirst() {
        for (int i = 0; i < laenge; i++) {
            if (a[i] != 0) {
                return a[i];
            }

        }
        return -9999;
    }

    @Override
    public int deleteFirst() {
        for (int i = 0; i < laenge; i++) {
            if (a[i] != 0) {
                a[i] = 0;
                return 0;
            }

        }
        return -1;
    }

    @Override
    public boolean search(int value) {
        for (int i = 0; i < laenge; i++) {
            if (a[i] == value) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void print() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");

        }
        System.out.println("\n");

    }
}

package test.ichar;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(14);

        ICharQ IQ;

        char ch;
        int i;

        IQ = q1;
        putShow(IQ, 10);
        System.out.println();

        IQ = q2;
        putShow(IQ, 30);
        System.out.println();

        IQ = q3;
        putShow(IQ, 14);
        System.out.println();
        putShow(IQ, 20, 14);

    }

    private static void putShow(ICharQ IQ, int a) {
        int i;
        for (i = 0; i < a; i++)
            IQ.put((char) ('A' + i));
        for (i = 0; i < a; i++)
            System.out.print(IQ.get() + "  ");
    }

    private static void putShow(ICharQ IQ, int a, int b) {
        int i;
        for (i = 10; i < a; i++)
            IQ.put((char) ('A' + i));
        for (i = 0; i < b; i++)
            System.out.print(IQ.get() + "  ");
    }
}

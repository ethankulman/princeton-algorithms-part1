import edu.princeton.cs.algs4.StdIn;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> newQueue = new RandomizedQueue<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            newQueue.enqueue(s);
        }
        for (int i = 0; i < k; i++) {
            newQueue.dequeue();
        }

    }

}

package access.ex;

public class MaxCounter {
    private int counter;
    private int max;

     MaxCounter(int max) {
        this.max = max;
    }

    void increment() {
        if (counter >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        counter++;
    }

    int getCounter() {
         return counter;
    }
}

package mytests;

class Sleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println("Size = " + i + ", Pause = " + pause(i));
        }
    }

    private static long pause(int snakeSize) {
        long pause = 500l;
        if (snakeSize == 1) {
            return pause;
        }
        if (snakeSize <= 11) {
            for (int i = 2; i <= snakeSize; i++) {
                pause = pause - 20;
            }
            return pause;
        } else if (snakeSize <= 15) {
            pause = 300l;
            for (int i = 12; i <= snakeSize; i++) {
                pause = pause - 25;
            }
            return pause;
        }
        return 200l;
    }
}

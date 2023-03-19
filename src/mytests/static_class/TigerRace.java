package mytests.static_class;

class TigerRace {
    public static void main(String[] args) {
        Tiger bob = new Tiger(250, "Bob");
        bob.tigerThread.start();

        Tiger nik = new Tiger(300, "Nik");
        nik.tigerThread.start();
    }
}

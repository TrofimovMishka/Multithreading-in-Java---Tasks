package mytests.static_class;

class Tiger extends Cat{

    public Tiger(int speed, String name) {
        super(speed, name);
    }

    public void tigerRun(){
        System.out.println("The tiger " + name + " run with speed "+speed);
    }

    Thread tigerThread = new Thread(){
        @Override
        public void run() {
            tigerRun();
        }
    };
}

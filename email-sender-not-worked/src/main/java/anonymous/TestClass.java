package anonymous;

class TestClass {
    public static void main(String[] args) {
//Inner anonymous class - it is implementation of interface in one place
        MonitoringSystem generalModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
// Важный момент в том, что дополнительные методы, помимо тех, что мы переопределяем, нельзя использовать извне этого анонимного класса, а только  внутри него.
            public void someSpecificMethod() {

                System.out.println("Специфический метод только для первого модуля");
            }
        };

        generalModule.startMonitoring();
    }
}

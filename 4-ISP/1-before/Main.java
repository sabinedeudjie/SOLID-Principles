public class Main {
    public static void main(String[] args) {
        Worker worker1 = new HumanWorker();
        Worker worker2 = new RobotWorker();

        worker1.work();
        worker1.eat();

        worker2.work();
        worker2.eat();
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker w1 = new DailyWorker("Ram", 100);
        Worker w2 = new SalariedWorker("Shyam", 120);

        System.out.println(w1.name + "'s Pay: $" + w1.computePay(40));
        System.out.println(w2.name + "'s Pay: $" + w2.computePay(60)); // ignored
    }
}
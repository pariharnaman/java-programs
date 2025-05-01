abstract class Worker {
    String name;
    double rate;

    Worker(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    abstract double computePay(int hours);
}

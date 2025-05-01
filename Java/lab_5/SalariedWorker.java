class SalariedWorker extends Worker {
    SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    double computePay(int hours) {
        return 40 * rate; // Fixed weekly pay
    }
}

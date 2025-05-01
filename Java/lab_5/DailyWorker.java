
class DailyWorker extends Worker {
    DailyWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    double computePay(int hours) {
        int days = hours / 8;
        return days * rate;
    }
}

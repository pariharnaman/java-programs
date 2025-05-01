class SuperClass {
    private int secret = 42; // private member

    public int getSecret() {
        return secret;
    }
}

class SubClass extends SuperClass {
    void tryAccess() {
        // System.out.println(secret); // ❌ Error: secret has private access
        System.out.println("Accessing via method: " + getSecret()); // ✅ Correct way
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.tryAccess();
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        Cricket_Player c = new Cricket_Player("Virat", 34, "Batsman");
        Football_Player f = new Football_Player("Ronaldo", 38, "Striker");
        Hockey_Player h = new Hockey_Player("Sardara", 30, "Midfielder");

        c.play(); f.train();
        h.play(); h.train();
    }
}

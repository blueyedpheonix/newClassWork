package Objects;

public class Grade {
    private Profestion profestion;
    private int score;

    public Grade(Profestion profestion, int score) {
        this.profestion = profestion;
        this.score = score;
    }

    public Profestion getProfestion() {
        return profestion;
    }

    public void setProfestion(Profestion profestion) {
        this.profestion = profestion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profestion=" + profestion +
                ", score=" + score +
                '}';
    }
}

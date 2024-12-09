package Buoi6_Abstract_TechmasterStudent;

public class StudentBiz extends TechmasterStudent{
    private double scoreMarketing;
    private double scoreSales;

    public StudentBiz(String name, String major, double scoreMarketing, double scoreSales) {
        super(name, major);
        this.scoreMarketing = scoreMarketing;
        this.scoreSales = scoreSales;
    }

    public StudentBiz(double scoreMarketing, double scoreSales) {
        this.scoreMarketing = scoreMarketing;
        this.scoreSales = scoreSales;
    }

    public double getScoreMarketing() {
        return scoreMarketing;
    }

    public void setScoreMarketing(double scoreMarketing) {
        this.scoreMarketing = scoreMarketing;
    }

    public double getScoreSales() {
        return scoreSales;
    }

    public void setScoreSales(double scoreSales) {
        this.scoreSales = scoreSales;
    }

    @Override
    public double getScore() {
        return (2*scoreMarketing + scoreSales)/3;
    }
}

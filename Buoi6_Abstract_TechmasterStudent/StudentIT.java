package Buoi6_Abstract_TechmasterStudent;

public class StudentIT extends TechmasterStudent{
     private double scoreJava;
     private double scoreHTML;
     private double scoreCSS;

    public StudentIT(String name, String major, double scoreJava, double scoreHTML, double scoreCSS) {
        super(name, major);
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
        this.scoreCSS = scoreCSS;
    }

    public StudentIT(double scoreJava, double scoreHTML, double scoreCSS) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
        this.scoreCSS = scoreCSS;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public double getScoreCSS() {
        return scoreCSS;
    }

    public void setScoreCSS(double scoreCSS) {
        this.scoreCSS = scoreCSS;
    }

    @Override
    public double getScore() {
        return (2*scoreJava + scoreHTML + scoreCSS)/4;
    }
}

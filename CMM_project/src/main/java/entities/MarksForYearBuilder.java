package entities;

public class MarksForYearBuilder {

     MarksForYear marksForYear;

    public MarksForYearBuilder() {
        this.marksForYear = new MarksForYear();
    }

    public MarksForYear build() {
        return marksForYear;
    }

    public MarksForYearBuilder withYear(int year) {
        marksForYear.setYear(year);
        return this;
    }

    public MarksForYearBuilder withScore(Subject subject, Double marks) {
        Score score = new Score(subject, marks);
        marksForYear.getScores().add(score);
        return this;
    }
}

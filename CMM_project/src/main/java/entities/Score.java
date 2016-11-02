package entities;

public class Score {

    Subject subject;
    Double marks;

    public Subject getSubject() {
        return subject;
    }

    public Double getMarks() {
        return marks;
    }

    public Score(Subject subject, Double marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String display(){
        return String.format("SUBJECT:%s MARKS:%s", subject, marks);
    }
}

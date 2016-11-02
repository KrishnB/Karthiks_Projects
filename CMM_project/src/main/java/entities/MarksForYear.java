package entities;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarksForYear {

    int year;
    List<Score> scores;

    public MarksForYear() {
        this.scores = new ArrayList<Score>();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public double calculateSgpa() {

        double totalmarks = 0, sgpa = 0;

        for (Score score : getScores()) {
            System.out.println("Subject:" + score.getSubject() + "  Marks:" + score.getMarks());
            totalmarks += score.getMarks();
        }

        sgpa = ((totalmarks/ getScores().size()) / 10);

        System.out.println("The aggregate of the "+ getYear()+ " Year is:" + sgpa);

        return sgpa;
    }

    public List<Score> getFailedScores() {
        List<Score> failedSubjects = new ArrayList();

        for (Score score : getScores()) {
            if(score.getMarks() < 40.0) {
                failedSubjects.add(score);
            }
        }
        return failedSubjects;

    }

}

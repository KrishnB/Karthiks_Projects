package entities;
import java.util.List;

public class CMM {

      public Double calculateCgpa(List<MarksForYear> years) throws Exception {

          double cgpa = 0, total;

          for (MarksForYear year : years) {

              List<Score> failedScores = year.getFailedScores();

              if (failedScores.size() > 0) {
                  String message="";
                  for (Score failedScore : failedScores) {
                      message += failedScore.display();

                  }
                  throw new Exception(String.format("There are failed subjects. Please clear them: %s", message));
              }

              cgpa += year.calculateSgpa();

          }

          total = cgpa / years.size();
          System.out.println("Total aggregate is:" + total);

          return total;

      }


}

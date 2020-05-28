package alex.khodin;

import java.util.*;

public class Exam
{
    public enum Faculty
    {
        IT,
        Bio,
        Teh,
        Road,
        Phys,
        Math
    }

    private class AvgScore
    {
        public int count;
        public int score;

        public AvgScore() { count = 0; score = 0; }
        public float getAvg() { return (float) score / count; }
    }

    private List<Enrollee> enrollees;
    private Map<Faculty, AvgScore> facultyScores;

    public Exam()
    {
        enrollees = new ArrayList<>();
        facultyScores = new HashMap<Faculty, AvgScore>();
        for(Faculty faculty : Faculty.values())
            facultyScores.put(faculty, new AvgScore());
    }

    public int register(int passportNo, String fullName, Faculty faculty)
    {
        Enrollee enrollee = new Enrollee(passportNo, fullName, faculty);
        enrollees.add(enrollee);
        return enrollee.getID();
    }

    public void setScore(int ID, int score)
    {
        for(Enrollee enrollee : enrollees)
        {
            if(enrollee.getID() == ID)
            {
                enrollee.setScore(score);
                AvgScore avgScore = facultyScores.get(enrollee.getFaculty());
                avgScore.score += score;
                avgScore.count++;
                return;
            }
        }
    }

    public void printPassed()
    {
        for(Faculty faculty : Faculty.values())
        {
            float avg = facultyScores.get(faculty).getAvg();
            System.out.println("Faculty: " + faculty.toString() + " Avg: " + Float.toString(avg));
            for(Enrollee enrollee: enrollees)
            {
                if(enrollee.getFaculty() == faculty && enrollee.getScore() > avg)
                    System.out.println(enrollee.toString());
            }
        }
    }

    public int getEnrolleeCount() { return enrollees.size(); }
}

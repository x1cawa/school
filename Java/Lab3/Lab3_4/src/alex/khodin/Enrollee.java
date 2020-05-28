package alex.khodin;

public class Enrollee
{
    private static int lastID = 0;
    private int ID;

    private int passportNo;
    private String fullName;
    private Exam.Faculty faculty;

    private boolean checked;
    private int score;

    public Enrollee(int passportNo, String fullName, Exam.Faculty faculty)
    {
        this.ID = ++lastID;
        this.passportNo = passportNo;
        this.fullName = fullName;
        this.faculty = faculty;
        this.checked = false;
        this.score = 0;
    }

    public int getID() { return ID; }
    public int getPassportNo() { return passportNo; }
    public String getFullName() { return fullName; }
    public Exam.Faculty getFaculty() { return faculty; }
    public int getScore() { return score; }

    public void setScore(int score)
    {
        this.checked = true;
        this.score = score;
    }

    public boolean isChecked() { return checked; }

    public String toString()
    {
        return Integer.toString(ID) + " " + Integer.toString(score) + " "
                + faculty.toString() + " " + fullName + " " + Integer.toString(passportNo);
    }
}

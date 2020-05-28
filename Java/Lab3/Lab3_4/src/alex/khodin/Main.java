package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        Exam exam = new Exam();

        exam.register(1123456, "AA B C", Exam.Faculty.Bio);
        exam.register(1234567, "AB C D", Exam.Faculty.Bio);
        exam.register(1345678, "AC D E", Exam.Faculty.Bio);
        exam.register(1456789, "AD E F", Exam.Faculty.Bio);
        exam.register(1567890, "AE F G", Exam.Faculty.Bio);

        exam.register(2123456, "BA B C", Exam.Faculty.IT);
        exam.register(2234567, "BB C D", Exam.Faculty.IT);
        exam.register(2345678, "BC D E", Exam.Faculty.IT);
        exam.register(2456789, "BD E F", Exam.Faculty.IT);
        exam.register(2567890, "BE F G", Exam.Faculty.IT);

        exam.register(3123456, "CA B C", Exam.Faculty.Teh);
        exam.register(3234567, "CB C D", Exam.Faculty.Teh);
        exam.register(3345678, "CC D E", Exam.Faculty.Teh);
        exam.register(3456789, "CD E F", Exam.Faculty.Teh);
        exam.register(3567890, "CE F G", Exam.Faculty.Teh);

        exam.register(4123456, "DA B C", Exam.Faculty.Road);
        exam.register(4234567, "DB C D", Exam.Faculty.Road);
        exam.register(4345678, "DC D E", Exam.Faculty.Road);
        exam.register(4456789, "DD E F", Exam.Faculty.Road);
        exam.register(4567890, "DE F G", Exam.Faculty.Road);

        exam.register(5123456, "EA B C", Exam.Faculty.Phys);
        exam.register(5234567, "EB C D", Exam.Faculty.Phys);
        exam.register(5345678, "EC D E", Exam.Faculty.Phys);
        exam.register(5456789, "ED E F", Exam.Faculty.Phys);
        exam.register(5567890, "EE F G", Exam.Faculty.Phys);

        exam.register(6123456, "FA B C", Exam.Faculty.Math);
        exam.register(6234567, "FB C D", Exam.Faculty.Math);
        exam.register(6345678, "FC D E", Exam.Faculty.Math);
        exam.register(6456789, "FD E F", Exam.Faculty.Math);
        exam.register(6567890, "FE F G", Exam.Faculty.Math);

        for(int i = 1; i <= exam.getEnrolleeCount(); i++)
        {
            exam.setScore(i, rand(0, 100));
        }

        exam.printPassed();
    }

    private static int rand(int start, int end) { return start + (int) (Math.random() * end); }
}

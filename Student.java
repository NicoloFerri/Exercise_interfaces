package javaOOPAdvanced_V2.interfaces;

public class Student extends CollegePerson implements LearningPerson{

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    private int academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("sono uno studente ,io devo studiare");
    }


}

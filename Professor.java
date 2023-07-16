package javaOOPAdvanced_V2.interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
    private String teachingPerson;

    public Professor(String name, String surname, int collegeId, String teachingPerson) {
        super(name, surname, collegeId);
        this.teachingPerson = teachingPerson;
    }

    @Override
    public void teachToOtherPerson() {
        System.out.println("sono un professore,io devo insegnare");
    }
}

package javaOOPAdvanced_V2.interfaces;

public class CollegePerson {
    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCollegeId() {
        return collegeId;
    }

    private String name;
    private String surname;
    private int collegeId;


    public void goToCollege(){
        System.out.println(" name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("collegeId = " + collegeId);
    }
}

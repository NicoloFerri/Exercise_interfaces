package javaOOPAdvanced_V2.interfaces;

public class Testing {
    public static void main(String[] args) {
        Student s1 = new Student("Antonio" , "Esposito" , 234312 , 2);
        Professor p1 = new Professor ("Valerio" , "Rossi" , 897372, s1.getName()+s1.getSurname());
        Assistant a1 = new Assistant("Matteo" , "Buia" , 498243 , true);

        s1.goToCollege();
        System.out.println("\n");
        p1.goToCollege();
        System.out.println("\n");
        a1.goToCollege();
        System.out.println("\n");

        s1.studyAtHome();
        System.out.println("\n");
        p1.teachToOtherPerson();
        System.out.println("\n");
        a1.studyAtHome();
        a1.teachToOtherPerson();

    }
}

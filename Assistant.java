package javaOOPAdvanced_V2.interfaces;

import java.sql.SQLOutput;

public class Assistant extends CollegePerson implements LearningPerson,TeachingPerson{

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("sono un assistente, sto ancora studiando");
    }

    @Override
    public void teachToOtherPerson() {
        if (isGoingToBeAPhD){
            System.out.println("sono un assistente e posso insegnare");
        }
        else {
            System.out.println("sono un assistente ma non posso insegnare");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Model.experienceCandidate;
import Model.fresherCandidate;
import Model.internCandidate;
import Util.Validation;
import View.Menu;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class Controller extends Menu {
    static String[] mc = {"Experience","Fresher","Intership","Searching"};
    ArrayList<Candidate> candidates = new ArrayList<>();
    
    public Controller(){
        super("Candidate Management System",mc);
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                createCandidate(candidates,0);
                break;
            case 2:
                createCandidate(candidates,1);
                break;
            case 3:
                createCandidate(candidates,2);
                break;
            case 4:
                searchCandidate(candidates);
                break;
        }
    }
    public void createCandidate(ArrayList<Candidate> candidates,int type){
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter first name: ");
            String firstName = Validation.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validation.checkInputString();
            System.out.print("Enter birth date: ");
            int birthDate = Validation.checkInputIntLimit(1900,
                    Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validation.checkInputPhone();
            System.out.print("Enter email: ");
            String email = Validation.checkInputEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,
                    birthDate, address, phone, email, type);
            //check id exist or not
            if (Validation.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }
        public static void createExperience(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkInputExprience(candidate.getBirthDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validation.checkInputString();
        candidates.add(new experienceCandidate(yearExperience, professionalSkill,
                candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType()));
        System.err.println("Create success.");
    }

    //allow user create fresher
    public static void createFresher(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = Validation.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validation.checkInputGraduationRank();
        candidates.add(new fresherCandidate(graduationDate, graduationRank, candidate.getCandidateId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType()));
        System.err.println("Create success.");
    }

    //allow user create internship
    public static void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validation.checkInputString();
        System.out.print("Enter university: ");
        String university = Validation.checkInputString();
        candidates.add(new internCandidate(major, semester, university, candidate.getCandidateId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCandidateType()));
        System.err.println("Create success.");
    }
        public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validation.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validation.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType()== typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }
    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.out.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof experienceCandidate) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof fresherCandidate) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof internCandidate) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }
}

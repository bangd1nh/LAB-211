/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class experienceCandidate extends Candidate {
    private int expInYear;
    private String proSkill;

    public experienceCandidate(int expInYear, String proSkill, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public experienceCandidate(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public experienceCandidate() {
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()+ "experienceCandidate{" + "expInYear=" + expInYear + ", proSkill=" + proSkill + '}';
    }
    
}

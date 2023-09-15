/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class fresherCandidate extends Candidate {
    private String graduationTime;
    private String graduationRank;

    public fresherCandidate(String graduationTime, String graduationRank, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
    }

    public fresherCandidate(String graduationTime, String graduationRank) {
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
    }

    public fresherCandidate() {
    }

    public String getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(String graduationTime) {
        this.graduationTime = graduationTime;
    }


    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return super.toString()+ "fresherCandidate{" + "graduationTime=" + graduationTime + ", graduationRank=" + graduationRank + '}';
    }
  
}

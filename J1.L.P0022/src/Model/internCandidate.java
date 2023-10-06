/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class internCandidate extends Candidate {
    private String major;
    private String semester;
    private String universityName;

    public internCandidate(String major, String semester, String universityName, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public internCandidate(String major, String semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public internCandidate() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()+ "internCandidate{" + "major=" + major + ", semester=" + semester + ", universityName=" + universityName + '}';
    }
    
}

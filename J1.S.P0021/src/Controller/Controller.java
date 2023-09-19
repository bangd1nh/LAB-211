/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import VIew.Menu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Controller extends Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    private static final ArrayList<String> courseName = new ArrayList<>();
    static String[] mc={"create","find/sort","update/delete","report"};
    public Controller(){
        super("Welcome to student mamagement",mc);
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                create();
                break;
            case 2:
                ArrayList<Student> result = findAndSort();
                for(Student s : result){
                    System.out.println(s);
                }
                break;
            case 3:
                updateAndDelete();
                break;
            case 4:
                report();
                break;
        }
    }
    public void create(){
        System.out.println("nhap ten hoc sinh: ");
        String name = sc.next();
        System.out.println("nhap id hoc sinh: ");
        int id = sc.nextInt();
        System.out.println("nhap hoc ki hoc sinh: ");
        int semester = sc.nextInt();
        System.out.println("nhap ten course: ");
        String courseNameadd = sc.next();
        courseName.add(courseNameadd);
        Student s = new Student(id,name,semester,courseName);
        students.add(s);
    }
    public ArrayList<Student> findAndSort(){
        ArrayList<Student> result = new ArrayList<>();
        System.out.println("nhap ten hoc sinh can tim");
        String name = sc.next();
        for(Student s : students){
            if(s.getName().equals(name)){
                result.add(s);
            }
        }
        result.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        return result;
    }
    public void updateAndDelete(){
        ArrayList<Student> result = new ArrayList<>();
        System.out.println("nhap id hoc sinh can tim");
        int id = sc.nextInt();
        for(Student s : students){
            if(s.getId()==id){
                result.add(s);
            }
        }
        System.out.println("ban muon update (U) hay xoa (D)");
        String chose = sc.next();
        switch(chose){
            case "U":
                System.out.println("update semester (S) update course name(C)");
                String c = sc.next();
                update(c,result);
                break;
            case"D":
                for(Student s : result){
                    students.remove(s);
                }
                break;
            default:
                System.out.println("cu phap ko hop le");
                break;
        }
    }
    public void update(String s,ArrayList<Student> result){
        switch(s){
            case "S":
                for(Student a : result){
                    System.out.println("nhap semester can update");
                    int semester = sc.nextInt();
                    a.setSemester(semester);
                }
                break;
            case "C":
                for(Student a : result){
                    System.out.println("nhap course name can update");
                    String course = sc.next();
                    courseName.add(course);
                    a.setCourseName(courseName);
                }
                break;
            default:
                System.out.println("sai cu phap");
                break;
        }
    }
    public void report(){
        ArrayList<Student> result = findAndSort();
        for(Student s : result){
            System.out.println("report course cua :");
            System.out.println(s.getName());
            System.out.println("course:");
            System.out.println(s.getCourseName());
        }
    }
}

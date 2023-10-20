package controller;

import repository.AnalysisStringRepository;

public class AnalysisStringProgram {

    public void run() {
        System.out.println("===== Analysis String Program ====");
        AnalysisStringRepository program = new AnalysisStringRepository();
        program.analysisString();
    }
}

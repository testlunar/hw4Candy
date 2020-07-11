package study_center.persons;

import study_center.Program;

public class student extends person {
 private Program studentsProgram;
    public student(String name, String surname) {
        super(name, surname);
    }

    public Program getStudentsProgram() {
        return studentsProgram;
    }

    public void setStudentsProgram(Program studentsProgram) {
        this.studentsProgram = studentsProgram;
    }
}

package study_center.reports;

import study_center.Course;
import study_center.Program;
import study_center.persons.student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class long_report implements report {
    SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
    @Override
    public void showReportForStudent(student CurrentStudent) {
        format.setLenient(false);
        Program program= CurrentStudent.getStudentsProgram();
        Date prograstartdate= program.getProgramStartDate();
        Date programstopdate=program.getProgramEndDate();
        StringBuilder fullInfo = new StringBuilder();
        fullInfo.append("Student:  "+ CurrentStudent.getName()+ " "+ CurrentStudent.getSurname()+"/n");
        fullInfo.append("Student program "+ program.getProgramName()+"/n");
        if (program.getCourses() !=null){
            fullInfo.append(program.showCoursesOfProgram());
        }else {
            fullInfo.append("no courses were found\n");
        }
        System.out.println(fullInfo.toString());
    }
}

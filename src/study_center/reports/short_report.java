package study_center.reports;

import com.sun.deploy.uitoolkit.impl.awt.ui.SwingConsoleWindow;
import study_center.Program;
import study_center.persons.student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class short_report implements report{

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Override
    public void showReportForStudent(student CurrentStudent) {
        format.setLenient(false);
        Program program= CurrentStudent.getStudentsProgram();
        Date prograstartdate= program.getProgramStartDate();
        Date programstopdate=program.getProgramEndDate();
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("Student:  "+ CurrentStudent.getName()+ " "+ CurrentStudent.getSurname()+"/n");
        shortInfo.append("Student program "+ program.getProgramName()+"/n");
        if (program.getProgramStartDate()!=null){
            shortInfo.append("Startdate "+ format.format(prograstartdate)+"/n");
            shortInfo.append("Duration "+ program.countProgramDuration()+"hours"+"/n");
            shortInfo.append("Program "+ program.showProgramProgress(prograstartdate,programstopdate));
        }else {
            shortInfo.append("no courses were found\n");
        }
        System.out.println(shortInfo.toString());
    }
}

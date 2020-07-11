package study_center;

import study_center.persons.student;
import study_center.reports.long_report;
import study_center.reports.report;
import study_center.reports.short_report;

import java.io.IOException;
import java.text.spi.BreakIteratorProvider;

public class study_center {
    public static void main(String[] args) throws IOException {
        student ivan= new student("ivan","ivanov");
        Course java= new Course("java", 16);
        Course js= new Course("javascript", 10);
        Program program= new Program("08/07/2020 10:00", "Programming");
        Course course = new Course[] {java,js};
        program.addCoursesToProgram();
        ivan.setStudentsProgram();
        program.calculateProgramEndDate();
        System.out.println("-----------short report------------- ");
        report shortreport =new short_report();
        shortreport.showReportForStudent(ivan);
        System.out.println("-------------long report------------");
        report longreport =new long_report();
        longreport.showReportForStudent(ivan);
    }
}

package study_center;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Program {
    private Date programStartDate;
    private Date programEndDate;
    private String programName;

    private List<Course> courses = new ArrayList<>();
    private Calendar calendar = Calendar.getInstance();

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Program(String programStartDate, String programName) {
        format.setLenient(false);
        try {
            this.programStartDate = format.parse(programStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.programName = programName;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public String getProgramName() {
        return programName;
    }

    public void addCoursesToProgram(Course[] currentCourses) {
        for (Course course : currentCourses) {
            courses.add(course);
        }
    }

    public List getCourses() {
        return courses;
    }

    public int countProgramDuration() {
        int programDurationHours = 0;
        for (Course course : courses) {
            programDurationHours += course.getCourseDuration();
        }
        return programDurationHours;
    }

    public void calculateProgramEndDate() {
        int programdurationInHours = countProgramDuration();
        calendar.setTime(this.programStartDate);
        calendar.add(Calendar.DAY_OF_MONTH, programdurationInHours / 8);
        calendar.add(Calendar.HOUR_OF_DAY, programdurationInHours % 8);
        Date enddate = calendar.getTime();
        programEndDate = enddate;

    }

    public Date getProgramEndDate() {
        return programEndDate;
    }

    public String showProgramProgress(Date starttime, Date endtime) {
        Date currentdate = calendar.getTime();
        if (currentdate.before(starttime)) {
            return "program is not started yet\n";
        }else if (currentdate.after(endtime)) {
                return "program is already finished\n";
            } else {
                return "program is is progress\n";
            }
        }


        public String showCoursesOfProgram () {
            String courseLine = "";
            for (Course course : courses) {
                courseLine += "Course " + course.getCourseName() + " Duration: " + course.getCourseDuration() + " hours; \n";
            }
            return courseLine;
        }
    }


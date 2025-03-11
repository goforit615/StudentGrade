package school;

import javax.security.auth.Subject;

public class Student {
    private int StudentID;
    private String StudentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentID, String studentName, Subject majorSubject) {
        this.studentId = studentID;
        this.StudentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubject(Score score) {
        scoreList.add(score);
    }

    public int getStudentID() {
        return StudentId;
    }

    public void setStudentID(int studentID) {
        this.studentId = studentId;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
    return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}

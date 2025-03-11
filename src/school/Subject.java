package school;

public class Subject {
    private String subject;
    private int subjectId;
    private int gradeType;

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subject, int subjectId) {
        this.subject = subject;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public ArrayList<student> getSTudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void register(Student student) {
        studentList.add(student);
    }
}

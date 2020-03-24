class Faculty{
    List <Student> students;
    String facultyName;

    public Faculty(List<Student> students, String facultyName) {
        this.students = students;
        this.facultyName = facultyName;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public double averageGrade(){
        double avg = 0;
        for (Student s:students) {
            avg+=s.getAverage();
        }
        return avg/students.size();
    }

    public double averageCredits(){
        double avg = 0;
        for (Student s:students) {
            avg+=s.ECTSCredits();
        }
        return avg/students.size();
    }

    


}
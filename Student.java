public class Student {
    private String studentID;
    private String name;
    private int grade;
    private String section;
    public Student(String ID, String name, int g, String section){
        studentID = ID;
        this.name = name;
        this.grade = g;
        this.section = section;
    }
    public void setID(String ID){
        this.studentID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int g){
        grade = g;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String getID(){
        return this.studentID;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return grade;
    }
    public String getSection(){
        return section;
    }

    public void showStudentsInfo(){
        System.out.println("Name:- " + name + " Student Id:- " + studentID + " grade" + grade + " section " + this.section);
    }

    public String toString() {
        return "\n--- Student Record ---" +
                "\nID: " + studentID +
                "\nName: " + name +
                "\nSection: " + section +
                "\nGrade: " + grade +
                "\n----------------------";
    }



}

public class Student {
    String name;
    int rollno;
    private static int numStudents;

     Student(int rno,String nm) {
        rollno = rno; 
        name = nm;
        numStudents++;
     }

     public int getnumstudents() {
        return numStudents;
     }

     public void print() {
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(getnumstudents());
     }

}
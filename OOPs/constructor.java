public class constructor {
    public static void main(String[] args) {

        Student s1 = new Student(); // object creation
        // Student s2 = new Student("Shreya");
        // Student s3 = new Student(061);
        s1.name = "anil";
        s1.roll = 61;
        s1.password = "anil1009";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 88;

        System.out.println("student 1 " + s1.name + " " + s1.roll + " " + s1.password);
        // for (int i = 0; i < s1.marks.length; i++) {
        //     System.out.println(s1.marks[i] + " ");
        // }

        Student s2 = new Student(s1); // copy
        s2.password = "xyz";
        System.out.println("student 2 " + s2.name + " " + s2.roll + " " + s2.password);
                s1.marks[2]=7;

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i] + " ");
        }

        // System.out.println(s2.name);
        // System.out.println(s3.roll);

    }

}

class Student {

    // properties ot attributes
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }

    //deep copy constructor
    Student(Student s1){
         marks = new int[3];
         this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            marks[i]=s1.marks[i];
        }
    }


    Student() {
        marks = new int[3];
        System.out.println("the constructor is called...");

    }

    Student(String name) { // constructor
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}

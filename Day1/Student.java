public class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 85);
        students[1] = new Student("Bob", 78);
        students[2] = new Student("Charlie", 90);
        students[3] = new Student("Diana", 88);
        students[4] = new Student("Ethan", 75);

        int totalMarks = 0;
        for (int i = 0; i < students.length; i++) {
            totalMarks += students[i].marks;
        }

        double average = (double) totalMarks / students.length;
        System.out.println("Average marks: " + average);
    }
}

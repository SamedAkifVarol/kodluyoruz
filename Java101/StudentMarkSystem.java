public class StudentMarkSystem {
    public class Student {
        private String name;
        private int stuNo;
        private Course math;
        private Course physics;
        private Course chemistry;
        private int average;
        private boolean isPass;

        public Student(String name, int stuNo, Course math,Course physics,Course chemistry){
            this.name=name;
            this.stuNo=stuNo;
            this.math=math;
            this.physics=physics;
            this.chemistry=chemistry;
            calcAvarage();
            this.isPass=isPass;
        }

        public void addBulkExamNote(int math,int physics,int chemistry){
            if(math >= 0 && math <= 100){
                this.math.note=math;
            }
            if(physics >= 0 && physics <= 100) {
                this.physics.note = physics;
            }
            if(chemistry >= 0 && chemistry <=100) {
                this.chemistry.note = chemistry;
            }
        }

        public void isPass(){
            if(this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
                System.out.println("grades not fully entered");
            } else {
                this.isPass=isCheckPass();
                printNote();
                System.out.println("Average grade : " + this.average);
                if(this.isPass) {
                    System.out.println("Passed the class");
                } else {
                    System.out.println("Failed the class");
                }

            }
        }

        public void calcAvarage() {
            this.average=(this.physics.note + this.chemistry.note + this.math.note) / 3 ;
        }

        public boolean isCheckPass(){
            calcAvarage();
            return this.average > 55;
        }

        public void printNote(){
            System.out.println("Student : " + this.name);
            System.out.println("Math Grade : " + this.math.note);
            System.out.println("Physics Grade : " + this.physics.note);
            System.out.println("Chemistry Grade : " + this.chemistry.note);
        }
    }

    public class Course{
        private Teacher courseTeacher;
        private String name;
        private String code;
        private String prefix;
        private int note;

        public Course(String name, String code, String prefix) {
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.note = 0;
        }

        public void addTeacher(Teacher t) {
            if (this.prefix.equals(t.branch)) {
                this.courseTeacher = t;
                System.out.println("Process is Succesful");
            } else {
                System.out.println(t.name + " Academician cannot teach this course.");
            }
        }

        public void printTeacher() {
            if (courseTeacher != null) {
                System.out.println(this.name + " Academician : " + courseTeacher.name);
            } else {
                System.out.println(this.name + " no academic has been appointed");
            }
        }
    }

    public class Teacher {
        String name;
        String mpno;
        String branch;
    
        public Teacher(String name, String mpno, String branch) {
            this.name = name;
            this.mpno = mpno;
            this.branch = branch;
        }
    
    }

    public class Main {
        public static void main(String[] args) {
    
            Course math = new Course("Math", "MATH101", "MATH");
            Course physics = new Course("Physics", "PHY101", "PHY");
            Course chemistry = new Course("Chemistry", "CHT101", "CHT");
    
            Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MATH");
            Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "PHY");
            Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHT");
    
            math.addTeacher(t1);
            physics.addTeacher(t2);
            chemistry.addTeacher(t3);
    
            Student s1 = new Student("Şaban", 4,math, physics, chemistry);
            s1.addBulkExamNote(50,20,40);
            s1.isPass();
    
            Student s2 = new Student("Güdük Necmi", 4, math, physics, chemistry);
            s2.addBulkExamNote(100,50,40);
            s2.isPass();
    
            Student s3 = new Student("Hayta İsmail", 4, math, physics, chemistry);
            s3.addBulkExamNote(50,20,40);
            s3.isPass();
    
        }
    }
}

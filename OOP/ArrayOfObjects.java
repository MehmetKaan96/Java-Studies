import java.util.ArrayList;

class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMaxMarks(int mark){maxMarks = mark;}
    public void setMarksObtain(int mark){marksObtain = mark;}

    public Subject(String SID,String n)
    {
        subID = SID;
        name = n;
        maxMarks =0;
        marksObtain = 0;
    }

    public Subject(String SID,String n,int m)
    {
        subID = SID;
        name = n;
        maxMarks = m;
    }

    public boolean isQualified()
    {
        return marksObtain>= maxMarks/10*4;
    }

    public String toString()
    {
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }

}

class Student{
    private int rollNo;
    private String name;
    private String dept;

    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}

    public Student(int roll,String n,String d)
    {
        rollNo = roll;
        name = n;
        dept = d;
    }

    public String toString()
    {
        return "\nName: "+name+"\nRoll No: "+rollNo+"\nDepartment :"+dept;
    }

}

public class ArrayOfObjects {
    public static void main(String[] args) {
        //Subject subs[] = new Subject[3];//Array of ArrayOfObjects
        //3 tane Subject objesi oluşturuldu. subs ise onları işaret ediyor
        //yani subs bir referans

        //Arraylist of objects
        // ArrayList<Subject> sub = new ArrayList<Subject>();

        // sub.add(new Subject("a101","Data S",100));
        // sub.add(new Subject("a102","C++",100));
        // sub.add(new Subject("a103", "Java",100));

        // for (Subject subject : sub) {
        //     System.out.println(subject.getName());
        // }

        // subs[0] = new Subject("s101","DS",100);
        // subs[1] = new Subject("s102","Algorithms",100);
        // subs[2] = new Subject("s103","Operating Systems",100);

        //     for (Subject subject : subs) {
        //         System.out.println(subject);
        //         //toString metodu sayesinde bu şekilde konsolda yazdırabiliriz.
        //         //eğer toString kullanmasaydık bize hafızadaki yerlerini gösterecekti.
        //     }

        ArrayList<String> subject = new ArrayList<>();
        subject.add("DSA");
        subject.add("C++");
        subject.add("Java");
        subject.add("Python");
        Student students[] = new Student[2];
        students[0] = new Student(1,"Mehmet","Computer Engineering");
        students[1] = new Student(2,"Temhem","Computer Engineering");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

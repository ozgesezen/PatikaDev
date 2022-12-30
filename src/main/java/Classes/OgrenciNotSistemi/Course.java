package Classes.OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int verbalNote;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int examNote=0;
        int verbalNote=0;
    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        }else {
            System.out.println("Ogretmenin bransi ile kurs uyusmuyor");
        }
    }
    public void printTeacher(){
        if (teacher!=null){
            System.out.println(this.name+" dersinin ogretmeni: "+teacher.name);
        }else {
            System.out.println(this.name+" dersine ogretmen atanmamistir.");
        }
    }


}

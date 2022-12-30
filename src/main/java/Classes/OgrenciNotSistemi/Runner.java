package Classes.OgrenciNotSistemi;

public class Runner {

    public static void main(String[] args) {
        Course mat = new Course("Matematik","Mat101","MAT");
        Course fizik = new Course("Fizik", "Fzk101","FZK");
        Course kimya = new Course("Kimya", "Kmy101","KMY");

        Teacher teacher1 = new Teacher("Cahit Arf","1234","MAT");
        Teacher teacher2 = new Teacher("Albert Einstein","4567","FZK");
        Teacher teacher3 = new Teacher("Antoine Lavoisier","78910","KMY");

        mat.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1 = new Student("Ozge","10001",1,mat,fizik,kimya);
        student1.addBulkExamNote(72,84,63);
        student1.addBulkVerbalNote(80,85,75);
        student1.isPass();

        Student student2 = new Student("Sezen","10002",1,mat,fizik,kimya);
        student2.addBulkExamNote(64,58,93);
        student2.addBulkVerbalNote(70,60,90);
        student2.isPass();

        Student student3 = new Student("Kirca","10003",1,mat,fizik,kimya);
        student3.addBulkExamNote(100,95,87);
        student3.addBulkVerbalNote(100,100,100);
        student3.isPass();
    }
}

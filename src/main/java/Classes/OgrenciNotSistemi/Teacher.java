package Classes.OgrenciNotSistemi;

public class Teacher {

    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Adi: "+this.name);
        System.out.println("Telefonu: "+this.mpno);
        System.out.println("Bransi: "+this.branch);
    }
}

package Classes.OgrenciNotSistemi;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;

    double avarage;
    boolean isPass;
    double fizikAvarege;
    double kimyaAvarege;
    double matAvarege;


    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.isPass=false;
        this.mat =mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvarege();
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat>=0 && mat<=100){
            this.mat.examNote=mat;
        }
        if (fizik>=0 && fizik<=100){
            this.fizik.examNote=fizik;
        }
        if (kimya>=0 && kimya<=100){
            this.kimya.examNote=kimya;
        }
    }

    public void addBulkVerbalNote(int verbalMat, int verbalFizik, int verbalKimya){
        if (verbalMat>=0 && verbalMat<=100){
            this.mat.verbalNote=verbalMat;
        }
        if (verbalFizik>=0 && verbalFizik<=100){
            this.fizik.verbalNote=verbalFizik;
        }
        if (verbalKimya>=0 && verbalKimya<=100){
            this.kimya.verbalNote=verbalKimya;
        }
    }

   public void calcAvarege(){
        this.fizikAvarege= (this.fizik.examNote*80)/100 +(this.fizik.verbalNote*20) /100;
        this.kimyaAvarege= (this.kimya.examNote*80)/100+(this.kimya.verbalNote*20)/100;
        this.matAvarege=(this.mat.examNote*80)/100+(this.fizik.verbalNote*20)/100;
        this.avarage = (fizikAvarege+kimyaAvarege+matAvarege)/ 3;
    }

   public boolean isCheckPass(){
        calcAvarege();
        return this.avarage>55;
    }

    public void isPass(){
        this.isPass=isCheckPass();
        printNote();
        System.out.println("Ortalama: "+this.avarage);
        if (this.isPass){
            System.out.println("Sinifi Gecti.");
        }else {
            System.out.println("Sinifta Kaldi.");
        }
    }

    public void printNote(){
        System.out.println("Ogrenci: "+ this.name);
        System.out.println("Matematik ders ortalasi: "+matAvarege);
        System.out.println("Fizik ders ortalamasi: "+fizikAvarege);
        System.out.println("Kimya ders ortalamasi: "+kimyaAvarege);
    }


}

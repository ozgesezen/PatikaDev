package Classes.BoksMaci;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (checkWeight()){
            while (f1.health>0 && f2.health>0){
                System.out.println("***************YENI ROUND***********");
                if (f1.start()){
                    f2.health= f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health=f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
                if (f2.start()){
                    f1.health=f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health=f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
            }

        }else {
            System.out.println("Boksorlerin agirliklari mac icin uygun degil!");
        }
    }

    boolean checkWeight(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&
                (this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);
    }

    boolean isWin(){
        if (f1.health==0){
            System.out.println("Maci kazanan :"+f2.name);
            return true;
        } else if (f2.health==0) {
            System.out.println("Maci kazanan :"+f1.name);
            return true;
        }
        return false;
    }

    void printScore(){
        System.out.println("------------------------------");
        System.out.println(f1.name+" kalan Can \t:"+f1.health);
        System.out.println(f2.name+" kalan Can \t:"+f2.health);
    }
}

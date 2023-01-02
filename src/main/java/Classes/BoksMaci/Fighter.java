package Classes.BoksMaci;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;

    public Fighter(String name, int damage, int health, int weight, int dodge, int start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.start = start;
    }

    boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue<=this.dodge;
    }

    int hit(Fighter foe){
        System.out.println("*****************************");
        System.out.println(this.name+" => "+foe.name+"'e "+this.damage+" hasar verdi.");

        if (foe.dodge()){
            System.out.println(foe.name+" gelen hasari savurdu.");
            return foe.health;
        }
        if (foe.health-this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }

    public boolean start(){
        double randomValue = Math.random()*100;
        return randomValue <= this.start;
    }
}

package Classes.BoksMaci;

public class Runner {

    public static void main(String[] args) {

        Fighter muhammedAli = new Fighter("Muhammet Ali",30,100,95,70,50);
        Fighter mikeRyson = new Fighter("Mike Tyson",20,95,94,65,50);

        Match ring = new Match(muhammedAli,mikeRyson,90,120);
        ring.run();

    }

}

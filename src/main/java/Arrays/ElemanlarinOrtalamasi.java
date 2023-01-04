package Arrays;

public class ElemanlarinOrtalamasi {

    public static void main(String[] args) {
        double[] numbers = {1,2,3};
        double harmonik=0;
        for (int i=0; i<numbers.length; i++){
            harmonik+=(1/numbers[i]);
        }
        System.out.println("Harmonik ortalama: "+harmonik);
    }

}

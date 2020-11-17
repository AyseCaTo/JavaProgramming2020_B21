package library;

public class StringUtility {

    public static void main(String[] args) {
        System.out.println( frequency("aaaayse", 'a'));
    }

    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
}

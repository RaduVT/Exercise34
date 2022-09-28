public class exercise34 {
    public static void main(String[] args){
        double e = 1, denom = 1;

        for (int i = 1; i <= 10000; i++){
            denom = denom * i;
            e = e + 1 / denom;
        }
        System.out.println(e);
    }
}

public class Problem {
    public static void main(String[] args) {
        
    }

    public static int addNo(int n){
        if(n/10==0){
            return n;
        }

        return addNo(n/10) +addNo(n%10);
    }
}

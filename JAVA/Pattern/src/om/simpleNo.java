package om;

public class simpleNo {
    public static void main(String[] args){
        simpNo(4);
    }

    static void simpNo(int n) {
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

package om;

public class rectangleFilled {
    public static void main(String[] args){
        rectFilled(4);
    }
    static void rectFilled(int n) {
        for(int i = 1; i<=n; i++){ //for row
            for (int j =1 ; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

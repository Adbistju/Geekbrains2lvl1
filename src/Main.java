public class Main {
    public static int H =1;
    public static void main (String[] args){
        transformationTrueOrFalse();
        computingaSequence();
        multiplyingaNumber();
        drawingDiagonal();
        searchMass();
        sideComprasion();
        nextMass();
    }
    public static void ubung(){
        System.out.println();
        System.out.println("Задание" + H++ + ".");
    }
    public static void transformationTrueOrFalse(){
        ubung();
        byte [] m = {1,1,0,1,0,0,0,1,1,0,1,1,1};
        for (byte j=0; j<m.length;j++){
            System.out.print(" " +m[j]);
        }
        for (byte i=0; i<m.length;i++){
            if (m[i]==0){
                m[i]=1;
            }else{
                m[i]=1;
            }
        }
    }
    public static void computingaSequence(){
        ubung();
        int d = 8;
        int[] D = new int[d];
        for (byte i=0; i<D.length; i++){
            D[i]=3*i;
            System.out.print(" "+D[i]);
        }
    }
    public static void multiplyingaNumber(){
        ubung();
        int[] Y= {3,4,6,2,9,8,5,2,1,314,354,534,73,84,2,1,45};
        for (byte j=0; j<Y.length;j++){
            System.out.print (" "+Y[j]);
        }
        for (byte i=0; i<Y.length;i++){
            if (Y[i]<=6){
                Y[i]*=2;
            }
            System.out.print(" "+Y[i]);
        }
    }
    public static void drawingDiagonal(){
        ubung();
        int g = 5;
        int D [][] = new int[g][g];
        for (int i= 0;i<D.length;i++){
            for (int j= 0;j<D.length;j++){
                if(i==j){
                    D[i][j]=1;
                }
                System.out.print(D[i][j]);
            }
            System.out.println();
        }
    }
    public static void searchMass(){
        ubung();
        int[] H= {2,3,6,86,4,45,754,2,7,4,64,3,4,5,46,62,54,435,634,73,8,47};
        int MAX=H[0];
        int MIN=H[0];
        for (int i =0; i<H.length;i++){
            if(MAX<H[i]){
                MAX=H[i];
            }else if(MIN>H[i]){
                MIN=H[i];
            }
        }
        System.out.println("Минимальное значение массива " + MIN);
        System.out.println("Максимальное значение массива " + MAX);
    }
    public static void sideComprasion(){
        ubung();
        int[] H= {2,3,6,86,4,45,754,2,7,4,8764,3,4,5,46,62,54,435,634,73,8,47};
        int l=0;
        int r=0;
        for (int i=0; i<H.length;i++){
            if(i<=H.length/2){
                l+=H[i];
            }else {r+=H[i];}
        }
        if (r==l){
            System.out.println(true);
        }else{System.out.println(false);}
    }
    public static void nextMass(){
        ubung();
        int Prog=0;
        int[] H= {1,2,3,5,6,7,8,9,9};
//        int[] H={2,4,4,5,2,2,7,5,8,9,0};
//        int [] H={11,22,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i=0;i<H.length-1;i++){
                if (Prog == 0) {
                    Prog = H[i + 1] - H[i];
                }
                if (Prog != H[i + 1] - H[i]) {
                    H[i + 1] = H[i] + Prog;
                }
        }
        for (int j=0; j<H.length;j++){
            System.out.print(" "+ H[j]);
        }
    }
}
//0001
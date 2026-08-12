public class Main {
    public static void main(String[] args) {
        double  P1, E1, E2, X, SUB, API, EXF, Base, MEDIA;
        P1=7.0;
        E1=7.0;
        E2=6.0;
        X=0.8;
        SUB=8.0;
        API=9.0;
        EXF=0.0;
        Base = ((P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + (X + SUB * 0.15));
if (Base >= 6){
    MEDIA = (Base * 0.5) + (API * 0.5);
    System.out.println("APROVADO");
    }
    else
    if (Base >= 4.0){
        MEDIA = EXF;
    }
    else
        System.out.println("Hello, World!");
    }
}
package assignment_1;

/**
 * Matches
 */
public class CaseA {

    public static void main(String[] args){
        for(int i = 0; i < 14; i++) {
            System.out.println("[Linear] " + caseA(i));
            System.out.println("[Recursive] " + recursiveCaseA(i));
        }
    }

    public static long caseA(long x){
        return (long) Math.pow(x, 2);
    }

    public static long recursiveCaseA(long x){
        if(x==0)return 0;
        if(x==1)return 1;
        if(x==2)return 4;
        return 3*recursiveCaseA(x - 1)-3*recursiveCaseA(x - 2) +recursiveCaseA(x - 3);
    }
}

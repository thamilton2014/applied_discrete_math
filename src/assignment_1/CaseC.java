package assignment_1;

/**
 * This scenario's functions do not match.
 */
public class CaseC {

    public static void main(String[] args){
        for(int i = 0; i < 14; i++) {
            System.out.println("[Linear] " + caseC(i));
            System.out.println("[Recursive] " + recursiveCaseC(i));
        }
    }
    
    public static long caseC(long x){
        return (long) (12 + 8 * x - (3 * Math.pow(x, 2))+ Math.pow(x, 3));
    }

    public static long recursiveCaseC(long x){
        if(x==0)return 12;
        if(x==1)return 18;
        return 2*recursiveCaseC(x - 1)-recursiveCaseC(x-2);
    }
}

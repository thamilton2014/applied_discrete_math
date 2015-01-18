package assignment_1;

/**
 * Matches
 */
public class CaseB {
    
    public static void main(String[] args){
        for(int i = 0; i < 14; i++) {
            System.out.println("[Linear] " + caseB(i));
            System.out.println("[Recursive] " + recursiveCaseB(i));
        }
    }

    public static long caseB(long x){

        return (long) ((x * x) * Math.pow(2, x) + x * Math.pow(3, x));
    }

    public static long recursiveCaseB(long x){
        if(x==0)return 0;
        if(x==1)return 5;
        if(x==2)return 34;
        if(x==3)return 153;
        if(x==4)return 580;
        return 12*recursiveCaseB(x - 1)-57*recursiveCaseB(x - 2) +134*recursiveCaseB(x - 3)-156*recursiveCaseB(x - 4)+72*recursiveCaseB(x-5);
    }
}

package assignment_1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCase {

    @Before
    public void setUp(){
        
    }
    
    @Test
    public void testCaseA(){
        for(int i = 0; i < 14; i++)
            assertEquals(caseA(i), recursiveCaseA(i));
    }

    @Test
    public void testCaseB(){
        for(int i = 0; i < 14; i++)
            assertEquals(caseB(i), recursiveCaseB(i));
    }

    @Test
    public void testCaseC(){
        for(int i = 0; i < 14; i++)
            assertEquals(caseC(i), recursiveCaseC(i));
    }

    public long caseA(long x){
        return (long) Math.pow(x, 2);
    }

    public long recursiveCaseA(long x){
        if(x==0)return 0;
        if(x==1)return 1;
        if(x==2)return 4;
        return 3*recursiveCaseA(x - 1)-3*recursiveCaseA(x - 2) +recursiveCaseA(x - 3);
    }

    public long caseB(long x){

        return (long) ((x * x) * Math.pow(2, x) + x * Math.pow(3, x));
    }

    public long recursiveCaseB(long x){
        if(x==0)return 0;
        if(x==1)return 5;
        if(x==2)return 34;
        if(x==3)return 153;
        if(x==4)return 580;
        return 12*recursiveCaseB(x - 1)-57*recursiveCaseB(x - 2) +134*recursiveCaseB(x - 3)-156*recursiveCaseB(x - 4)+72*recursiveCaseB(x-5);
    }

    public long caseC(long x){
        return (long) (12 + 8 * x - (3 * Math.pow(x, 2))+ Math.pow(x, 3));
    }

    public long recursiveCaseC(long x){
        if(x==0)return 12;
        if(x==1)return 18;
        return 2*recursiveCaseC(x - 1)-recursiveCaseC(x-2);
    }
}

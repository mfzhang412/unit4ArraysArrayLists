

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testMonsterlocation1()
    {
        // expected monster location 16, 18
        
        Radar testRadar = new Radar(100,100);

        testRadar.setMonsterLocation(16, 18);
        int actualMonsterRow = 16;
        int actualMonsterCol = 18;
        
        int monsterRow = 0;
        int monsterCol = 0;
        int biggestValue = 0;
        
        for (int i = 0; i < 71; i++)
        {
            testRadar.scan();
        }
        
        for (int i = 0; i < testRadar.getNumRows(); i++)
        {
            for (int j = 0; j < testRadar.getNumCols(); j++)
            {
                if (testRadar.getAccumulatedDetection(i, j) > biggestValue)
                {
                    monsterRow = i;
                    monsterCol = j;
                    biggestValue = testRadar.getAccumulatedDetection(i, j);
                }
            }
        }
        
        assertEquals(monsterRow, actualMonsterRow);
        assertEquals(monsterCol, actualMonsterCol);
    }
    
    @Test
    public void testMonsterLocation2()
    {
        // expected monster location 50, 53
        
        Radar testRadar2 = new Radar(100,100);

        testRadar2.setMonsterLocation(50, 53);
        int actualMonsterRow2 = 50;
        int actualMonsterCol2 = 53;
        
        int monsterRow2 = 0;
        int monsterCol2 = 0;
        int biggestValue2 = 0;
        
        for (int i = 0; i < 71; i++)
        {
            testRadar2.scan();
        }
        
        for (int i = 0; i < testRadar2.getNumRows(); i++)
        {
            for (int j = 0; j < testRadar2.getNumCols(); j++)
            {
                if (testRadar2.getAccumulatedDetection(i, j) > biggestValue2)
                {
                    monsterRow2 = i;
                    monsterCol2 = j;
                    biggestValue2 = testRadar2.getAccumulatedDetection(i, j);
                }
            }
        }
        
        assertEquals(monsterRow2, actualMonsterRow2);
        assertEquals(monsterCol2, actualMonsterCol2);
    }
}

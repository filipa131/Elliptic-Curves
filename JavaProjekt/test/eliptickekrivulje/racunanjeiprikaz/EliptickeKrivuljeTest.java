package eliptickekrivulje.racunanjeiprikaz;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EliptickeKrivuljeTest {
    
    public EliptickeKrivuljeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDohvatiA() {
        System.out.println("dohvatiA");
        EliptickeKrivulje instance = new EliptickeKrivulje();
        int expResult = 0;
        int result = instance.dohvatiA();
        assertEquals(expResult, result);
    }

    @Test
    public void testDohvatiB() {
        System.out.println("dohvatiB");
        EliptickeKrivulje instance = new EliptickeKrivulje();
        int expResult = 0;
        int result = instance.dohvatiB();
        assertEquals(expResult, result);
    }

    @Test
    public void testDohvatiP() {
        System.out.println("dohvatiP");
        EliptickeKrivulje instance = new EliptickeKrivulje();
        int expResult = 0;
        int result = instance.dohvatiP();
        assertEquals(expResult, result);
    }

    @Test
    public void testTockaNaEK() {
        System.out.println("TockaNaEK");
        Tocka t = new Tocka(1, 2);
        EliptickeKrivulje instance = new EliptickeKrivulje(2, 1, 3);
        boolean expResult = true;
        boolean result = instance.TockaNaEK(t);
        assertEquals(expResult, result);
    }

    @Test
    public void testZbroji() {
        System.out.println("zbroji");
        Tocka t1 = new Tocka(1, 2);
        Tocka t2 = new Tocka(3, 4);
        EliptickeKrivulje instance = new EliptickeKrivulje(2, 1, 3);
        Tocka zbroj = instance.zbroji(t1, t2);
        boolean result = zbroj.jednako(new Tocka(0, 2));
        assertEquals(true, result);
    }

    @Test
    public void testOduzmi() {
        System.out.println("oduzmi");
        Tocka t1 = new Tocka(1, 2);
        Tocka t2 = new Tocka(3, 4);
        EliptickeKrivulje instance = new EliptickeKrivulje(2, 1, 3);
        Tocka razlika = instance.oduzmi(t1, t2);
        boolean result = razlika.jednako(new Tocka(2, 1));
        assertEquals(true, result);
    }

    @Test
    public void testSkalarnoMnozenje() {
        System.out.println("skalarnoMnozenje");
        Tocka t = new Tocka(1, 2);
        int n = 2;
        EliptickeKrivulje instance = new EliptickeKrivulje(2, 1, 3);
        Tocka umnozak = instance.skalarnoMnozenje(t, n);
        boolean result = umnozak.jednako(new Tocka(2, 2));
        assertEquals(true, result);
    }

    @Test
    public void testTockeZaCrtanjeINT() {
        System.out.println("tockeZaCrtanjeINT");
        EliptickeKrivulje instance = new EliptickeKrivulje();
        ArrayList<Tocka> expResult = null;
        ArrayList<Tocka> result = instance.tockeZaCrtanjeINT();
        assertNotEquals(expResult, result);
    }
    
}

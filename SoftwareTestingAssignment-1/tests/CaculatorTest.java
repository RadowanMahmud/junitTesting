import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {


    @Test
    public void add2() {
    }


    @Test
    public void divide() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void addWorstCase1 () {
        Caculator c = new Caculator();
        int result = c.add(-1000,2000);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase2 () {
        Caculator c = new Caculator();
        int result = c.add(-1000,2001);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase3 () {
        Caculator c = new Caculator();
        int result = c.add(-1000,3000);
        int expected = 2000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase4 () {
        Caculator c = new Caculator();
        int result = c.add(-1000,3999);
        int expected = 2999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase5 () {
        Caculator c = new Caculator();
        int result = c.add(-1000,4000);
        int expected = 3000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase6 () {
        Caculator c = new Caculator();
        int result = c.add(-999,2000);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase7 () {
        Caculator c = new Caculator();
        int result = c.add(-999,2001);
        int expected = 1002;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase8 () {
        Caculator c = new Caculator();
        int result = c.add(-999,3000);
        int expected = 2001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase9 () {
        Caculator c = new Caculator();
        int result = c.add(-999,3999);
        int expected = 3000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase10 () {
        Caculator c = new Caculator();
        int result = c.add(-999,4000);
        int expected = 3001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase11 () {
        Caculator c = new Caculator();
        int result = c.add(0,2000);
        int expected = 2000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase12 () {
        Caculator c = new Caculator();
        int result = c.add(0,2001);
        int expected = 2001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase13 () {
        Caculator c = new Caculator();
        int result = c.add(0,3000);
        int expected = 3000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase14 () {
        Caculator c = new Caculator();
        int result = c.add(0,3999);
        int expected = 3999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase15 () {
        Caculator c = new Caculator();
        int result = c.add(0,4000);
        int expected = 4000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase16 () {
        Caculator c = new Caculator();
        int result = c.add(999,2000);
        int expected = 2999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase17 () {
        Caculator c = new Caculator();
        int result = c.add(999,2001);
        int expected = 3000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase18 () {
        Caculator c = new Caculator();
        int result = c.add(999,3000);
        int expected = 3999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase19 () {
        Caculator c = new Caculator();
        int result = c.add(999,3999);
        int expected = 4998;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase20 () {
        Caculator c = new Caculator();
        int result = c.add(999,4000);
        int expected = 4999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase21 () {
        Caculator c = new Caculator();
        int result = c.add(1000,2000);
        int expected = 3000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase22 () {
        Caculator c = new Caculator();
        int result = c.add(1000,2001);
        int expected = 3001;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase23 () {
        Caculator c = new Caculator();
        int result = c.add(1000,3000);
        int expected = 4000;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase24 () {
        Caculator c = new Caculator();
        int result = c.add(1000,3999);
        int expected = 4999;
        assertEquals(expected,result);
    }
    @Test
    public void addWorstCase25 () {
        Caculator c = new Caculator();
        int result = c.add(1000,4000);
        int expected = 5000;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10000 () {
        Caculator c = new Caculator();
        int result = c.add(0,-100);
        int expected = -100;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10001 () {
        Caculator c = new Caculator();
        int result = c.add(0,-99);
        int expected = -99;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10002 () {
        Caculator c = new Caculator();
        int result = c.add(0,100);
        int expected = 100;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10003 () {
        Caculator c = new Caculator();
        int result = c.add(0,99);
        int expected = 99;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10004 () {
        Caculator c = new Caculator();
        int result = c.add(-10000,0);
        int expected = -10000;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10005 () {
        Caculator c = new Caculator();
        int result = c.add(-9999,0);
        int expected = -9999;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10006 () {
        Caculator c = new Caculator();
        int result = c.add(10000,0);
        int expected = 10000;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10007 () {
        Caculator c = new Caculator();
        int result = c.add(9999,0);
        int expected = 9999;
        assertEquals(expected,result);
    }
    @Test
    public void addBVC10008 () {
        Caculator c = new Caculator();
        int result = c.add(0,0);
        int expected = 0;
        assertEquals(expected,result);
    }

    ///////////add1 Tests

    @Test
    public void add_three_parameter_BVC10000 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,800);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10001 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,801);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10002 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,900);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10003 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,899);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10004 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,850);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10005 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,850);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10006 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,850);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10007 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,850);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10008 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,850);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10009 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,850);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10010 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,850);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10011 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,850);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_BVC10012 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,850);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase1 () {
        Caculator c = new Caculator();
        int result = c.add(-100,200,800);
        int expected = 900;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase2 () {
        Caculator c = new Caculator();
        int result = c.add(-100,200,801);
        int expected = 901;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase3 () {
        Caculator c = new Caculator();
        int result = c.add(-100,200,850);
        int expected = 950;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase4 () {
        Caculator c = new Caculator();
        int result = c.add(-100,200,899);
        int expected = 999;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase5 () {
        Caculator c = new Caculator();
        int result = c.add(-100,200,900);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase6 () {
        Caculator c = new Caculator();
        int result = c.add(-100,201,800);
        int expected = 901;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase7 () {
        Caculator c = new Caculator();
        int result = c.add(-100,201,801);
        int expected = 902;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase8 () {
        Caculator c = new Caculator();
        int result = c.add(-100,201,850);
        int expected = 951;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase9 () {
        Caculator c = new Caculator();
        int result = c.add(-100,201,899);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase10 () {
        Caculator c = new Caculator();
        int result = c.add(-100,201,900);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase11 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,800);
        int expected = 950;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase12 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,801);
        int expected = 951;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase13 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,850);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase14 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,899);
        int expected = 1049;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase15 () {
        Caculator c = new Caculator();
        int result = c.add(-100,250,900);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase16 () {
        Caculator c = new Caculator();
        int result = c.add(-100,299,800);
        int expected = 999;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase17 () {
        Caculator c = new Caculator();
        int result = c.add(-100,299,801);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase18 () {
        Caculator c = new Caculator();
        int result = c.add(-100,299,850);
        int expected = 1049;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase19 () {
        Caculator c = new Caculator();
        int result = c.add(-100,299,899);
        int expected = 1098;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase20 () {
        Caculator c = new Caculator();
        int result = c.add(-100,299,900);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase21 () {
        Caculator c = new Caculator();
        int result = c.add(-100,300,800);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase22 () {
        Caculator c = new Caculator();
        int result = c.add(-100,300,801);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase23 () {
        Caculator c = new Caculator();
        int result = c.add(-100,300,850);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase24 () {
        Caculator c = new Caculator();
        int result = c.add(-100,300,899);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase25 () {
        Caculator c = new Caculator();
        int result = c.add(-100,300,900);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase26 () {
        Caculator c = new Caculator();
        int result = c.add(-99,200,800);
        int expected = 901;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase27 () {
        Caculator c = new Caculator();
        int result = c.add(-99,200,801);
        int expected = 902;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase28 () {
        Caculator c = new Caculator();
        int result = c.add(-99,200,850);
        int expected = 951;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase29 () {
        Caculator c = new Caculator();
        int result = c.add(-99,200,899);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase30 () {
        Caculator c = new Caculator();
        int result = c.add(-99,200,900);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase31 () {
        Caculator c = new Caculator();
        int result = c.add(-99,201,800);
        int expected = 902;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase32 () {
        Caculator c = new Caculator();
        int result = c.add(-99,201,801);
        int expected = 903;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase33 () {
        Caculator c = new Caculator();
        int result = c.add(-99,201,850);
        int expected = 952;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase34 () {
        Caculator c = new Caculator();
        int result = c.add(-99,201,899);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase35 () {
        Caculator c = new Caculator();
        int result = c.add(-99,201,900);
        int expected = 1002;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase36 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,800);
        int expected = 951;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase37 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,801);
        int expected = 952;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase38 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,850);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase39 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,899);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase40 () {
        Caculator c = new Caculator();
        int result = c.add(-99,250,900);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase41 () {
        Caculator c = new Caculator();
        int result = c.add(-99,299,800);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase42 () {
        Caculator c = new Caculator();
        int result = c.add(-99,299,801);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase43 () {
        Caculator c = new Caculator();
        int result = c.add(-99,299,850);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase44 () {
        Caculator c = new Caculator();
        int result = c.add(-99,299,899);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase45 () {
        Caculator c = new Caculator();
        int result = c.add(-99,299,900);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase46 () {
        Caculator c = new Caculator();
        int result = c.add(-99,300,800);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase47 () {
        Caculator c = new Caculator();
        int result = c.add(-99,300,801);
        int expected = 1002;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase48 () {
        Caculator c = new Caculator();
        int result = c.add(-99,300,850);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase49 () {
        Caculator c = new Caculator();
        int result = c.add(-99,300,899);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase50 () {
        Caculator c = new Caculator();
        int result = c.add(-99,300,900);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase51 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,800);
        int expected = 1000;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase52 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,801);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase53 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,850);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase54 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,899);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase55 () {
        Caculator c = new Caculator();
        int result = c.add(0,200,900);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase56 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,800);
        int expected = 1001;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase57 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,801);
        int expected = 1002;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase58 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,850);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase59 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,899);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase60 () {
        Caculator c = new Caculator();
        int result = c.add(0,201,900);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase61 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,800);
        int expected = 1050;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase62 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,801);
        int expected = 1051;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase63 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,850);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase64 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,899);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase65 () {
        Caculator c = new Caculator();
        int result = c.add(0,250,900);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase66 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,800);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase67 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,801);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase68 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,850);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase69 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,899);
        int expected = 1198;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase70 () {
        Caculator c = new Caculator();
        int result = c.add(0,299,900);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase71 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,800);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase72 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,801);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase73 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,850);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase74 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,899);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase75 () {
        Caculator c = new Caculator();
        int result = c.add(0,300,900);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase76 () {
        Caculator c = new Caculator();
        int result = c.add(99,200,800);
        int expected = 1099;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase77 () {
        Caculator c = new Caculator();
        int result = c.add(99,200,801);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase78 () {
        Caculator c = new Caculator();
        int result = c.add(99,200,850);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase79 () {
        Caculator c = new Caculator();
        int result = c.add(99,200,899);
        int expected = 1198;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase80 () {
        Caculator c = new Caculator();
        int result = c.add(99,200,900);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase81 () {
        Caculator c = new Caculator();
        int result = c.add(99,201,800);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase82 () {
        Caculator c = new Caculator();
        int result = c.add(99,201,801);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase83 () {
        Caculator c = new Caculator();
        int result = c.add(99,201,850);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase84 () {
        Caculator c = new Caculator();
        int result = c.add(99,201,899);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase85 () {
        Caculator c = new Caculator();
        int result = c.add(99,201,900);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase86 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,800);
        int expected = 1149;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase87 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,801);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase88 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,850);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase89 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,899);
        int expected = 1248;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase90 () {
        Caculator c = new Caculator();
        int result = c.add(99,250,900);
        int expected = 1249;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase91 () {
        Caculator c = new Caculator();
        int result = c.add(99,299,800);
        int expected = 1198;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase92 () {
        Caculator c = new Caculator();
        int result = c.add(99,299,801);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase93 () {
        Caculator c = new Caculator();
        int result = c.add(99,299,850);
        int expected = 1248;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase94 () {
        Caculator c = new Caculator();
        int result = c.add(99,299,899);
        int expected = 1297;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase95 () {
        Caculator c = new Caculator();
        int result = c.add(99,299,900);
        int expected = 1298;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase96 () {
        Caculator c = new Caculator();
        int result = c.add(99,300,800);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase97 () {
        Caculator c = new Caculator();
        int result = c.add(99,300,801);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase98 () {
        Caculator c = new Caculator();
        int result = c.add(99,300,850);
        int expected = 1249;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase99 () {
        Caculator c = new Caculator();
        int result = c.add(99,300,899);
        int expected = 1298;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase100 () {
        Caculator c = new Caculator();
        int result = c.add(99,300,900);
        int expected = 1299;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase101 () {
        Caculator c = new Caculator();
        int result = c.add(100,200,800);
        int expected = 1100;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase102 () {
        Caculator c = new Caculator();
        int result = c.add(100,200,801);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase103 () {
        Caculator c = new Caculator();
        int result = c.add(100,200,850);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase104 () {
        Caculator c = new Caculator();
        int result = c.add(100,200,899);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase105 () {
        Caculator c = new Caculator();
        int result = c.add(100,200,900);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase106 () {
        Caculator c = new Caculator();
        int result = c.add(100,201,800);
        int expected = 1101;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase107 () {
        Caculator c = new Caculator();
        int result = c.add(100,201,801);
        int expected = 1102;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase108 () {
        Caculator c = new Caculator();
        int result = c.add(100,201,850);
        int expected = 1151;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase109 () {
        Caculator c = new Caculator();
        int result = c.add(100,201,899);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase110 () {
        Caculator c = new Caculator();
        int result = c.add(100,201,900);
        int expected = 1201;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase111 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,800);
        int expected = 1150;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase112 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,801);
        int expected = 1151;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase113 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,850);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase114 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,899);
        int expected = 1249;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase115 () {
        Caculator c = new Caculator();
        int result = c.add(100,250,900);
        int expected = 1250;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase116 () {
        Caculator c = new Caculator();
        int result = c.add(100,299,800);
        int expected = 1199;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase117 () {
        Caculator c = new Caculator();
        int result = c.add(100,299,801);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase118 () {
        Caculator c = new Caculator();
        int result = c.add(100,299,850);
        int expected = 1249;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase119 () {
        Caculator c = new Caculator();
        int result = c.add(100,299,899);
        int expected = 1298;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase120 () {
        Caculator c = new Caculator();
        int result = c.add(100,299,900);
        int expected = 1299;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase121 () {
        Caculator c = new Caculator();
        int result = c.add(100,300,800);
        int expected = 1200;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase122 () {
        Caculator c = new Caculator();
        int result = c.add(100,300,801);
        int expected = 1201;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase123 () {
        Caculator c = new Caculator();
        int result = c.add(100,300,850);
        int expected = 1250;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase124 () {
        Caculator c = new Caculator();
        int result = c.add(100,300,899);
        int expected = 1299;
        assertEquals(expected,result);
    }
    @Test
    public void add_three_parameter_worstCase125 () {
        Caculator c = new Caculator();
        int result = c.add(100,300,900);
        int expected = 1300;
        assertEquals(expected,result);
    }

    ////////////////////substract
    @Test
    public void subtract_worstCase1 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,300);
        int expected = -200;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase2 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,301);
        int expected = -201;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase3 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,350);
        int expected = -250;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase4 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,399);
        int expected = -299;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase5 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,400);
        int expected = -300;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase6 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,300);
        int expected = -199;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase7 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,301);
        int expected = -200;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase8 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,350);
        int expected = -249;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase9 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,399);
        int expected = -298;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase10 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,400);
        int expected = -299;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase11 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,300);
        int expected = -150;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase12 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,301);
        int expected = -151;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase13 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,350);
        int expected = -200;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase14 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,399);
        int expected = -249;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase15 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,400);
        int expected = -250;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase16 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,300);
        int expected = -101;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase17 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,301);
        int expected = -102;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase18 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,350);
        int expected = -151;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase19 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,399);
        int expected = -200;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase20 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,400);
        int expected = -201;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase21 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,300);
        int expected = -100;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase22 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,301);
        int expected = -101;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase23 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,350);
        int expected = -150;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase24 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,399);
        int expected = -199;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_worstCase25 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,400);
        int expected = -200;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10000 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,300);
        int expected = -150;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10001 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,301);
        int expected = -151;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10002 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,400);
        int expected = -250;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10003 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,399);
        int expected = -249;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10004 () {
        Caculator c = new Caculator();
        int result = c.subtract(100,350);
        int expected = -250;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10005 () {
        Caculator c = new Caculator();
        int result = c.subtract(101,350);
        int expected = -249;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10006 () {
        Caculator c = new Caculator();
        int result = c.subtract(200,350);
        int expected = -150;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10007 () {
        Caculator c = new Caculator();
        int result = c.subtract(199,350);
        int expected = -151;
        assertEquals(expected,result);
    }
    @Test
    public void subtract_BVC10008 () {
        Caculator c = new Caculator();
        int result = c.subtract(150,350);
        int expected = -200;
        assertEquals(expected,result);
    }
}
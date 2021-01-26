import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculatorTest {

    @Test
    public void getGradeTest1() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,1);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest2() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,2);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest3() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,10);
        String expected = "C";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest4() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,9);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest5() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest6() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest7() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,5);
        String expected = "A";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest8() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,5);
        String expected = "A";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest9() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest110() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest11() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,5);
        String expected = "B";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest12() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest13() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest14() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,5);
        String expected = "F";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest15() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,5);
        String expected = "B";

        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTest16() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }

    @Test
    public void getGradeTest17() {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,5);
        String expected = "C";

        assertEquals(expected,grade);
    }


    //test cases for getGPA
    @Test
    public void getGPATest1() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("A+");
        double expected = 4.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest2() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("A");
        double expected = 3.50;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest3() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("B");
        double expected = 3.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest4() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("C");
        double expected = 2.00;

        assertEquals(expected,gpa,0.001);
    }
    @Test
    public void getGPATest5() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("F");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }

    @Test
    public void getGPATest6() {
        GradeCalculator gc = new GradeCalculator();
        double gpa = gc.getGPA("D");
        double expected = 0.00;

        assertEquals(expected,gpa,0.001);
    }

//    public void test(int a,int b,int c,int d,String g ){
//        GradeCalculator gc= new GradeCalculator();
//        String grade = gc.getGrade(a,b,c,d);
//        String expected = g;
//
//        assertEquals(expected,grade);
//    }
//
//    @Test
//    public void getGradeTest1() {
//        test(10,10,2,5,"F");
////        test(10,10,50,5,"A");
//        test(1,10,25,5,"F");
//        test(10,10,25,5,"C");
//   }

    @Test
    public void getGradeTestWorstCase1 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase2 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase3 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase4 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase5 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase6 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase7 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase8 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase9 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase10 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase11 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase12 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase13 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase14 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase15 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase16 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase17 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase18 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase19 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase20 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase21 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase22 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase23 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase24 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase25 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase26 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase27 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase28 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase29 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase30 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase31 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase32 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase33 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase34 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase35 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase36 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase37 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase38 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase39 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase40 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase41 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase42 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase43 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase44 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase45 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase46 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase47 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase48 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase49 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase50 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,2,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase51 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase52 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase53 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase54 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase55 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase56 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase57 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase58 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase59 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase60 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase61 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase62 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase63 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase64 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase65 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase66 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase67 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase68 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase69 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase70 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase71 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase72 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase73 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase74 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase75 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,10,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase76 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase77 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase78 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase79 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase80 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase81 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase82 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase83 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase84 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase85 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase86 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase87 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase88 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase89 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase90 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase91 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase92 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase93 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase94 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase95 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase96 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase97 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase98 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase99 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase100 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,19,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase101 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase102 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase103 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase104 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase105 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase106 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase107 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase108 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase109 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase110 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase111 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase112 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase113 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase114 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase115 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase116 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase117 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase118 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase119 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase120 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase121 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase122 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase123 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase124 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase125 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,20,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase126 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase127 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase128 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase129 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase130 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase131 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase132 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase133 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase134 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase135 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase136 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase137 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase138 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase139 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase140 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase141 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase142 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase143 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase144 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase145 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase146 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase147 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase148 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase149 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase150 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,1,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase151 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase152 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase153 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase154 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase155 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase156 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase157 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase158 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase159 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase160 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase161 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase162 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase163 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase164 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase165 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase166 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase167 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase168 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase169 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase170 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase171 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase172 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase173 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase174 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase175 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,2,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase176 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase177 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase178 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase179 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase180 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase181 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase182 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase183 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase184 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase185 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase186 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase187 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase188 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase189 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase190 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase191 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase192 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase193 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase194 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase195 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase196 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase197 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase198 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase199 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase200 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,10,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase201 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase202 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase203 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase204 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase205 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase206 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase207 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase208 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase209 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase210 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase211 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase212 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase213 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase214 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase215 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase216 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase217 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase218 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase219 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase220 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase221 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase222 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase223 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase224 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase225 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,19,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase226 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase227 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase228 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase229 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase230 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase231 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase232 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase233 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase234 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase235 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase236 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase237 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase238 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase239 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase240 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase241 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase242 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase243 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase244 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase245 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase246 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase247 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase248 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase249 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase250 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(2,20,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase251 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase252 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase253 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase254 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase255 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase256 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase257 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase258 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase259 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase260 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase261 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase262 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase263 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase264 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase265 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase266 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase267 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase268 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase269 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase270 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase271 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase272 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase273 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase274 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase275 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,1,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase276 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase277 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase278 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase279 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase280 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase281 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase282 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase283 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase284 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase285 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase286 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase287 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase288 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase289 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase290 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase291 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase292 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase293 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase294 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase295 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase296 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase297 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase298 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase299 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase300 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,2,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase301 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase302 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase303 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase304 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase305 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase306 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase307 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase308 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase309 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase310 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase311 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase312 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase313 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase314 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase315 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase316 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase317 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase318 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase319 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase320 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase321 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase322 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase323 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase324 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase325 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,10,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase326 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase327 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase328 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase329 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase330 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase331 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase332 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase333 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase334 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase335 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase336 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase337 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase338 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase339 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase340 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase341 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase342 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase343 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase344 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase345 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase346 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase347 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase348 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase349 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase350 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,19,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase351 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase352 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase353 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase354 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase355 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase356 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase357 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase358 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase359 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase360 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase361 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase362 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase363 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase364 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase365 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase366 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase367 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase368 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase369 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase370 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase371 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase372 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase373 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase374 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase375 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(10,20,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase376 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase377 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase378 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase379 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase380 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase381 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase382 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase383 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase384 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase385 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase386 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase387 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase388 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase389 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase390 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase391 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase392 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase393 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase394 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase395 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase396 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase397 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase398 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase399 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase400 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,1,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase401 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase402 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase403 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase404 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase405 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase406 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase407 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase408 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase409 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase410 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase411 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase412 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase413 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase414 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase415 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase416 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase417 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase418 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase419 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase420 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase421 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase422 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase423 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase424 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase425 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,2,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase426 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase427 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase428 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase429 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase430 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase431 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase432 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase433 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase434 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase435 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase436 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase437 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase438 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase439 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase440 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase441 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase442 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase443 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase444 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase445 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase446 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase447 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase448 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase449 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase450 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,10,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase451 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase452 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase453 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase454 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase455 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase456 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase457 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase458 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase459 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase460 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase461 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase462 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase463 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase464 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase465 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase466 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase467 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase468 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase469 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase470 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase471 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase472 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase473 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase474 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase475 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,19,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase476 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase477 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase478 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase479 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase480 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase481 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase482 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase483 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase484 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase485 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase486 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase487 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase488 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase489 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase490 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase491 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase492 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase493 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase494 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase495 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase496 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase497 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase498 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase499 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase500 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(19,20,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase501 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase502 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase503 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase504 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase505 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase506 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase507 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase508 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase509 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase510 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase511 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase512 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase513 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase514 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase515 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase516 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase517 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase518 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase519 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase520 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase521 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase522 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase523 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase524 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase525 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,1,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase526 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase527 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase528 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase529 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase530 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase531 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase532 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase533 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase534 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase535 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase536 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase537 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase538 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase539 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase540 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase541 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase542 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase543 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase544 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase545 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase546 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase547 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase548 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase549 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase550 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,2,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase551 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase552 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase553 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase554 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase555 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase556 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase557 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase558 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase559 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase560 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase561 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase562 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase563 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase564 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase565 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase566 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase567 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase568 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase569 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase570 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase571 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase572 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase573 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase574 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase575 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,10,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase576 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase577 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase578 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase579 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase580 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase581 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase582 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase583 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase584 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase585 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase586 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase587 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase588 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase589 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase590 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase591 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase592 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase593 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase594 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase595 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase596 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase597 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase598 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase599 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase600 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,19,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase601 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,1,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase602 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,1,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase603 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,1,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase604 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,1,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase605 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,1,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase606 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,2,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase607 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,2,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase608 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,2,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase609 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,2,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase610 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,2,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase611 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,25,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase612 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,25,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase613 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,25,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase614 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,25,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase615 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,25,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase616 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,49,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase617 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,49,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase618 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,49,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase619 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,49,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase620 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,49,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase621 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,50,1);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase622 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,50,2);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase623 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,50,5);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase624 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,50,9);
        String expected = "Z";
        assertEquals(expected,grade);
    }
    @Test
    public void getGradeTestWorstCase625 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(20,20,50,10);
        String expected = "Z";
        assertEquals(expected,grade);
    }


}
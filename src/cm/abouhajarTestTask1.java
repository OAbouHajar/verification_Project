package cm;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class abouhajarTestTask1 {
    // Rate Test Case #1
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase1() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("-1");
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate  Test Case #2
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase2() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(0);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate  Test Case #3
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase3() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(8);
        BigDecimal reducedRate = new BigDecimal(10);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate  Test Case #4
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase4() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(5,7);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(6,21);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    // Rate Test Case #5
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase5() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(4);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(5,7);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(6,21);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate  Test Case #6
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase6() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = null;
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    // Rate Test Case #7
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase7() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("1");
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #8
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase8() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal("1");
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate  Test Case #9
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase9() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("[55]");
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Rate  Test Case #10
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase10() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal("hi");
        BigDecimal reducedRate = new BigDecimal(1);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate  Test Case #11
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase11() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        Period reduceP2 = new Period(1,11);
        reducedPeriods.add(reduceP);
        reducedPeriods.add(reduceP2);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #12
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase12() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(10,12);
        normalPeriods.add(np);
        Period np2 = new Period(11,1);
        normalPeriods.add(np2);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //Rate  Test Case #13
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase13() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        Period reduceP2 = new Period(17,21);
        reducedPeriods.add(reduceP2);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(10,12);
        normalPeriods.add(np);
        Period np2 = new Period(11,1);
        normalPeriods.add(np2);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase14() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = null;
        reducedPeriods.add(reduceP);
        Period reduceP2 = new Period(17,21);
        reducedPeriods.add(reduceP2);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(10,12);
        normalPeriods.add(np);
        Period np2 = new Period(11,1);
        normalPeriods.add(np2);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    // Rate  test case 15
       @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCase15() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        Period reduceP2 = null;
        reducedPeriods.add(reduceP2);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(10,12);
        normalPeriods.add(np);
        Period np2 = new Period(11,1);
        normalPeriods.add(np2);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    // Rate Test Case #14
    @org.junit.Test()
    public void testCase16() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #15
    @org.junit.Test()
    public void testCase17() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    // Rate Test Case #16
    @org.junit.Test()
    public void testCase18() throws IllegalArgumentException {
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // Rate Test Case #19
    @org.junit.Test()
    public void testCase19() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,9);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    // calculate Test Case #1
    @org.junit.Test
    public void calculateTest1() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(20);
        assertEquals(outputExpected, rate.calculate(new Period(8,10)));
    }
    // calculate Test Case #1
    @org.junit.Test
    public void calculateTest2() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,12);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.VISITOR;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(30);
        assertNotEquals(outputExpected, rate.calculate(new Period(8,10)));
    }

    // calculate Test Case #2
    @org.junit.Test
    public void calculateTest3() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(4);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(13,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,12);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(29);
        assertNotEquals(outputExpected, rate.calculate(new Period(8,14)));
    }
    // calculate Test Case #2
    @org.junit.Test
    public void calculateTest4() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(4);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(13,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,12);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STUDENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(60);
        assertNotEquals(outputExpected, rate.calculate(new Period(8,14)));
    }

    // calculate Test Case #3
    @org.junit.Test
    public void calculateTest5() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(15);
        BigDecimal reducedRate = new BigDecimal(10);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(50);
        assertNotEquals(outputExpected, rate.calculate(new Period(9,14)));
    }
    // calculate Test Case #6
    @org.junit.Test
    public void calculateTest6() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(15);
        BigDecimal reducedRate = new BigDecimal(10);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(10,15);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(7,10);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.MANAGEMENT;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(55);
        assertEquals(outputExpected, rate.calculate(new Period(9,14)));
    }
    // calculate Test Case #7
        @org.junit.Test
    public void calculateTest7() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(3);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,15);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(21);
        assertEquals(outputExpected, rate.calculate(new Period(9,12)));
    }

    // calculate Test Case #7
    @org.junit.Test
    public void calculateTest8() throws IllegalArgumentException{
        Rate rate ;
        // normalRate && reducedRate
        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(3);
        // reducedPeriods
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reduceP = new Period(16,18);
        reducedPeriods.add(reduceP);
        // normalPeriods
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,15);
        normalPeriods.add(np);
        // Car Park
        CarParkKind park = CarParkKind.STAFF;
        rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        BigDecimal outputExpected = new BigDecimal(90);
        assertNotEquals(outputExpected, rate.calculate(new Period(9,12)));
    }

}
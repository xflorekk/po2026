package agh.po.lab3;

import static org.junit.Assert.*;
public class CodingBatTest {

    private CodingBat codingBat=new CodingBat();

    @org.junit.Test
    public void sumDouble() {
        assertEquals(true,codingBat.doubleX("xxxx"));
        assertEquals(true,codingBat.doubleX("aaxx"));
        assertEquals(false,codingBat.doubleX("xaxx"));
    }

    @org.junit.Test
    public void doubleX() {
        assertEquals();
    }

    @org.junit.Test
    public void countEvens() {
    }

    @org.junit.Test
    public void helloName() {
    }
}
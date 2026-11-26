package agh.po.symulator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void move() {
        Position t1 = new Position(0,0);
        t1.move(2,3600,new Position(10,0));
        assertEquals(2.0, t1.getX(), 0.00001);
        assertEquals(0.0, t1.getY(),0.00001);
        Position t2 = new Position(0,0);
        t2.move(1,18000,new Position(3,4));
        assertEquals(3.0, t2.getX(),0.00001);
        assertEquals(4.0, t2.getY(),0.00001);
        Position t3 = new Position(10,10);
        t3.move(5,3600,new Position(13,14));
        assertEquals(3.0, t3.getX(),0.00001);
        assertEquals(4.0, t3.getY(),0.00001);


    }
}
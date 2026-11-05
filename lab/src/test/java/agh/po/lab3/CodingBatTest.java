package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class CodingBatTest {

    private CodingBat codingBat=new CodingBat();

    @org.junit.Test
    public void sumDouble() {
        assertEquals(3, codingBat.sumDouble(1,2));
        assertEquals(8, codingBat.sumDouble(2,2));
    }

    @org.junit.Test
    public void doubleX() {
        assertEquals(true,codingBat.doubleX("xxxx"));
        assertEquals(true,codingBat.doubleX("aaxx"));
        assertEquals(false,codingBat.doubleX("xaxx"));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(3, codingBat.countEvens(new int[]{2,1,2,3,4}));
        assertEquals(3, codingBat.countEvens(new int[]{2,2,0}));
        assertEquals(0, codingBat.countEvens(new int[]{1,3,5}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
    }

    @org.junit.Test
    public void mapAB() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        Map<String, String> result = codingBat.mapAB(map);

        assertEquals("HiThere", result.get("ab"));
        assertEquals("Hi", result.get("a"));
        assertEquals("There", result.get("b"));
    }

    @org.junit.Test
    public void wordLen() {
        Map<String, Integer> expected1 = Map.of("bb", 2, "a", 1);
        assertEquals(expected1, codingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));

        Map<String, Integer> expected2 = Map.of("that", 4, "and", 3, "this", 4);
        assertEquals(expected2, codingBat.wordLen(new String[]{"this", "and", "that", "and"}));

        Map<String, Integer> expected3 = Map.of("code", 4, "bug", 3);
        assertEquals(expected3, codingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

}
package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void nonBracketCharactersReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc]"));
    }
    @Test
    public void returnsFalseIfBracketsOutOfOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void noBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("It can print this"));
    }
    @Test
    public void allowsNestedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[this is outside[this is inside].]"));
    }
    @Test
    public void emptyStringReturnsTrue(){
        boolean mockData = BalancedBrackets.hasBalancedBrackets("");
        assertEquals(true, mockData);
    }
    @Test
    public void singleBracketReturnsFalse(){
        boolean mockDataL = BalancedBrackets.hasBalancedBrackets("[");
        boolean mockDataR = BalancedBrackets.hasBalancedBrackets("]");
        assertNotEquals(true, mockDataR);
        assertNotEquals(true, mockDataL);
    }
    @Test
    public void returnsTrueDespiteUnbalancedCurlyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Cats } dogs]"));
    }
    @Test
    public void returnsFalseIfBracketIsLeftOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void returnsFalseIfMisNested(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This is] ]improperly[nested]]"));
    }
    @Test
    public void manyBracketsReturnTrueIfEncapsulated(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]]]]][[[[[]"));
    }
}

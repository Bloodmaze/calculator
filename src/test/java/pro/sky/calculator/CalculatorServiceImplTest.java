package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.service.CalculatorService;
import pro.sky.calculator.service.CalculatorServiceImpl;
import pro.sky.calculator.service.ZeroDivideException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest  {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnThreeWhenSumOneAndTwo(){
        assertEquals(THREE, out.sum(ONE,TWO));
    }
    @Test
    public void shouldReturnTwoWhenSumZeroAndTwo(){
        assertEquals(TWO, out.sum(ZERO,TWO));}

    @Test
    public void shouldReturnZeroWhenMinusTwoAndTwo(){
        assertEquals(ZERO, out.minus(TWO,TWO));}
    @Test
    public void shouldReturnOneWhenMinusTwoAndOne(){
        assertEquals(ONE, out.minus(TWO,ONE));}
    @Test
    public void shouldReturnOneWhenMultiplyOneAndOne(){
        assertEquals(ONE, out.multiply(ONE,ONE));}
    @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne(){
        assertEquals(TWO, out.multiply(TWO,ONE));}
    @Test
    public void shouldReturnOneWhenDivideTwoAndTwo() throws ZeroDivideException {
        assertEquals(ONE, out.divide(TWO,TWO));}
    @Test
    public void shouldReturnTwoWhenDivideTWOAndOne() throws ZeroDivideException {
        assertEquals(TWO, out.divide(TWO,ONE));}
    @Test
    public void shouldThrowZeroDividerExceptionWhenDivideAnyAndZero() throws ZeroDivideException {
        assertThrows(ZeroDivideException.class,() -> out.divide(TWO,ZERO));}







}

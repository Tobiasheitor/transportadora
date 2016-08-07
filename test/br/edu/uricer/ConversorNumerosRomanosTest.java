package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class ConversorNumerosRomanosTest {
    
    ConversorNumerosRomanos conversor;
    
    @Before
    public void inicializaMetodoDeTeste() {
        conversor = new ConversorNumerosRomanos();
    }
    
    //deve converter I para 1
    @Test
    public void deveConverterIPara1() {
        int retorno = conversor.converter('I');
        assertEquals(1, retorno);
    }
    
    //deve converter V para 5
    @Test
    public void deveConverterVpara5() {
        assertEquals(5, conversor.converter('V'));
    }
    
    //	 * deve converter X para 10
    @Test
    public void deveConverterXpara10() {
        assertEquals(10, conversor.converter('X'));
    }
    
    //	 * dever dar erro com caracter desconhecido
    @Test(expected=IllegalArgumentException.class)
    public void deveDarErroComCaracterDesconhecido() {
        conversor.converter('Z');
    }
    
    //	 * deve validar caracter é maiúsculo  
    @Test(expected=IllegalArgumentException.class)
    public void deveValidarCaracterMaiusculo() {
        conversor.converter('i');
    }

    //	 * deve converter II para 2
    @Test
    public void deveConverterIIpara2() {
        assertEquals(2, conversor.converter("II"));
    }
    
    //	 * deve converter IV para 4
    @Test
    public void deveConverterIVPara4() {
        assertEquals(4, conversor.converter("IV"));
    }

    //	 * deve converter VI para 6
    @Test
    public void deveConverterVIPara6() {
        assertEquals(6, conversor.converter("VI"));
    }
    
    //	 * deve converter III para 3
    @Test
    public void deveConverterIIIpara3() {
        assertEquals(3, conversor.converter("III"));
    }    
    
    //	 * deve converter VII para 7
    @Test
    public void deveConverterVIIpara7() {
        assertEquals(7, conversor.converter("VII"));
    }    
    
    //	 * deve converter VIII para 8
    @Test
    public void deveConverterVIIIpara8() {
        assertEquals(8, conversor.converter("VIII"));
    }    
    
    //	 * deve converter IX para 9
    @Test
    public void deveConverterIXpara9() {
        assertEquals(9, conversor.converter("IX"));
    }    
    
    // deve converter I para 1 como String
    @Test
    public void deveConverterIpara1ComoString() {
        assertEquals(1, conversor.converter("I"));
    }    
}

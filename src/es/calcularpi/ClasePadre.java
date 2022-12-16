/*
 Seleccionamos el metodo piFunction
     Click derecho->Refactor->Extrac superclass
     Y le damos el nombre que nos fue solicitado, en este clase "Clase Padre"

*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package es.calcularpi;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author pablo
 */
public class ClasePadre {
    
    /*
    Seleccionamos todo lo que esta entre los comentarios
    Click derecho->Refactor->Introduce->Metodo
    Ponemos la visibilidad public y le damos el nombre especificado
     */
    public static BigDecimal piFunction(int k, MathContext mc) {
        //meter en el método piFunction
        int k8 = 8 * k;
        BigDecimal val1 = new BigDecimal(4);
        val1 = val1.divide(new BigDecimal(k8 + 1), mc);
        BigDecimal val2 = new BigDecimal(-2);
        val2 = val2.divide(new BigDecimal(k8 + 4), mc);
        BigDecimal val3 = new BigDecimal(-1);
        val3 = val3.divide(new BigDecimal(k8 + 5), mc);
        BigDecimal val4 = new BigDecimal(-1);
        val4 = val4.divide(new BigDecimal(k8 + 6), mc);
        BigDecimal val = val1;
        val = val.add(val2);
        val = val.add(val3);
        val = val.add(val4);
        BigDecimal multiplier = new BigDecimal(16);
        multiplier = multiplier.pow(k);
        BigDecimal one = new BigDecimal(1);
        multiplier = one.divide(multiplier, mc);
        val = val.multiply(multiplier);
        BigDecimal piK = val;
        return piK;
    }
    
}

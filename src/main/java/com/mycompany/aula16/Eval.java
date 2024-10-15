/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula16;

import org.mariuszgromada.math.mxparser.*;

public class Eval {

    public Eval() {
        License.iConfirmNonCommercialUse("Só quero fazer a calculadora que meu professor de Linguagem de Programação pediu, desculpa\nInclusive, ótimo trabalho o de vocês");
    }
    
    public static double avaliarExpressao(String expressao) {
        Expression e = new Expression(expressao);
        return e.calculate();
    }
}
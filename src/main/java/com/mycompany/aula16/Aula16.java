/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula16;


/**
 *
 * @author aluno
 */
public class Aula16 {

    public static void main(String[] args) {
        /*
        Então, Otaviano, me deparando com um desafio desses não pude me contentar com fazer uma calculadora simples com apenas 2 termos ou sem ordem de precedência
        Após ir além da minha capacidade humana e pesquisar por diversos fóruns, encontrei a solução :)
        
        https://mathparser.org/mxparser-tutorial/
        Essa biblioteca é magica e faz tudo que eu buscava, ao converter String para Formula Matemática e descobrir o resultado
        
        Para usar, basta colocar no seu pom.xml isso:
        <dependencies>
            <dependency>
                <groupId>org.mariuszgromada.math</groupId>
                <artifactId>MathParser.org-mXparser</artifactId>
                <version>6.0.0</version>
            </dependency>
        </dependencies>
        
        Por isso, a calculadora está bem insana, inclusive tem como fazer comparações, usando =, >, < que resultam em verdadeiro ou falso
        Ordem de precedência funciona
        Da pra ir apertando os botoes ou digitar dentro do espaço
        Os parenteses também funcionam, tipo:
        2 ^ 2 + 1 = 5
        2 ^ (2 + 1) = 8
        
        */
        
        
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }
}

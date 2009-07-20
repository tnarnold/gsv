/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pertmed.ets.svgenerator;

import java.util.Random;

/**
 *
 * @author tiago
 */
public class Gerador {
    public static void main(String[] args) {
        Integer max=30;
        Integer min=10;
       Integer valor=min + (new Random()).nextInt(max-min);
        System.out.println(valor.toString());
    }
}

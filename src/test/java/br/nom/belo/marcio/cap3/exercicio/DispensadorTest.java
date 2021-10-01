package br.nom.belo.marcio.cap3.exercicio;

import org.junit.Assert;
import org.junit.Test;

public class DispensadorTest {
    @Test
    public void testDispensador() {
        // começa vazio
        Dispensador caixa = new Dispensador();
        String listaVazia = "(2):0 (5):0 (10):0 (20):0 (50):0 (100):0 (200):0 TOTAL:0.0";
        Assert.assertEquals( listaVazia, caixa.listar());
        // adiciona 5 cédulas de 10
        boolean resultAdicionar1 = caixa.adicionar( 10, 5);
        Assert.assertTrue( resultAdicionar1);
        String listaOp1 = "(2):0 (5):0 (10):5 (20):0 (50):0 (100):0 (200):0 TOTAL:50.0";
        Assert.assertEquals( listaOp1, caixa.listar());
        // nao consegue adicionar em cedula que nao existe
        boolean resultAdicionar2 = caixa.adicionar( 3, 1);
        Assert.assertFalse( resultAdicionar2);
        Assert.assertEquals( listaOp1, caixa.listar()); // continua como estava
        // retira 2 de 10
        boolean resultOp1 = caixa.retirar( 10, 2);
        String listaOp2 = "(2):0 (5):0 (10):3 (20):0 (50):0 (100):0 (200):0 TOTAL:30.0";
        Assert.assertTrue( resultOp1);
        Assert.assertEquals( listaOp2, caixa.listar()); // diminuiu duas de 10
        // não consegue tirar de tipo de cédula vazia
        // e se tirássemos 1 de 10? bem, nosso dispenser não funciona assim
        boolean resultOp2 = caixa.retirar( 5, 2);
        Assert.assertFalse( resultOp2);
        Assert.assertEquals( listaOp2, caixa.listar()); // continua como era
    }
}

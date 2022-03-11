import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMarzoTest {
private boolean dentro;
private boolean esta;
    @Test
    void multiplica() {
        assertAll(
                () ->    assertEquals(4, OperacionesMarzo.multiplica(2,2)),
                () ->    assertEquals(-4, OperacionesMarzo.multiplica(2,-2))
        );

    }

    @Test
    void invierteCadena() {
        assertAll(
                () ->    assertEquals("esa k ola", OperacionesMarzo.invierteCadena("ola k ase")),
                () ->    assertEquals("sometamos o matemos", OperacionesMarzo.invierteCadena("sometamos o matemos"))
        );

    }

    @Test
    void isDivisble() {
        assertAll(
                () ->    assertTrue( OperacionesMarzo.isDivisble(10,5)),
                () ->     assertFalse( OperacionesMarzo.isDivisble(10,3))
        );

    }

    @Test
    void perimetroRectangulo() {
        assertEquals(14, OperacionesMarzo.perimetroRectangulo(3,4));


    }

    @Test
    void sacaNumeroAlAzar() {

        int num=0, contador=0;
        int[] vector={21,22,23,24,25,26};
        boolean [] aparecen =new boolean[vector.length];
        boolean aux =true;
        dentro=true;
        for(int i=0;i<10000; i++){
            if(dentro){
                dentro=aux;
            }
            num= OperacionesMarzo.sacaNumeroAlAzar(vector);
            aux =false;
            for (int j=0; j<vector.length; j++){

                if(vector[j]==num){
                  aux =true;
                  if(!aparecen[j]){
                      aparecen[j]=true;

                      contador++;
                    }
                  break;
                }
            }
        }
        esta=contador==vector.length;


        assertAll(
                ()->assertTrue(dentro, "Comprobación del rango"),
                ()->assertTrue(esta, "comprobación de aparición")

        );

    }
}
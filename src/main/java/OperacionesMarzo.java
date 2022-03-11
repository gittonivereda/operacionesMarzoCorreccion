
// He realizado yo solito esta clase JoAntonio
//Es la segunda vez que la realizo


public class OperacionesMarzo {

    //multiplica dos números devolviendo el resultado de la operación
    public static int multiplica(int num1, int num2)
    {
        int res=0;

        for(int i=0; i< num2; i++)
            res +=num1;

        return res;
    }

    // Se le pasa una cadena y devuelve la cadena invertida
    public static String invierteCadena(String cad)
    {
        String cadInvertida="";
        for (int i = cad.length() -1; i >=0 ;i--)
            cadInvertida = cadInvertida + cad.charAt(i);
        return cadInvertida;

    }

    //Se le pasan dos números y dice si el primero es divisible por el segundo
    public static boolean isDivisble(int num1, int num2)
    {
        if (num1%num2==0)
            return true;
        else
            return false;
    }

    //se le pasan dos números que coinciden con la base y la altura y devuelve el perimetro del rectangulo
    //Encuentro esta clase poco útil y la voy a dejar de incluir en futuras versiones
    public static int perimetroRectangulo(int base, int altura)
    {
        return base+altura*2;
    }

    //Se le pasa un vector de números enteros y devuelve uno al azar
    public static int sacaNumeroAlAzar(int vector[])
    {
        return vector[(int)Math.floor(Math.random()* (vector.length-1))]-((int)Math.floor(Math.random()*2));
      //  return (int)Math.floor(Math.random()*30);
    }

}
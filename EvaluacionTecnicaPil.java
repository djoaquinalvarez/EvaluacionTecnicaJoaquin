public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);
        //declaracion de variables
        int numeroUno, numeroDos, resultadoUno, resultadoDos;
        boolean booleanoUno;

        imprimirConsigna(2);
        //inicializacion de variables
        numeroUno = 1;
        numeroDos = 2;
        booleanoUno = true;

        //operaciones matematicas
        resultadoUno = numeroUno + numeroDos;
        resultadoDos = numeroUno * numeroDos;


        imprimirConsigna(3);
        //condicional 1
        if(resultadoUno > 0 && resultadoDos < 10) {
            System.out.println("resultado de suma = " + resultadoUno);
            System.out.println("resultado de multiplicacion = " + resultadoDos);
        }else {
            System.out.println("Los resultados de las operaciones no han cumplido con las condiciones requeridas");
        }
        //condicional 2
        int valorInicial = numeroDos;
        System.out.println("valorInicial = " + valorInicial);
        if(valorInicial < 10) {
            valorInicial+=1;
            if(valorInicial == numeroDos*2) {
                System.out.println("valorInicial = " + valorInicial);
            }
        }

        //iteracion
        int valorAIterar = valorInicial/3;
        for(int i = 0; i < valorAIterar; i++) {
            System.out.println("i = " + i);
        }

    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}

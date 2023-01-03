package com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;

import java.util.*;
import java.util.stream.Stream;

public class EvaluacionTecnicaPil2 {

    private static List<Tecnologia> listadoTecnologias = inicializarTecnologias();

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.
        inicializarCandidatos();
        resolverPunto1();

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2(inicializarCandidatos());

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3(inicializarCandidatos());

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4(inicializarCandidatos());

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5(inicializarCandidatos());

    }

    private static List<Candidato> inicializarCandidatos() {
        // TODO: Realizar implementación.
        List<Candidato> candidatos = new ArrayList<>();
        Long[] idsCandidatos = {3L,7L,1L,4L,5L,2L,10L,9L,8L,6L};
        String[] nombresCandidatos = {"Jhon","Matias","Joaquin","Gaston","Pablo","Lucas","Lionel","Julian","Lula","Agustin"};
        String[] apellidosCandidatos = {"Doe","Otamendi","Tagliafico","Mac Allister","De Paul","Di Maria","Messi","Alvarez","Martinez","Dybala"};
        Double[] pretencionSalarial = {5000D,3000D,2000D,5000.50D,9000.50D,6000D,10000.10D,5000D,1000D,1000D};
        Integer[] aniosExperiencia = {2,9,6,1,4,7,10,3,2,2};

        //listadoTecnologias = inicializarTecnologias();
        Tecnologia[][] tecnologiasCandidatos = {
                {buscarTecnologiaPorNombre("Java"), buscarTecnologiaPorNombre("Angular"), buscarTecnologiaPorNombre("SQL")},
                {buscarTecnologiaPorNombre("NodeJS"), buscarTecnologiaPorNombre("Java"), buscarTecnologiaPorNombre("SQL")},
                {buscarTecnologiaPorNombre("MongoDB"), buscarTecnologiaPorNombre("NoSQL")},
                {buscarTecnologiaPorNombre("Vue"), buscarTecnologiaPorNombre("SQL"), buscarTecnologiaPorNombre("Java")},
                {buscarTecnologiaPorNombre("Java")},
                {buscarTecnologiaPorNombre("Java"), buscarTecnologiaPorNombre("Angular"), buscarTecnologiaPorNombre("SQL")},
                {buscarTecnologiaPorNombre("SQL"), buscarTecnologiaPorNombre("Vue"), buscarTecnologiaPorNombre("Java")},
                {buscarTecnologiaPorNombre("NoSQL"), buscarTecnologiaPorNombre("MongoDB"), buscarTecnologiaPorNombre("SQL"), buscarTecnologiaPorNombre("Java")},
                {buscarTecnologiaPorNombre(".NET"), buscarTecnologiaPorNombre("Java"), buscarTecnologiaPorNombre("Angular")},
                {buscarTecnologiaPorNombre("Java"), buscarTecnologiaPorNombre(".NET"), buscarTecnologiaPorNombre("Angular")}
        };

        for (int i = 0; i < idsCandidatos.length; i++) {
            candidatos.add(new Candidato(
                    idsCandidatos[i],
                    nombresCandidatos[i],
                    apellidosCandidatos[i],
                    aniosExperiencia[i],
                    pretencionSalarial[i],
                    Arrays.stream(tecnologiasCandidatos[i]).toList()
            ));
        }
        return candidatos;
    }


    private static List<Tecnologia> inicializarTecnologias() {
        List<Tecnologia> tecnologias = new ArrayList<>();
        Long[] idsTecnologia = {1L,2L,3L,4L,5L,6L,7L,8L};
        String[] nombresTecnologia = {"Java","Angular","SQL","NoSQL","Vue",".NET","MongoDB","NodeJS"};

        for (int i = 0; i < idsTecnologia.length; i++){
            tecnologias.add(new Tecnologia(idsTecnologia[i], nombresTecnologia[i]));
        }
        return tecnologias;
    }


    private static Tecnologia buscarTecnologiaPorNombre(String nombre) {
        Optional<Tecnologia> optionalTecnologia = listadoTecnologias.stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst();
        return optionalTecnologia.orElse(null);
    }

    private static void resolverPunto1() {
        List<Candidato> candidatos = inicializarCandidatos();
        //candidatos.forEach(System.out::println);
        candidatos.forEach(c -> {
                    System.out.println(c);
                    List<Tecnologia> tecnologias = c.getTecnologias();
                    tecnologias.forEach(System.out::println);
                });
    }

    private static void resolverPunto2(List<Candidato> candidatos) {
        // TODO: Realizar implementación.
        Stream<Candidato> streamCandidatos = candidatos.stream()
                .sorted();

        // Ordenamiento Burbuja
        /*
        for (int i = candidatos.size() - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (candidatos.get(j).compareTo(candidatos.get(j+1)) > 0) {
                    Candidato candidatoAux = candidatos.get(j+1);
                    candidatos.set(j+1, candidatos.get(j));
                    candidatos.set(j, candidatoAux);
                }
            }
        }
         */
        streamCandidatos.forEach(c -> {
            System.out.println("ID: " + c.getId() +
                    ", Nombre y Apellido: " + c.getNombre() + " " + c.getApellido() );
        });
    }


    private static void resolverPunto3(List<Candidato> candidatos) {
        // TODO: Realizar implementación.
        Stream<Candidato> streamCandidatos = candidatos.stream()
                .sorted(candidatoComparatorSalarioDescendente());

        streamCandidatos.forEach(c -> {
            System.out.println("Pretencion Salarial: $" + c.getPretencionSalarial() + '\n' +
                    ("Nombre y Apellido: " + c.getNombre() + " " + c.getApellido()) + '\n' +
                    "--------------------------------------");
        });
    }

    private static Comparator<Candidato> candidatoComparatorSalarioDescendente() {
        return new Comparator<Candidato>() {
            @Override
            public int compare(Candidato o1, Candidato o2) {
                return Integer.compare(0, o1.getPretencionSalarial().compareTo(o2.getPretencionSalarial()));
            }
        };
    }


    private static void resolverPunto4(List<Candidato> candidatos) {
        // TODO: Realizar implementación.
        Candidato candidatoMasExperiencia = candidatos.stream()
                .max(candidatoComparatorAniosExperiencia())
                .orElseThrow();
        System.out.println(candidatoMasExperiencia);
        List<Tecnologia> tecnologiasOrdenadas = candidatoMasExperiencia.ordenarTecnologias();
        tecnologiasOrdenadas.forEach(System.out::println);
    }

    public static Comparator<Candidato> candidatoComparatorAniosExperiencia() {
        return new Comparator<Candidato>() {
            @Override
            public int compare(Candidato o1, Candidato o2) {
                return Integer.compare(o1.getAniosExperiencia().compareTo(o2.getAniosExperiencia()), 0);
            }
        };
    }


    private static void resolverPunto5(List<Candidato> candidatos) {
        // TODO: Realizar implementación.
        Candidato candidatoMasTecnologias = candidatos.stream()
                .max(candidatoComparatorCantidadTecnologias())
                .orElseThrow();
        System.out.println(candidatoMasTecnologias);

        Tecnologia tecnologiaIdPar = candidatoMasTecnologias.getTecnologias().stream()
                .filter(Tecnologia::esIdPar)
                .findFirst()
                .orElseThrow();
        System.out.println(tecnologiaIdPar);
    }

    private static Comparator<Candidato> candidatoComparatorCantidadTecnologias() {
        return new Comparator<Candidato>() {
            @Override
            public int compare(Candidato o1, Candidato o2) {
                //Convierto valores a la clase Wrapper para poder usar el compareTo
                Integer cantidadTecnologiasCandidato1 = o1.getTecnologias().size();
                Integer cantidadTecnologiasCandidato2 = o2.getTecnologias().size();
                return Integer.compare(cantidadTecnologiasCandidato1.compareTo(cantidadTecnologiasCandidato2), 0);
            }
        };
    }

    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}
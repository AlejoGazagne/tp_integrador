package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.*;

public class GenerarEjemplosDePlanes {

    // Este metodo primero crea 2 planes, segun https://monserrat.unc.edu.ar/secundario/plan-de-estudios/#1523542585948-acc3dfd8-8da3
    // y tambien crea de forma aleatoria una determinada cantidad de planes
    public static List<Plan> generar(int cantidadAGenerar, boolean imprimirResultado) {

        List<Plan> planes = new ArrayList<Plan>();

        // ==========================================================================

        // PLAN 2018

        Plan plan2018 = new PlanImpl();

        plan2018.setAnio(2018);
        plan2018.setEstadoActivo();

        planes.add(plan2018);

        // AÑOS DEL PLAN 2018

        AnioPlan primero2018 = new AnioPlanImpl(1, "Primer año");
        AnioPlan segundo2018 = new AnioPlanImpl(2, "Segundo año");
        AnioPlan tercero2018 = new AnioPlanImpl(3, "Tercero año");
        AnioPlan cuarto2018 = new AnioPlanImpl(4, "Cuarto año");
        AnioPlan quinto2018 = new AnioPlanImpl(5, "Quinto año");

        plan2018.getAnios().add((AnioPlanImpl) primero2018);
        plan2018.getAnios().add((AnioPlanImpl) segundo2018);
        plan2018.getAnios().add((AnioPlanImpl) tercero2018);
        plan2018.getAnios().add((AnioPlanImpl) cuarto2018);
        plan2018.getAnios().add((AnioPlanImpl) quinto2018);

        // MATEIAS DEL PLAN 2018 - PRIMER AÑO

        int codigoMateria = 1;

        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Ciencias de la Vida y de la Tierra ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Lengua y Literatura Castellanas I", 5.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Lengua y Cultura Latinas I ", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Lengua y Cultura Inglesas I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Formación Musical I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Formación Plástica I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Matemática I", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Geografía I ", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Historia I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Formación Ética y Ciudadana I", 3.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Estrategias de Aprendizaje y Entornos Virtuales", 4.0));
        primero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 1 + codigoMateria++), "Educación Física y Deportes I", 1.0));

        //primero2018.getMaterias().add(m1);
        //primero2018.getMaterias().add(m2);
        //primero2018.getMaterias().add(m3);
        //primero2018.getMaterias().add(m4);
        //primero2018.getMaterias().add(m5);
        //primero2018.getMaterias().add(m6);
        //primero2018.getMaterias().add(m7);
        //primero2018.getMaterias().add(m8);
        //primero2018.getMaterias().add(m9);
        //primero2018.getMaterias().add(m10);
        //primero2018.getMaterias().add(m11);
        //primero2018.getMaterias().add(m12);

        // MATEIAS DEL PLAN 2018 - SEGUNDO AÑO
        codigoMateria = 1;

        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Educación para la Salud", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Lengua y Literatura Castellanas II ", 5.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Lengua y Cultura Latinas II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Lengua y Cultura Inglesas II  ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Formación Musical II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Formación Plástica II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Matemática II ", 4.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Geografía II ", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Historia II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Formación Ética y Ciudadana II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Educación Física y Deportes II", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Espacios Optativos 2019/2021", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Espacios Optativos 2022", 3.0));
        segundo2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 2 + codigoMateria++), "Chino", 4.0));
        // MATEIAS DEL PLAN 2018 - TERCER AÑO

        codigoMateria = 1;

        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Ciencias Naturales", 3.0));
        tercero2018.getMaterias()
                .add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Lengua y Literatura Castellanas III", 5.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Lengua y Cultura Latinas III ", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Lengua y Cultura Inglesas III  ", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Formación Plástica III ", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Matemática III ", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Geografía III ", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Historia III", 4.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Formación Ética y Ciudadana III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Educacion Tecnologica", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Educación Física y Deportes III", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Espacios Optativos 2020/2021", 0.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Espacios Optativos 2021", 3.0));
        tercero2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 3 + codigoMateria++), "Espacios Optativos 2022", 3.0));

        // MATEIAS DEL PLAN 2018 - CUARTO AÑO

        codigoMateria = 1;

        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Biologia I", 3.0));
        cuarto2018.getMaterias()
                .add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Fisico-Quimica", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Lengua y Literatura Castellanas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Lengua y Cultura Latinas IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Lengua y Cultura Inglesas IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Lengua y Cultura Francesas I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Historia del Arte", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Matemática IV", 5.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Geografía IV", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Historia IV", 4.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Educacion Fisica y Escuadras I", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Espacios Optativos 2020/2021", 0.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Espacios Optativos 2021", 3.0));
        cuarto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 4 + codigoMateria++), "Espacios Optativos 2022", 3.0));

        // MATEIAS DEL PLAN 2018 - QUINTO AÑO

        codigoMateria = 1;

        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Biologia II", 3.0));
        quinto2018.getMaterias()
                .add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Quimica", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Lengua y Literatura Castellanas IV", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Lengua y Cultura Griegas", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Lengua y Cultura Inglesas IV", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Lengua y Cultura Francesas II", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Matemática V", 5.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Geografía V", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Historia V", 4.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Educacion Fisica y Escuadras", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Espacios Optativos 2022", 3.0));
        quinto2018.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2018 + 5 + codigoMateria++), "Proyectos Sociocomunitarios", 1.0));

        // PLAN 2001

        Plan plan2001 = new PlanImpl();

        plan2001.setAnio(2001);
        plan2001.setEstadoNoActivo();

        planes.add(plan2001);

        // AÑOS DEL PLAN 2001

        AnioPlan primer2001 = new AnioPlanImpl( 1, "Primer año");
        AnioPlan segundo2001 = new AnioPlanImpl( 2, "Segundo año");
        AnioPlan tercero2001 = new AnioPlanImpl(3, "Tercero año");
        AnioPlan cuarto2001 = new AnioPlanImpl( 4, "Cuarto año");
        AnioPlan quinto2001 = new AnioPlanImpl(5, "Quinto año");
        AnioPlan sexto2001 = new AnioPlanImpl(6, "Sexto año");
        AnioPlan septimo2001 = new AnioPlanImpl( 7, "Septimo año");

        plan2001.getAnios().add((AnioPlanImpl) primer2001);
        plan2001.getAnios().add((AnioPlanImpl) segundo2001);
        plan2001.getAnios().add((AnioPlanImpl) tercero2001);
        plan2001.getAnios().add((AnioPlanImpl) cuarto2001);
        plan2001.getAnios().add((AnioPlanImpl) quinto2001);
        plan2001.getAnios().add((AnioPlanImpl) sexto2001);
        plan2001.getAnios().add((AnioPlanImpl) septimo2001);

        // MATEIAS DEL PLAN 2001 - PRIMER AÑO

        codigoMateria = 1;

        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Lengua y Literatura I", 5.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Lengua y Cultura Latinas I ", 5.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Ingles I", 3.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Geografía I", 3.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Historia I", 2.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Matemática I", 4.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Plastica I", 2.0));
        primer2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Musica I", 2.0));
        primer2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Ciencias Naturales I", 3.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Tecnicas De Trabajo Intelectual I", 2.0));
        primer2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Informatica I", 2.0));
        primer2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 1 + codigoMateria++), "Educacion Fisica I", 2.0));

        // MATEIAS DEL PLAN 2001 - SEGUNDO AÑO

        codigoMateria = 1;

        segundo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Lengua y Cultura Latinas II", 5.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Ingles II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Formacion Etica y Civica I", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Geografía II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Historia II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Matemática II", 4.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Plastica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Musica II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Ciencias Naturales II", 3.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Tecnicas De Trabajo Intelectual II", 2.0));
        segundo2001.getMaterias().add(new MateriaImpl(Integer.parseInt("" + 2001 + 2 + codigoMateria++), "Educacion Fisica II", 2.0));

        // MATEIAS DEL PLAN 2001 - TERCER AÑO

        codigoMateria = 1;

        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Lengua y Literatura III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Lengua y Cultura Latinas III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Ingles III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Formacion Etica y Civica II", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Geografía III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Historia III", 4.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Historia Del Arte I", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Plastica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Musica III", 2.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Ciencias Naturales III", 3.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Matemática III", 5.0));
        tercero2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 3 + codigoMateria++), "Educacion Fisica III", 2.0));

        // MATEIAS DEL PLAN 2001 - CUARTO AÑO

        codigoMateria = 1;

        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Lengua y Literatura IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Lengua y Cultura Latinas IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Ingles IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Geografía IV", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Historia IV", 4.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Formacion Etica y Civica III", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Historia Del Arte II", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Plastica IV", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Matemática IV", 5.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Biologia I", 2.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Fisico-quimica", 3.0));
        cuarto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 4 + codigoMateria++), "Educacion Fisica IV", 2.0));

        // MATEIAS DEL PLAN 2001 - QUINTO AÑO

        codigoMateria = 1;

        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Lengua y Literatura V ARG", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Lengua y Cultura Latinas V", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Lengua y Cultura Griegas I", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Ingles V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Frances I", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Geografía V", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Historia V", 4.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Quimica I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Biologia II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Matemática V - Algebra ", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Estadistica y Probabilidades", 3.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Informatica II", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Metodologia De La Investigacion", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Folosofia I", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Educacion Fisica V", 2.0));
        quinto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 5 + codigoMateria++), "Arg", 2.0));

        // MATEIAS DEL PLAN 2001 - SEXTO AÑO

        codigoMateria = 1;

        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Lengua y Literatura VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Lengua y Cultura Griegas II", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Ingles VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Frances II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Historia VI", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Historia De La Cultura I", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Geografia VI", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Filosofia II", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Matematica VI - Trigonometria ", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Geometria", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Biologia III", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Quimica II", 3.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Fisica I", 4.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Informatica III", 2.0));
        sexto2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 6 + codigoMateria++), "Educacion Fisica VI", 2.0));

        // MATEIAS DEL PLAN 2001 - SEPTIMO AÑO

        codigoMateria = 1;

        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Lengua y Literatura VII", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Lengua y Cultura Griegas III", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Frances III", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Historia VII", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Filosofia III", 4.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Psicologia", 2.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Analisis Matematico y Geometria Analitica", 4.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Biologia IV", 2.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Sociologia", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Economia Politica", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Historia De La Cultura II", 2.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Elemento De Derecho Y Derecho Consitucional Argentino", 3.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Informatica IV", 2.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Educacion Fisica VII", 2.0));
        septimo2001.getMaterias().add(new MateriaImpl( Integer.parseInt("" + 2001 + 7 + codigoMateria++), "Fisica II", 3.0));

        // ==========================================================================

        generarYAgregarPlanesAleatoriamente(cantidadAGenerar, planes);

        // ==========================================================================

        /*if (imprimirResultado) {
            imprimirPlanes(planes);
        }*/

        return planes;
    }

    private static void generarYAgregarPlanesAleatoriamente(int cantidadAGenerar, List<Plan> planes){
        UtilRandom generacionDePlanes = new UtilRandom();
        for (int i = 0; i < cantidadAGenerar; i++){
            planes.add(generacionDePlanes.crearPlanAleatorio(planes));
        }
    }

    public static void imprimirPlanes(List<Plan> planes) {
        for (Plan plan : planes) {
            System.out.println("\n" + plan);
            for (AnioPlan anio : plan.getAnios()) {
                System.out.println("\t" + anio);
                for (Materia materia : anio.getMaterias()) {
                    System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo()) + " - " + materia);
                }
                if (anio.getMaterias().size() == 0) {
                    System.out.println("\t\tA este año no se le cargaron materias!!");
                }
            }
            if (plan.getAnios().size() == 0) {
                System.out.println("\tA este plan no se le cargaron años!!");
            }
        }
    }
}

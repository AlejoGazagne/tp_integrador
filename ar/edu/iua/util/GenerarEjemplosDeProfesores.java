package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.iua.modelo.academico.plan.MateriaImpl;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class GenerarEjemplosDeProfesores {
    static List<ProfesorImpl> generarYAgregarProfesoresAleatoriamente(){
        List<ProfesorImpl> profes = new ArrayList<ProfesorImpl>();
        Random random = new Random(System.currentTimeMillis());

        String nombres[] = {"Lizy", "Hermion", "Bruno", "Simon", "Gabriel", "Matias", "Alejo","Franco", "Fabricio", "Ciro", "Guada", "Mariel", "Fatima", "Martina", "Daniel","German"}; // 16 profes

        try {
            PlanImpl planAnio = BaseDeDatos.getPlanes().get(0);

            for(int i = 0; i < nombres.length; i++){
                Profesor profe = new ProfesorImpl();
                profe.setNombre(nombres[i]);
                profe.setDni(random.nextInt(16000000) + 25000000);
                
                profes.add((ProfesorImpl) profe);
            }

            List<MateriaImpl> materias = new ArrayList<MateriaImpl>();
            materias.add(planAnio.getAnios().get(0).getMaterias().get(0));
            materias.add(planAnio.getAnios().get(0).getMaterias().get(1));
            materias.add(planAnio.getAnios().get(0).getMaterias().get(2));
            materias.add(planAnio.getAnios().get(0).getMaterias().get(3));
            materias.add(planAnio.getAnios().get(0).getMaterias().get(4));
            materias.add(planAnio.getAnios().get(0).getMaterias().get(5));
            Profesor profe = new ProfesorImpl();
            profe = profes.get(0);
            profe.setMaterias(materias);
            profes.set(0,(ProfesorImpl) profe);


            List<MateriaImpl> materias1 = new ArrayList<>();
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(6));
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(7));
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(8));
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(9));
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(10));
            materias1.add(planAnio.getAnios().get(0).getMaterias().get(11));
            Profesor profe1 = new ProfesorImpl();
            profe1 = profes.get(1);
            profe1.setMaterias(materias);
            profes.set(1,(ProfesorImpl) profe1);


            List<MateriaImpl> materias2 = new ArrayList<>();
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(0));
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(1));
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(2));
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(3));
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(4));
            materias2.add(planAnio.getAnios().get(1).getMaterias().get(5));
            Profesor profe2 = new ProfesorImpl();
            profe2 = profes.get(2);
            profe2.setMaterias(materias2);
            profes.set(2,(ProfesorImpl) profe2);


            List<MateriaImpl> materias3 = new ArrayList<>();
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(6));
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(7));
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(8));
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(9));
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(10));
            materias3.add(planAnio.getAnios().get(1).getMaterias().get(11));
            Profesor profe3 = new ProfesorImpl();
            profe3 = profes.get(3);
            profe3.setMaterias(materias3);
            profes.set(3,(ProfesorImpl) profe3);


            List<MateriaImpl> materias4 = new ArrayList<>();
            materias4.add(planAnio.getAnios().get(1).getMaterias().get(11));
            materias4.add(planAnio.getAnios().get(1).getMaterias().get(12));
            materias4.add(planAnio.getAnios().get(1).getMaterias().get(13));
            materias4.add(planAnio.getAnios().get(2).getMaterias().get(0));
            materias4.add(planAnio.getAnios().get(2).getMaterias().get(1));
            materias4.add(planAnio.getAnios().get(2).getMaterias().get(2));
            Profesor profe4 = new ProfesorImpl();
            profe4 = profes.get(4);
            profe4.setMaterias(materias4);
            profes.set(4,(ProfesorImpl) profe4);


            List<MateriaImpl> materias5 = new ArrayList<>();
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(3));
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(4));
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(5));
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(6));
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(7));
            materias5.add(planAnio.getAnios().get(2).getMaterias().get(8));
            Profesor profe5 = new ProfesorImpl();
            profe5 = profes.get(5);
            profe5.setMaterias(materias5);
            profes.set(5,(ProfesorImpl) profe5);


            List<MateriaImpl> materias6 = new ArrayList<>();
            materias6.add(planAnio.getAnios().get(2).getMaterias().get(9));
            materias6.add(planAnio.getAnios().get(2).getMaterias().get(10));
            materias6.add(planAnio.getAnios().get(2).getMaterias().get(11));
            materias6.add(planAnio.getAnios().get(2).getMaterias().get(12));
            materias6.add(planAnio.getAnios().get(2).getMaterias().get(13));
            materias6.add(planAnio.getAnios().get(3).getMaterias().get(0));
            Profesor profe6 = new ProfesorImpl();
            profe6 = profes.get(6);
            profe6.setMaterias(materias6);
            profes.set(6,(ProfesorImpl) profe6);


            List<MateriaImpl> materias7 = new ArrayList<>();
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(1));
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(2));
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(3));
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(4));
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(5));
            materias7.add(planAnio.getAnios().get(3).getMaterias().get(6));
            Profesor profe7 = new ProfesorImpl();
            profe7 = profes.get(7);
            profe7.setMaterias(materias7);
            profes.set(7,(ProfesorImpl) profe7);


            List<MateriaImpl> materias8 = new ArrayList<>();
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(7));
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(8));
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(9));
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(10));
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(11));
            materias8.add(planAnio.getAnios().get(3).getMaterias().get(12));
            Profesor profe8 = new ProfesorImpl();
            profe8 = profes.get(8);
            profe8.setMaterias(materias8);
            profes.set(8,(ProfesorImpl) profe8);


            List<MateriaImpl> materias9 = new ArrayList<>();
            materias9.add(planAnio.getAnios().get(3).getMaterias().get(13));
            materias9.add(planAnio.getAnios().get(4).getMaterias().get(0));
            materias9.add(planAnio.getAnios().get(4).getMaterias().get(1));
            materias9.add(planAnio.getAnios().get(4).getMaterias().get(2));
            materias9.add(planAnio.getAnios().get(4).getMaterias().get(3));
            materias9.add(planAnio.getAnios().get(4).getMaterias().get(4));
            Profesor profe9 = new ProfesorImpl();
            profe9 = profes.get(9);
            profe9.setMaterias(materias9);
            profes.set(9,(ProfesorImpl) profe9);


            List<MateriaImpl> materias10 = new ArrayList<>();
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(5));
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(6));
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(7));
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(8));
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(9));
            materias10.add(planAnio.getAnios().get(4).getMaterias().get(10));
            Profesor profe10 = new ProfesorImpl();
            profe10 = profes.get(10);
            profe10.setMaterias(materias10);
            profes.set(10,(ProfesorImpl) profe10);


            List<MateriaImpl> materias11 = new ArrayList<>();
            materias11.add(planAnio.getAnios().get(4).getMaterias().get(11));
            Profesor profe11 = new ProfesorImpl();
            profe11 = profes.get(11);
            profe11.setMaterias(materias11);
            profes.set(11,(ProfesorImpl) profe11);

            
            List<MateriaImpl> materias12 = new ArrayList<>();

            Profesor profe12 = new ProfesorImpl();
            profe12 = profes.get(12);
            profe12.setMaterias(materias12);
            profes.set(12,(ProfesorImpl) profe12);


            List<MateriaImpl> materias13 = new ArrayList<>();

            Profesor profe13 = new ProfesorImpl();
            profe13 = profes.get(13);
            profe13.setMaterias(materias13);
            profes.set(13,(ProfesorImpl) profe13);


            List<MateriaImpl> materias14 = new ArrayList<>();

            Profesor profe14 = new ProfesorImpl();
            profe14 = profes.get(14);
            profe14.setMaterias(materias14);
            profes.set(14, (ProfesorImpl) profe14);


            List<MateriaImpl> materias15 = new ArrayList<>();

            Profesor profe15 = new ProfesorImpl();
            profe15 = profes.get(15);
            profe15.setMaterias(materias15);
            profes.set(15, (ProfesorImpl) profe15);



            return profes;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return profes;
    }
}

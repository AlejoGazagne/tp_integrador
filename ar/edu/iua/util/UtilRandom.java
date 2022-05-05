package ar.edu.iua.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;


public class UtilRandom {
    public Plan crearPlanAleatorio(List<Plan> listaPlanes){
        Random random = new Random(System.currentTimeMillis());
        Plan planAleatorio = new PlanImpl();
        List<Materia> materiaList = new ArrayList<Materia>();
        List<AnioPlan> anioList = new ArrayList<AnioPlan>();
        int aux = random.nextInt(4)+7;
        String materiaGenerador[]={"Matematica","Historia","Biologia","Geografia","Robotica","Lengua","Informatica",
                                    "Latin","Ingles","Quimica","Fisica","Educacion para la Salud","Educacion Fisica"};

                                   

        for(int jj = 0; jj < listaPlanes.size(); jj++){
             planAleatorio.setAnio(random.nextInt(20) + 2000);
                if(planAleatorio.getAnio().equals(listaPlanes.get(jj).getAnio())){
                    planAleatorio.setAnio(random.nextInt(20) + 2000);
            }

        }
        

        int cantAnios = random.nextInt(2)+5;
        for(int i=0; i<cantAnios; i++){
            AnioPlan anioAleatorio = new AnioPlanImpl(planAleatorio, i, listaPlanes.get(1).getAnios().get(i).getNombre());

            
            for(int hh = 0; hh < 5; hh++){
                Materia materia = new MateriaImpl(anioAleatorio, Integer.parseInt(""+ planAleatorio.getAnio() + anioAleatorio.getNumero() + hh), 
                materiaGenerador[random.nextInt(materiaGenerador.length)],Math.ceil(random.nextDouble(2.0)+2));
                if(hh == 0){
                    materiaList.add(materia);
                }
                for (int kk =0; kk < materiaList.size(); kk++){
                    if(materia.getNombre().equals(materiaList.get(kk).getNombre())){
                        materia.setNombre(materiaGenerador[random.nextInt(materiaGenerador.length)]);
                        //kk--; 
                        // MUCHAS MATERIAS GENERADAS Y KK-- rompe todo 
                    }
                }
                materiaList.add(materia);
                
                
            }
            anioAleatorio.setMaterias(materiaList);
            anioList.add(anioAleatorio);
        }
        planAleatorio.setAnios(anioList);

        return planAleatorio;

    }

        

}


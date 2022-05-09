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
        List<AnioPlan> anioList = new ArrayList<AnioPlan>();
        String materiaGenerador[]={"Matematica","Historia","Biologia","Geografia","Robotica","Lengua","Informatica", 
                                    "Latin","Ingles","Quimica","Fisica","Educacion para la Salud","Educacion Fisica",
                                    "Musica","Plastica"};

        // PRIMERO SETTEAMOS UN ANIO ALEATORIO Y DESPUES EN EL FOR RECORREMOS TODA LA LISTA Y VERIFICAMOS QUE LOS VALORES SEAN DISTINTOS
        planAleatorio.setAnio(random.nextInt(20) + 2000);
        for(int jj = 0; jj < listaPlanes.size(); jj++){
            if(planAleatorio.getAnio().equals(listaPlanes.get(jj).getAnio())){
                planAleatorio.setAnio(random.nextInt(26) + 1996);
                jj = -1;
            }
        }
        if(planAleatorio.getAnio() > 2018) planAleatorio.setEstadoBorrador();
        else if(planAleatorio.getAnio() < 2018) planAleatorio.setEstadoNoActivo();
        
        // EN ESTE ANIO QUEREMOS SETTEAR LOS NOMBRES DE LOS ANIOSPLAN
        int cantAnios = random.nextInt(2)+5;
        for(int ii = 0; ii < cantAnios; ii++){
            List<Materia> materiaList = new ArrayList<Materia>();
            AnioPlan anioAleatorio = new AnioPlanImpl(planAleatorio, ii+1, listaPlanes.get(1).getAnios().get(ii).getNombre());

            // EN ESTE FOR QUEREMOS INGRESAR LAS MATERIAS AL PLAN
            int aux = random.nextInt(4)+8;
            for(int hh = 0; hh < aux; hh++){
                Materia materia = new MateriaImpl(anioAleatorio, Integer.parseInt("" + planAleatorio.getAnio() + anioAleatorio.getNumero() + hh), 
                materiaGenerador[random.nextInt(materiaGenerador.length)], Math.ceil(random.nextDouble(2.0)+1));
                if(hh == 0){
                    materiaList.add(materia);
                }else{
                    for (int kk = 0; kk < materiaList.size(); kk++){
                        if(materia.getNombre().equals(materiaList.get(kk).getNombre())){
                            materia.setNombre(materiaGenerador[random.nextInt(materiaGenerador.length)]);
                            kk = -1;
                        }
                    }
                    materiaList.add(materia);
                
                }
                
            }
            anioAleatorio.setMaterias(materiaList);
            anioList.add(anioAleatorio);
        }
        planAleatorio.setAnios(anioList);


        return planAleatorio;
    }
}
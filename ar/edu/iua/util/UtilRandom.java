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
        planAleatorio.setAnio(random.nextInt(30) + 1996);
        for(int j = 0; j < listaPlanes.size(); j++){
            if(planAleatorio.getAnio().equals(listaPlanes.get(j).getAnio())){
                planAleatorio.setAnio(random.nextInt(40) + 1996);
                j = -1;
            }
        }

        // A LOS ANIOS MENORES A 2018 SE LES SETTEA ESTADO NO ACTIVO Y A LOS MAYORES BORRADOR
        if(planAleatorio.getAnio() > 2018) planAleatorio.setEstadoBorrador();
        else if(planAleatorio.getAnio() < 2018) planAleatorio.setEstadoNoActivo();
        
        // EN ESTE ANIO QUEREMOS SETTEAR LOS NOMBRES DE LOS ANIOSPLAN
        int cantAnios = random.nextInt(2)+5;
        for(int i = 0; i < cantAnios; i++){
            List<Materia> materiaList = new ArrayList<Materia>();
            AnioPlan anioAleatorio = new AnioPlanImpl(planAleatorio, i+1, listaPlanes.get(1).getAnios().get(i).getNombre());

            // EN ESTE FOR QUEREMOS INGRESAR LAS MATERIAS AL PLAN
            int aux = random.nextInt(4)+8; 
            for(int h = 0; h < aux; h++){ 
                Materia materia = new MateriaImpl(anioAleatorio, Integer.parseInt("" + planAleatorio.getAnio() + anioAleatorio.getNumero() + (h + 1)), 
                materiaGenerador[random.nextInt(materiaGenerador.length)], Math.ceil(random.nextDouble(2.0)+1));
                if(h == 0){
                    materiaList.add(materia);
                }else{
                    for (int k = 0; k < materiaList.size(); k++){
                        if(materia.getNombre().equals(materiaList.get(k).getNombre())){
                            materia.setNombre(materiaGenerador[random.nextInt(materiaGenerador.length)]);
                            k = -1;
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
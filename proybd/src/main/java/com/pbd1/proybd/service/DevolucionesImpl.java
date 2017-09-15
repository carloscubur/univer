package com.pbd1.proybd.service;


import com.pbd1.proybd.domain.bo.Devoluciones;
import com.pbd1.proybd.domain.repository.DevolucionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carloscubur on 8/09/17.
 */

@Service
public class DevolucionesImpl implements DevolucionesService{

    private DevolucionesRepository devolucionesRepository;

    @Autowired
    public DevolucionesImpl(DevolucionesRepository devolucionesRepository){
        this.devolucionesRepository = devolucionesRepository;
    }

    public List<Devoluciones> getDevoluciones(){

        //Se crea una instancia tipo lista de objetos y se llena con el metodo del repositorio
        List<Devoluciones> listadevoluciones = devolucionesRepository.findAll();
        //Se crea una instancia tipo lista pero tipo ArrayList esta solo sirve para devolverse en el return
        List<Devoluciones> devolucionesList = new ArrayList<>();


        //Se llena la lista tipo Arraylist usando un objeto intermedio
        for(Devoluciones devolucion:listadevoluciones){

            Devoluciones devo = new Devoluciones();
            devo.setId(devolucion.getId());
            devo.setDescripcion(devolucion.getDescripcion());

            //guardo la instancia en la lista return
            devolucionesList.add(devo);
        }

        return devolucionesList;
    }
}

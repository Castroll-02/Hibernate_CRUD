/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Diego
 */
public class MtoUsuarios extends models.Usuarios{
    private Session sesion;
    private boolean result;
    
    private void startSession(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession(); 
        sesion.getTransaction().begin();
    }
    
    private void finishSesion(){
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public boolean saveRow(Usuarios obj) {
        try {
            startSession();
            sesion.save(obj);
            finishSesion();
            result = true;
        } catch(Exception e) {
            System.out.println("Error al ingresar: " + e);
            result = false;
        }
        return result;
    }
    
    public boolean updateRow (Usuarios obj){
        
        try {
            startSession();
            sesion.update(obj);
            finishSesion();
            result = true;
        } catch(Exception e) {
            System.out.println("Error al modificar: " + e);
            result = false;
        }
        return result;       
    }
    
    public boolean deleteRow (Usuarios obj){
        try {
            startSession();
            sesion.delete(obj);
            finishSesion();
            result = true;
        } catch(Exception e) {
            System.out.println("Error al eliminar: " + e);
            result = false;
        }
        return result;
    }
    
    public Usuarios getRow (int id){
        Usuarios usuario;
        startSession();
        usuario = (Usuarios) sesion.get(Usuarios.class, id);
        finishSesion();
        return usuario;
    }
    
    public List<MtoUsuarios> readAll(){
        List<MtoUsuarios> list;
        startSession();
        list = sesion.createQuery("from Usuarios").list();
        finishSesion();
        return list;
    }
    
    public List<MtoUsuarios> searchRows(String query){
        List<MtoUsuarios> list;
        startSession();
        list = sesion.createQuery(query).list();
        finishSesion();
        return list;
    }

    public MtoUsuarios() {
    }
   
}

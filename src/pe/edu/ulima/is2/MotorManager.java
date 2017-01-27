/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.is2;

/**
 *
 * @author Administrator
 */
public class MotorManager {
    
    private static MotorManager instancia = null;
    
    
    public static MotorManager getInstance(String tipo){
        if(instancia == null){
            instancia = new MotorManager(tipo);
        }
        return instancia;
    }
    
    
    
    private MotorAdapter adapter;
    
    private MotorManager(String tipoMotor){
        MotorFactory factory = new MotorFactory();
        adapter = factory.obtenerAdapter(tipoMotor);
        
    }
    
    
    
    public void arrancar(){
        adapter.arrancar();
    }
    public void acelerar(){
        adapter.acelerar();
    }
    public void frenar(){
        adapter.frenar();
    }
    public double apagar(){
        return adapter.apagar();
    }
    
    
    
    
}

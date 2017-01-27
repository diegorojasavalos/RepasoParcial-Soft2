/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.is2;

import motorgfx.Motor;

/**
 *
 * @author Administrator
 */
public class GfxAdapter implements MotorAdapter{
    
    private Motor motor;
    
    public GfxAdapter(){
        motor = new Motor();
    }
    
    

    @Override
    public void arrancar() {
        motor.arrancar();
    }

    @Override
    public void acelerar() {
        motor.acelerar(Motor.VELOCIDAD_ALTA);
    }

    @Override
    public void frenar() {
        motor.desacelerar();
    }

    @Override
    public double apagar() {
        return motor.detener();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.is2;

import com.yotato.Engine;

/**
 *
 * @author Administrator
 */
public class YotatoAdapter implements MotorAdapter{
    
    private Engine engine;
    
    public YotatoAdapter(){
        engine = new Engine();
    }
    

    @Override
    public void arrancar() {
        engine.ignite();
    }

    @Override
    public void acelerar() {
        engine.accelerate(Engine.FORCE_HIGH); 
    }

    @Override
    public void frenar() {
        engine.brake();   
    }

    @Override
    public double apagar() {
       return engine.stop();
                        
    }
    
}

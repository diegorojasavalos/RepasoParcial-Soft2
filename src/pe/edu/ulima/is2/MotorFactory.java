package pe.edu.ulima.is2;

public class MotorFactory {
    
    private static MotorFactory instancia = null;
    
    
    public static MotorFactory getInstance(){
        if(instancia == null){
            instancia = new MotorFactory();
        }
        return instancia;
    }
    

    public MotorAdapter obtenerAdapter(String tipo) {

        if (tipo.equalsIgnoreCase("gfx")) {
            return new GfxAdapter();
        } else if (tipo.equalsIgnoreCase("yotato")) {
            return new YotatoAdapter();
        } else {
            return null;
        }

    }

}

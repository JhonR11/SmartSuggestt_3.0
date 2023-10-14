
package entidades;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.TarjetaGrafica;


public abstract class Catalogo {
    ArrayList<TarjetaGrafica>tarjetas;
    


    

    public void CrearCatalogo(){
        tarjetas= new ArrayList();
    }
    public TarjetaGrafica CrearTarjeta(int id){
        //Aqui se crean las tarjetas que se añadiran al catalogo
        String nombre=(JOptionPane.showInputDialog(null,"Ingrese el nombre del fabricante:","fabricante",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","NVIDIA","AMD"},"selecciona")).toString();
        String modelo=JOptionPane.showInputDialog("Ingrese el nombre del modelo:");
        String vram=JOptionPane.showInputDialog("ingresa el numero de Vram:");
        String tipomemoria=(JOptionPane.showInputDialog(null,"Ingrese el tipo de memoria:","TipoMemoria",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","DDR3","GDDR2","GDDR3","GDDR4","GDDR5","GDDR6"},"selecciona")).toString();
        int consumo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de Watts que consume"));
       
        boolean alimentacion_externa=false;
        String pines="ninguno";
        String comprobarAlimentacion=(JOptionPane.showInputDialog(null,"Tiene fuente de alimentacion externa?","Alimentacion externa",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","si","no"},"selecciona")).toString();
         if ("si".equals(comprobarAlimentacion)){
                     alimentacion_externa=true;
                     pines=(JOptionPane.showInputDialog(null,"Ingrese el numero de cables X pines","Cantidad cable x pines",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","1x4","1x6","1x8","2x4","2x6","2x8"},"selecciona")).toString();
                     }
               
        String puerto=(JOptionPane.showInputDialog(null,"Ingrese el tipo de puerto:","Tipo puerto PCI",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","PCI 1.0 x8","PCI 2.0 x8","PCI 2.0 x16","PCI 3.0 x8","PCI 3.0 x16","PCI 4.0 x 16"},"selecciona")).toString();
        int  procesadores=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de procesadores:"));
        String gama=(JOptionPane.showInputDialog(null,"Ingrese la gama","Gama",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","baja","baja-media","baja-alta","media-baja","media","media-alta","alta-baja","alta-media","alta",},"selecciona")).toString();
        TarjetaGrafica tarjeta = new TarjetaGrafica(id++,nombre,modelo,vram,tipomemoria,consumo,alimentacion_externa,pines,puerto,procesadores,gama);
        return tarjeta;      
    }
    
    public void InsertarTarjeta(TarjetaGrafica tarjeta){
        
         tarjetas.add(tarjeta);
    }

    public String Imprimir(){
        String imprimir=" ";
        for(int contador =0 ; contador<tarjetas.size();contador++){
            imprimir+=tarjetas.get(contador).toString()+"\n";
        } 
        return imprimir;
    }
    public boolean modificartarjeta(TarjetaGrafica tarjeta){
        boolean encontrado= false;
        for(int contador=0;contador<tarjetas.size();contador++){
            if(tarjetas.get(contador).getId()==tarjeta.getId()){
                encontrado=true;
                tarjetas.get(contador).setNombre(tarjeta.getNombre());
                tarjetas.get(contador).setModelo(tarjeta.getModelo());
                tarjetas.get(contador).setVram(tarjeta.getVram());
                tarjetas.get(contador).setTipomemoria(tarjeta.getTipomemoria());
                tarjetas.get(contador).setConsumo(tarjeta.getConsumo());
                tarjetas.get(contador).setAlimentacion_externa(tarjeta.isAlimentacion_externa());
                tarjetas.get(contador).setPines(tarjeta.getPines());
                tarjetas.get(contador).setPuerto(tarjeta.getPuerto());
                tarjetas.get(contador).setProcesadores(tarjeta.getProcesadores());
                tarjetas.get(contador).setGama(tarjeta.getGama());
                
            } 
        }
        return encontrado;
    }
    
    public boolean eliminartarjeta(int id){
         boolean encontrado= false;
        for(int contador=0;contador<tarjetas.size();contador++){
            if(tarjetas.get(contador).getId()==id){
                encontrado=true;
                tarjetas.remove(contador);         
                }
        }
        return encontrado;
    } 
}  
    

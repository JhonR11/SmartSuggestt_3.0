package entidades;
public class TarjetaGrafica {
   private static int nid=0; //Numero de id constante
   private int id; //Numero id
   private String nombre; 
   private String modelo;
   private String vram;
   private String tipomemoria;
   private  int consumo;
   private boolean alimentacion_externa;
   private String pines;
   private String puerto;
   private int  procesadores;
   private String gama;

    public TarjetaGrafica() {
        nid++;
        this.id=nid;
    }

    public TarjetaGrafica(int id,String nombre, String modelo, String vram, String tipomemoria, int consumo, boolean alimentacion_externa, String pines, String puerto, int procesadores, String gama) {
        nid++;
        this.id=nid;
        this.nombre = nombre;
        this.modelo = modelo;
        this.vram = vram;
        this.tipomemoria = tipomemoria;
        this.consumo = consumo;
        this.alimentacion_externa = alimentacion_externa;
        this.pines = pines;
        this.puerto = puerto;
        this.procesadores = procesadores;
        this.gama = gama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVram() {
        return vram;
    }

    public void setVram(String vram) {
        this.vram = vram;
    }

    public String getTipomemoria() {
        return tipomemoria;
    }

    public void setTipomemoria(String tipomemoria) {
        this.tipomemoria = tipomemoria;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isAlimentacion_externa() {
        return alimentacion_externa;
    }

    public void setAlimentacion_externa(boolean alimentacion_externa) {
        this.alimentacion_externa = alimentacion_externa;
    }

    public String getPines() {
        return pines;
    }

    public void setPines(String pines) {
        this.pines = pines;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public int getProcesadores() {
        return procesadores;
    }

    public void setProcesadores(int procesadores) {
        this.procesadores = procesadores;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" + "id=" + id + ", nombre=" + nombre + ", modelo=" + modelo + ", vram=" + vram + ", tipomemoria=" + tipomemoria + ", consumo=" + consumo + ", alimentacion_externa=" + alimentacion_externa + ", pines=" + pines + ", puerto=" + puerto + ", procesadores=" + procesadores + ", gama=" + gama + '}';
    }
    


    
    
}

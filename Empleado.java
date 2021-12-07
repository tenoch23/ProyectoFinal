import java.util.Arrays;
import java.util.Scanner;
public class Empleado {
    String nombre;
    String apellido1;
    String apellido2;
    String proyectosAntiguos1;
    String proyectosAntiguos2;
    String proyectosAntiguos3;
    String proyectosAntiguos4;
    String proyectosVigentes1;
    String proyectosVigentes2;
    int dirección;
    int numEmpleado;
    int añosServicio;
    
    public Empleado(){}
    public void setNombre(String nombre){
       this.nombre=nombre;
        }
    public String getNombre(){
        return nombre;
    }
    public void genDatos(){
        String nombres[]={"Aldo","Andrea","Adolfo","Abril","Armando","Andrés","Beatriz","Brenda","Carlos","Angélica","Marco","Verónica","Mariana","David","Emiliano","Germán","Nicole","Carla","Daniela","Cristián"};
         int aleatorio;
         aleatorio= (int)(Math.random()*19);
         nombre=nombres[aleatorio];
         this.nombre=nombre;
         
         String apellidos[]={"Andrade","Acosta","Giménez","Vázquez","Montes","Navarro","Sánchez","Rodríguez","López","Moreno","Becerra","Martínez","Mendoza","Romero","Hernández","Franco","Omaña","González","Juárez","Cano"};
    int aleatorio1;
         aleatorio1= (int)(Math.random()*19);
         apellido1=apellidos[aleatorio1];
         this.apellido1=apellido1;
         
         int aleatorio2;
         aleatorio2= (int)(Math.random()*19);
         apellido2=apellidos[aleatorio2];
         this.apellido2=apellido2;
         
         String proyectosPasado[]={"Optimización de la producción de KFC","Algoritmo de Seguros Quálitas","APP de CitiBanamex","Página web de McDonald's","Sistema de seguridad de Home Depot","Cajeros automaticos de Wal-mart","Escaleras eléctricas del metro de la CDMX", "Casa inteligente","Software para un elevador de 5 pisos","Semáforo","Control de bombeo de un Hotel","Inteligencia Artificial para un videojuego","Aplicación de edición de video","Aplicación VPN","E-store de Pull&Bear","Directorios para Plaza Santa Fe","Algoritmo para Seguros ABA","Automatización de planta Turín","Cajeros automáticos de Santander","Sitio web de CFE","Sitio web de Burguer King","Algoritmo de seguros El águila","Página web de IZZI","Inteligencia Atificial de Ubisoft","App de mensajería","Software de elevador de 10 pisos","App correctora de gramática","App traductor","Sitio web de GAP","E-store de Liverpool","Cajeros automáticos de chedraui","App de inventario de Amazon","base de datos de Banco Azteca","App de calculadora","Inteligencia artificial para identificacion facial","Sensores de reversa de Toyota","E-store de Ford","Refrigerador inteligente","Sanitario inteligente","Smartwatch"};
         int proyecto1;
         proyecto1=(int)(Math.random()*39);
         int proyecto2;
         proyecto2=(int)(Math.random()*39);
          int proyecto3;
         proyecto3=(int)(Math.random()*39);
         int proyecto4;
         proyecto4=(int)(Math.random()*39);
         String proyectosAntiguos1=proyectosPasado[proyecto1];
         this.proyectosAntiguos1=proyectosAntiguos1;
         String proyectosAntiguos2=proyectosPasado[proyecto2];
         this.proyectosAntiguos2=proyectosAntiguos2;
         String proyectosAntiguos3=proyectosPasado[proyecto3];
         this.proyectosAntiguos3=proyectosAntiguos3;
         String proyectosAntiguos4=proyectosPasado[proyecto4];
         this.proyectosAntiguos4=proyectosAntiguos4;
         
         String proyectosActuales[]={"Aplicación detectora de plagio","Base de datos de Sears","E-store de Samborns","Dispensador automático de gasolina","Cajeros de pago de estacionamiento","Pagina web de Cinemex","Optimización de producción de Panam","Elevador de carga","Sistema de seguridad de BBVA","App de inventario de Mercado libre"};
        
         int proyecto5;
         proyecto5=(int)(Math.random()*9);
         int proyecto6;
         proyecto6=(int)(Math.random()*9);
         String proyectosVigentes1=proyectosActuales[proyecto5];
         this.proyectosVigentes1=proyectosVigentes1;
          String proyectosVigentes2=proyectosActuales[proyecto6];
          this.proyectosVigentes2=proyectosVigentes2;
         
           int direcciones[]={01223,02341,03412,07602,02371,02674,02134,02341,07521,90123,01234,04321,40821,23412,4210,01432,05321,05324,31251,23412,5498,04372};
           int direccionRandom;
           direccionRandom=(int)(Math.random()*21);
           dirección=direcciones[direccionRandom];
           this.dirección=dirección;
           
           
           
           int anios[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
           int aniosRandom;
           aniosRandom=(int)(Math.random()*49);
           añosServicio=anios[aniosRandom];
    }
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    public String getApellido1(){
        return apellido1;
    }
    
    
     public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    public String getApellido2(){
        return apellido2;
    }
    
    public void setProyectosAntiguos1(String proyectosAntiguos1){
        this.proyectosAntiguos1=proyectosAntiguos1; 
    }
   
    public String getProyectosActuales1(){
        return proyectosAntiguos1;
    }
    
      public void setProyectosAntiguos2(String proyectosAntiguos2){
        this.proyectosAntiguos2=proyectosAntiguos2; 
    }
   
    public String getProyectosActuales2(){
        return proyectosAntiguos2;
    }
    
      public void setProyectosAntiguos3(String proyectosAntiguos3){
        this.proyectosAntiguos3=proyectosAntiguos3; 
    }
   
    public String getProyectosActuales3(){
        return proyectosAntiguos3;
    }
    
      public void setProyectosAntiguos4(String proyectosAntiguos4){
        this.proyectosAntiguos4=proyectosAntiguos4; 
    }
   
    public String getProyectosActuales4(){
        return proyectosAntiguos4;
    }
    
      public void setProyectosVigentes1(String proyectosVigentes1){
        this.proyectosVigentes1=proyectosVigentes1; 
    }
   
    public String getProyectosVigentes1(){
        return proyectosVigentes1;
    }
    
    public void setProyectosVigentes2(String proyectosVigentes2){
        this.proyectosVigentes2=proyectosVigentes2; 
    }
   
    public String getProyectosVigentes2(){
        return proyectosVigentes2;
    }
    
    public void setDirección(int dirección){
        this.dirección=dirección;
    }
    
    public int getDirección(){
        return dirección;
    }
    
      public void setNumEmpleado(int numEmpleado){
        this.numEmpleado=numEmpleado;
    }
    
    public int getNumEmpleado(){
        return numEmpleado;
    }
    
      public void setAñosServicio(int añosServicio){
        this.añosServicio=añosServicio;
    }
    
    public int getAñosServicio(){
        return añosServicio;
    }
    
     @Override
  public String toString(){
    return "Empleado={nombre= "+nombre+" apellido paterno= "+apellido1+" apellido materno= "+apellido2+" Proyectos antiguos: "+proyectosAntiguos1+", "+proyectosAntiguos2+", "+proyectosAntiguos3+", "+proyectosAntiguos4+" Proyectos actuales: "+proyectosVigentes1+", "+proyectosVigentes2+" Dirección: CP: "+dirección+" Numero de empleado: "+numEmpleado+" años de servicio: "+añosServicio+"}";
  }
    }




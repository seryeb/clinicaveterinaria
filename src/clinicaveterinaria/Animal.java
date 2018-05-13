package clinicaveterinaria;

public class Animal {
	private String nombre,codigo,especie,alimentacion,observaciones,genero;
    public Animal(String nombre, String codigo, String especie, String alimentacion, String observaciones, String genero) {
        this.nombre = nombre;
    	this.codigo = codigo;
        this.especie = especie;
        this.alimentacion = alimentacion;
        this.observaciones = observaciones;
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getEspecie() {
        return especie;
    }
 
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getAlimentacion() {
        return alimentacion;
    }
 
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    public String getObservaciones() {
        return observaciones;
    }
 
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public String getGenero() {
        return genero;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

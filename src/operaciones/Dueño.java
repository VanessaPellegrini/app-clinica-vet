/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author vann
 */
public class Dueño {
    private String _rut;
    private String _nombre;
    private String _apellido;
    private Byte _edad;
    private String _direccion;
    private char _sexo;
    
    private Mascota objMascota = new Mascota();
    
    //constructor por defecto
    public Dueño() {
    }
    
    //constructor explicito + derivado

    public Dueño(String _rut, String _nombre, String _apellido, Byte _edad, String _direccion, char _sexo, Mascota objMascota) {
        this._rut = _rut;
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._edad = _edad;
        this._direccion = _direccion;
        this._sexo = _sexo;
        this.objMascota = objMascota;
    }

    public String getRut() {
        return _rut;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public Byte getEdad() {
        return _edad;
    }

    public String getDireccion() {
        return _direccion;
    }

    public char getSexo() {
        return _sexo;
    }

    public Mascota getObjMascota() {
        return objMascota;
    }

    public void setRut(String _rut) {
        this._rut = _rut;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public void setEdad(Byte _edad) {
        this._edad = _edad;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public void setSexo(char _sexo) {
        this._sexo = _sexo;
    }

    public void setObjMascota(Mascota objMascota) {
        this.objMascota = objMascota;
    }
}

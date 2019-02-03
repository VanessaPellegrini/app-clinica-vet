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
public class Mascota {
    private String _raza;
    private Byte _edad;
    private char _sexo;

    //constructor por defecto
    public Mascota() {
    }

    public Mascota(String _raza, Byte _edad, char _sexo) {
        this._raza = _raza;
        this._edad = _edad;
        this._sexo = _sexo;
    }

    public String getRaza() {
        return _raza;
    }

    public Byte getEdad() {
        return _edad;
    }

    public char getSexo() {
        return _sexo;
    }

    public void setRaza(String _raza) {
        this._raza = _raza;
    }

    public void setEdad(Byte _edad) {
        this._edad = _edad;
    }

    public void setSexo(char _sexo) {
        this._sexo = _sexo;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.ArrayList;

/**
 *
 * @author vann
 */
public class ListaDueñosDeMascotas {
    private static ArrayList<Dueño> _listaDueño = new ArrayList<>();
    
    public ListaDueñosDeMascotas() {
    }
    
    public static ArrayList<Dueño> getListaDueño() {
        return _listaDueño;
    }

    public static void setListaDueño(ArrayList<Dueño> _listaDueño) {
        ListaDueñosDeMascotas._listaDueño = _listaDueño;
    }
    
}

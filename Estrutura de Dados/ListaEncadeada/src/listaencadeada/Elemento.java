/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author estudos
 */
public class Elemento {
    private String info;
    private Elemento proximo;

    public Elemento(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento elemento) {
        this.proximo = elemento;
    }
  
}

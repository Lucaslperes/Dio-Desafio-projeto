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
public class ListaEncadeada {

    private Elemento inicio;

    public void adicionar(String info) {
        if (this.inicio == null) {
            this.inicio = new Elemento(info);
        } else {
            Elemento elemento = this.inicio;
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(info));
        }
    }
    public void inserir(String info){
        if (this.inicio == null) {
            this.inicio = new Elemento(info);
        }else{
            if(this.inicio.getProximo() == null){
                this.inicio.setProximo(new Elemento(info));
            }else{
               Elemento elemento = this.inicio.getProximo();
               elemento.setProximo(new Elemento(info));
            }
        
        }
    }

    public void listar() {
        Elemento elemento = this.inicio;
        System.out.println(elemento.getInfo());
        while (elemento.getProximo() != null) {
            
        }
    }

}

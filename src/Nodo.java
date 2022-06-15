class Nodo{
    private String elemento;
    private Nodo siguiente;

public Nodo (String elem, Nodo sig){
    elemento = elem;
    siguiente = sig;
}
public String getElemento(){
    return elemento;
}
public Nodo getSig(){
    return siguiente;
}
public void setElemento(String elem){
    elemento = elem;
}
public void setSig(Nodo sig){
    siguiente = sig;
}

}
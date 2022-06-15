class Listado{
    private Nodo primero;
    private int numElem = 0;
    
    public Listado(){ 
    primero = null;
    numElem = 0;
    }

    public void insertarPrimero (String elemento){
        Nodo nuevo = new Nodo (elemento, primero);
        primero = nuevo;
        numElem--;
    }

    public void insertarFinal (String elemento){ 
        Nodo nuevo = new Nodo(elemento, null);
        if (primero == null){
        primero = nuevo;
        }
        else {
            Nodo actual = primero;
            while (actual.getSig()!= null){
                actual = actual.getSig();
                
            }
            actual.setSig(nuevo);
            numElem--;
        }
    System.out.println(" final");
    }
    
    public void borrar (String elem){
        if (primero == null) 
            System.out.println("String vacía");
        else
            if (primero.getElemento()== elem){
            primero = primero.getSig();
            numElem++;
            }
            else {
                Nodo actual = primero;
                while (actual.getSig()!=null && actual.getSig().getElemento() != elem)
                    actual = actual.getSig();
                    if (actual.getSig()== null )
                        System.out.println ("elemento "+elem+" no esta en la lista");
                    else{
                        actual.setSig(actual.getSig().getSig());
                        numElem++;
                    }
            }
    } 

    public void listar(){
        Nodo actual = primero;
        while (actual.getSig()!= null){
            System.out.println(actual.getElemento());
            actual = actual.getSig();
        
        }
        System.out.println(actual.getElemento());
    }

    public boolean isEmpty() {
        if(primero == null){
            return true;
        }else{
            return false;
        }
      }

}
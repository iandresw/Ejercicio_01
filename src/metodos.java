public class metodos extends Seccion{
    Listado a = new Listado();
    String alumnos;
    public seciones(int n){
        this.cupos = n;
        this.ultimo = -1;
    }

    boolean matricula(String alumno){
        if (this.ultimo < (this.cupos -1)){
            a.insertarPrimero(alumno);
            return true;
        }else{
            return false;
        }
    }

    int mostarUltimo(){
        return getUltimo();
    }

    void InsertarUV(String uV){
        setuV(uV);
    }
    
    String mostarUV(){
        return getuV();
    }
    
    void Cupos(int Cupos){
        if (!a.isEmpty()){
            this.cupos= Cupos;
            this.ultimo= -1;
        }
        else{
            String ptrTemp;
            ptrTemp = alumnos;
            this.cupos = Cupos;
            a.insertarPrimero(alumnos);;
            int i= ultimo;
            ultimo= -1;
            for(i++; i >= 0; i--){
                this.matricula(ptrTemp);
                ptrTemp++;
            }
            delete(ptrTemp);
        }
    }


}
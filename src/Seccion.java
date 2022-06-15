public class Seccion{
private String nombre = "";
private String aula= "";
private String hora= "";
private String iD= "";
private String uV= "";
protected int  cupos= 0;
protected int ultimo= 0;

public Seccion(String nombre, String aula, String hora, String iD, String uV, int cupos, int ultimo) {
    this.nombre = nombre;
    this.aula = aula;
    this.hora = hora;
    this.iD = iD;
    this.uV = uV;
    this.cupos = cupos;
    this.ultimo = ultimo;
}

public Seccion() {
    this.nombre = "";
    this.aula = "";
    this.hora = "";
    this.iD = "";
    this.uV = "";
    this.cupos = 0;
    this.ultimo = 0;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getAula() {
    return aula;
}
public void setAula(String aula) {
    this.aula = aula;
}
public String getHora() {
    return hora;
}
public void setHora(String hora) {
    this.hora = hora;
}
public String getiD() {
    return iD;
}
public void setiD(String iD) {
    this.iD = iD;
}
public String getuV() {
    return uV;
}
public void setuV(String uV) {
    this.uV = uV;
}
public int getCupos() {
    return cupos;
}
public void setCupos(int cupos) {
    this.cupos = cupos;
}
public int getUltimo() {
    return ultimo;
}
public void setUltimo(int ultimo) {
    this.ultimo = ultimo;
}

@Override
public String toString() {
    return "Seccion [aula= " + aula + ", cupos= " + cupos + ", hora= " + hora + ", iD= " + iD + ", nombre= " + nombre
            + ", uV= " + uV + ", ultimo= " + ultimo + "]";
}


}
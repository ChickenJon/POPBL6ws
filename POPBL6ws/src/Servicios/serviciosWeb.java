package Servicios;

public class serviciosWeb {
	
	
	public void mostrarTecnicos(){
        //devolvera toda la información de todos los técnicos en una tabla
    }

    public void MostrarTecnicosLibres(){
        //devolvera una lista de tecnicos haciendo una innerjoin entre tabla tecnicos y tabla estado
    }

    public void AsignarIncidenciaTecnico(){
        
    }

    public void AsignarProblemaTecnico(){

    }

    public void MostrarHistorialTecnico(int idtecnico){
        //devolvera una lista de incidencias haciendo un inerjoin entre la tabla incidecia, tecnico_incidencia y tecnico
    }

    public void MostrarHistorialIncidencias(){
        //devolvera una lista de todas las incidencias select de tabla incidencia con todos los atributos
    }

    public void mostrarInformacionDetalladaIncidencia(int idIncidencia){
        //devolvera una lista haciendo un innerjoin entre incidencia, tecnico_incidencia, tecnico y incidencia, tipo_incidencia, solucion_incidencia y solucion
    }

    public void MostrarHistorialProblemas(){
        //devolvera una lista de todas las incidencias select de tabla problema con todos los atributos
    }

    public void IntroducirIncidencia(int codigoTipoIncidencia, int usuario, int activoID, String descripcion){
        //insert en tabla incidencia el resto nosotros
    }

    public void MostrarIncidenciasAbiertas(int IDincidencia){
        //devolvera una lista de incidencias haciendo innerjoin entre incidencia y estado
    }

    public void MostrarIncidenciasAceptadas(int idtecnico){
        //igual que el anterior pero con otro atributo
    }

    public void AceptarIncidencia(int IDincidencia, int idtecnico){
        //insert en tecnico incidencia
    }

    public void CerrarIncidencia(int IDincidencia, String descripcion){
        //update de la tabla tecnico_incidencia para modificar estado. Si ese tipoIncidencia no tiene esa solucion registrada, se inserta la solucion en "solucion"
    }

    public void EscalarIncidencia(int IDincidencia){
        //delete la linea de tecnico_incidencia y update la tabla de incidencia estado pasa a escalado_segundo_nivel
    }

    public void MostrarProblemasAbiertos(){
        //devolvera una lista de problema en la tabla problema mirando el atributo estado
    }

    public void MostrarProblemasAceptados(){
        //mirar estado en la tabla de problemas
    }

    public void AceptarProblema(int IDproblemas, int idtecnico){
        //update en la tabla problema estado
    }

    public void CerrarProblema(int IDproblema, String descripcion){
        //update estado de la tabla problema y insert en solucion si la solucion no esta registrada
    }

    public void EscalarProblemas(int IDproblema){
        //update del estado del problema
    }

    public void MonitorizarInfraestructura(){
        /*pensando*/
    }

}

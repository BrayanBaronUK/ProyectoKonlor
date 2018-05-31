package co.edu.konrad.vl.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-26T10:41:47")
@StaticMetamodel(ReservaEntity.class)
public class ReservaEntity_ { 

    public static volatile SingularAttribute<ReservaEntity, Long> Cod_Rol;
    public static volatile SingularAttribute<ReservaEntity, Long> idHotel;
    public static volatile SingularAttribute<ReservaEntity, Long> idCliente;
    public static volatile SingularAttribute<ReservaEntity, Long> Cod_F_Pago;
    public static volatile SingularAttribute<ReservaEntity, String> Fecha_Hora_Salida;
    public static volatile SingularAttribute<ReservaEntity, String> programa;
    public static volatile SingularAttribute<ReservaEntity, String> Fecha_Hora_Entrada;
    public static volatile SingularAttribute<ReservaEntity, String> Disponibilidad;
    public static volatile SingularAttribute<ReservaEntity, Long> idReserva;

}
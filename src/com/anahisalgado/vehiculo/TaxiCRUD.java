package com.anahisalgado.vehiculo;

import com.alejozepol.BasesDatos.BasesDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alejozepol
 */
public class TaxiCRUD {

    private final int idTipoVehiculo = 2;

    public void agregar(Taxi taxi) throws SQLException {

        String insersion = "";
        String idTabla = "";
        Statement sentencia = null;
        int id=100;



        insersion = 
//                "select @id:=max(idVehiculo+1) from vehiculos; +/"
                 "INSERT INTO vehiculos (idVehiculo, matriculo, marca, modelo,anio, idTipoVehiculo)"
                + " VALUES ("+id+",'"+ taxi.getMatricula() + "','" + taxi.getMarca()
                + "','" + taxi.getModelo()
                + "','" + taxi.getAnio() + "'," + idTipoVehiculo + ");";

        BasesDatos basesDatos = new BasesDatos();
        sentencia = basesDatos.conectar().createStatement();

        if (sentencia.executeUpdate(insersion) > 0) {
            System.out.println("El registro fue Insertado Conexito");
            System.out.println(insersion);
        } else {
            System.err.println("no se puedo insertar la sentencis");
            System.err.println(insersion);

        }
    }

}

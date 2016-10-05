package com.anahisalgado.sistematransporte;

import com.alejozepol.BasesDatos.BasesDatos;
import com.anahisalgado.asociatividad.DocumentoAsociatividad;
import com.anahisalgado.conductor.ChoferAutobus;
import com.anahisalgado.conductor.Taxista;
import com.anahisalgado.vehiculo.Taxi;
import com.anahisalgado.vehiculo.TaxiCRUD;
import com.anahisalgado.vehiculo.Vehiculo;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

//		Taxi ti = new Taxi("AAA123", "fadf", "i7");
//		Taxista tA = new Taxista("ann", "B", ti);
//		Taxista tA2 = new Taxista("leo", "C", ti);
//		
//		//Lo mismo con un bus
//		
//		
//		DocumentoAsociatividad dA = new DocumentoAsociatividad(ti,tA);
//		dA.mostrarDatosDocumento();
//		
//		DocumentoAsociatividad dA2 = new DocumentoAsociatividad(ti,tA2);
//		dA2.mostrarDatosDocumento();
//        BasesDatos baseDatos = new BasesDatos();
//        baseDatos.conectar();
//
//        System.out.println("¿desea Insertar un nuevo registro? 1 para si 2 para no");
//
//        Scanner sc = new Scanner(System.in);
//        int resp;
//        resp = Integer.parseInt(sc.nextLine());
//
//        if (resp == 1) {
//            Taxi taxi = new Taxi("hhh000", "oi87", "cu","2016");
//        
//
//            TaxiCRUD taxiCRUD = new TaxiCRUD();
//            taxiCRUD.agregar(taxi);
//        }
int i=1; 
int j=2;
int k=3; 
int m=2; 
System.out.println ((j >= i) || (k == m));
    }

}

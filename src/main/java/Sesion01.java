
import controlador.ControladorOperaciones;
//import java.util.Scanner;
import modelo.Operaciones;
import vista.frmOperaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author F20LAB207E16
 */
public class Sesion01 {

    public static void main(String[] args) {
        
        
        
        Operaciones modelo = new Operaciones(20,30);
        frmOperaciones vista = new frmOperaciones();
        ControladorOperaciones controlador = new ControladorOperaciones(modelo,vista);
        controlador.iniciar();
        
        /*
        Scanner teclado = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        System.out.println("Ingrese primer valor");
        int numero = teclado.nextInt();
        operacion.setOperador1(numero);
        System.err.println("Ingrese segundo valor:");
        numero = teclado.nextInt();
        operacion.setOperador2(numero);
        
        System.out.println("La suma es " + operacion.sumar());
        System.out.println("La resta es " + operacion.restar());
        System.out.println("El producto es " + operacion.multiplicar());*/
        
    }
}

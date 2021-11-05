package proyecto1;
    import java.util.Scanner;

public class Proyecto1 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in); 
     
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String sistOperativo;
        
        System.out.println("Ingrese su nombre:");
        nombre=teclado.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido=teclado.nextLine();
        System.out.println("Ingrese su edad:");
        edad=Integer.parseInt(teclado.nextLine()); /*trasnf el int en string*/
        System.out.println("Ingrese su hobbie:");
        hobbie=teclado.nextLine();
        System.out.println("Ingrese su editor preferido:");
        editor=teclado.nextLine();
        System.out.println("Ingrese su SO preferido:");
        sistOperativo=teclado.nextLine();
        
        System.out.println("");
        System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Preferencias: " + editor + " como editor de código y " + sistOperativo + " como SO");
         
    }
    
}

import java.util.Scanner;

public class Main {
    public static final String nombre_1= "maxmiranda";
    public static final String contraseña_1= "maxmiranda*?";
    public static final String nombre_2= "miguelhidalgo";
    public static final String contraseña_2= "mike230&0";
    public static final String nombre_3= "nadiamedina";
    public static final String contraseña_3= "mega0303";
//15 caracteres max de contraseña y usuario

    public static String resultado (int a){
        if (a== 1 || a==0){
            System.out.println("Usuario o contraseña inválida, vuelva a intentar");
            return " ";
        }
        else {return "cerrar";}
    }


    public static void main(String[] args) {


        //Declaración de variables
        String usuarios[]= {nombre_1, nombre_2, nombre_3};
        String contraseñas[]= {contraseña_1, contraseña_2, contraseña_3};
        String usuario= "nada";
        String contraseña;
        int verificar= 0;
        int posicion=0;
        Boolean reinicia= false;


        //Aquí empieza el while

        while (!usuario.equals("cerrar")) {

            //Pide que entre su usuario
            System.out.println("\nBienvenido, ingresa tu usuario: ");
            Scanner scan= new Scanner(System.in);
            usuario= scan.next();

            int veces_repetir= usuarios.length -1;
            int veces_repetir2= contraseñas.length -1;


            //verificar si existe
            for (int i=0; i<= veces_repetir; i++) {
                if (usuarios[i].compareTo(usuario)==0){
                    verificar= 1;
                    posicion= i;
                }
            }
            if (verificar== 1) {
                //Aquí pasamos al siguiente paso de verificar contraseña
                System.out.println("Ingrese su contraseña");

                contraseña = scan.next();

                //verificar si la contraseña existe

                for (int i = 0; i <= veces_repetir2; i++) {
                    if (contraseñas[i].equals(contraseña) && posicion==i) {
                        //verificar si coincide con su contraseña
                        if (posicion==0){
                            System.out.println("Bienvenido dueño..");
                            verificar=2;
                        } else {
                            System.out.println("Bienvenido...");
                            verificar=2;
                        }

                    }
                }
            } usuario= resultado(verificar);


        }
    }
}
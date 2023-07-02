import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        //ARREGLO DE OBJETOS
        ArrayList<Fruta>frutas=new ArrayList<Fruta>();
        ArrayList<Fruta_dulce>frutaDulces= new ArrayList<Fruta_dulce>();
        ArrayList<Sandia>sandias=new ArrayList<Sandia>();

        //INSTANCIAS
        Planta planta1=new Planta("Magnoliophyta","Magnoliopsida");
        frutas.add(new Fruta("Magnoliophyta","Liliopsida","acida"));
        frutas.add(new Fruta("Magnoliophyta","Magnoliopsida","semiacida"));
        frutas.add(new Fruta("Magnoliophyta","Magnoliopsida", "dulce"));
        frutaDulces.add(new Fruta_dulce("Magnoliophyta","Magnoliopsida", "dulce","beige","mediano","Melon"));
        frutaDulces.add(new Fruta_dulce("Magnoliophyta", "Magnoliopsida","dulce","verde claro","pequeño","pera"));
        frutaDulces.add(new Fruta_dulce("Magnoliophyta", "Magnoliopsida", "dulce","rojo","pequeña","manzana"));
        sandias.add(new Sandia("Magnoliophyta","Magnoliopsida","dulce","verde-roja","grande","sandia","A, B1, B2, B3, B5, B6, C",3.3f));
        sandias.add(new Sandia("Magnoliophyta","Magnoliopsida","dulce","verde-roja","grande","sandia","A, B1, B2, B3, B5, B6, C",2.75f));
        sandias.add(new Sandia("Magnoliophyta","Magnoliopsida","dulce","verde-roja","grande","sandia","A, B1, B2, B3, B5, B6, C",3.0f));

        //VARIABLES
        String division, clase, tipo, color, tamanio, nombreFruta, vitamina;
        float precio;
        //CLASE SCANNER
        Scanner entrada = new Scanner(System.in);
        //MENU
        int opc=0;

        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Mostrar información de Frutas");
            System.out.println("2. Mostrar información de Frutas Dulces");
            System.out.println("3. Mostrar información de Sandias");
            System.out.println("4. Salir");
            System.out.println("Ingrese: "); opc=entrada.nextInt();
            entrada.nextLine();

            switch (opc){
                case 1:
                    System.out.println("-----------Frutas-----------");
                    int nfruta=1;
                    for (Fruta fruta:frutas){
                        System.out.println("Info fruta n°"+(nfruta));
                        System.out.println("Division en el reino plantae: "+fruta.getDivision());
                        System.out.println("Clase a la que pertenece: "+fruta.getClase());
                        System.out.println("Tipo: "+fruta.getTipo());
                        nfruta++;
                        System.out.println("---------------------------------");
                    }
                    break;
                case 2:
                    int nfrutadulce=1;
                    System.out.println("-----------Frutas Dulces-----------");
                    for (Fruta_dulce frutaDulce:frutaDulces){
                        System.out.println("Info fruta dulce n°"+(nfrutadulce));
                        System.out.println("Division en el reino plantae: "+frutaDulce.getDivision());
                        System.out.println("Clase a la que pertenece: "+frutaDulce.getClase());
                        System.out.println("Tipo: "+frutaDulce.getTipo());
                        System.out.println("Color: "+frutaDulce.getColor());
                        System.out.println("Tamaño: "+frutaDulce.getTamanio());
                        System.out.println("Nombre de la fruta: "+frutaDulce.getNombreFruta());
                        nfrutadulce++;
                        System.out.println("---------------------------------");
                    }
                    break;

                case 3:
                    int nsandias=1;
                    System.out.println("-----------Sandias-----------");
                    for (Sandia sandia:sandias){
                        System.out.println("Info Sandias n°"+(nsandias));
                        System.out.println("División en el reino plantae: "+sandia.getDivision());
                        System.out.println("Clase a la que pertenece: "+sandia.getClase());
                        System.out.println("Tipo: "+sandia.getTipo());
                        System.out.println("Color: "+sandia.getColor());
                        System.out.println("Tamaño: "+sandia.getTamanio());
                        System.out.println("Nombre de la fruta: "+sandia.getNombreFruta());
                        System.out.println("Vitaminas: "+sandia.getVitamina());
                        System.out.println("Precio: "+sandia.getPrecio());
                        nsandias++;
                        System.out.println("---------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }

        }while(opc!=4);



    }
}


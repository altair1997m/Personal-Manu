package com.mycompany.batallanaval;
import java.util.Scanner; 
public class Batallanaval {
static int Arraylist[][];
static int list[][];
static int filas, columnas;
static Scanner barco=new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Pedir numero de filas");
        filas=barco.nextInt();
        System.out.println("Pedir numero de columnas");
        columnas=barco.nextInt();
        Arraylist=new int [filas][columnas];
        list=new int [filas][columnas];
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                Arraylist[i][j]=6;
                
            }
        }
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                list[i][j]=6;
                
            }
        }
        System.out.println("Turno P1");
        barcosP1();
        System.out.println("Turno P2");
        barcosP2();
        System.out.println("");
        bala();
        
    }
    public static void barcosP1(){
        System.out.println("Ingresa la posicion del primer barco horizontal o vertical");
        String posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<4;i++){
                        Arraylist[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"v":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<4;i++){
                        Arraylist[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del segundo barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<3;i++){
                        Arraylist[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<3;i++){
                        Arraylist[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del tercer barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<2;i++){
                        Arraylist[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<2;i++){
                        Arraylist[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del cuarto barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<1;i++){
                        Arraylist[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<1;i++){
                        Arraylist[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(Arraylist[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
    }
    public static void barcosP2(){
        System.out.println("Ingresa la posicion del primer barco horizontal o vertical");
        String posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<4;i++){
                        list[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<4;i++){
                        list[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del segundo barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<3;i++){
                        list[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<3;i++){
                        list[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del tercer barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<2;i++){
                        list[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<2;i++){
                        list[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
        System.out.println("Ingresa la posicion del cuarto barco horizontal o vertical");
        posicion=barco.next();
        switch(posicion){
            case"h":
                System.out.println("Ingresar coordena horizontal");
                int horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                int vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas&&vertic>=0&&vertic<columnas-4){
                    for(int i=0;i<1;i++){
                        list[horizon][vertic+i]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                break;
                case"V":
                     System.out.println("Ingresar coordena horizontal");
                 horizon=barco.nextInt();
                System.out.println("Ingresar coordena vertical");
                 vertic=barco.nextInt();
                if(horizon>=0&&horizon<filas-4&&vertic>=0&&vertic<columnas){
                    for(int i=0;i<1;i++){
                        list[horizon+i][vertic]=4;
                        
                    }
                    for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(list[i][j]+" ");
                
            }
                        System.out.println("");
        }
                }
                    break;
        }
    }
    public static void bala(){
        for(int i=0; i<Arraylist.length; i++)
            for(int j=0; j<Arraylist.length-1; j++)
                for(int t=0; t<list.length; t++)
                    for(int g=0; g<list.length-1; g++)
                        
                        while(Arraylist[i][j]==4&&list[t][g]==4){
                            System.out.println("Turno de P1");
                            System.out.println("Ingresar los tiros en horizontal");
                            int disparo=barco.nextInt();
                            System.out.println("Ingresar los tiros en vertical");
                            int canon=barco.nextInt();
                            if(disparo>=0&&disparo<filas&&canon>=0&&canon<columnas){
                                if(list[disparo][canon]==4){
                                    System.out.println("Hacerto el tiro");
                                    for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                        list[disparo][canon]=8;
                
            }
        }   
                                }else if(list[disparo][canon]==6){
                                    System.out.println("No hacerto el tiro");
                                  for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                        list[disparo][canon]=8;
                
            }
        }     
                                }else if(list[disparo][canon]==4){
                                    System.out.println("A atacado la coordenada");
                                }
                            }
                            System.out.println("Turno de P2");
                            System.out.println("Ingresar los tiros en horizontal");
                            disparo=barco.nextInt();
                            System.out.println("Ingresar los tiros en vertical");
                            canon=barco.nextInt();
                            if(disparo>=0&&disparo<filas&&canon>=0&&canon<columnas){
                                if(Arraylist[disparo][canon]==4){
                                    System.out.println("Hacerto el tiro");
                                    for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                        Arraylist[disparo][canon]=8;
                
            }
        }   
                                }else if(list[disparo][canon]==6){
                                    System.out.println("No hacerto el tiro");
                                  for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                        Arraylist[disparo][canon]=8;
                
            }
        }     
                                }else if(Arraylist[disparo][canon]==4){
                                    System.out.println("A atacado la coordenada");
                                }
                            }

                            
                        }
        for(int i=0; i<=Arraylist.length; i++)
            for(int j=0; j<Arraylist.length-1; j++)
                for(int t=0; t<list.length; t++)
                    for(int g=0; g<list.length-1; g++)
                        if(Arraylist[i][j]==4||list[t][g]==4){
                            if(Arraylist[i][j]==4){
                                System.out.println("Perdio P2");
                                for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                            System.out.print(Arraylist[p][r]+ " ");
                
            }
                                        System.out.println("");
        }   
                            }else{
                                System.out.println("Gano P2");
                                for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                            System.out.print(Arraylist[p][r]+ " ");
                
            }
                                        System.out.println("");
        }   
                            }
                            if(list[t][g]==4){
                                System.out.println("Perdio P1");
                                for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                            System.out.print(list[p][r]+ " ");
                
            }
                                        System.out.println("");
        }   
                            }else{
                                System.out.println("Gano P1");
                                for (int p=0; p<filas; p++){
                                        for (int r=0; r<columnas; r++){
                                            System.out.print(list[p][r]+ " ");
                
            }
                                        System.out.println("");
        }   
                            }
                            return;
                        }
                        }
        
    }

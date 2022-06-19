package epsi.tdgrp2;

import java.util.*;

public class Main {
    
    public static void main(String[] args)
    {
        int x=1;
        String[] tab={"","","","",""};
        String[] tab1={"","","","",""};
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Scanner sc=new Scanner(System.in);
        Film f = new Film();
        Film film1 = new Film("Dune","Timothée Chalamet","2021","Denis Villeneuve","Blue-ray");
        Film film2 = new Film("Forrest-Gump","Tom Hanks","1987","Robert Zemeckis","DVD");
        Film film3 = new Film("Eternals","Richard Madden","2021","Chloé Zhao","Blue-ray");
        Film film4 = new Film("Mortal Kombat","Jessica McNamee","2021","Simon McQuoid","K7");
        Film film5 = new Film("Spider-Man","Tom Holland","2021","Jon Watts","Blue-ray");
        vector.add(film1);
        vector.add(film2);
        vector.add(film3);
        vector.add(film4);
        vector.add(film5);
        Client c = new Client();
        Client client1 = new Client("EL MAHERSSI","Med aziz","zielmaherssi@gmail.com",tab);
        Client client2 = new Client("Dupont","John","johndup@gmail.com",tab1);
        vector2.add(client1);
        vector2.add(client2);
        while(x!=0)
        {
            System.out.println("\n");
            System.out.println("1 -Afficher la liste des films ");
            System.out.println("2 -Ajouter un film ");
            System.out.println("3 -Rechercher un film par le nom ");
            System.out.println("4 -Supprimer un film par le nom ");
            System.out.println("5 -Afficher la liste des films par support ");
            System.out.println("6 -Louer des films ");
            System.out.println("7 -Ajouter un client ");
            System.out.println("8 -Afficher les films loués ");
            System.out.println("0 -Exit ");
            System.out.println("\n");
            System.out.println("Veuillez saisir un choix : ( 1, 2, 3, 4, 5, 6, 7, 8, 0)");
            while(!sc.hasNextInt())
            {
                sc.next();
                System.out.println("Veuillez entrer un choix valide : ");
            }
            x=sc.nextInt();
            System.out.println("\n");

            switch(x)
            {

                case 1:f.afficher2(vector);
                break;
                case 2:
                {
                    f.saisie();
                    f.remplissage(vector);
                }
                break;
                case 3: f.recherche(vector);
                break;
                case 4: f.supprimer(vector);
                break;
                case 5: f.trier(vector);
                break;
                case 6:
                { 
                    f.afficher2(vector);
                    System.out.println("Saisir le numero du film choisi : ");
                    int z=sc.nextInt();
                    c.afficher2(vector2);
                    System.out.println("Saisir le numero du client : ");
                    int y=sc.nextInt();
                    c.location(z,y, vector,vector2);
                    
                }
                break;
                case 7: 
                { 
                    c.saisie();
                    c.remplissage(vector2);
                }
                break;
                case 8: 
                { 
                    c.afficher2(vector2);
                    System.out.println("Saisir le numero du client : ");
                    int m=sc.nextInt();
                    c.afficher3(m,vector2);
                }
                break;
            }
        
        }    
        
    }
}
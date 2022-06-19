package epsi.tdgrp2;
import java.util.*;

public class Film {

    private String nom;
    private String acteur;
    private String date;
    private String realisateur;
    private String support;


    public Film()
    {
        nom="";
        acteur="";
        date="";
        realisateur="";
        support="";

    }

    public Film(String nom,String acteur,String date,String realisateur,String support) 
    {
        this.nom=nom;
        this.acteur=acteur;
        this.date=date;
        this.realisateur=realisateur;
        this.support=support;

    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom)
    {
        this.nom=nom;
    }


    public void saisie()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le nom du film : ");
        nom=sc.nextLine();
        System.out.println("Entrer le nom de l'acteur : ");
        acteur=sc.nextLine();
        System.out.println("Entrer la date du sortie du film : ");
        date=sc.nextLine();
        System.out.println("Entrer le nom du realisateur : ");
        realisateur=sc.nextLine();
        System.out.println("Entrer le support : ");
        support=sc.nextLine();
        System.out.println("\n");
        System.out.println("Ajouté avec success ");
        System.out.println("\n");
    }

    public void afficher2(Vector vector)
    {
        for(int i=0; i<vector.size(); i++)
        {
            System.out.println(i+1 +":");
            
            ((Film) (vector.elementAt(i))).afficher();
            System.out.println("\n");
        }
        System.out.println("\n");

    }

    public void remplissage(Vector vector)
    {

        Film f = new Film(nom,acteur,date,realisateur,support);
        vector.add(f);
        System.out.println("\n");

    }

    public void recherche(Vector vector)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Entre le nom du film a rechercher : ");
        name = sc.nextLine();
        System.out.println("\n");
        for(int i=0; i<vector.size(); i++)
        {
            
            if(((Film) (vector.elementAt(i))).nom.equals(name))
            {
                ((Film) (vector.elementAt(i))).afficher();
                break;
            }
            else if(i==vector.size()-1) 
            {System.out.println("Le film n'existe pas");}
        }
        System.out.println("\n");

    }

    public void afficher()
    {
        System.out.println("le nom du film : "+nom);
        System.out.println("le nom de l'acteur : "+acteur);
        System.out.println("la date du sortie du film : "+date);
        System.out.println("le nom du realisateur : "+realisateur);
        System.out.println("le support : "+support);
    }

    public void supprimer(Vector vector)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Entre le nom du film a supprimer : ");
        name = sc.nextLine();
        System.out.println("\n");
        for(int i=0; i<vector.size(); i++)
        {
            
            if(((Film) (vector.elementAt(i))).nom.equals(name))
            {
                vector.removeElementAt(i);
                System.out.println("supprimé avec succès");
                break;
            }
            else if(i==vector.size()-1) 
            {System.out.println("Le film n'existe pas");}
        }
        System.out.println("\n");

    }

    public void trier(Vector vector)

    {
        boolean b=true;
        for(int i=0; i<vector.size(); i++)
        {
            if(((Film) (vector.elementAt(i))).support.equals("K7"))
            {
                while(b==true)
                {
                    System.out.println(" Support K7 : ");
                    System.out.println("\n");
                    b=false;
                }
                ((Film) (vector.elementAt(i))).afficher();
                System.out.println("\n");
            }
        }
        b=true;
        for(int i=0; i<vector.size(); i++)
        {
            
            if(((Film) (vector.elementAt(i))).support.equals("clé USB"))
            {
                while(b==true)
                {
                    System.out.println(" Support clé USB : ");
                    System.out.println("\n");
                    b=false;
                }
                ((Film) (vector.elementAt(i))).afficher();
                System.out.println("\n");
            }
        }
        b=true;
        for(int i=0; i<vector.size(); i++)
        {
            if(((Film) (vector.elementAt(i))).support.equals("Blue-ray"))
            {
                while(b==true)
                {
                    System.out.println(" Support Blue-ray : ");
                    System.out.println("\n");
                    b=false;
                }
                ((Film) (vector.elementAt(i))).afficher();
                System.out.println("\n");
            }
        }
        b= true;
        for(int i=0; i<vector.size(); i++)
        {
            
            if(((Film) (vector.elementAt(i))).support.equals("DVD"))
            {
                while(b==true)
                {
                    System.out.println(" Support DVD : ");
                    System.out.println("\n");
                    b=false;
                }
                ((Film) (vector.elementAt(i))).afficher();
                System.out.println("\n");
            }
        }
    }
}

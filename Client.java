package epsi.tdgrp2;
import java.util.*;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String[] t;
    


    public Client()
    {
        t = new String[5];

    }

    public Client(String nom, String prenom, String adresse, String[] t)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.t = t;
    }

    public void saisie()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le nom : ");
        nom=sc.nextLine();
        System.out.println("Entrer le prenom : ");
        prenom=sc.nextLine();
        System.out.println("Entrer l'adresse mail : ");
        adresse=sc.nextLine();
        System.out.println("\n");
        System.out.println("Ajouté avec success ");
        System.out.println("\n");

    }

    public void afficher()
    {
        System.out.println("Nom  : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Adresse mail : "+adresse);
    }

    public void afficher2(Vector vector)
    {
        for(int i=0; i<vector.size(); i++)
        {
            System.out.println(i+1 +":");
            
            ((Client) (vector.elementAt(i))).afficher();
            System.out.println("\n");
        }
        System.out.println("\n");

    }

    public void remplissage(Vector vector)
    {

        Client c = new Client(nom,prenom,adresse,t);
        vector.add(c);
        System.out.println("\n");

    }

    public void location(int z,int y,Vector vector,Vector vector2)
    {
        int i=0;
        while(i<5)
        {
            if((((Client) (vector2.elementAt(y-1))).t[i] == "") || (((Client) (vector2.elementAt(y-1))).t[i] == null))
            { 
                ((Client) (vector2.elementAt(y-1))).t[i]=((Film) (vector.elementAt(z-1))).getNom();
                System.out.println("Ajouté avec success ");
                break;
            }
            else if(((Client) (vector2.elementAt(y-1))).t[i]==((Film) (vector.elementAt(z-1))).getNom())
            {
                System.out.println("Vous avez deja loué ce film !");
                break;
            }
            else i++;
        }
        if(i==5)
        {
            System.out.println("Vous avez deja loué 5 films !");
        }
        
        System.out.println("\n");
    }

    public void afficher3(int y,Vector vector)
    {

        int k=0;
        System.out.println("le(s) film loué(s) : ");
        for(int j=0;j<t.length;j++)
        {
            
            if((((Client) (vector.elementAt(y-1))).t[j] == "") || (((Client) (vector.elementAt(y-1))).t[j] == null))
            {
                if(j==0)
                {
                    System.out.println("0 Films trouvé !\n");
                    break;
                }
                else break;
                
            }
            else System.out.println(((Client) (vector.elementAt(y-1))).t[j]);
        
        }
        System.out.println("\n");
    }


}

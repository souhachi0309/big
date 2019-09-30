package fr.htc.java.oo;
public class MonProgramme2 {

  public static void main(String[] args){
    // Dans une méthode, par exemple, main:
    Circle c1, c2;
    c1 = new Circle(2.0, 3.0, 4.0);
    c2 = c1; // c2 et c1 pointent vers le même objet
    c2.r = c2.r – 1; // l’objet a le rayon réduit
    c1 = new Circle(2.0); // c1 point vers un autre objet, mais c2 ne change pas
    c1.x = 2.0; // on modifie le deuxième objet
    c2 = c1; // maintenant, c2 pointe vers le 2ième objet aussi
  }
}

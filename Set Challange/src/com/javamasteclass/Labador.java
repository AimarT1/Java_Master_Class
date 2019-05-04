package com.javamasteclass;

public class Labador extends Dog {
    public Labador(String name) {
        super(name);
    }
/* Cant have Override method in this class because it will retun false, sould return true.
//Dont override equals method in a subclass.
    @Override
    public boolean equals(Object obj) {
        //Comparasion against itself
        if (this == obj){
            return true;
        }
        //is the compared string same to the one we compare.
        if (obj instanceof Labador){
            String objName = ((Labador) obj).getName();
            return this.getName().equals(objName);
        }
        return false;
    } */
}

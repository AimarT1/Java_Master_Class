package com.javamasteclass;

public class Labador extends Dog {
    public Labador(String name) {
        super(name);
    }
   /* @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Labador){
            String objName = ((Labador)obj).getName();
            return this.getName().equals(objName);
        }
        return false;
    }*/
}

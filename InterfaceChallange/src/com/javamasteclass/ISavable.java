package com.javamasteclass;

import java.util.List;

public interface ISavable {

    //methods in interface. method write and method read both are List type.
    //Method write has no pramaters.
     List<String> write();
     // method read has a paramter List<String> type called savedValues
     void read (List<String> savedValues);


}

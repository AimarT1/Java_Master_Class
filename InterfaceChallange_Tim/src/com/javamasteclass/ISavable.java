package com.javamasteclass;

//useing list that means in the future we can use any type of lists.
//Chang array type of list to Generic List tyoe we can use any type of list in the future.
import java.util.List;

public interface ISavable {
    //interfaces
    List<String> write();
    void read(List<String> savedValues);

}

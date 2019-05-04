package com.javamasteclass;

interface Accessible {

    // 1. package private interface access.
    // 2. package private. works on class implementasion, can override.
    // 3. package private. works on class implementasion, can override.
    // 4. package private. works on class implementasion, can override.

    int SOME_CONSTANT = 100;
    public void methodA();
    void  methodB();
    boolean methodC();

    // Tims anserws
    // 1. its accesable to all classes on the "package com.javamasteclass;" package.
    // 2. all interface variables are public static final.
    // 3. standart public
    // 4. thei are still public cause this is an interface.

    //the lack of access modifier means the default of package private, exept with interface methods and variables wich are allways public.


}

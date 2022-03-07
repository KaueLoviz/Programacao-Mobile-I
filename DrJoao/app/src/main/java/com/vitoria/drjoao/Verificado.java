package com.vitoria.drjoao;

public class Verificado {
    static boolean primeiravez = true;

    public static boolean isPrimeiravez(){
        return  primeiravez;
    }
    public static void setPrimeiravez(boolean primeiravez) {
        Verificado.primeiravez = primeiravez;
    }
}

package com.tucan.Personal.Model.Enum;

public enum Grupo_Sanguineo {
    A_Positivo("A+"),
    A_Negativo("A-"),
    B_Ppsitivo("B+"),
    B_negativo("B-"),
    AB_Positivo("AB+"),
    AB_Negativo("AB-"),
    O_Positivo("O+"),
    O_Negativo("O-");

    private final String valorReal;
            Grupo_Sanguineo(String valorReal){
                this.valorReal = valorReal;
            }

    public String getValorReal(){
                return valorReal;
    }


}

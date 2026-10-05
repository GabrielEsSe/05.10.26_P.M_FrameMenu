package com.example.a051026_itsbbmk_menupunto;

public class operaciones {
    private int dta1;
    private int dta2;

    public void setDta1(int dta1) {
        this.dta1 = dta1;
    }

    public void setDta2(int dta2) {
        this.dta2 = dta2;
    }
    public float OperarSuma(int dta1, int dta2){
        return dta1 + dta2;
    }
    public float OperarResta(int dta1, int dta2){
        return dta1 - dta2;
    }
    public float OperarMultiplicacion(int dta1, int dta2){
        return dta1 * dta2;
    }
    public float OperarDivision(int dta1, int dta2){
        return dta1 / dta2;
    }
}

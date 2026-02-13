package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows(){
        return pillows;
    }
    public int getHeight(){
        return height;
    }
    public int getSheets(){
        return sheets;
    }
    public int getQuilts(){
        return quilts;
    }
}


//org.example.model paketi altında Bed isminde bir sınıf yazınız.
//Bed sınıfı için 5 tane instance variable tanımlamalıyız. style tipi String olmalı.
//pillows, height, sheets, quilt tipleri int olmalı. Hepsi private olmalı.
//Bed sınıfı için bir constructor yazmalıyız.
//Bed sınıfı için 5 metod yazacağız. make herhangi bir return değeri olmayacak.
//Sadece 'The bed is being made.' mesajını ekrana basacak.
//getPillows() pillows sayısını return etmeli. getHeight() height değerini return etmeli.
//getSheets() sheets sayısını return etmeli. getQuilts() quilts sayısını return etmeli.
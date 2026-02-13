package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void setColor(PaintColor color) {
        this.color = color;
    }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}

//org.example.model paketi altında Carpet isminde bir sınıf yazınız.
//Carpet sınıfı için 3 adet instance variable tanımlayınız. int width, int height,
//PaintColor color Hepsi private olmalı.
//org.example.model.enums paketi altında PaintColor isminde bir enum tanımlayınız.
//RED,GREEN ve WHITE değerlerini almalı.
//Carpet sınıfı için constructor & getter metodlarını yazınız.
//Carpet sınıfı içerisinde lying isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek.
//Sadece 'Carpet is lying on Bedroom floor.' mesajını ekrana basacak.
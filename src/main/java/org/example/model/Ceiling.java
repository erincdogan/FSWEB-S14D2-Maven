package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create(){
        System.out.println("Ceiling has been built.");
    }
}

//org.example.model paketi altında Ceiling isminde bir sınıf yazınız.
//Ceiling sınıfının 2 tane instance variable olmalı. height ve color.height int tipinde olmalı
//color PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
//Ceiling sınıfının bir constructor metodu olmalı. 2 değişkenine de değer atamalı.
//Ceiling sınıfının getHeight() adında bir metodu olmalı. height değerini dönmeli.
//getColor adında bir metodu olmalı ve paintedColor değerini dönmeli.
//Ceiling sınıfının create isimli bir metodu olmalı.
//Ekrana 'Ceiling has been built.' yazdırmalı.
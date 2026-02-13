package org.example.model;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void create(){
        System.out.println("Wall has been built.");
    }
}

//org.example.model paketi altında Wall isminde bir sınıf yazınız.
//İçerisinde bir tane değişkeni olmalı direction String değerinde olmalı ve
//private olarak tanımlanmalı.
//Wall sınıfının bir constructor metodu olmalı ve tek değişkenine değer atamalı.
//Wall sınıfının iki metodu olmalı. getDirection direction değişkeninin değerini dönmeli.
//create metodu ekrana 'Wall has been built.' yazdırmalı.
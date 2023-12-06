package com.tutorial;

class player {
    // Data Member
    String name;//default, bisa dibaca dan ditulis oleh diluar class
    public int exp;//public, bisa dibaca dan ditulis diluar class
    private int health;// private, hanya bisa dibaca oleh class itu sendiri


    // kosntruktor
    player (String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display(){
        System.out.println("hero 1 : " + this.name);
        System.out.println("hero health :" +this.health);
        System.out.println("hero EXP : " + this.exp);
    }
}

public class main {
    public static void main(String[] args) {
        // Membuat objek atau instansiasi objek
        player hero_1 =  new player("dimas", 20, 100);

        // default
        System.out.println(hero_1.name);
        hero_1.name = "dimboy";
        System.out.println(hero_1.name);

        // public
        System.out.println(hero_1.exp);
        hero_1.exp = 50;
        System.out.println(hero_1.exp);

        // private
        hero_1.display();
    }
}
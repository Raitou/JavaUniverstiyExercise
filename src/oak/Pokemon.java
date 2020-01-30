/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oak;

/**
 *
 * @author 
 */
public class Pokemon {
    String name;
    String type;
    String gender;
    private String skill;
    
    public void setSkill(String skill){
        this.skill = skill;
    }
    
    public String getSkill(){
        return this.skill;
    }
    
    public Pokemon(){
        name = "Pikachu";
        type = "Electric";
        gender = "Male";
    }
    
    public Pokemon(String name){
        this.name = name;
        type = "Electric";
        gender = "Male";
    }
    
    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        gender = "Male";
    }
    
    public Pokemon(String name, String type, String gender){
        this.name = name;
        this.type = type;
        this.gender = gender;
    }
    
    public static void main(String args[]){
        Pokemon pika = new Pokemon();
        Pokemon raichu = new Pokemon("Raichu");
        Pokemon squirtle = new Pokemon("Squirtle", "Water");
        Pokemon charizard = new Pokemon("Charizard", "Fire", "Female");
        System.out.println("Pikachu Details: ");
        System.out.println("Name: " + pika.name);
        System.out.println("Type: " + pika.type);
        System.out.println("Gender: " + pika.gender);
    }
    
    
}

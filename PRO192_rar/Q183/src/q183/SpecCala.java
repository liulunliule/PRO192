/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q183;

/**
 *
 * @author ADMIN
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {

    }

    public SpecCala(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getValue(){
        int var = 0;
        if(color % 2 == 1){
            var = super.getPrice() + 1;
            return var;
        } else {
            var = super.getPrice() * 2;
            return var;
        }
    }

    public void setData() {

// format owner field to have first letter of all words in uppercase and other letters in lowercase
        String[] words = owner.toLowerCase().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.isEmpty()) {
                continue;
            }
            sb.append(Character.toUpperCase(word.charAt(0)));
            if (word.length() > 1) {
                sb.append(word.substring(1));
            }
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        owner = sb.toString();
        System.out.println("OUTPUT: " + owner);

// calculate value based on color
    }

    @Override
    public String toString() {
        return super.getOwner() + " @ " + super.getPrice() + " # " + getColor(); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
//SU21
public class Bottle {

    private String maker;
    private int volume;

    public Bottle() {
        super();
    }

    public Bottle(String maker, int volume) {
        super();
        this.maker = maker;
        this.volume = volume;
    }

    public String getMaker() {
        return maker.toLowerCase();
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}

package model;

public class Snack extends Perishable{

    private String flavor;
    private  String name;

    public Snack(String name, String flavor, boolean expired) {
        super(expired);
        this.flavor = flavor;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Snack  "+name+" ("+" has the flavor "+  flavor + ")";
    }
}

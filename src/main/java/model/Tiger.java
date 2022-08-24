package model;

import model.interfaces.IAnimal;
import model.interfaces.ISwim;

// Hint: missing an interface and a method implementation
public class Tiger implements ISwim, IAnimal {
    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }
    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }
}

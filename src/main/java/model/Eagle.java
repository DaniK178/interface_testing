package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IHunt;

public class Eagle  implements IFly, IHunt,IAnimal{

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}

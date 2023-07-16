import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Car car = new Car ("red",100);
        Phone phone = new Phone("blanck", 5000);
      House house = new House("white", 10000);


        User user = new User(car, phone,house);
        System.out.println(
                " car color: "+ user.getCar().getColor()+ "\n"+
                        " car speed: "+ user.getCar().getSpeed()+"\n"+
                        "\n"+" phone color: "+ user.getPhone().getColor()+"\n"+
                      " phone sum: "+user.getPhone().getSum()+"\n"+
                        "\n"+ " house color: " + user.getHouse().getColor()+"\n"+
                        " house sum: " + user.getHouse().getSum()+"\n"
        );      }       }

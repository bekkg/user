      public class User {

        private Car car ;
        private  Phone phone ;
        private House house ;

    public User(Car car, Phone phone, House house) {
        this.car = car;
        this.phone = phone;
        this.house = house;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Car getCar() {
        return car;
    }

    public Phone getPhone() {
        return phone;
    }

    public House getHouse() {
        return house;
    }
}

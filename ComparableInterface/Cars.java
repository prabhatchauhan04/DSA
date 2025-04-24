package ComparableInterface;

public class Cars implements Comparable<Cars>{
    int price;
    int speed;
    String color;

    public Cars(){

    }

    public Cars(int price , int speed , String color){
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString(){
        return "P: " + this.price + "   S: " + this.speed + "  C: " + this.color;
    }

    @Override
    public int compareTo(Cars o){
        // return this.price - o.price; // ye low to high price mein arrange krwa degi cars ko
        // return o.speed-this.speed; // ye high to low speed(Average Speed) mein arrange krwa degi cars ko
        return (this.color).compareTo(o.color); // ye humara alphabetically arrange kra dega cars ko based on color of the car (dictionary order mein)
    }
}




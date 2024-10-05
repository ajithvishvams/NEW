class Car{
    public void Wheel(){
        System.out.println("Car is running");
    }
    public String Price(int amount){
        if (amount > 1000){
            return "You bought the wheel";
            // If the code sees the return keyword it jumps out of the method
            // it wont execute the below code
        }
        return "Insufficent balance";
    }
}


public class Methods {
    public static void main(String args[]){
        Car car1 = new Car();
        car1.Wheel();
        String result = car1.Price(102);
        System.out.println(result);
    }
}

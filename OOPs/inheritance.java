public class inheritance {
    public static void main(String[] args) {

        // fish f1 = new fish();
        // f1.eat();

        dog d1 = new dog(4);
        d1.colour = "blue";
        d1.eat();
        System.out.println(d1.legs+" "+d1.colour);
        
    }
    
}


//Base class
class Animal{
    String colour;

    void eat(){
        System.out.println("eats");
    }

    void brethe(){
        System.out.println("breathes");
    }
}


//derived classs and single inheritance 
// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }


//MultiLevel Inhe....
// class mammal extends Animal{
//     int legs;

// }

// class dog extends mammal{
//     String Breed;

//     dog(int legs ){
//         this.legs=legs;
        

//     }
    

// }

//heirarchial Inhe....
class mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}
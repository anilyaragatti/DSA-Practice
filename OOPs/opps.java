public class opps {
    public static void main(String[] args) {

        Pen p1 = new Pen();// created a pen obj called p1

        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());//

    }

}

class Pen {
    // property or attributes
    private String color;
    private int tip;

    // getter and setter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // functions or behaviors
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// class Student {
// String name;
// int age;
// float percentage;

// void calculatePercentage(int phy, int math, int chem) {
// percentage = (phy + math + chem) / 3;
// }

// }
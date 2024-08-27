public class Super {
    public static void main(String[] args) {
        
    }
}

class Box {
    int l;
    int h;
    int w;
    // int weight;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(int l, int h, int w) {
        this.l =l;
        this.h = h;
        this.w = w;
    }


}

class BoxWeight extends Box {
    int weight;

    BoxWeight(int l, int h, int w, int weight) {
        //Used to initialise values of parent class
        //Call the parent class constructor
        super(l, h, w);
        
        //For access parent class property
        // System.out.println(super.weight);
        this.weight = weight;
        
    }
}


interface Animal {
    void sound();
    // void lags();
};

interface Animal2 {
    void sound();
    // void lags();
};

class dog implements Animal, Animal2 {
    // @Override
    public void sound() {
        System.out.println("i am a dog");
    }
    void sound(int i) {
        System.out.println("i am a dog from "+i);
    }
}


public class inheritance {

    public static void main(String[] arg) {
        dog D = new dog();
        D.sound();
    }
    
}

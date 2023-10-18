interface Bicycle{
    void horn();
    void ring();
}

interface Horn{
    void songhorn();
    void hornmusic();
}
class Herobicycle implements Bicycle,Horn{
    public void horn(){
        System.out.println("Sound horn .....");
    }
    public void ring(){
        System.out.println("Ring the horn...");
    }

    @Override
    public void hornmusic() {
        System.out.println("Playing horn with music ....... HMMMMM.....");
    }

    @Override
    public void songhorn() {
        System.out.println("He hamma hammma hamma hamma hamma");
    }
}
public class Tut_55_AbstractClassVsInterfaces {
    public static void main(String[] args) {
        Herobicycle h=new Herobicycle();
        h.horn();
        h.ring();
        h.hornmusic();
        h.songhorn();
    }
}
//Sound horn .....
//Ring the horn...
//Playing horn with music ....... HMMMMM.....
//He hamma hammma hamma hamma hamma
//We can use multiple interfaces to form a single class

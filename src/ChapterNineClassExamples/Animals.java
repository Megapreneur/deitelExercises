package ChapterNineClassExamples;

public class Animals extends LivingThings {

    public Animals(int something){
        this();
        System.out.println("i'm in my own world");

    }
    public Animals(){
        super();
        System.out.println("This is not my real face");

    }
    @Override
    public void move(){
        System.out.println("I can move differently from my father.");

    }
    public void moveLikeYourGrandfather(){
        super.move();
    }

}

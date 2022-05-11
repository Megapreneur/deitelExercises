package ChapterNineClassExamples2;

public class PapaAdemola {
    private Pray kneeling;
    private Eat chop;
    private Run waka;
    private Walk step;
    public PapaAdemola(Pray kneeling,Eat chop,Run waka,Walk step){
        this.kneeling = kneeling;
        this.chop = chop;
        this.waka = waka;
        this.step = step;
    }
    public void pray(){
        System.out.println("i sabi pray");
    }
    public void walk(){
        System.out.println("I walk well and faster");
    }
    public void eat(){
        System.out.println("Eat like a king");
    }
}

package ChapterNineClassExamples2;

public class PapaAdemolaDriver {
    public static void main(String[] args) {
        Prayoo adura = new Prayoo();
        Eat eat = new Eat();
        Run run = new Run();
        Walk2 walk = new Walk2();
        PapaAdemola demola = new PapaAdemola(adura, eat, run, walk);

//        demola.pray();
//        adura.pray();
//        eat.chop();
//        run.run();
        walk.walk();
//        demola.walk();

    }
}

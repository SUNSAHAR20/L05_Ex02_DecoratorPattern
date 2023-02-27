public class Demo {
    public static void main(String[] args) {
        ArtefactInterface mainArtefact = new ConcreteBaseArtefact("Main", true);
        
        ArtefactInterface [] artefacts = 
        {
            new DemoArtefactDecorator(mainArtefact, false),
            new EmailClientArtefactDecorator(mainArtefact, true),
            new EmailProviderArtefactDecorator(mainArtefact, false),
        };

    System.out.println(mainArtefact.render());
    for(ArtefactInterface artefact : artefacts)
            System.out.println(artefact.render());
    }
}

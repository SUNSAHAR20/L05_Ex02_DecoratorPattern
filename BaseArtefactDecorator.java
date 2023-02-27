public abstract class BaseArtefactDecorator implements ArtefactInterface{
    private ArtefactInterface artefact;

    public BaseArtefactDecorator(ArtefactInterface artefact) {
        this.artefact = artefact;
    }
    @Override
    public String render(){
        return artefact.render();
    }
}

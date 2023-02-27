public class DemoArtefactDecorator extends BaseArtefactDecorator {
    private boolean hasError;

    public DemoArtefactDecorator (ArtefactInterface artefact, Boolean hasError) {
        super(artefact);
        this.hasError = hasError;
    }

    @Override
    public String render(){
        String errorIcon = hasError ? "[Error]" : "";
        return String.format("Demo %s", errorIcon);
    }


    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}

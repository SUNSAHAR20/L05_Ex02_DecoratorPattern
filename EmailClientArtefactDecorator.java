public class EmailClientArtefactDecorator extends BaseArtefactDecorator {
    private boolean hasError;

    public EmailClientArtefactDecorator (ArtefactInterface artefact, Boolean hasError) {
        super(artefact);
        this.hasError = hasError;
    }

    @Override
    public String render(){
        String errorIcon = hasError ? "[Error]" : "";
        return String.format("EmailClient %s", errorIcon);
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}

public class EmailProviderArtefactDecorator extends BaseArtefactDecorator {
    private boolean hasError;

    public EmailProviderArtefactDecorator (ArtefactInterface artefact, Boolean hasError) {
        super(artefact);
        this.hasError = hasError;
    }

    @Override
    public String render(){
        String errorIcon = hasError ? "[Error]" : "";
        return String.format("EmailProvider %s", errorIcon);
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}

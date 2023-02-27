public class ConcreteBaseArtefact implements ArtefactInterface {
    private String name;
    private boolean isMain;

    public ConcreteBaseArtefact(String name, Boolean main) {
        this.name = name;
    }

    @Override
    public String render(){
        String mainIcon = isMain ? "" : "[Main]";
        return String.format("%s  %s", name, mainIcon);
    }

    public void setMain(boolean main) {
        isMain = main;
    }
}

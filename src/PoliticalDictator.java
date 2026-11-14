public class PoliticalDictator extends Leader implements PowerActions {
    private final String partyName;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Party Name: " + partyName);
    }

    @Override
    public void giveSpeech() {
        System.out.println("PoliticalDictator " + getName() + " gives a speech promoting the party's agenda.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("PoliticalDictator " + getName() + " is implementing political policy: New Policy");
    }

    @Override
    public void repressOpposition() {
        System.out.println("PoliticalDictator " + getName() + " is repressing the opposition through political means.");
    }

    @Override
    public void holdParade() {
        System.out.println("PoliticalDictator " + getName() + " is holding a political parade.");
    }
}
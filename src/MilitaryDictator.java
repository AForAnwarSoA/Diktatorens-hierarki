public class MilitaryDictator extends Leader implements PowerActions {
    private String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Military Rank: " + militaryRank);
    }

    @Override
    public void giveSpeech() {
        System.out.println("MilitaryDictator " + getName() + " gives a speech emphasizing military strength.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("MilitaryDictator " + getName() + " is implementing military policy: New Policy");
    }

    @Override
    public void repressOpposition() {
        System.out.println("MilitaryDictator " + getName() + " is repressing the opposition with force.");
    }

    @Override
    public void holdParade() {
        System.out.println("MilitaryDictator " + getName() + " is holding a military parade.");
    }
}
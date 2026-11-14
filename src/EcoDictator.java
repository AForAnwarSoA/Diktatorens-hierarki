public class EcoDictator extends Leader implements PowerActions {
    private String greenSlogan;
    private int treesPlanted;

    public EcoDictator(String name, String country, int yearsInPower, String greenSlogan) {
        super(name, country, yearsInPower);
        this.greenSlogan = greenSlogan;
        this.treesPlanted = 0;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Green Slogan: " + greenSlogan);
        System.out.println("Trees Planted: " + treesPlanted);
    }

    @Override
    public void giveSpeech() {
        System.out.println("EcoDictator " + getName() + " gives a speech: \"" + greenSlogan + "\"");
    }

    @Override
    public void implementPolicy() {
        System.out.println("EcoDictator " + getName() + " is implementing eco policy: Mandatory composting for all citizens.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("EcoDictator " + getName() + " is repressing the opposition by banning all plastic cups at their meetings.");
    }

    @Override
    public void holdParade() {
        System.out.println("EcoDictator " + getName() + " is holding a parade made entirely of bicycles and compost trucks.");
    }
    public void plantTrees(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Antal træer skal være større end 0: " + amount);
        }
        treesPlanted += amount;
        System.out.println("EcoDictator " + getName() + " forces the citizens to plant " + amount + " trees!");
    }


}


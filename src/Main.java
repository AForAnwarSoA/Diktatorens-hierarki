import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Leader> leaders = new ArrayList<>();
        leaders.add(new MilitaryDictator("General Zod", "Krypton", 15, "General"));
        leaders.add(new PoliticalDictator("Chancellor Palpatine", "Galactic Empire", 20, "Sith Party"));
        leaders.add(new EcoDictator("Supreme Leader Greta Greenleaf", "Republic of Evergreenia", 8, "Recycle or perish!"));

        for (Leader leader : leaders) {
            leader.printDetails();
            leader.giveSpeech();


            if (leader instanceof PowerActions actions) {
                actions.implementPolicy();
                actions.repressOpposition();
                actions.holdParade();
            }


            if (leader instanceof EcoDictator eco) {
                eco.plantTrees(1000);
                eco.printDetails();
            }
            try {
                leaders.add(new MilitaryDictator("General Zod", "Krypton", -7, "General"));
            } catch (IllegalArgumentException e) {
                System.out.println("Kunne ikke oprette diktator: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
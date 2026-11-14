public abstract class Leader {
    private String name;
    private String country;
    private int yearsInPower;

    public Leader(String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }


    public abstract void giveSpeech();


    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYearsInPower() {
        return yearsInPower;
    }
}

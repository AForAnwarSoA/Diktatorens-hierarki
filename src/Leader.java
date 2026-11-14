public abstract class Leader {
    private final String name;
    private final String country;
    private final int yearsInPower;

    public Leader(String name, String country, int yearsInPower) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Navn må ikke være tomt.");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Land må ikke være tomt.");
        }
        if (yearsInPower < 0) {
            throw new IllegalArgumentException("År ved magten kan ikke være negativt: " + yearsInPower);
        }

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

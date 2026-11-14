Gruppenavn: The boys
Gruppemedlemmer: Anwar & Najib

Hvad programmet gør:
Vores program er et hierarki af diktatorer, bygget med abstrakte klasser og interfaces i Java. Alle diktatorer er ledere (Leader) med navn, land og antal år ved magten. De to grundtyper, MilitaryDictator og PoliticalDictator, har hver deres titel (militærrang eller partinavn), deres egen tale og deres egen måde at udøve magt på. I Main lægger vi alle diktatorerne i en List<Leader>, og programmet udskriver deres oplysninger, lader dem holde tale og udfører deres magthandlinger.

Vores regler:
* Leader er en abstrakt klasse med felterne name, country og yearsInPower, og den kan ikke oprettes direkte med new.
* giveSpeech() er abstrakt i Leader, så hver underklasse skal lave sin egen tale.
* printDetails() er en fælles metode i Leader, som underklasserne udvider med deres eget felt.
* PowerActions er et interface med implementPolicy(), repressOpposition() og holdParade().
* MilitaryDictator, PoliticalDictator og EcoDictator arver fra Leader og implementerer PowerActions.
* I Main bruger vi polymorfi til at kalde giveSpeech() og printDetails() på alle ledere.
* Vi bruger instanceof og casting til at kalde metoderne fra PowerActions og den specifikke metode plantTrees().
* Leader validerer input i konstruktøren: navn og land må ikke være tomme, og yearsInPower må ikke være negativt. Ellers kastes en IllegalArgumentException, som Main opfanger med try/catch.
  
Vores udvidelse:
Vi har lavet vores egen diktatortype, EcoDictator, som arver fra Leader og implementerer PowerActions. Den har to ekstra felter (greenSlogan og treesPlanted) og en helt egen metode, plantTrees(), som ingen af de andre diktatorer har. Den bruger vi til at vise, hvorfor man skal bruge instanceof og casting for at kalde metoder, der kun findes i en bestemt underklasse.


Noget vi gerne vil have feedback på:
Er det en god løsning, at Leader er en abstrakt klasse, mens PowerActions er et interface? Og kunne vi have brugt interfacet på en mere hensigtsmæssig måde, fx ved at lade nogle ledere være uden PowerActions?

### Opgave 1 - Alkoholprocent

Reglerne for alkoholsalg i Danmark er som følgende.
1. Hvis alkoholprocenten er over 1,2 procent, må produktet ikke sælges til personer
   under 16 år.
2. Har produktet derimod en alkoholprocent på 16,5 eller over, må det kun sælges til
   personer der er over 18 år.
   
kilde: https://www.sik.dk/erhverv/medicin-og-alderskontrol/alderskontrol/alderskontrol-salg-alkohol
   
De regler er åbenbart svære at huske, så I skal lave et program, hvor man kan indtaste en alder
og en alkoholprocent og få svar på om det er tilladt at sælge det produkt til den person.

--- 

### Opgave 2 - FizzBuzz

FizzBuzz er den udvidede udgave af bum, som børn leger når de skal lære den lille tabel.

Legen går ud på at man tæller op fra 1, men hvis tallet man er nået til, går op i 3 siger man
Fizz, går tallet op i 5 siger man Buzz og endelig hvis tallet går op i både 3 og 5 siger man
FizzBuzz.

Så de første 15 tal vil man sige:

1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz

I main metoden har jeg lavet et tæller variable (currentNumber) der tæller op fra 1 til 40.

Implementer FizzBuzz ved brug at denne tæller.

Hint: I får brug for modulus funktionen. Modulusfunktionen returnerer rest ved
heltalsdivision. 

Procenttegnet (%) bruges som modulusfunktionen i Java.

Eksempel:

x = 19 % 4;

x vil være 3, da 4 går op i 19 fire gange, med en rest på 3.

---

### Opgave 3 - Ugedage.

Lav et program der spørger brugeren for en tal imellem 0 og 6, hvor 0 repræsentere mandag, 1 tirsdag osv.
Spørg brugeren for en nyt tal, dette tal repræsenterer dage frem.

Udskriv hvilken ugedag den fremtidige dag er.

Eksempel: 

Hvis en bruger først indtaster 5 (fredag) og dernæst 3, skal din applikation udskrive: mandag.

Hint: I får brug for modulus funktionen.

Hvor robust er din applikation, hvad gør din applikation hvis en bruger indtaster et tal der er 
mindre end 0 eller større end 6?

---

### Opgave 4 - Sten, Saks, Papir

Lav en applikation der beder bruger vælger 0 (sten), 1 (saks) eller 2 (papir).

I sten, saks, papir, slår sten en saks, en saks slår papir og papir slår sten.

Lad computeren generere et tilfældigt tal 0, 1 eller 2 og udskriv hvem der vandt, dig eller computeren. 

Se RandomExample i example pakken linje 12 om hvordan man kan generer tilfældige heltal. 

---

### Opgave 5 - Registreringsafgift

I Danmark skal man betale registreringsafgift for nyregistrerede biler. Registreringsafgiften
beregnes ud fra prisen af bilen.  

| Beløb imellem | Procent af bilens pris |
| --- | --- |
| Op til 67.800 kr. | 25% |
| 67.800 – 210.600 kr. | 85% |
| Over 210.600 kr. | 150% |



Eksempel.

For en mellemklassebil hvor nyprisen uden registreringsafgift er 150.00 skal man betale 25%
af de første 67.800 kr. = 16.950

Af de resterende 150.000 kr. – 67.800 kr. = 82.200 kr. skal man betale 85%, hvilket er 69.870
kr.  

I alt skal der betales 16.950 kr. + 69.870 kr. = 86.820 kr. 

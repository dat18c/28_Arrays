# 28_Arrays
## Agenda
* Mere om arrays: arrays som parametre (call by reference og call by value)
* en anden måde at definere arrays på
* Og så skal vi have introduceret konstanter
## Arrays som parametre
Arrays overføres som reference til et array
`````
public static void change(int[] tal, int x)
{
   tal[0] = -tal[0]];
   x = -x;
}
`````
Konsekvensen er, at efter metoden vil 2. parameter have samme værdi som før metodekaldet. Arrayets element 0 vil have skiftet fortegn. (Note fra jeres underviser: det er lidt upædagogisk).
## En anden måde at definere arrays på
``````
int[] tal = {7, 9, 13};
``````
Giver det samme som
`````
int[] tal = new int(3);
tal[0] = 7;
tal[1] = 9;
tal[2] = 13;
`````
## Konstanter
Konstanter er variable, der ikke kan ændres. De erklæres med brug af *final* og skrives altid med store bogstaver.
`````
//vi bruger altid 3 som antal
final int ANTAL = 3;

for (int i=0; i<ANTAL; i++)
{
   //gør noget med i
}
`````

## Øvelser
Videre med de givne øvelser på arrays.

Status på 1 - 100.

Lav en metode, der bytter om på to elementer i et array.

Vend et array om, så elementerne optræder i omvendt rækkefølge: Første element skal være til sidst, element nr. 2 skal være næstsidst osv. Brug ombyttemetoden og en forløkke.

Sorter et array. Kræver to løkker inden i hinanden.

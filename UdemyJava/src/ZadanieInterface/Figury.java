package ZadanieInterface;
/*Zadanie 2
- stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
- stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
- dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
- zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
- pola będą prywatne a konstruktor i metody publiczne
- przetestuj w main*/

public interface Figury {

     double obwod ();

    double pole();
}

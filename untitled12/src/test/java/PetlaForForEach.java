import org.junit.jupiter.api.Test;

public class PetlaForForEach {

    @Test
    public void ForExaple(){
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia4 = 1 * 2 * 3 * 4;
        int silnia1 = 1;
        int silnia0 = 1;
        int silnia6 = obliczSillnie(6);
        int silnia7 = obliczSillnie(10);
    }

    private int obliczSillnie(int liczba) {
        int silnia = 1;

        if (liczba > 1) {
            for(int i = 2; i<=liczba; i++){     // zaczynajac od i=2 do i <=liczba, za kazdym obrotem petli +1 inicjalizacja/warunek/modyfikator
            silnia = silnia * i;                                  // w petli for mozna wszystko wrzucic w nawias


            }
        }
        return silnia;
    }

    @Test
    public void forEachExample() {

        String[] rasy = {"Ork", "Undead", "Troll", "Tauren", "Goblin", "BloodElf"};
        String tekst = "Rasy w WoW to: ";

        for (String rasa : rasy) {                            // dla kazdego elementu z tablicy rasy
            tekst = tekst + "\n" + rasa;                   // "\n" - znak nowej linii

        }
        System.out.println(tekst);

    }
}



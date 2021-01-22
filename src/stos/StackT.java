package stos;

public class StackT implements IStack{
    private int tab[];
    private int szczyt;
    private int pojemnosc;



    StackT(int rozmiar){
        tab = new int[rozmiar];
        pojemnosc = rozmiar;
        szczyt = -1;
    }

    public void push(int dane) {
        if(szczyt==pojemnosc-1){
            System.out.println("Przepełnienie");
            System.exit(1);
        }
        System.out.println("Dodaję " + dane);
        tab[++szczyt] = dane;
    }


    public void pop() {
    if(isEmpty()){
        System.out.println("Pusty");
        System.exit(1);
    }
    System.out.println("Zdejmuję " + top());
        szczyt--;
    }


    public int top() {
        if(!isEmpty())
            return tab[szczyt];
        else System.exit(1);
        return -1;
    }


    public boolean isEmpty() {
        return szczyt == -1;
    }

    public void zawartosc(){
        System.out.println("Wyświetlam zawartość stosu: ");
        while(!isEmpty()) {
            System.out.println(tab[szczyt]);
            pop();
            if(isEmpty())
                System.out.println("Wszystkie elementy stosu zostały wyświetlone");
        }
    }
}

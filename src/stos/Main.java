package stos;

public class Main {

    public static void main(String[] args) {
//Stos z wykorzystaniem tablicy;
        StackT stos = new StackT(4);
        stos.push(1);
        stos.push(2);
        System.out.println("Na szczycie stosu znajduje się: "+ stos.top());
        stos.pop();
        stos.push(4);
        System.out.println("Na szczycie stosu znajduje się: "+ stos.top());
    if (stos.isEmpty())
        System.out.println("Stos jest pusty");
    else
        System.out.println("stos nie jest pusty");

    stos.push(5);
    stos.zawartosc();

    //Stos z wykorzystaniem listy wiązanej;
        System.out.println("Stos Z wykorzystaniem listy wiązanej");
        StackL stosL = new StackL();

        stosL.push(13);
        stosL.push(14);
        stosL.push(15);

        stosL.wyswietl();

        stosL.pop();
        stosL.wyswietl();

    }
}

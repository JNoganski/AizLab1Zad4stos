package stos;


public class StackL implements IStack{


    SElem top;

    StackL(){
        this.top=null;
    }


    public void push(int dane) {
    SElem lokator = new SElem();
    if(lokator == null){
        System.out.println("overflow");
        return;
    }
        System.out.println("Wkładam na stos: "+dane);
    lokator.setData(dane);
    lokator.setUnder(top);
    top = lokator;
    }

    @Override
    public void pop() {
    if(top == null){
        System.out.println("Underflow");
        return;
    }
    top = (top).getUnder();
    }

    @Override
    public int top() {
        if (!isEmpty()){
            return top.getData();
        }

        System.out.println("stos jest pusty");
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void wyswietl(){
    if(top == null){
        System.out.println("Underflow");
    }else{
        System.out.println("\n Wyświetlam elementy na stosie: ");
        SElem lokator = top;
        while (lokator != null){
            System.out.printf("%d->", lokator.getData());
            lokator = lokator.getUnder();
        }
    }

        }
    }


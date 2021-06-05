public class hello {

    public static void main(String[] args){
        //System.out.println("Hello, i am ubantuCode!");
       // System.out.println("Hello ,i am windowsCode!");
        PrimeThread primeThread = new PrimeThread(10);
        for(int i=0;i<10;i++)
            System.out.println("Hello ,i am helloCode " + i);
    }
}


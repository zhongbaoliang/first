class PrimeThread extends Thread{
    long minPrime;
    PrimeThread(long minPrime){
        this.minPrime=minPrime;
    }
    public void run(){
        for(int i=0;i<minPrime;i++)
            System.out.println("hello, i am minPrime " + i);
    }
}
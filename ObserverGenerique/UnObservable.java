

/**
 * UnObservable.java
 *
 * @author (your name) 
 * @version (a version number or a date)
 */


/**
 *
 */
public class UnObservable implements Observable
{  
    private java.util.Collection<Observer> observers = new java.util.ArrayList<Observer>();
    private int state = 0;
    public UnObservable(){}
    
   /**
    *
    */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     *
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    
    /**
     *
     */
    public void notifyObservers(){
        java.util.Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            ((Observer)iterator.next()).update(this);
        }
    }
    
    /**
     *
     */
    public int getState(){
        return this.state;
    }
    
    /**
     *
     */
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }

}

/*
 *Source file generated by patternCoder for BlueJ Version 0.5.3.004.
 *For more info, please visit http://www.patterncoder.org.
 */
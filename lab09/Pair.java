package lab09;

import java.util.Objects;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){ return key;}
    public V getValue(){return value;}

    public void setKey(K key){
        this.key=key;
    }
    public void setValue(V value){
        this.value=value;
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if(!(o instanceof Pair<?,?> other)) return false;
        return Objects.equals(key, other.key) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    
    @Override
    public String toString() {
        return "Pair(" + key + ", " + value + ")";
    }
    
    public static void main(String[] args) {

        Pair<String, Integer> grade = new Pair<>("Alice", 95);  
        System.out.println("Original : " + grade);
        System.out.println("Key      : " + grade.getKey());
        System.out.println("Value    : " + grade.getValue());
    
        Pair<Double, Boolean> measured = new Pair<>(3.14, true);  
        System.out.println("Double/Bool: " + measured);
    
        Pair<String, Integer> same  = new Pair<>("Alice", 95);
        Pair<String, Integer> other = new Pair<>("Bob", 88);
        System.out.println("\ngrade.equals(same)  : " + grade.equals(same));
        System.out.println("grade.equals(other) : " + grade.equals(other));
    
}
}


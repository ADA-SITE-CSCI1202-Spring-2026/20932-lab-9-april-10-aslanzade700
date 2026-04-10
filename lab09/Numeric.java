package lab09;

public class Numeric <T extends Number> {
    private T value;
    
    public Numeric(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }

    public double reciprocal(){
        double d = value.doubleValue();
        if (d==0){
            throw new ArithmeticException("Reciprocal of 0 is undefined");
        }
        return 1.0/d;
    }

    public double fractionalPart(){
        double d = value.doubleValue();
        return Math.floor(d);
    }

    public <U extends Number> boolean absCompare (Numeric <U> other){
        double d1 = Math.abs(this.value.doubleValue());
        double d2 = Math.abs(other.getValue().doubleValue());
        return d1==d2;
    }
}

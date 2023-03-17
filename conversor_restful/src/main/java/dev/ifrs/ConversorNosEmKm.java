package dev.ifrs;

public class ConversorNosEmKm {

    private double nos;
    private double km;

    public ConversorNosEmKm() {
    }

    public ConversorNosEmKm(double nos) {
        this.nos = nos;
        this.km = nos * 1.852;
    }

    public double getNos() {
        return nos;
    }

    public void setNos(double nos) {
        this.nos = nos;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "ConversorNosEmKm [nos=" + nos + ", km=" + km + "]";
    }

    
    
}

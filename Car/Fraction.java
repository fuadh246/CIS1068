public class Fraction {
    public int n;
    public int d;

    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public int getNum() {
        return n;
    }

    public int getDenom() {
        return d;
    }

    public void setNum(int n) {
        this.n = n;
    }

    public void setDenom(int d) {
        this.d = d;
    }

    public Fraction add(Fraction a) {
        int common_d = d * a.d;

        return a;
    }

    public boolean equals(Fraction a) {
        return n == a.n && d == a.d;
    }

    public String toString() {
        return n + "/" + d;
    }
}

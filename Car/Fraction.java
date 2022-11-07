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
        int common_d = this.d * a.d;
        int total_n = ((common_d / this.d) * this.n) + ((common_d / a.d) * a.n);
        int gdc = gcd(total_n, common_d);
        n = total_n / gdc;
        d = common_d / gdc;
        return new Fraction(n, d);
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public boolean equals(Fraction a) {
        return this.n == a.n && this.d == a.d;
    }

    public String toString() {
        return n + "/" + d;
    }
}

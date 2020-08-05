package top.werls.data.algortihm.chapter.one;

/**
 * 无理数
 *
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/24 10:43
 */
public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("denominator==0 is not allow");
        }
        int gcd = Text.gcd(numerator, denominator);
        if (gcd != 1) {
            numerator /= gcd;
            denominator /= gcd;
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    /**
     * a and b sum
     *
     * @param b Rational
     * @return Rational
     */
    public Rational plus(Rational b) {
        int numerator = this.numerator * b.denominator + b.numerator * this.denominator;
        int denominator = this.denominator * b.denominator;
        return isGcd(numerator, denominator);
    }

    /**
     * discrepancy
     *
     * @param b Rational
     * @return Rational
     */
    public Rational minus(Rational b) {
        int numerator = this.numerator * b.denominator - b.numerator * this.denominator;
        int denominator = this.denominator * b.denominator;
        return isGcd(numerator, denominator);
    }

    /**
     * @param b Rational
     * @return Rational
     */
    public Rational times(Rational b) {
        int numerator = this.numerator * b.numerator;
        int denominator = this.denominator * b.denominator;
        return isGcd(numerator, denominator);
    }

    public boolean equals(Rational that) {
        return (this.numerator == that.numerator && this.denominator == that.denominator);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Rational divides(Rational b) {
        int numerator = b.denominator * this.numerator;
        int denominator = this.denominator * b.numerator;
        return isGcd(numerator, denominator);
    }

    private Rational isGcd(int numerator, int denominator) {
        int gcd = Text.gcd(numerator, denominator);
        if (gcd != 1) {
            numerator /= gcd;
            denominator /= gcd;
        }
        return new Rational(numerator, denominator);
    }
}

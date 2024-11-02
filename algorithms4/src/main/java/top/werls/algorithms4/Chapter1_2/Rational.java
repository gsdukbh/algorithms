package top.werls.algorithms4.Chapter1_2;

/**
 * Rational
 * 1.2.16
 * @author JiaWei Lee
 * @version 1
 * @since on   02 11月 2024
 */
public class Rational {

  private int numerator;
  private int denominator;

  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Rational plus(Rational b) {
    int numerator = this.numerator * b.denominator + this.denominator * b.numerator;
    int denominator = this.denominator * b.denominator;
    return new Rational(numerator, denominator);
  }

  public Rational minus(Rational b) {
    int numerator = this.numerator * b.denominator - this.denominator * b.numerator;
    int denominator = this.denominator * b.denominator;
    return new Rational(numerator, denominator);
  }

  public Rational times(Rational b) {
    int numerator = this.numerator * b.numerator;
    int denominator = this.denominator * b.denominator;
    return new Rational(numerator, denominator);
  }

  public Rational divides(Rational b) {
    int numerator = this.numerator * b.denominator;
    int denominator = this.denominator * b.numerator;
    return new Rational(numerator, denominator);
  }

  public boolean equals(Rational that) {
    if (this == that) {
      return true;
    }
    if (that == null) {
      return false;
    }
    if (this.getClass() != that.getClass()) {
      return false;
    }
    return this.numerator == that.numerator && this.denominator == that.denominator;
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

}

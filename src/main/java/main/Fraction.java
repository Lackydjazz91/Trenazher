package main;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) throw new IllegalArgumentException();

        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public Fraction sum(Fraction other ) {
        int commonDenominator = this.denominator * other.denominator;
        int commonNumerator = (other.denominator * this.numerator) + (this.denominator * other.numerator);
        return new Fraction(commonNumerator, commonDenominator);
    }

    public Fraction minus(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int commonNumerator = (other.denominator * this.numerator) - (this.denominator * other.numerator);
        return new Fraction(commonNumerator, commonDenominator);
    }

    public Fraction sum(int number ) {
        Fraction numberAsFraction = new Fraction(number, 1);
        int commonDenominator = this.denominator * numberAsFraction.denominator;
        int commonNumerator = (this.numerator * numberAsFraction.denominator) - (numberAsFraction.numerator * this.denominator);
        return new Fraction(commonNumerator, commonDenominator);

    }

    public Fraction minus(int number) {
        Fraction numberAsFraction = new Fraction(number, 1);
        int commonDenominator = this.denominator * numberAsFraction.denominator;
        int commonNumerator = (this.numerator * numberAsFraction.denominator) - (numberAsFraction.numerator * this.denominator);
        return new Fraction(commonNumerator, commonDenominator);
    }
}

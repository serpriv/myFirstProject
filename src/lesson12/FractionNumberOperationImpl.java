package lesson12;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    public static void main(String[] args) {

    }

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;

    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDividend = (a.getDividend()*b.getDividend());
        int commonDivisor = (a.getDivisor()*b.getDivisor());
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDividend);
        result.setDivisor(commonDivisor);
        return result;

    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int commonDividend = (a.getDividend()*b.getDivisor());
        int commonDivisor = (a.getDivisor()*b.getDividend());
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDividend);
        result.setDivisor(commonDivisor);
        return result;
    }
}

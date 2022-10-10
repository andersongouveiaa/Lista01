public class Calculadora {

    private double num1, num2;
    private String operacao;

    public Calculadora() {
    }

    public double calcular() {
        double result = 0;
        switch (operacao) {
            case "+":
                result = getNum1() + getNum2();
                break;
            case "-":
                result = getNum1() - getNum2();
                break;
            case "/":
                result = getNum1() / getNum2();
                break;
            case "*":
                result = getNum1() * getNum2();
                break;
            default:

        }
        return result;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

}

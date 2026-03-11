package OOPS;

public class Complex{
    int real;
    int imag;
    Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex sum(Complex a, Complex b){
        return new Complex((a.real + b.real) , (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real - b.real) , (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real) - (a.imag*b.imag)) , ((a.real*b.imag) + (a.imag*b.real)));
    }

    public void printComplexNo(){
        if(real == 0 && imag != 0){
            System.out.println(imag + "i");
        }else if(real != 0 && imag == 0){
            System.out.println(real);
        }else{
            System.out.println(real + "+" + imag + "i");
        }
    }
    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(8, 4);

        Complex e = Complex.sum(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplexNo();
        f.printComplexNo();
        g.printComplexNo();
    }
}

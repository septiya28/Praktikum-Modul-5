package septiya;

public class OperasiPenjumlahan extends OperasiBilanganAbs{

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = a + b;
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan\n"+ a + " + " + b + " = " + c); 
    }
    
}
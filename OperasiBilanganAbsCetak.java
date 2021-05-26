package septiya;

public class OperasiBilanganAbsCetak extends OperasiBilanganAbs{
    private void cetaksemua(double a,double b){
        OperasiPenjumlahan hitung1 = new OperasiPenjumlahan();
        hitung1.set_A(a);
        hitung1.set_B(b);
        hitung1.set_C();
        hitung1.get_C();
        hitung1.tampil();
        
        OperasiPengurangan Hitung2 = new OperasiPengurangan();
        Hitung2.set_A(a);
        Hitung2.set_B(b);
        Hitung2.set_C();
        Hitung2.get_C();
        Hitung2.tampil();
        
        OperasiPerkalian Hitung3 = new OperasiPerkalian();
        Hitung3.set_A(a);
        Hitung3.set_B(b);
        Hitung3.set_C();
        Hitung3.get_C();
        Hitung3.tampil();
        
        OperasiPembagian Hitung4 = new OperasiPembagian();
        Hitung4.set_A(a);
        Hitung4.set_B(b);
        Hitung4.set_C();
        Hitung4.get_C();
        Hitung4.tampil();
    }
    
    public static void main(String[] args) {
       OperasiBilanganAbsCetak act = new OperasiBilanganAbsCetak();
       act.cetaksemua(6.5 , 0.5);  
    }

    @Override
    protected void set_A(double a) {
        
    }

    @Override
    protected void set_B(double a) {
 
    }

    @Override
    protected void set_C() {
        
    }

    protected double get_A() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected double get_B() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected double get_C() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected void tampil() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

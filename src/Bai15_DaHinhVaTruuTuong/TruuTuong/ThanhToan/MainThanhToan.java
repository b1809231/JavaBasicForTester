package Bai15_DaHinhVaTruuTuong.TruuTuong.ThanhToan;

public class MainThanhToan {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new MomoPayment();

        payment1.pay(100000);
        payment2.pay(200000);
    }
}

package Bai15_DaHinhVaTruuTuong.TruuTuong.ThanhToan;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng");
    }
}
import it.store.utils.receipt.DetailReceipt;
import it.store.utils.receipt.Receipt;
import it.store.utils.receipt.SimpleReceipt;

public class TestReceipt {
    public static void main(String[] args) {
        //Receipt simpleReceipt=new SimpleReceipt("สมรักษ์ คำสิงห์",1500.00);
        //simpleReceipt.printReceipt();

        String[] item={"WiFi-IP Camera","Power Bank 6000 mAh","Panasonic Battery ขนาด AAA","Adapter DC 12V"};
        double[] prices={1200.00,550.00,65.00,120};
        Receipt detailReceipt=new DetailReceipt("สมหวัง ใจเลิศ",item,prices);
        detailReceipt.printReceipt();
    }
}

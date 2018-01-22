package methods;


public class Main5 {

    public static void main(String[] args) {
        double gross = 8000;
        double vat = 0.23;
        System.out.println(calculateNet(gross, vat));

    }
    static double calculateNet(double gross, double vat){
    	double resoultNet = gross - (gross * vat);
    	return resoultNet;
    	
    }
}

package radianMeasure;

public class RadianMeasureVersion1_pure {
	
	public static final double E = 2.7182818284590452354;
	 
    public static final double PI = 3.14159265358979323846;
    
    
    public static double toRadians(double angdeg) {
        return angdeg / 180.0 * PI;
    }
 
    public static double toDegrees(double angrad) {
    	return angrad * 180.0 / PI;
    }

    //Get a power n
    public static double power(double a, int n) {
    	
    	double result=1;
    	for(int i=0;i<n;i++) {
    		result=result*a;
    	}
    	return result;
    }
    
    //Bernoulli numbers Bn
    public static double[] Bernoulli() {
    	double[] result= {1/6,1/30,1/42,1/30,5/66,691/2730,7/6,3617/510,43867/798,174611/330};    	
    	return result;
    }
 
    public static double factorial(int a) {
    	double result=1;
    	for(double i=1;i<=a;i++) {
    		result=result*i;
    	}
    	return result;
    }
    
    /*
    default input type if radian.
    */
    
    public static double sin(double a) {
    	double sum=0,temp=1;
    	for(int i = 3; i<=21; i=i+2) {
    		for(int j=i;j>0;j--) {
    			temp=temp*a/j;
    		}
    		sum=sum+temp;
    	}
    	return sum;
    }
    
    public static double cos(double a) {
    	double sum=0,temp=1;
    	for(int i = 2; i<=20; i=i+2) {
    		for(int j=i;j>0;j--) {
    			temp=temp*a/j;
    		}
    		sum=sum+temp;
    	}
    	return sum;
    }
    

    public static double tan(double a) {
    	double[] bernoulli=new double[10];
    	bernoulli=Bernoulli();
    	double temp;
    	double sum=0;
    	for(int i=1;i<=10;i++) {
    		temp=power(2,2*i)*(power(2,2*i)-1)*bernoulli[i]*power(a,2*i-1)/factorial(i);
    		sum=sum+temp;
    	}
    	return sum;
    }
}
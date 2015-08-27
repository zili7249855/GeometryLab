public class GeometryLab {
    
    public double f(double x, double y){
        return x+y;
    }
    
    public double g(double x, double y){
        return x-y;
    }
    
    public double h(double x, double y){
        return x*y;
    }
    
    public double j(double x, double y){
        return x / y;
    }
    
    public double k(double x, double y){
        return x % y;
    }
    
    public double m(double x, double y, double z){
        return x + y - z;
    }
    
    public double triArea(double b, double h){
        return (1.0/2) * b * h;
    }
    
    public double trapArea(double b1, double b2, double h){
        return (1.0/2) * h * (b1 + b2);
    }
    
    public double circArea(double r){
        return 3.14 * r * r;
    }
    
    public double pythHypotenuse(double a, double b){
        return a * a + b *b;
    }
    
    public double rectArea(double b, double h){
        return b * h;
    }
    
    public double paralArea(double b, double h){
        return b * h;
    }
    
    public double triPrismVol (double b, double h, double w){
        return (1.0/2)* b * h * w;
    }
    
    public double rectPrismVol(double b, double h, double w){
        return b * h * w;
    }
    
    public double rectPyramidVol(double b, double h, double w){
        return (1.0/3) * b * h * w;
    }
    
    public double cylVol (double r, double h){
        return 3.14 * r * r * h;
    }
    
    public double sphereVol (double r){
        return (4.0/3) * 3.14 * r * r * r;
    }
    
    public double coneVol ( double r, double h){
        return (1.0/3) * 3.14 * r * r * h;
    }
    
    public double sphereSurfArea (double r){
        return 4 * 3.14 * r * r;
    }
    
    public double cylSurfArea (double r, double h){
        return (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
    }
    
    public double rectPrismSurfArea ( double b, double h, double w){
        return (2 * b * h) + (2 * b * w) + (2 * h * w);
    }
}
package app;
class Triangulo{
    
    private double area;

    public double perimetro(double a, double b, double c){
        double perimetro = (a+b+c)/2;
        return perimetro;
    }
    
    public double getArea(){
        return this.area;
    }

    public void setArea(double a, double b, double c){
    this.area = Math.sqrt(perimetro(a, b, c)*(perimetro(a, b, c) - a)*(perimetro(a, b, c) - b)*(perimetro(a, b, c) - c));
    }

}
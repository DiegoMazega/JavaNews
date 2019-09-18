package app;

class CalcShop{
    private String name;
    private double price;
    private int amount;

    public void setNewProduct(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void inAmount(int amount){
        this.amount+= amount;
    }
    public void outAmount(int amount){
        if(this.amount - amount < 0 ){
            System.out.printf("%nValor de estoque não pode ser menor que 0(Zero)");
        }else this.amount-= amount;
    }

    public double Calc(){
        double total = this.price*this.amount;
        return total;
    }

    public String getProduct(){
        return this.name.substring(0,1).toUpperCase().concat(this.name.substring(1))+" "+Double.toString(this.price)+" "+Integer.toString(this.amount);
    }
}
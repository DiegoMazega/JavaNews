class VetorClass{
    private String nome;
    private double price;

    public VetorClass(String nome, double price){
        this.nome = nome;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getNome(){
        return this.nome;
    }

    public String toString(){
        return this.nome+" - "+String.format("%.2f", this.price);
    }
}
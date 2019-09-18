class Pessoas{
    private String nome;
    private String email;
    private int room;

    public Pessoas(String nome, String email, int room){
        this.nome = nome;
        this.email = email;
        this.room = room;
    }
    public Pessoas(){

    }

    public String toString(){
        return this.nome+" - "+this.email+" - "+Integer.toString(this.room);
    }
}
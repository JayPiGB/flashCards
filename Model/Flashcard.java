package Model;

public class Flashcard {
    //Caracteristicas de um flashcard
    String pergunta;
    String resposta;
    String tema;
    String id;

    //tornar nullable ou optional
    String boxId;

    public Flashcard(String tema,String pergunta,String resposta){
        setTema(tema);
        setPergunta(pergunta);
        setResposta(resposta);
    }
    public String getTema(){
        return tema;
    }
    public String getPergunta(){
        return pergunta;
    }
    public String getResposta(){
        return resposta;
    }
    public String getId() { return id; }



    public void setTema(String tema){
        this.tema = tema;
    }
    public void setPergunta(String pergunta){
       this.pergunta = pergunta;
    }
    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    private void setId() {}
}

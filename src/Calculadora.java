import java.lang.Math;

public class Calculadora {
    //Atributos

    public float forcaPeso(float massa){
        return massa * 9.8f;
    }

    public float forcaCentripeta(float massa, float velocidade, float raio){
        return massa * (float) Math.pow(velocidade, 2) / raio;
    }

    public float impulso(float forca, float tempo){
        return forca * tempo;
    }

    public float forcaElastica(float constante, float deformacao){
        return constante * deformacao;
    }

    public float velocidadeMedia(float distancia, float tempo){
        return distancia / tempo;
    }

    public float movimentoUniforme(float velocidade, float tempo){
        return velocidade * tempo;
    }

    public float mruv(float velocidadeInicial, float aceleracao, float tempo){
        return velocidadeInicial * tempo + aceleracao * tempo * tempo / 2;
    }
}

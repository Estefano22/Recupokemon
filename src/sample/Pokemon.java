package sample;

public class Pokemon {


        private final String nombre;
        private int vida;
        private final int nivel;


        public Pokemon(String nombre, int vida, int nivel) {
            this.nombre = nombre;
            this.vida = vida;
            this.nivel = nivel;

        }

        public String getNombre() { return nombre; }

        public int getVida() {
            return vida;
        }

        public void setVida(int vida){
            this.vida=vida;
        }


        public int getNivel() {
            return nivel;
        }

}

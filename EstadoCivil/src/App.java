public class App {
    public static void main(String[] args) throws Exception {
        
        
        EstadoCivil Casado = EstadoCivil.CASADO;
        System.out.println(Casado.getValue());

    }


    public enum EstadoCivil {
        SOLTEIRO("solteiro"),
        CASADO("Casado"),
        SEPARADO("Separado"),
        DIVORCIADO("Divorciado"),
        VIUVO("Viúvo");


        private String value;

        public String getValue() {
            return value;
        }

        private EstadoCivil(String value){
            this.value = value;

        }
    }
    
}


package br.edu.utfpr.dv.sireata.model;

public enum SituacaoComentario {

        NAOANALISADO(0), ACEITO(1), RECUSADO(2);

        private final int value;
        SituacaoComentario(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public static SituacaoComentario valueOf(int value){
            for(SituacaoComentario u : SituacaoComentario.values()){
                if(u.getValue() == value){
                    return u;
                }
            }

            return null;
        }

        public String toString(){
            switch(this){
                case NAOANALISADO:
                    return "Não Analisado";
                case ACEITO:
                    return "Aceito";
                case RECUSADO:
                    return "Recusado";
                default:
                    return "";
            }
        }

}


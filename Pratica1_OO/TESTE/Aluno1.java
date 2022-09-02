package Pratica1_OO.TESTE;

public class Aluno1 {
        private String nome;
        private String matricula;
        private Double notaAV1;
        private Double notaAV2;
        private Double notaAE;
        private String curso;
        private String periodo;
    
        public Aluno1(
            String nome, String matricula, Double notaAV1, Double notaAV2, Double notaAE, String curso, String periodo){
                this.nome = nome;
                this.matricula = matricula; 
                this.notaAV1 = notaAV1;
                this.notaAV2 = notaAV2;
                this.notaAE = notaAE;
                this.curso = curso;
                this.periodo = periodo;
        }
    
        public void SetNotaAV1(Double notaAV1){
            this.notaAV1 = notaAV1;
        }
    
        public void SetNotaAV2(Double notaAV2){
            this.notaAV2 = notaAV2;
        }
    
        public void SetNotaAE(Double notaAE){
            this.notaAE = notaAE;
        }
        
        public String AvaliarAluno(Double notaAV1, Double notaAV2){
            if (this.notaAV1 + this.notaAV2 >= 60){
                return "Aprovado";
            } else {
                return "Recuperação";
            }
        }
    
        public String AvaliarRecuperação(Double notaAV1, Double notaAV2, Double notaAE){
            Double media = (notaAV1 + notaAV2 + notaAE)/3;
            if(media >= 60){
                return "Aprovado";
            } else {
                return "Reprovado";
            }
            
        }
    
    
        @Override
        public String toString() {
            return "Aluno [ curso= " + curso + ", matricula= " + matricula + ", nome= " + nome + ", notaAE= " + notaAE
                    + ", notaAV1= " + notaAV1 + ", notaAV2= " + notaAV2 + ", periodo= " + periodo + " ]";
        }
    }
    

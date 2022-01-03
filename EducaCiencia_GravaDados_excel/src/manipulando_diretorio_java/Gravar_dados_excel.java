package manipulando_diretorio_java;

import java.io.File;
import java.io.PrintWriter;

public class Gravar_dados_excel {

   // public String codigo, nome, email;

    public String gravar(String path, String nomeArquivo, String nome, String email) {

        //String nomeArquivo = "JavaGrava";
        //String nome = "EducaCiencia - ";
        //String email = "educaciencia_fastcode@outlook.com.br";
        try {
            File diretorio = new File(path);
            if (!diretorio.exists()) {
                System.out.println("Pasta criada");
                diretorio.mkdir();
            }
            try (PrintWriter escreve = new PrintWriter(path + "/" + nomeArquivo + ".xls")) {
                escreve.print(nome);
                escreve.println(email);
                escreve.flush();
                System.out.println("Arquivo gravado com sucesso !");
                return "Arquivo gravado com sucesso !";
            }
        } catch (Exception e) {
            System.out.println("Falha ao gravar arquivo - " + e.toString());
            return "Falha ao gravar arquivo - " + e.toString();
        }
    }

   
}

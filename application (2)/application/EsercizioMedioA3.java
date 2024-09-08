package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class EsercizioMedioA3 {

    @FXML
    private Text codeArea;

    @FXML
    private Button verifyButton;

    @FXML
    private Text feedbackText;

    @FXML
    private Button esciButton;

    @FXML
    private Button nextButton;

    @FXML
    private TextArea rispostaUserArea;

    @FXML
    public void initialize() {

        // Codice predefinito nell'area di testo
        String domanda =
                "// Questo programma deve calcolare il fattoriale di un numero.\n" +
                        "public class Fattoriale {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        int n = 5;\n" +
                        "        int fattoriale = 1;\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            fattoriale -= i;\n" +
                        "        }\n" +
                        "        System.out.println(\"Il fattoriale di \" + n + \" è: \" + fattoriale);\n" +
                        "    }\n" +
                        "}";

        String rispostaGiusta = "test";

        String prossimoLivello = "EsercizioDifficileA1.fxml";

        ModelloEsercizioMedio modelloEsercizioMedio = new ModelloEsercizioMedio();
        modelloEsercizioMedio.initialize(domanda, rispostaGiusta, codeArea,
                verifyButton, feedbackText, esciButton,
                nextButton, prossimoLivello, rispostaUserArea);
    }

}

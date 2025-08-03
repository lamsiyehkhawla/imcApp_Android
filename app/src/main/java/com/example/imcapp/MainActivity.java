package com.example.imcapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText poidsInput, tailleInput;
    Button calcButton;
    TextView resultText;
    ImageView categoryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poidsInput = findViewById(R.id.poidsInput);
        tailleInput = findViewById(R.id.tailleInput);
        calcButton = findViewById(R.id.calcButton);
        resultText = findViewById(R.id.resultText);
        categoryImage = findViewById(R.id.categoryImage);

        calcButton.setOnClickListener(v -> {
            String poidsStr = poidsInput.getText().toString();
            String tailleStr = tailleInput.getText().toString();

            if (!poidsStr.isEmpty() && !tailleStr.isEmpty()) {
                float poids = Float.parseFloat(poidsStr);
                float taille = Float.parseFloat(tailleStr) / 100;
                float imc = poids / (taille * taille);
                resultText.setText(String.format("Votre IMC est: %.2f", imc));
                afficherCategorie(imc);
            } else {
                Toast.makeText(this, "Veuillez remplir les deux champs :", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void afficherCategorie(float imc) {
        if (imc < 18.5) {
            categoryImage.setImageResource(R.drawable.maigre);
        } else if (imc < 25) {
            categoryImage.setImageResource(R.drawable.normal);
        } else if (imc < 30) {
            categoryImage.setImageResource(R.drawable.surpoids);
        } else if (imc < 40) {
            categoryImage.setImageResource(R.drawable.obesite_moderee);
        } else {
            categoryImage.setImageResource(R.drawable.obesite_severe);
        }
    }
}
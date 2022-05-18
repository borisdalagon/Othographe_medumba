package com.example.orthographe_menjumba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.orthographe_menjumba.adapter.AdapterLettre;
import com.example.orthographe_menjumba.adapter.AdapterTon;
import com.example.orthographe_menjumba.classSimple.Lettre;
import com.example.orthographe_menjumba.classSimple.Ton;
import com.example.orthographe_menjumba.listeners.BaseListenerCheckBox;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager gridLayout;
    AdapterLettre adapterLettre;
    List<Lettre> listLettre = new ArrayList<>();

    CardView cardTonHaut;
    CardView cardTonBas;
    CardView cardTonMoyen;
    CardView cardTonMontant;
    CardView cardTonDecendant;

    ImageButton imgBtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimary));


        imgBtnInfo = (ImageButton)findViewById(R.id.img_btn_info);
        imgBtnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                finish();
            }
        });

        //LES LETTRES DE L'ALPHABET
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_alphabet);
        gridLayout = new GridLayoutManager(MainActivity.this, 7);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayout);
        List<Lettre> listInitLettre =  getListLettre();
        adapterLettre = new AdapterLettre(MainActivity.this, listInitLettre, new BaseListenerCheckBox() {
            @Override
            public void onClick(int position, View view) {
                if(position == 0){
                    //a

                }if(position == 1){
                    //α

                }if(position == 2){
                    //b

                }if(position == 3){
                    //c

                }if(position == 4){
                    //d

                }if(position == 5){
                    //ə

                }if(position == 6){
                    //e

                }if(position == 7){
                    //ɛ

                }if(position == 8){
                    //f

                }if(position == 9){
                    //g

                }if(position == 10){
                    //gh

                }if(position == 11){
                    //h

                }if(position == 12){
                    //i

                }if(position == 13){
                    //j

                }if(position == 14){
                    //k

                }if(position == 15){
                    //l

                }if(position == 16){
                    //m

                }if(position == 17){
                    //n

                }if(position == 18){
                    //ŋ

                }if(position == 19){
                    //o

                }if(position == 20){
                    //ɔ

                }if(position == 21){
                    //s

                }if(position == 22){
                    //sh

                }if(position == 23){
                    //t

                }if(position == 24){
                    //ts

                }if(position == 25){
                    //u

                }if(position == 26){
                    //ʉ

                }if(position == 27){
                    //v

                }if(position == 28){
                    //w

                }if(position == 29){
                    //ny

                }if(position == 30){
                    //y

                }if(position == 31){
                    //z

                }if(position == 32){
                    // ’

                }

            }

            @Override
            public void onLongClick(int position) {

            }
        });
        recyclerView.setAdapter(adapterLettre);


        //LES TONS
        cardTonHaut = (CardView) findViewById(R.id.card_ton_haut);
        cardTonBas = (CardView) findViewById(R.id.card_ton_bas);
        cardTonMoyen = (CardView) findViewById(R.id.card_ton_moyen);
        cardTonMontant = (CardView) findViewById(R.id.card_ton_montant);
        cardTonDecendant = (CardView) findViewById(R.id.card_ton_descendant);

        cardTonHaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardTonBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardTonMoyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardTonMontant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardTonDecendant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private List<Lettre> getListLettre(){

        listLettre.add(new Lettre("a"));
        listLettre.add(new Lettre("α"));
        listLettre.add(new Lettre("b"));
        listLettre.add(new Lettre("c"));
        listLettre.add(new Lettre("d"));
        listLettre.add(new Lettre("ə"));
        listLettre.add(new Lettre("e"));

        listLettre.add(new Lettre("ɛ"));
        listLettre.add(new Lettre("f"));
        listLettre.add(new Lettre("g"));
        listLettre.add(new Lettre("gh"));
        listLettre.add(new Lettre("h"));
        listLettre.add(new Lettre("i"));
        listLettre.add(new Lettre("j"));

        listLettre.add(new Lettre("k"));
        listLettre.add(new Lettre("l"));
        listLettre.add(new Lettre("m"));
        listLettre.add(new Lettre("n"));
        listLettre.add(new Lettre("ŋ"));
        listLettre.add(new Lettre("o"));
        listLettre.add(new Lettre("ɔ"));

        listLettre.add(new Lettre("s"));
        listLettre.add(new Lettre("sh"));
        listLettre.add(new Lettre("t"));
        listLettre.add(new Lettre("ts"));
        listLettre.add(new Lettre("u"));
        listLettre.add(new Lettre("ʉ"));
        listLettre.add(new Lettre("v"));

        listLettre.add(new Lettre("w"));
        listLettre.add(new Lettre("ny"));
        listLettre.add(new Lettre("y"));
        listLettre.add(new Lettre("z"));
        listLettre.add(new Lettre("’"));

        return listLettre;
    }


}
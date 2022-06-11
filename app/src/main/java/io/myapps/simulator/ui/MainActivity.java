package io.myapps.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.myapps.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupMatchesList() {
        //TODO: Listar as partidas consumindo nossa API.
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas na açõa de swipe.
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas
    }
}

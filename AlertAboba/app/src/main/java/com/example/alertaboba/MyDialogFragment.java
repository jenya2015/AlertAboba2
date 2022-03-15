package com.example.alertaboba;

import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class MyDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Важное сообщение!")
                .setMessage("Пожалуйста, оцените наше приложение)")
                .setPositiveButton("Оно классное", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        Toast.makeText(getActivity(), "Спасибо за отзыв! Мы рады, что вам нравится наше приложение)",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Мне не нравится это приложение", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        Toast.makeText(getActivity(), "Спасибо за отзыв! Надеемся, что мы сможем сделать это приложение лучше)",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Я не знаю", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        Toast.makeText(getActivity(), "Спасибо за отзыв! Надеемся, что это приложение вам понравится)",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}

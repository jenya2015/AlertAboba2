package com.example.alertaboba;

import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class MyDialogFragment2 extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] comArray = {"Оно классное", "Мне не нравится это приложение", "Я не знаю"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Важное сообщение!")
                .setItems(comArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(),
                                "Ваш отзыв: " + comArray[which],
                                Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}

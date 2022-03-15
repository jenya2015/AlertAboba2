package com.example.alertaboba;

import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class MyDialogFragment3 extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] comArray = {"Оно классное", "Мне не нравится это приложение", "Я не знаю"};
        final boolean[] checkedItemsArray = {false, true, false};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Важное сообщение!")
                .setMultiChoiceItems(comArray, checkedItemsArray,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                checkedItemsArray[which] = isChecked;
                            }
                        })
                .setPositiveButton("Готово",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                StringBuilder state = new StringBuilder();
                                for (int i=0; i<comArray.length; i++) {
                                    state.append(comArray[i]);
                                    if (checkedItemsArray[i])
                                        state.append(" выбрано\n");
                                    else
                                        state.append(" не выбрано\n");
                                }
                                Toast.makeText(getActivity(),
                                        state.toString(), Toast.LENGTH_LONG).show();
                            }
                        });
        return builder.create();
    }
}

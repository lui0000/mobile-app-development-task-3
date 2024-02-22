package com.example.mobile_app_development_task_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        EditText editText = new EditText(this);
        editText.setHint("Введите Email");
        editText.setId(View.generateViewId());

        Button button = new Button(this);
        button.setText("Отправить");
        button.setId(View.generateViewId());
        ConstraintLayout.LayoutParams editTextLayout = new
                ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT ,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        editTextLayout.rightToLeft = button.getId();
        editText.setLayoutParams(editTextLayout);
        constraintLayout.addView(editText);
        ConstraintLayout.LayoutParams buttonLayout = new
                ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT ,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
        buttonLayout.leftToRight = editText.getId();
        buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        button.setLayoutParams(buttonLayout);
        constraintLayout.addView(button);
        setContentView(constraintLayout);
    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello!");
//        textView.setTextSize(26);
//        textView.setBackgroundColor(0xFFE0E0E0);
//
//
//        // Преобразование dp в пиксели
//        Resources r = getResources();
//        int marginInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, r.getDisplayMetrics());
//        int paddingInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, r.getDisplayMetrics());
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//        layoutParams.setMargins(marginInDp, marginInDp, marginInDp, marginInDp);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop =ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        textView.setPadding(paddingInDp, paddingInDp, paddingInDp, paddingInDp);
//        constraintLayout.addView(textView);
//        setContentView(R.layout.second_activity_main);
//        // Получаем ссылки на виджеты
//        Button button1 = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);
//        TextView textView1 = findViewById(R.id.textView1);
//        TextView textView2 = findViewById(R.id.textView2);
//        TextView textView3 = findViewById(R.id.textView3);
//
//
//    }
}